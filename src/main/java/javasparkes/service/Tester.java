/**
 * 
 */
package javasparkes.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoder;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.Row;
import org.elasticsearch.spark.rdd.api.java.JavaEsSpark;

import javasparkes.config.SetProperties;
import javasparkes.config.SparkConfig;
import javasparkes.model.CaseNote;

/**
 * @author swmohara
 *
 */
public class Tester {

	SparkConfig sparkConfig = new SparkConfig();
	
	SetProperties setProperties = new SetProperties();
	
	public static void main(String args[]) {
		
		new Tester().fetchAndPushCaseNoteToEs();
	}
	
	public void fetchAndPushCaseNoteToEs() {
		
		System.out.println("fetchCaseBySpark !!!");
		
		
		String URL = "jdbc:oracle:thin:@scan-nprd-2023:1541/DV3CSF_SRVC_OTH.cisco.com";
		
		String caseNoteQuery = "SELECT * FROM XXCTS_CM_CASE_NOTES WHERE CASE_NUMBER IN "
				+ "(  SELECT CASE_NUMBER FROM XXCTS_CM_CASE_NOTES xccn WHERE 1 = 1 AND CASE_NUMBER IN "
				+ "(  SELECT xcc.CASE_NUMBER FROM XXCTS_CM_CASE_NOTES xccn, XXCTS_CM_CASE xcc "
				+ "WHERE 1 = 1 AND xcc.CASE_NUMBER = xccn.CASE_NUMBER AND xcc.CASE_CREATED_DATE > SYSDATE - 84.6 "
				+ "GROUP BY xcc.CASE_NUMBER ) GROUP BY CASE_NUMBER HAVING COUNT (1) < 15) AND ROWNUM <= 3";
		
		Properties caseNoteProp = new Properties();
		caseNoteProp.put("url", URL);
		caseNoteProp.put("user", "APPS");
		caseNoteProp.put("password", "refrig3r8");
		caseNoteProp.put("dbtable", caseNoteQuery/*"XXCTS_CM_CASE_NOTES_TEMP"*/);
		caseNoteProp.put("Driver", "oracle.jdbc.driver.OracleDriver");

		
		
		/*Dataset<Row> noteDF = sparkConfig.caseSparkSession().read().jdbc(URL, "XXCTS_CM_CASE_NOTES_TEMP", caseNoteProp);
		noteDF.printSchema();
		noteDF.show(10);*/
		
		Encoder<CaseNote> caseNoteEncoder = Encoders.bean(CaseNote.class);
		
		Dataset<CaseNote> caseNoteDS = sparkConfig.caseSparkSession().read().jdbc(URL, "XXCTS_CM_CASE_NOTES_TEMP", caseNoteProp).as(caseNoteEncoder);
		caseNoteDS.printSchema();
		caseNoteDS.show(10);
		
		
		/*Map<String, String> caseNotePro = new HashMap<String, String>();
		caseNoteProp.put("es.index.auto.create", setProperties.getEsIndexAutoCreate());
		caseNoteProp.put("es.mapping.id", "CASE_NOTES_ID");
		caseNoteProp.put("es.write.operation", setProperties.getEsWriteOperation());
		
		JavaEsSpark.saveToEs(caseNoteDS.javaRDD(), "casenote/note", caseNotePro);*/
	}
}
