/**
 * 
 */
package javasparkes.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

import org.apache.spark.api.java.function.FilterFunction;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.api.java.function.ForeachFunction;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.VoidFunction;
import org.apache.spark.sql.Column;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoder;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.ForeachWriter;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SQLContext;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.functions;
import org.apache.spark.sql.streaming.OutputMode;
import org.apache.spark.sql.streaming.StreamingQueryException;
import org.apache.spark.sql.streaming.Trigger;
import org.apache.spark.sql.types.StructType;
import org.elasticsearch.spark.sql.api.java.JavaEsSparkSQL;

import javasparkes.config.SetProperties;
import javasparkes.config.SparkConfig;
import javasparkes.model.Case;
import javasparkes.model.MasterDetails;
import scala.Function1;
import scala.Tuple2;
import scala.runtime.BoxedUnit;

/**
 * @author swmohara
 *
 */
public class TestApp {

	SetProperties setProperties = new SetProperties();
	
	SparkConfig sparkConfig = new SparkConfig();
	
	public static void main(String[] args) throws StreamingQueryException {
		// TODO Auto-generated method stub
		new TestApp().merger();
	}

	
	
	public void merger() throws StreamingQueryException {
	
		SparkSession sparkSession = SparkSession.builder()
				.appName("SparkES")
				.master("local[*]")
				.getOrCreate();//new TestApp().sparkConfig.caseSparkSession();
		
		//======================================================
		
		/*Map<String, String> kafkaProp = new HashMap<String, String>();
		kafkaProp.put("kafka.bootstrap.servers", "localhost:9092");
		kafkaProp.put("subscribe", "testCase");
		kafkaProp.put("enable.auto.commit", "true");
		kafkaProp.put("auto.offset.reset", "smallest");
		
		StructType caseSchema = new StructType()
				.add("caseNumber","String")
				.add("caseContact","String")
				.add("caseAdd","String");
		
		Encoder<TestCase> caseEncoder = Encoders.bean(TestCase.class);
		
		Dataset<TestCase> caseDf = sparkSession
				  .readStream()
				  .format("kafka")
				  .options(kafkaProp)
				  .load()
				  .selectExpr("CAST(value AS STRING) as masterDetails")
		            .select(functions.from_json(functions.col("masterDetails"),caseSchema).as("json"))
		            .select("json.*")
		            .as(caseEncoder);
		            
		caseDf.writeStream()
					.outputMode(OutputMode.Append())
					.format("es")
					.option("checkpointLocation", "/tmp/mastercasetemp")
					.start("es/docs")
					
					.awaitTermination();
		
		
		Dataset<Row> caseDF = sparkSession.readStream()
		.format("kafka")
		.options(kafkaProp)
		.load();
		
		Dataset<Row> valueDF = caseDF.selectExpr("CAST(value AS STRING)","CAST(key AS STRING)"
				,"CAST(partition AS STRING)","CAST(offset AS STRING)"
				,"CAST(timestamp AS STRING)","CAST(topic AS STRING)","CAST(timestampType AS STRING)");
		
		Dataset<Row> df =  sparkSession.read().json(valueDF.toJSON());
		
		
		
		valueDF.writeStream()
		
		.format("console")
		.option("truncate", false)
		.trigger(Trigger.ProcessingTime("10 seconds"))
		.outputMode(OutputMode.Append())
		.queryName("from-kafka-to-console")
		.start()
		
		.format("es")
		.option("truncate", false)
		.trigger(Trigger.ProcessingTime("10 seconds"))
		.outputMode(OutputMode.Append())
		.option("checkpointLocation", "/tmp/casetemp")
		.queryName("from-kafka-to-es")		
		.start("cses4/docs")
		
		.awaitTermination();*/
		
		//=======================================================
		
		Map<String, String> masterkafkaProp = new HashMap<String, String>();
		masterkafkaProp.put("kafka.bootstrap.servers", "localhost:9092");
		masterkafkaProp.put("subscribe", "testMaster");
		masterkafkaProp.put("enable.auto.commit", "true");
		masterkafkaProp.put("auto.offset.reset", "smallest");
		
		StructType masterSchema = new StructType()
				.add("caseNumber","String")
				.add("masterName","String")
				.add("masterAddress","String");
		
		Encoder<TestMaster> masterEncoder = Encoders.bean(TestMaster.class);
		
		/*Dataset<TestMaster> MasterDf = */sparkSession
				  .readStream()
				  .format("kafka")
				  .options(masterkafkaProp)
				  .load()
				  .selectExpr("CAST(value AS STRING) as masterDetails")
		            .select(functions.from_json(functions.col("masterDetails"),masterSchema).as("json"))
		            .select("json.*")
		            //.as(masterEncoder)
		            
		            .writeStream()
					
//		            .outputMode(OutputMode.Append())
//					.format("console")
//					.start()
					
					.outputMode(OutputMode.Append())
					.format("es")
					.option("checkpointLocation", "C:/comitlogs/masterchkpoint")
					.start("index1/docs")
					
					.awaitTermination();
		
		//====================================
		
		/*caseDf.join(MasterDf, caseDf.col("caseNumber").equalTo(MasterDf.col("caseNumber")))
		//.join(MasterDf,MasterDf.col("caseNumber"))
			.writeStream()
			.outputMode(OutputMode.Append())
			.format("console")
			.trigger(Trigger.ProcessingTime("10 seconds"))
			//.option("checkpointLocation", "/tmp/mastercasetemp")
			.start()
			.format("es")
			.outputMode(OutputMode.Append())
			//.option("checkpointLocation", "/tmp/mastercasetemp")
			.start("mastercase/mastercase")
			.awaitTermination();*/
		//====================================
		
		
		
		/*SQLContext sqlContext = new SQLContext(sparkSession);
		
		Dataset<Row> DF = sqlContext.read().json(transformedDF.toJSON().javaRDD());
		
		DF.show(10);*/
		
		//==================================
	}
	
	
	public void createAndPushMastercase(SparkSession sparkSession) {
		
		String case_number = "";
		
		// get Kafka Case Dataset
		Dataset<TestCase> caseDs = readKafkaCase(new TestApp().sparkConfig.caseSparkSession());
		
		// get Kafka Master Dataset
		Dataset<TestMaster> masterDs = readKafkaMaster(new TestApp().sparkConfig.caseSparkSession());
		
		// join Case and Master to create masterCase
		Dataset<Row> masterCaseD = caseDs.join(masterDs, caseDs.col("caseNumber").equalTo(masterDs.col("caseNumber")));
		
		Map<String, String> elasticProp = new HashMap<String,String>();
		
		masterCaseD
			.writeStream()
			.outputMode(OutputMode.Append())
			.format("es")
			.option("checkpointLocation", "/tmp/mastercasetemp")
			.start("mastercase/mastercase");
		
		
		//JavaEsSparkSQL.saveToEs(masterCaseD, "mastercase/mastercase",elasticProp);
	}
	
	
	public Dataset<TestCase> readKafkaCase(SparkSession sparkSession){
		
		Dataset<TestCase> masterDf = null;
		
		try {
			Map<String, String> kafkaProp = new HashMap<String, String>();
			kafkaProp.put("kafka.bootstrap.servers", "localhost:9092");
			kafkaProp.put("subscribe", "testMaster");
			kafkaProp.put("enable.auto.commit", "true");
			
			StructType masterSchema = new StructType()
					.add("caseNumber","String")
					.add("caseContact","String")
					.add("caseAdd","String");
			
			Encoder<TestCase> masterEncoder = Encoders.bean(TestCase.class);
			
			Dataset<TestCase> tempMasterDf = sparkSession
					  .readStream()
					  .format("kafka")
					  .options(kafkaProp)
					  .load()
					  .selectExpr("CAST(value AS STRING) as masterDetails")
			            .select(functions.from_json(functions.col("masterDetails"),masterSchema).as("json"))
			            .select("json.*")
			            .as(masterEncoder);
			
			masterDf = tempMasterDf;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return masterDf;
	}
	
	
	public Dataset<TestMaster> readKafkaMaster(SparkSession sparkSession){
		
		Dataset<TestMaster> masterDf = null;
		
		try {
			Map<String, String> kafkaProp = new HashMap<String, String>();
			kafkaProp.put("kafka.bootstrap.servers", "localhost:9092");
			kafkaProp.put("subscribe", /*"com.cisco.cm.case"*/"testMaster");
			kafkaProp.put("enable.auto.commit", "true");
			
			StructType masterSchema = new StructType()
					.add("caseNumber","String")
					.add("masterName","String")
					.add("masterAddress","String");
			
			Encoder<TestMaster> masterEncoder = Encoders.bean(TestMaster.class);
			
			Dataset<TestMaster> tempMasterDf = sparkSession
					  .readStream()
					  .format("kafka")
					  .options(kafkaProp)
					  .load()
					  .selectExpr("CAST(value AS STRING) as masterDetails")
			            .select(functions.from_json(functions.col("masterDetails"),masterSchema).as("json"))
			            .select("json.*")
			            .as(masterEncoder);  
			
			masterDf = tempMasterDf;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return masterDf;
	}
	
	
}
