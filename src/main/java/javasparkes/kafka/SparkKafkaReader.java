/**
 * 
 */
package javasparkes.kafka;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.spark.api.java.function.ForeachFunction;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoder;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.functions;
import org.apache.spark.sql.streaming.OutputMode;
import org.apache.spark.sql.streaming.StreamingQuery;
import org.apache.spark.sql.streaming.StreamingQueryException;
import org.apache.spark.sql.types.DataType;
import org.apache.spark.sql.types.StructType;
import org.apache.spark.streaming.Duration;
import org.apache.spark.streaming.api.java.JavaDStream;
import org.apache.spark.streaming.api.java.JavaPairInputDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.apache.spark.streaming.kafka010.KafkaUtils;
import org.elasticsearch.spark.rdd.EsSpark;
import org.elasticsearch.spark.rdd.api.java.JavaEsSpark;
import org.elasticsearch.spark.sql.EsSparkSQL;
import org.elasticsearch.spark.sql.api.java.JavaEsSparkSQL;
import org.elasticsearch.spark.sql.streaming.EsSparkSqlStreamingSink;
import org.elasticsearch.spark.streaming.EsSparkStreaming;
import org.elasticsearch.spark.streaming.api.java.JavaEsSparkStreaming;

import com.fasterxml.jackson.databind.ObjectMapper;

import javasparkes.config.SetProperties;
import javasparkes.config.SparkConfig;
//import kafka.serializer.StringDecoder;
import javasparkes.model.Case;
import javasparkes.model.CaseDeserializer;
import javasparkes.model.CaseNote;
import javasparkes.model.KafkaResponse;
import javasparkes.model.MasterCase;
import javasparkes.model.MasterDetails;

/**
 * @author swmohara
 *
 */
public class SparkKafkaReader {

	SetProperties setProperties = new SetProperties();
	
	SparkConfig sparkConfig = new SparkConfig();
	
	public static void main (String args[]) throws StreamingQueryException {
		
		//new SparkKafkaReader().readKafkaMaster("", new SparkKafkaReader().sparkConfig.caseSparkSession());
		new SparkKafkaReader().readKafkaCaseNote(new SparkKafkaReader().sparkConfig.caseSparkSession());
//		new SparkKafkaReader().readKafkaCase(new SparkKafkaReader().sparkConfig.caseSparkSession());
		
	}
	
