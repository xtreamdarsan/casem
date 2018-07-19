package javasparkes.inc;

import java.io.Serializable;
import java.util.*;

import org.apache.spark.api.java.function.ForeachFunction;
import org.apache.spark.api.java.function.MapFunction;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.ForeachWriter;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.functions;
import org.apache.spark.sql.streaming.OutputMode;
import org.apache.spark.sql.streaming.StreamingQueryException;
import org.apache.spark.sql.streaming.StreamingQueryManager;
import org.apache.spark.sql.streaming.StreamingQuery;
import org.apache.spark.sql.streaming.Trigger;
import org.apache.spark.sql.types.DataTypes;
import org.apache.spark.sql.types.StructField;
import org.apache.spark.sql.types.StructType;
import org.json.JSONObject;
import org.json4s.jackson.Json;
import org.mortbay.util.ajax.JSON;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.JsonObject;
import com.sun.research.ws.wadl.Option;

import scala.collection.JavaConversions;
import scala.collection.JavaConverters;
import scala.collection.Seq;
import static org.apache.spark.sql.functions.*;


//import org.apache.spark.sql.

public class SparkConsumer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	SparkSession spark;
	
	public SparkConsumer(){
		
		
		
		System.setProperty("hadoop.home.dir", "c:\\Winutils\\");
		  
	   	
		spark = SparkSession.builder().appName("DataFromKafka").master("local[*]").getOrCreate();
        
	
	}
	
	private static StructType buildSchema() {
	    
		StructType schema = new StructType(
	        new StructField[] {
	           // DataTypes.createStructField("name", DataTypes.StringType, true),
	           // DataTypes.createStructField("num_pets", DataTypes.IntegerType, true),
	           // DataTypes.createStructField("paid_in_full", DataTypes.BooleanType, true),
	            DataTypes.createStructField("",DataTypes.createMapType(DataTypes.StringType, DataTypes.StringType, true), true)
	            //DataTypes.createStructField("registered_on", DataTypes.DateType, true),
	            //DataTypes.createStructField("visits", 
	              //  DataTypes.createArrayType(DataTypes.TimestampType, true), true) 
	           });
	    return (schema);
	}
	
	void processRow(Row row){
		System.out.println("==============================processRow===========================");
		
		
		Seq<String> fields = JavaConverters.asScalaBufferConverter(Arrays.asList(row.schema().fieldNames())).asScala().toSeq();
		
		Dataset<Row> masterDF = getMasterDetails(row.getValuesMap(fields).get("CaseNumber").get()+"");
		masterDF.show();
		
		System.out.println("seq: "+row.getValuesMap(fields).get("CaseNumber").get()+"");
		//JSONObject caseObject = new JSONObject(row.getValuesMap(fields));
		//System.out.println("caseNumber : "+caseObject.keySet());
				
	}
	public Dataset<Row> getMasterDetails(String caseNumber) {
		
		System.out.println("getMasterDetails : "+caseNumber);
		
		Properties p = new Properties();
		p.put("user", "XXCTS_CM_API_U");
		p.put("password", "Ns5N_q6Y");
		p.put("Driver", "oracle.jdbc.driver.OracleDriver");
		
		//caseNumber = "681584469";
		
		String URL="jdbc:oracle:thin:@173.38.69.54:1541/TS3CSF_SRVC_RO.cisco.com";
		Dataset<Row> jdbcDF = spark.read().jdbc(URL,"(SELECT XSP1.PART_NUMBER AS hardwareDetails,XSP2.PART_NUMBER AS softwareDetails,HZ_P_SHIP.PARTY_NAME AS companySiteName,NVL(HZ_PART.PARTY_NAME,XCC.CURRENT_CONTACT_NAME) AS contactName,  HZ_P_SHIP1.PARTY_NAME AS companyName, XXHDR.SERVICE_LINE_NAME AS contractType,   XXHDR.SERVICE_LINE_STATUS AS serviceLineStatus,  XDSC.CONTRACT_ATTRIBUTE7 AS contractUsageType,  NVL (XFUX.ACCESS_LEVEL, 9999) AS contactTypeIndicator,  XFUX.CCIE_NUMEBR AS contactCCIENumber, XCC.CASE_NUMBER As caseNumber FROM XXCTS_CM_CASE XCC, APPS.XXCTS_FEA_FND_USER_EXT XFUX,  APPS.XXCCS_DS_SAHDR_CORE XDSC,  APPS.XXCTS_ENT_CONTSUM_HDR XXHDR, APPS.HZ_PARTIES HZ_P_SHIP1,  APPS.HZ_PARTIES HZ_PART,  APPS.HZ_PARTIES HZ_P_SHIP,  APPS.HZ_CUST_ACCOUNTS HZ_CA_SHIP,  APPS.HZ_LOCATIONS HZ_L_SHIP,  APPS.HZ_PARTY_SITES HZ_PS_SHIP, APPS.HZ_CUST_SITE_USES_ALL HZ_CSUA_SHIP, APPS.HZ_CUST_ACCT_SITES_ALL HZ_CASA_SHIP,  APPS.HZ_PARTIES HP,  APPS.XXCTS_SRM_PRODUCT_PARTS XSP1,  APPS.XXCTS_SRM_PRODUCT_PARTS XSP2,  APPS.XXCTS_SRM_PART_VERSIONS XPV1,  APPS.XXCTS_SRM_PART_VERSIONS XPV2	WHERE  1 = 1 AND XDSC.CONTRACT_NUMBER(+) = XCC.CONTRACT_NUMBER AND UPPER (XFUX.USER_NAME(+)) = UPPER (XCC.CONTACT_CCO_ID) AND XXHDR.CONTRACT_NUMBER(+) = XCC.CONTRACT_NUMBER AND XXHDR.SERVICE_LINE_NUMBER(+) = 1 AND HZ_P_SHIP1.PARTY_ID(+) = XCC.C3_CUSTOMER_ID AND XCC.CONTACT_CCO_ID = HZ_PART.ATTRIBUTE17(+) AND XCC.C3_SHIP_TO_SITE_ID = HZ_CSUA_SHIP.CUST_ACCT_SITE_ID(+) AND HZ_CSUA_SHIP.SITE_USE_CODE(+) = 'SHIP_TO' AND HZ_CASA_SHIP.CUST_ACCT_SITE_ID(+) = HZ_CSUA_SHIP.CUST_ACCT_SITE_ID  AND HZ_CA_SHIP.CUST_ACCOUNT_ID(+) = HZ_CASA_SHIP.CUST_ACCOUNT_ID AND HZ_P_SHIP.PARTY_ID(+) = HZ_CA_SHIP.PARTY_ID AND HZ_PS_SHIP.PARTY_SITE_ID(+) = HZ_CASA_SHIP.PARTY_SITE_ID AND HZ_L_SHIP.LOCATION_ID(+) = HZ_PS_SHIP.LOCATION_ID AND HZ_PS_SHIP.PARTY_SITE_ID(+) = XCC.C3_INSTALL_SITE_ID AND XPV1.VERSION_ID(+) = XCC.C3_HW_VERSION_ID AND XPV2.VERSION_ID(+) = XCC.C3_SW_VERSION_ID AND XPV1.PRODUCT_PART_ID = XSP1.PRODUCT_PART_ID(+) AND XPV2.PRODUCT_PART_ID = XSP2.PRODUCT_PART_ID(+) AND XCC.CASE_NUMBER = "+caseNumber+" AND ROWNUM = 1) APPS", p);
		
		/*jdbcDF.toJSON().foreach((ForeachFunction<String>) row ->{
			
			JSONObject jsonObject = new JSONObject(row);
			
			System.out.println("caseNumber : "+jsonObject.get("CASENUMBER"));
			
		});*/
		
		//jdbcDF.selectExpr("cast (value as string) as json").select(from_json("json").as("data")).select("data.*");
		
		jdbcDF.printSchema();
		
		jdbcDF.show();
		
		return jdbcDF;
	}
	
	public void Consumer(String FileNm){
		
		StructType keySchema = new StructType().add("key", "string").add("value", "string");

		//=======================================================

		/*Properties p = new Properties();
		p.put("user", "XXCTS_CM_API_U");
		p.put("password", "Ns5N_q6Y");
		p.put("Driver", "oracle.jdbc.driver.OracleDriver");
		
		
		String URL="jdbc:oracle:thin:@173.38.69.54:1541/TS3CSF_SRVC_RO.cisco.com";
		Dataset<Row> jdbcDF = spark.read().jdbc(URL,"(SELECT XSP1.PART_NUMBER AS hardwareDetails,XSP2.PART_NUMBER AS softwareDetails,HZ_P_SHIP.PARTY_NAME AS companySiteName,NVL(HZ_PART.PARTY_NAME,XCC.CURRENT_CONTACT_NAME) AS contactName,  HZ_P_SHIP1.PARTY_NAME AS companyName, XXHDR.SERVICE_LINE_NAME AS contractType,   XXHDR.SERVICE_LINE_STATUS AS serviceLineStatus,  XDSC.CONTRACT_ATTRIBUTE7 AS contractUsageType,  NVL (XFUX.ACCESS_LEVEL, 9999) AS contactTypeIndicator,  XFUX.CCIE_NUMEBR AS contactCCIENumber, XCC.CASE_NUMBER As caseNumber FROM XXCTS_CM_CASE XCC, APPS.XXCTS_FEA_FND_USER_EXT XFUX,  APPS.XXCCS_DS_SAHDR_CORE XDSC,  APPS.XXCTS_ENT_CONTSUM_HDR XXHDR, APPS.HZ_PARTIES HZ_P_SHIP1,  APPS.HZ_PARTIES HZ_PART,  APPS.HZ_PARTIES HZ_P_SHIP,  APPS.HZ_CUST_ACCOUNTS HZ_CA_SHIP,  APPS.HZ_LOCATIONS HZ_L_SHIP,  APPS.HZ_PARTY_SITES HZ_PS_SHIP, APPS.HZ_CUST_SITE_USES_ALL HZ_CSUA_SHIP, APPS.HZ_CUST_ACCT_SITES_ALL HZ_CASA_SHIP,  APPS.HZ_PARTIES HP,  APPS.XXCTS_SRM_PRODUCT_PARTS XSP1,  APPS.XXCTS_SRM_PRODUCT_PARTS XSP2,  APPS.XXCTS_SRM_PART_VERSIONS XPV1,  APPS.XXCTS_SRM_PART_VERSIONS XPV2	WHERE  1 = 1 AND XDSC.CONTRACT_NUMBER(+) = XCC.CONTRACT_NUMBER AND UPPER (XFUX.USER_NAME(+)) = UPPER (XCC.CONTACT_CCO_ID) AND XXHDR.CONTRACT_NUMBER(+) = XCC.CONTRACT_NUMBER AND XXHDR.SERVICE_LINE_NUMBER(+) = 1 AND HZ_P_SHIP1.PARTY_ID(+) = XCC.C3_CUSTOMER_ID AND XCC.CONTACT_CCO_ID = HZ_PART.ATTRIBUTE17(+) AND XCC.C3_SHIP_TO_SITE_ID = HZ_CSUA_SHIP.CUST_ACCT_SITE_ID(+) AND HZ_CSUA_SHIP.SITE_USE_CODE(+) = 'SHIP_TO' AND HZ_CASA_SHIP.CUST_ACCT_SITE_ID(+) = HZ_CSUA_SHIP.CUST_ACCT_SITE_ID  AND HZ_CA_SHIP.CUST_ACCOUNT_ID(+) = HZ_CASA_SHIP.CUST_ACCOUNT_ID AND HZ_P_SHIP.PARTY_ID(+) = HZ_CA_SHIP.PARTY_ID AND HZ_PS_SHIP.PARTY_SITE_ID(+) = HZ_CASA_SHIP.PARTY_SITE_ID AND HZ_L_SHIP.LOCATION_ID(+) = HZ_PS_SHIP.LOCATION_ID AND HZ_PS_SHIP.PARTY_SITE_ID(+) = XCC.C3_INSTALL_SITE_ID AND XPV1.VERSION_ID(+) = XCC.C3_HW_VERSION_ID AND XPV2.VERSION_ID(+) = XCC.C3_SW_VERSION_ID AND XPV1.PRODUCT_PART_ID = XSP1.PRODUCT_PART_ID(+) AND XPV2.PRODUCT_PART_ID = XSP2.PRODUCT_PART_ID(+) AND XCC.CASE_NUMBER ='681584469' AND ROWNUM = 1) APPS", p);
		
		jdbcDF.printSchema();
		
		jdbcDF.show();*/
		
		//========================================================
		
//		Dataset<Row> tempCaseDF = spark
//				
//				.read()
//				.format("kafka")
//				.option("startingoffsets", "earliest")
//				.option("subscribe", "edss_cm_dl_case")
//				.option("kafka.bootstrap.servers","edsskafka-dev:9092")
//				.option("group.id", "CSOneES")
//				//.option("topic","testCase")
//				.option("maxOffsetsPerTrigger", 1)
//				.load().selectExpr("CAST(value AS STRING)");
//		
//		tempCaseDF.printSchema();
//		
//		tempCaseDF.show();
//		
//		List<String> caseNumberList = new ArrayList<>();
//		
//		tempCaseDF.toJSON().foreach((ForeachFunction<String>) row ->{
//		
//		JSONObject jsonObject = new JSONObject(row);
//		
//		String caseString = jsonObject.getString("value");
//		
//		JSONObject caseObject = new JSONObject(caseString);
//		
//		System.out.println("caseNumber : "+/*caseObject.get("CaseNumber")*/caseObject.getString("CaseNumber"));
//		
//		caseNumberList.add(caseObject.getString("CaseNumber"));
//		
//		});
//		
//		tempCaseDF.select(functions.get_json_object(functions.col("value"), "$.")).as("caseObject");
//		
//		tempCaseDF.show();
		
		/*caseNumberList.forEach(caseNumber -> {
			
			Dataset<Row> masterDF = getMasterDetails(caseNumber);
			
			tempCaseDF.join(masterDF,tempCaseDF.col("CaseNumber"));
			
			
		});*/
		
		//=======================================================
		
		StructType caseSchema=null;
		
		caseSchema = spark.read()
				  .option("multiLine", true)
				  .json(FileNm)
				   .schema();
		
		ForeachWriter<Row> foreachWriter = new ForeachWriter<Row>() {

			private static final long serialVersionUID = 1L;

			@Override
			public void close(Throwable arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean open(long arg0, long arg1) {
				// TODO Auto-generated method stub
				return true;
			}

			@Override
			public void process(Row row) {
				
				processRow(row);
				
			}
		};
		
		Dataset<Row> caseDF = spark.readStream()
				.format("kafka")
				.option("startingoffsets", "earliest")
				.option("subscribe", "edss_cm_dl_case")
				.option("kafka.bootstrap.servers","edsskafka-dev:9092")
				.option("group.id", "CSOneES")
				.option("failOnDataLoss", "false")
				.load()
				.selectExpr("CAST (value AS String) as caseDetails")
				.select(functions.from_json(functions.col("caseDetails"),caseSchema).as("json"))
				.select("json.*");
		
		
		
				try {
					
					caseDF.writeStream()
					.foreach(foreachWriter)
					.outputMode(OutputMode.Append())
					//.format("console")
					//.option("checkpointLocation", "C:/comitlogs/notechkpoint")
					.start()
					
					.awaitTermination();
					
				} catch (StreamingQueryException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		//=======================================================
		/*Dataset<Row> caseDF = spark
				
				.readStream()
				.format("kafka")
				.option("startingoffsets", "earliest")
				.option("subscribe", "edss_cm_dl_case")
				.option("kafka.bootstrap.servers","edsskafka-dev:9092")
				.option("group.id", "CSOneES")
				//.option("topic","testCase")
				.option("maxOffsetsPerTrigger", 1)
				.load();
		
		
		
		StructType schemaImp=null;
		
		schemaImp = spark.read()
				  .option("multiLine", true)
				  .json(FileNm)
				   .schema();				  
		String caseNumber = null;
		
		Dataset<Row> df4 = caseDF.selectExpr("CAST(value AS STRING)").select(from_json(col("value"),schemaImp)).as("data");
		
		//Dataset<Row> df5 =df4.select("data.jsontostructs(value)");
		
		//df4.printSchema();
		//Dataset<Row> df6 = df4.join(jdbcDF,df4.col("data.jsontostructs(value).CaseNumber").equalTo(jdbcDF.col("CaseNumber")),"inner");
		
		//Dataset<Row> df6 = df4.join(getMasterDetails(df4.select(functions.get_json_object(functions.col("caseDetails"), "$.caseNumber")).),df4.col("data.jsontostructs(value).CaseNumber").equalTo(jdbcDF.col("CaseNumber")),"inner");
		
		
		ForeachWriter<Row> foreachWriter = new ForeachWriter<Row>() {

			*//**
			 * 
			 *//*
			private static final long serialVersionUID = 1L;

			@Override
			public void close(Throwable arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean open(long arg0, long arg1) {
				// TODO Auto-generated method stub
				return true;
			}

			@Override
			public void process(Row row) {

				System.out.println("inside process");
				//processRow(row);
				
			}
		};
		
		StreamingQuery query1 = df4
				.selectExpr("to_json(struct(*)) AS value")
			   .writeStream()
			   //.foreach(foreachWriter)
      		  .outputMode(OutputMode.Append())
      		.format("console")
      		  .option("truncate",false)
      		  .option("numrows", 200)
      		  .trigger(Trigger.ProcessingTime(10000))
      		  .start();
      		  
      try {
			query1.awaitTermination();
		} catch (StreamingQueryException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
      
		
				
		spark.stop();
		spark.close();
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("<-- Started Consuming--->");
		
		
		SparkConsumer SP = new SparkConsumer();
		SP.Consumer(args[0]);
		//SP.getMasterDetails("");
		

	}

}
