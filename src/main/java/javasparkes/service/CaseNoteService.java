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
import org.apache.spark.sql.SparkSession;
import org.elasticsearch.spark.rdd.api.java.JavaEsSpark;

import javasparkes.config.SetProperties;
import javasparkes.config.SparkConfig;
import javasparkes.model.CaseNote;

/**
 * @author swmohara
 *
 */
public class CaseNoteService implements Runnable{

	private SparkConfig sparkConfig = new SparkConfig();
	private SetProperties setProperties = new SetProperties();
	
	public static void main(String args[]) {
		
		new CaseNoteService().fetchAndPushCaseNoteToEs();
	}
	
	public void run() {
		
		System.out.println(" fetch Casenote By Spark !!!");
		
		String URL = setProperties.getDatasourceUrl();
		
		Properties caseNoteProp = new Properties();
		caseNoteProp.put("url", URL);
		caseNoteProp.put("user", setProperties.getDatasourceUsername());
		caseNoteProp.put("password", setProperties.getDatasourcePassword());
		caseNoteProp.put("dbtable", setProperties.getCasenoteQuery());
		caseNoteProp.put("Driver", setProperties.getDatasourceDriver());
		
		Encoder<CaseNote> caseNoteEncoder = Encoders.bean(CaseNote.class);
		
		Dataset<CaseNote> caseNoteDS = sparkConfig.caseSparkSession().read().jdbc(URL, setProperties.getCasenoteTablename(), caseNoteProp).as(caseNoteEncoder);
		caseNoteDS.printSchema();
		caseNoteDS.show(10);
		
		System.out.println("after show");
		
		Map<String, String> caseNotePro = new HashMap<String, String>();
		caseNoteProp.put("es.index.auto.create", setProperties.getEsIndexAutoCreate());
		caseNoteProp.put("es.mapping.id", setProperties.getCasenotePk());
		caseNoteProp.put("es.write.operation", setProperties.getEsWriteOperation());
		
		JavaEsSpark.saveToEs(caseNoteDS.javaRDD(), setProperties.getEsCasenoteIndex(),caseNotePro);
	}
	
	public void fetchAndPushCaseNoteToEs() {
		
		System.out.println(" fetch Casenote By Spark !!!");
		
		String URL = setProperties.getDatasourceUrl();
		
		Properties caseNoteProp = new Properties();
		caseNoteProp.put("url", URL);
		caseNoteProp.put("user", setProperties.getDatasourceUsername());
		caseNoteProp.put("password", setProperties.getDatasourcePassword());
		caseNoteProp.put("dbtable", "XXCTS_CM_CASE_NOTES"/*setProperties.getCasenoteQuery()*/);
		caseNoteProp.put("Driver", setProperties.getDatasourceDriver());
		
		Encoder<CaseNote> caseNoteEncoder = Encoders.bean(CaseNote.class);
		
		Dataset<CaseNote> caseNoteDS = sparkConfig.caseSparkSession().read().jdbc(URL, setProperties.getCasenoteTablename(), caseNoteProp).as(caseNoteEncoder);
		//caseNoteDS.printSchema();
		//caseNoteDS.show(10);
		
		//System.out.println("after show");
		
		Map<String, String> caseNotePro = new HashMap<String, String>();
		caseNoteProp.put("es.index.auto.create", setProperties.getEsIndexAutoCreate());
		caseNoteProp.put("es.mapping.id", setProperties.getCasenotePk());
		caseNoteProp.put("es.write.operation", setProperties.getEsWriteOperation());
		
		JavaEsSpark.saveToEs(caseNoteDS.javaRDD(), setProperties.getEsCasenoteIndex(),caseNotePro);
		
	}
}