	public void createAndPushMastercase(SparkSession sparkSession) {
		
		String case_number = "";
		
		// get Kafka Case Dataset
		Dataset<Case> caseDs = readKafkaCase(sparkSession);
		
		// get Kafka Master Dataset
		Dataset<MasterDetails> masterDs = readKafkaMaster(case_number,sparkSession);
		
		// join Case and Master to create masterCase
		Dataset<Row> masterCaseD = caseDs.join(masterDs, caseDs.col("CASE_NUMBER").equalTo(masterDs.col("caseNumber")));
		
		Map<String, String> elasticProp = new HashMap<String,String>();
		
		JavaEsSparkSQL.saveToEs(masterCaseD, "mastercase/mastercase",elasticProp);
	}
	
	
	public void oldCaseKafka() throws StreamingQueryException {
		SparkConfig sparkConfig = new SparkConfig();
		
		//JavaStreamingContext jsc = new JavaStreamingContext(sparkConfig.caseJavaSparkContext(), new Duration(2000));
		
		Map<String, String> kafkaProp = new HashMap<String, String>();
		kafkaProp.put("kafka.bootstrap.servers", /*"localhost:9092"*/"edsskafka-dev:9092");
		//kafkaProp.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
		//kafkaProp.put("value.deserializer", "javasparkes.model.CaseDeserializer");
		kafkaProp.put("kafka.subscribe", /*"com.cisco.cm.case"*/"edss_cm_dl_case");
		kafkaProp.put("enable.auto.commit", "true");
		kafkaProp.put("group.id", "CSOneES");
		
		Encoder<Case> caseEncoder = Encoders.bean(Case.class);
		
		Dataset<Row> df = sparkConfig.caseSparkSession()
				  .readStream()
				  .format("kafka")
				  .options(kafkaProp)
				  .load();//.as(caseEncoder);
		//System.out.println("Count : "+df.selectExpr("CAST(key AS STRING)", "CAST(value AS STRING)").collectAsList().size());
		
		//JavaEsSparkSQL.saveToEs(df,"spark/docs");
		
		StreamingQuery strQuery = df.writeStream()
				  .outputMode(OutputMode.Append())
				  .format("es")
				  .option("checkpointLocation", "/tmp/stream1_checkpoint1")
				  .start("index2/type1");
		
		strQuery.awaitTermination();
		
		/*StreamingQuery query = df.writeStream()
				  .outputMode(OutputMode.Append())
				  .format("console")
				  .start();
		
		query.awaitTermination();*/
		
		
		//Create D stream
		//JavaDStream<Row> dSTream ;//= jsc.
		
		
		//save JavaDStream to ES
		//JavaEsSparkStreaming.saveToEs(dSTream, "kafka/docs");
		
		//Require DataSet<?>
		//JavaEsSparkSQL.saveToEs(df,"spark/docs");
		
		//Require RDD
		//JavaEsSpark.saveToEs(arg0, arg1);
		
		//Require DataSet
		//EsSparkSQL.saveToEs(arg0, arg1);
		
		//Require DStream<?>
		//EsSparkStreaming.saveToEs(arg0, arg1);
	}
	
	
	
	
	public Dataset<Row> readR12Master(String caseNumber, SparkSession sparkSession) {
		
		String masterQuery = setProperties.getMasterDetailsQuery1()+caseNumber+setProperties.getMasterDetailsQuery2();/*"SELECT XSP1.PART_NUMBER AS 'hardwareDetails',"
				+ " XSP2.PART_NUMBER 'softwareDetails',"
				+ " HZ_P_SHIP.PARTY_NAME AS 'companySiteName',"
				+ " NVL(HZ_PART.PARTY_NAME,XCC.CURRENT_CONTACT_NAME) AS 'contactName',"
				+ " HZ_P_SHIP1.PARTY_NAME AS 'companyName',"
				+ " XXHDR.SERVICE_LINE_NAME AS 'contractType',"
				+ " XXHDR.SERVICE_LINE_STATUS AS 'serviceLineStatus',"
				+ " XDSC.CONTRACT_ATTRIBUTE7 AS 'contractUsageType',"
				+ " NVL (XFUX.ACCESS_LEVEL, 9999) AS 'contactTypeIndicator',"
				+ " XFUX.CCIE_NUMEBR              AS 'contactCCIENumber'"
				
				+ "FROM XXCTS_CM_CASE XCC,"
				+ " APPS.XXCTS_FEA_FND_USER_EXT XFUX, "
				+ " APPS.XXCCS_DS_SAHDR_CORE XDSC,"
				+ " APPS.XXCTS_ENT_CONTSUM_HDR XXHDR,"
				+ " APPS.HZ_PARTIES HZ_P_SHIP1,"
				+ " APPS.HZ_PARTIES HZ_PART,  "
				+ " APPS.HZ_PARTIES HZ_P_SHIP,"
				+ " APPS.HZ_CUST_ACCOUNTS HZ_CA_SHIP,"
				+ " APPS.HZ_LOCATIONS HZ_L_SHIP, "
				+ " APPS.HZ_PARTY_SITES HZ_PS_SHIP,"
				+ " APPS.HZ_CUST_SITE_USES_ALL HZ_CSUA_SHIP,"
				+ " APPS.HZ_CUST_ACCT_SITES_ALL HZ_CASA_SHIP,"
				+ " APPS.HZ_PARTIES HP,  APPS.XXCTS_SRM_PRODUCT_PARTS XSP1,  APPS.XXCTS_SRM_PRODUCT_PARTS XSP2,"
				+ " APPS.XXCTS_SRM_PART_VERSIONS XPV1, APPS.XXCTS_SRM_PART_VERSIONS XPV2"
				
				+ " WHERE  1 = 1 "
				+ " AND XDSC.CONTRACT_NUMBER(+) = XCC.CONTRACT_NUMBER AND UPPER (XFUX.USER_NAME(+)) = UPPER (XCC.CONTACT_CCO_ID)"
				+ " AND XXHDR.CONTRACT_NUMBER(+) = XCC.CONTRACT_NUMBER"
				+ " AND XXHDR.SERVICE_LINE_NUMBER(+) = 1"
				+ " AND HZ_P_SHIP1.PARTY_ID(+) = XCC.C3_CUSTOMER_ID"
				+ " AND XCC.CONTACT_CCO_ID = HZ_PART.ATTRIBUTE17(+)"
				+ " AND XCC.C3_SHIP_TO_SITE_ID = HZ_CSUA_SHIP.CUST_ACCT_SITE_ID(+)"
				+ " AND HZ_CSUA_SHIP.SITE_USE_CODE(+) = 'SHIP_TO'"
				+ " AND HZ_CASA_SHIP.CUST_ACCT_SITE_ID(+) = HZ_CSUA_SHIP.CUST_ACCT_SITE_ID"
				+ " AND HZ_CA_SHIP.CUST_ACCOUNT_ID(+) = HZ_CASA_SHIP.CUST_ACCOUNT_ID"
				+ " AND HZ_P_SHIP.PARTY_ID(+) = HZ_CA_SHIP.PARTY_ID"
				+ " AND HZ_PS_SHIP.PARTY_SITE_ID(+) = HZ_CASA_SHIP.PARTY_SITE_ID"
				+ " AND HZ_L_SHIP.LOCATION_ID(+) = HZ_PS_SHIP.LOCATION_ID"
				+ " AND HZ_PS_SHIP.PARTY_SITE_ID(+) = XCC.C3_INSTALL_SITE_ID"
				+ " AND XPV1.VERSION_ID(+) = XCC.C3_HW_VERSION_ID"
				+ " AND XPV2.VERSION_ID(+) = XCC.C3_SW_VERSION_ID"
				+ " AND XPV1.PRODUCT_PART_ID = XSP1.PRODUCT_PART_ID(+)"
				+ " AND XPV2.PRODUCT_PART_ID = XSP2.PRODUCT_PART_ID(+)"
				+ " AND XCC.CASE_NUMBER = "+caseNumber
				+ " AND ROWNUM = 1";*/
		
		Properties masterDetailsProp = new Properties();
		masterDetailsProp.put("url", setProperties.getDatasourceUrl());
		masterDetailsProp.put("user", setProperties.getDatasourceUsername());
		masterDetailsProp.put("password", setProperties.getDatasourcePassword());
		masterDetailsProp.put("dbtable", masterQuery);
		masterDetailsProp.put("Driver", setProperties.getDatasourceDriver());

		
		
		
		Dataset<Row> masterDf = sparkSession.read().jdbc(setProperties.getDatasourceUrl(), setProperties.getCaseTablename(), masterDetailsProp);
		
		/*Encoder<CaseNote> caseNoteEncoder = Encoders.bean(CaseNote.class);
		
		Dataset<CaseNote> caseNoteDS = sparkSession.read().jdbc(setProperties.getDatasourceUrl(), setProperties.getCaseTablename(), masterDetailsProp).as(caseNoteEncoder);
		caseNoteDS.printSchema();
		caseNoteDS.show(10);*/
		
		return masterDf;
	}
	
	
	

