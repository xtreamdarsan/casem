/**
 * 
 */
package javasparkes.inc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.spark.api.java.function.ForeachFunction;
import org.apache.spark.api.java.function.MapFunction;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoder;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.functions;
import org.apache.spark.sql.streaming.OutputMode;
import org.apache.spark.sql.streaming.StreamingQuery;
import org.apache.spark.sql.types.DataType;
import org.apache.spark.sql.types.StructType;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;

import javasparkes.model.Case;
import kafka.utils.Json;
import scala.util.parsing.json.JSONObject;

/**
 * @author swmohara
 *
 */
public class CaseKafkaService {


	public static void main(String[] args) {
		
		SparkSession sparkSession = SparkSession.builder()
				.appName("note_kafka")
				.master("local[*]")
				.getOrCreate();
		
		Map<String, String> kafkaProp = new HashMap<String, String>();
		
		kafkaProp.put("kafka.bootstrap.servers", "edsskafka-dev:9092");
		kafkaProp.put("subscribe","edss_cm_dl_case");
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
				.add("LastModifiedDate","String")
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
		
		
		try {
			
			
			Encoder<JSONObject> caseEncoder = Encoders.bean(JSONObject.class);
			
			//Encoder<JsonObject> jsonEncoder = Encoders.bean(JsonObject.class);
			
			JsonObject json = new JsonObject();
			
			Dataset<Row> caseDF = sparkSession.readStream()
					.format("kafka")
					.options(kafkaProp)
					.load()
					.select("value")
					.selectExpr("CAST (key AS value) AS caseDetails");
					//.select(functions./*to_json("value")*/from_json(functions.col("caseDetails"),DataType.fromJson("value")).as("json"))
		            //.select(functions.get_json_object(functions.col("caseDetails"), "$"));//_json(functions.col("caseDetails")))
					//.select("json.*");
					
			caseDF.printSchema();
			
			/*caseDF.map((MapFunction<Row, JSONObject>) caseDetails ->{
				
				  ObjectMapper mapper = new ObjectMapper();
				  
				  JSONObject caseO =  mapper.readValue(caseDetails.getString(0), JSONObject.class);
				   
				  System.out.println("sdfsfdsf : "+caseO.toString());
				  
				  return caseO;
				  
			  }, caseEncoder);*/
					
			caseDF.writeStream()
				.outputMode(OutputMode.Append())
				.format("console")
				.option("checkpointlocation", "C:\\comitlogs\\casekafka")
				.start()
				
				.awaitTermination();
			
//			Dataset<Row> caseDF = sparkSession
//					  .readStream()
//					  .format("kafka")
//					  .options(kafkaProp)
//					  .load()
//					  .selectExpr("CAST(value AS STRING) as caseDetails")
//			            .select(functions.from_json(functions.col("caseDetails"),caseSchema).as("json"))
//			            .select("json.*");
			
//			caseDF.foreach((ForeachFunction<Row>) row -> 
//			
//					//row.getMap(0).get("");
//					
//					//masterDF = getMasterDetails(row.getMap(0).get(""););
//					
//					);
			
//			caseDF
//				
//						.writeStream()
//			          
//			          	.outputMode(OutputMode.Append())
//						.format("console")
//						.option("checkpointLocation", "C:/comitlogs/casechkpoint")
//						.start()
			          
//					  	.outputMode(OutputMode.Append())
//					  	.format("es")
//					  	.option("checkpointLocation", "C:/comitlogs/casechkpoint")
//					  	.start("caseindex/docs")
			
					 // .awaitTermination();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
