package javasparkes.inc;

import java.util.HashMap;
import java.util.Map;

import org.apache.spark.sql.Encoder;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.functions;
import org.apache.spark.sql.streaming.OutputMode;
import org.apache.spark.sql.streaming.StreamingQueryException;
import org.apache.spark.sql.types.StructType;

import javasparkes.model.CaseNote;

public class CaseNoteKafkaService {

	public static void main(String[] args) {

		SparkSession sparkSession = SparkSession.builder()
				.appName("note_kafka")
				.master("local[*]")
				.getOrCreate();
		
		Map<String, String> noteKafkaProp = new HashMap<String, String>();
		
		noteKafkaProp.put("kafka.bootstrap.servers", "edsskafka-dev:9092");
		noteKafkaProp.put("subscribe","edss_cm_dl_notes");
		noteKafkaProp.put("enable.auto.commit", "true");
		noteKafkaProp.put("group.id", "CSOneES");
		noteKafkaProp.put("failOnDataLoss", "false");
		noteKafkaProp.put("auto.offset.reset", "smallest");
		
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
		
		
		try {
			sparkSession
				.readStream()
				.format("kafka")
				.options(noteKafkaProp)
				.load()
				.selectExpr("CAST(value AS STRING) as noteDetails")
				.select(functions.from_json(functions.col("noteDetails"),caseNoteSchema).as("json"))
				.select("json.*")

			
				.writeStream()
					/*.outputMode(OutputMode.Append())
					.format("es")
					.option("checkpointLocation", "C:/comitlogs/notechkpoint")
					.start("casenote/docs")*/
				
					.outputMode(OutputMode.Append())
					.format("console")
					.option("checkpointLocation", "C:/comitlogs/notechkpoint")
					.start()
			
			.awaitTermination();
			
		} catch (StreamingQueryException e) {
			
			sparkSession.close();
			e.printStackTrace();
			
		}
	}
}