	public Dataset<MasterDetails> readKafkaMaster(String caseNumber, SparkSession sparkSession){
		Dataset<MasterDetails> masterDf = null;
		
		try {
			Map<String, String> kafkaProp = new HashMap<String, String>();
			kafkaProp.put("kafka.bootstrap.servers", "localhost:9092");
			//kafkaProp.put("kafka.key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
			//kafkaProp.put("kafka.value.deserializer", "javasparkes.model.MasterDetailsDeserializer");
			kafkaProp.put("subscribe", /*"com.cisco.cm.case"*/"masterTopic");
			kafkaProp.put("enable.auto.commit", "true");
			//kafkaProp.put("group.id", "CSOneES");
			
			StructType masterSchema = new StructType()
					.add("hardwareDetails","String")
					.add("softwareDetails","String")
					.add("companySiteName","String")
					.add("contactName","String")
					.add("companyName","String")
					.add("contractType","String")
					.add("serviceLineStatus","String")
					.add("contractUsageType","String")
					.add("contactTypeIndicator","String")
					.add("contactCCIENumber","String")
					.add("caseNumber","String");
			
			//Encoder<KafkaResponse> kafkaResponseEncoder = Encoders.bean(KafkaResponse.class);
			Encoder<MasterDetails> masterEncoder = Encoders.bean(MasterDetails.class);
			
			Dataset<MasterDetails> tempMasterDf = sparkSession
					  .readStream()
					  .format("kafka")
					  //.schema(masterSchema)
					  .options(kafkaProp)
					  .load()//.as(masterEncoder);
					  .selectExpr("CAST(value AS STRING) as masterDetails")
			            .select(functions.from_json(functions.col("masterDetails"),masterSchema).as("json"))
			            .select("json.*")
			            .as(masterEncoder);  
			
			masterDf = tempMasterDf;
			
			//Dataset<MasterCase> masterCaseDF = tempMasterDf.jo
			
			/*StreamingQuery query = tempMasterDf.writeStream()
					  .outputMode(OutputMode.Append())
					  .format("es")
					  .option("checkpointLocation", "/tmp/stream1_checkpoint2")
					  .start("masterindex/docs");
			query.awaitTermination();*/
			//==========================================
			
			/*tempMasterDf.takeAsList(10).forEach(res -> {
				ObjectMapper obM = new ObjectMapper();
				byte[] value = res.getValue().getBytes();
				try {
					MasterDetails mast = obM.readValue(value, MasterDetails.class);
					System.out.println("master : "+mast.getCompanyName());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});*/
			
			/*StreamingQuery query = tempMasterDf.writeStream()
					  .outputMode(OutputMode.Append())
					  .format("es")
					  .option("checkpointLocation", "/tmp/stream1_checkpoint2")
					  .start("kafka3/master");
			
			query.awaitTermination();*/
			
			//masterDf = tempMasterDf;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return masterDf;
	}
	
	
	
	
	public Dataset<Case> readKafkaCase(SparkSession sparkSession){
		
		Dataset<Case> caseDf = null;
		
		try {
			
			Map<String, String> kafkaProp = new HashMap<String, String>();
			
			kafkaProp.put("kafka.bootstrap.servers", "edsskafka-dev:9092");
			kafkaProp.put("subscribe", /*"com.cisco.cm.case"*/"edss_cm_dl_case");
			kafkaProp.put("enable.auto.commit", "true");
			kafkaProp.put("group.id", "CSOneES");
			kafkaProp.put("failOnDataLoss", "false");
			
			StructType caseSchema = new StructType()
					.add("CASE_ID","String")
					.add("CASE_NUMBER","String")
					.add("CS1_CASE_NUMBER","String")
					.add("CONTRACT_NUMBER","String")
					.add("CONTACT_CCO_ID","String")
					.add("TECH_ID","String")
					.add("SUB_TECH_ID","String")
					.add("PROBLEM_CODE_ID","String")
					.add("C3_SW_VERSION_ID","String")
					
					.add("C3_HW_VERSION_ID","String")
					.add("SHIP_TO_SITE_USE_ID","String")
					.add("CUSTOMER_PROVIDED_SER_NUMBER","String")
					.add("CASE_SUMMARY","String")
					.add("CASE_SUBJECT","String")
					.add("CASE_ORIGIN","String")
					.add("CASE_OWNER","String")
					.add("CS1_REASON","String")
					.add("CASE_CLOSED_DATE","String")
					
					.add("CASE_CREATED_DATE","String")
					.add("CASE_DESCRIPTION","String")
					.add("CASE_COMMENTS","String")
					.add("CASE_PRIORITY","String")
					.add("CASE_STATUS","String")
					.add("CASE_TYPE","String")
					.add("CASE_OWNER_CHANGES","String")
					.add("IS_ACCEPTED","String")
					.add("ACTION_CLASS","String")
					
					.add("ADDITIONAL_EMAIL_CC","String")
					.add("ALTERNATE_CONTACT_NAME","String")
					.add("ALTERNATE_EMAIL_ADDRESS","String")
					.add("ALTERNATE_PHONE","String")
					.add("B2B_URGENCY","String")
					.add("B2B_ESCALATED_TIME","String")
					.add("B2B_FLAG","String")
					.add("B2B_STATUS","String")
					.add("BILL_TO_PARTY_ID","String")
					
					.add("BILL_TO_SITE_C3_ID","String")
					.add("BILL_TO_SITE_USE_ID","String")
					.add("CALL_END_TIME","String")
					.add("CALL_PHONE_NUMBER","String")
					.add("CALL_START_TIME","String")
					.add("CASE_ACCEPTED_DATE","String")
					.add("CASE_IMPACT_CATEGORY","String")
					.add("CASE_IMPACT_STATUS","String")
					.add("CASE_IMPACT_USER_COUNT","String")
					
					.add("CASE_NOTIFICATION_SETTINGS","String")
					.add("CASE_OWNER_EMAIL_ID","String")
					.add("CASE_OWNER_ROLE","String")
					.add("CASE_REASON","String")
					.add("CISCO_ACCOUNT_ID","String")
					.add("COMMUNICATION_PREFERENCE","String")
					.add("CASE_COMPLEXITY","String")
					.add("CONTACT_ME","String")
					.add("CONTACT_ME_DATE","String")
					
					.add("CONTACT_ME_FROM_TIME","String")
					.add("CONTACT_ME_TIME","String")
					.add("CONTACT_ME_TIME_ZONE","String")
					.add("CONTACT_ME_TO_TIME","String")
					.add("CONTACT_SECONDARY_EMAIL","String")
					.add("CONTACT_TYPE","String")
					.add("CONTRACT_STATUS","String")
					.add("COUNTRY_INCIDENT","String")
					.add("ACTION_PLAN","String")
					
					.add("C3_CUSTOMER_ID","String")
					.add("CUSTOMER_CATEGORY","String")
					.add("CUSTOMER_ACTIVITY","String")
					.add("CUSTOMER_COM_BUIS_IMPACT","String")
					.add("CUSTOMER_COMPANY_NAME","String")
					.add("CUST_CONFIRM_PRIORITY_CHANGE","String")
					.add("CUSTOMER_CSAT","String")
					.add("CUSTOMER_SYMPTOM","String")
					.add("DATE_TIME_SURVEY_SENT","String")
					
					.add("DESCRIBE_TROUBLESHOOTING_DONE","String")
					.add("DESCRIBE_RECENT_ENV_CHANGES","String")
					.add("CSC_DISCUSSION_THREAD_ID","String")
					.add("DRAFT_CASE_NUMBER","String")
					.add("DSD_STATUS","String")
					.add("EF_PRODUCT_NAME","String")
					.add("EF_UNREACHABLE","String")
					.add("CS1_END_CLIENT_INFORMATION","String")
					.add("END_CUSTOMER_CASE_CREATE_DATE","String")
					
					.add("END_CUSTOMER_EMAIL","String")
					.add("ENGINEER_SLA_STATUS_NOTE","String")
					.add("ENTITLEMENT_STATUS","String")
					.add("ENTITLEMENT_AUDIT_ID","String")
					.add("ENTITLEMENT_REASON","String")
					.add("ENTITLEMENT_STATUS_CODE","String")
					.add("CUSTOMER_EPAGE","String")
					.add("ESCALATION_FLAG","String")
					.add("GR_GENERAL_OF_ACCOUNT","String")
					
					.add("GR_LAST_UPDATE_DATE","String")
					.add("GR_RMA_OF_ACCOUNT","String")
					.add("HELPDESK_TRACKING_NUMBER","String")
					.add("HTOM_EMAIL_ADDRESS","String")
					.add("CIN_INITIAL_ACCEPTNCE_DATE","String")
					.add("INITIAL_SOLUTION","String")
					.add("C3_INSTALL_SITE_ID","String")
					.add("INTERIM_CONTACT_EMAIL","String")
					.add("ISSUE_CATEGORY","String")
					
					
					.add("CIN_CR_SSB_ISSUE_REASON","String")
					.add("ISV_RESPONSE_STATUS","String")
					.add("CASE_LABEL","String")
					.add("RPT_LAST_REVIEW_DATE","String")
					.add("LATEST_ACTION_PLAN","String")
					.add("LATEST_PROBLEM_DESCRIPTION","String")
					.add("MANAGER_EMAIL","String")
					.add("MANAGER_GROUP_ALIAS","String")
					.add("MOBILE_PHONE","String")
					
					.add("NMTG_PRODUCT_VERSION","String")
					.add("NODE_NAME","String")
					.add("COMM_PREFERENCE_LANG","String")
					.add("ON_HOLD_DUE_DATE","String")
					.add("ORIGINAL_CONTACT_EMAIL","String")
					.add("OTHER_INFORMATION","String")
					.add("OWNER_ID","String")
					.add("OWNER_QUEUE","String")
					.add("OWNER_USER","String")
					
					.add("OWNER_PROFILE","String")
					.add("PARTNER_CASE_NUMBER","String")
					.add("PARTNER_CASE_OWNER_CCO_ID","String")
					.add("PARTNER_CASE_OWNER_EMAIL","String")
					.add("PARTNER_CASE_OWNER_NAME","String")
					.add("PARTNER_CASE_OWNER_PHONE","String")
					.add("PARTNER_NAME","String")
					.add("PARTNER_OWNER_GROUP_ID","String")
					.add("PARTNER_OWNER_GROUP_NAME","String")
					
					.add("PICA_ID","String")
					.add("PORTFOLIO_NUMBER","String")
					.add("PREVIOUS_QUEUE","String")
					.add("PRIORITY_INDICATION","String")
					.add("CASE_IMPACT_INCIDENT_TIME","String")
					.add("C3_PRODUCT_ID","String")
					.add("CIN_CR_LED_PRODUCT_TYPE","String")
					.add("CIN_CR_SSB_PRODUCT_TYPE","String")
					.add("PURCHASE_DATE","String")
					
					.add("REASON_CUST_CONSNT_NOT_TAKEN","String")
					.add("REASON_SURVEY_NOT_SENT","String")
					.add("REQUEST_CLASS","String")
					.add("REQUEST_SUB_CLASS","String")
					.add("REQUEST_TYPE","String")
					.add("REQUEUE_REASON","String")
					.add("MISQUEUE_REASON","String")
					.add("REQUEUE_REASON_DETAILS","String")
					.add("RESOLUTION_CODE","String")
					
					.add("RESOLUTION_SUMMARY","String")
					.add("CDS_RESOLUTION_SUMMARY","String")
					.add("ROUTE_OPTION_SELECTED","String")
					.add("RTO_AUDIT_ID","String")
					.add("RTO_FLAG","String")
					.add("SBSC_CHANNEL_CODE","String")
					.add("SBSC_RESOLUTION_COMMENT","String")
					.add("SCHEDULED_DISPATCH_TIME","String")
					.add("SCRUBBED_CUSTOMER_SYMPTOM","String")
					
					.add("SCRUBBED_RESOLUTION_CODE","String")
					.add("SCRUBBED_RESOLUTION_SUMMARY","String")
					.add("SCRUBBED_UNDERLYING_CAUSE","String")
					.add("SCRUBBED_UNDERLYING_CAUSE_CAT","String")
					.add("SEND_EMAIL_NOTIF_TO_CONTACT","String")
					.add("SERVICE_LINE_NAME","String")
					.add("EXTENDED_LOSS_OF_SERVICE","String")
					.add("SHIP_TO_PARTY_ID","String")
					.add("C3_SHIP_TO_SITE_ID","String")
					
					.add("SMART_ACCOUNT_ID","String")
					.add("SMART_SERVICE_PROGRAMS","String")
					.add("SN_INPUT_TYPE","String")
					.add("SW_VERSION","String")
					.add("SOLUTION_RELEASE","String")
					.add("SOLUTION_TYPE","String")
					.add("DATA_SOURCE_NAME","String")
					.add("SPOKEN_LANGUAGE","String")
					.add("SR_LANGUAGE","String")
					
					.add("SUBSCRIPTION_REFERENCE_ID","String")
					.add("SURVEY_OPT_OUT","String")
					.add("SURVEY_PREFERENCE","String")
					.add("SURVEY_SENT","String")
					.add("SURVEY_TYPE","String")
					.add("SVO_ACCESS_ENABLED","String")
					.add("CASE_TAG","String")
					.add("TICKET_NUMBER","String")
					.add("THIRD_PARTY_VENDOR","String")
					
					.add("UNDERLYING_CAUSE","String")
					.add("CASE_CATEGORY","String")
					.add("CASE_URGENCY","String")
					.add("CASE_CLOSE_SW_VERSION","String")
					.add("VIRTUAL_ACCOUNT_ID","String")
					.add("CUSTOMER_CALLED_SUPPORT_REASON","String")
					.add("RESOLUTION_WORKAROUND","String")
					.add("WORKGROUP_NAME","String")
					.add("LAST_UPDATE_DATE_C3_USER","String")
					
					.add("NETWORK_PROTOCOL","String")
					.add("PROTOCOL_DETAILS","String")
					.add("DEFECT_COUNT","String")
					.add("CASE_TOPOLOGY","String")
					.add("SLA_ATTAINMENT","String")
					.add("CONTACT_PERSONA","String")
					.add("CONTAINER_TYPE","String")
					.add("HIGHEST_ELIGIBLE_SEVERITY","String")
					.add("PARENT_CONTAINER_NAME","String")
					
					.add("SERVICE_TIER","String")
					.add("TAC_SUPPORT_COVERAGE","String")
					.add("CREATED_DATE","String")
					.add("CREATED_BY","String")
					.add("LAST_MODIFIED_DATE","String")
					.add("LAST_MODIFIED_BY","String")
					.add("C3_CREATION_DATE","String")
					.add("C3_CREATED_BY","String")
					.add("C3_LAST_MODIFIED_DATE","String")
			
					.add("C3_LAST_MODIFIED_BY","String")
					.add("CREATED_BY_C3","String")
					.add("MODIFIED_BY_C3","String")
					.add("CURRENT_CONTACT_PHONE","String")
					.add("CURRENT_CONTACT_EMAIL","String")
					.add("CURRENT_CONTACT_EXTENSION","String")
					.add("CURRENT_CONTACT_NAME","String");
			
			
			Encoder<Case> caseEncoder = Encoders.bean(Case.class);
			
			Dataset<Case> tempCaseDf = sparkSession
					  .readStream()
					  .format("kafka")
					  .options(kafkaProp)
					  .load()
					  .selectExpr("CAST(value AS STRING) as caseDetails")
			            .select(functions.from_json(functions.col("caseDetails"),caseSchema).as("json"))
			            .select("json.*")
			            .as(caseEncoder);
			
			caseDf = tempCaseDf;
			
			StreamingQuery query = tempCaseDf.writeStream()
					  .outputMode(OutputMode.Append())
					  .format("es")
					  .option("checkpointLocation", "/tmp/stream1_checkpoint2")
					  .start("caseindex/docs");
			
			query.awaitTermination();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return caseDf;
	}
	
	
	
	
	
	public Dataset<Row> readKafkaCaseNote(SparkSession sparkSession){
		Dataset<Row> caseNoteDf = null;
		
		try {
			Map<String, String> kafkaProp = new HashMap<String, String>();
			
			kafkaProp.put("kafka.bootstrap.servers", "edsskafka-dev:9092");
			kafkaProp.put("subscribe", /*"com.cisco.cm.case"*/"edss_cm_dl_notes");
			kafkaProp.put("enable.auto.commit", "true");
			kafkaProp.put("group.id", "CSOneES");
			kafkaProp.put("failOnDataLoss", "false");
			
			
			StructType caseNoteSchema = new StructType()
					.add("CASE_NOTES_ID","String")
					.add("CASE_NUMBER","String")
					.add("NOTE_TYPES","String")
					.add("CASE_NOTES_TITLE","String")
					.add("NOTE_NAME","String")
					.add("B2B_NOTE_STATUS","String")
					.add("CASE_NOTE_TYPE","String")
					.add("CASE_OWNER_EMAIL","String")
					.add("CS1_CREATION_DATE","String")
					.add("ENG_FAILURE_ANALYSIS","String")
					.add("NOTE_STATUS","String")
					
					.add("IS_JUNK","String")
					.add("LAST_EXTERNAL_UPDATE_TIME","String")
					.add("IS_DELETED","String")
					.add("NOTES_DETAILS","String")
					.add("NOTES_SUBSCRIPTION_ALERT","String")
					.add("NOTE_STATUS_VALUE","String")
					.add("OLD_CASE_COMMENT_ID","String")
					.add("RMA_ORDER_NUMBER","String")
					
					.add("CREATED_DATE","String")
					.add("CREATED_BY","String")
					.add("LAST_MODIFIED_DATE","String")
					.add("LAST_MODIFIED_BY","String")
					.add("C3_CREATION_DATE","String")
					.add("C3_CREATED_BY","String")
					.add("C3_LAST_MODIFIED_DATE","String")
					.add("C3_LAST_MODIFIED_BY","String")
					.add("CREATED_BY_C3","String")
					.add("MODIFIED_BY_C3","String");
			
			Encoder<CaseNote> caseNOteEncoder = Encoders.bean(CaseNote.class);
			
			Dataset<CaseNote> tempMasterDf = sparkSession
					  .readStream()
					  .format("kafka")
					  //.schema(masterSchema)
					  .options(kafkaProp)
					  .load()//.as(masterEncoder);
					  .selectExpr("CAST(value AS STRING) as noteDetails")
			            .select(functions.from_json(functions.col("noteDetails"),caseNoteSchema).as("json"))
			            .select("json.*")
			            .as(caseNOteEncoder);  
		
			
			StreamingQuery query = tempMasterDf.writeStream()
					  .outputMode(OutputMode.Append())
					  .format("es")
					  .option("checkpointLocation", "/tmp/stream1_checkpoint2")
					  .start("noteindex/docs");
			
			query.awaitTermination();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return caseNoteDf;
	}
}
