/**
 * 
 */
package javasparkes.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoder;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.Row;
import org.elasticsearch.spark.rdd.api.java.JavaEsSpark;

import javasparkes.config.SetProperties;
import javasparkes.config.SparkConfig;
import javasparkes.model.Case;

/**
 * @author swmohara
 *
 */
public class CaseService implements Runnable, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4422637882443955971L;
	private SparkConfig sparkConfig = new SparkConfig();
	private SetProperties setProperties = new SetProperties();
	
	public static void main(String args[]) {
		
		new CaseService().fetchAndPushCaseToEs();
	}
	
	public void run() {
		
		System.out.println("fetch CASE By Spark !!!");
		
		String URL = setProperties.getDatasourceUrl();
		
		Properties caseProp = new Properties();
		caseProp.put("url", URL);
		caseProp.put("user", setProperties.getDatasourceUsername());
		caseProp.put("password", setProperties.getDatasourcePassword());
		caseProp.put("dbtable", setProperties.getCaseQuery());
		caseProp.put("Driver", setProperties.getDatasourceDriver());
		
		Encoder<Case> caseEncoder = Encoders.bean(Case.class);
		
		Map<String, String> esProp = new HashMap<String, String>();
		esProp.put("es.index.auto.create", setProperties.getEsIndexAutoCreate());
		esProp.put("es.mapping.id", setProperties.getCasePk());
		//esProp.put("es.batch.size.entries", "500");
		esProp.put("es.write.operation", setProperties.getEsWriteOperation());
		
		Dataset<Case> caseDS = sparkConfig.caseSparkSession().read().jdbc(URL, setProperties.getCaseTablename(), caseProp).as(caseEncoder);
		caseDS.printSchema();
		caseDS.show(10);
		
		JavaEsSpark.saveToEs(caseDS.javaRDD(), setProperties.getEsCaseIndex(),esProp);
	}
	
	
	public JavaRDD<Case> getCaseRDD(){
		
		String URL = setProperties.getDatasourceUrl();
		
		Properties caseProp = new Properties();
		caseProp.put("url", URL);
		caseProp.put("user", setProperties.getDatasourceUsername());
		caseProp.put("password", setProperties.getDatasourcePassword());
		caseProp.put("dbtable", setProperties.getCaseQuery());
		caseProp.put("Driver", setProperties.getDatasourceDriver());
		
		Encoder<Case> caseEncoder = Encoders.bean(Case.class);
		
		Dataset<Case> caseDS = sparkConfig.caseSparkSession().read().jdbc(URL, setProperties.getCaseTablename(), caseProp).as(caseEncoder);
		caseDS.printSchema();
		caseDS.show(10);
		
		return caseDS.javaRDD();
	}
	
	
	public void fetchAndPushCaseToEs() {
		
		System.out.println("fetch CASE By Spark !!!");
		
		String URL = setProperties.getDatasourceUrl();
		
		Properties caseProp = new Properties();
		caseProp.put("url", URL);
		caseProp.put("user", setProperties.getDatasourceUsername());
		caseProp.put("password", setProperties.getDatasourcePassword());
		caseProp.put("dbtable", setProperties.getCaseQuery());
		caseProp.put("Driver", setProperties.getDatasourceDriver());
		
		Encoder<Case> caseEncoder = Encoders.bean(Case.class);
		
		Map<String, String> esProp = new HashMap<String, String>();
		esProp.put("es.index.auto.create", setProperties.getEsIndexAutoCreate());
		esProp.put("es.mapping.id", setProperties.getCasePk());
		//esProp.put("es.batch.size.entries", "500");
		esProp.put("es.write.operation", setProperties.getEsWriteOperation());
		
		/*Dataset<Case> caseDS = sparkConfig.caseSparkSession().read().jdbc(URL, setProperties.getCaseTablename(), caseProp).as(caseEncoder);
		caseDS.printSchema();
		caseDS.show(10);
		
		JavaEsSpark.saveToEs(caseDS.javaRDD(), setProperties.getEsCaseIndex(),esProp);*/
		
		
		//Using StreamAPI
		
		Map<String, String> jdbcProp = new HashMap<>();
		jdbcProp.put("url", URL);
		jdbcProp.put("user", setProperties.getDatasourceUsername());
		jdbcProp.put("password", setProperties.getDatasourcePassword());
		jdbcProp.put("dbtable", setProperties.getCaseQuery());
		jdbcProp.put("Driver", setProperties.getDatasourceDriver());
		
		Dataset<Case> caseStream = sparkConfig.caseSparkSession().readStream().format("jdbc").options(jdbcProp).load().as(caseEncoder);
		
		System.out.println("Stream : "+caseStream.count());
		
		/*Dataset<Row> caseDF = sparkConfig.caseSparkSession().read().jdbc(URL, setProperties.getCasenoteTablename(), caseProp);
		caseDF.printSchema();
		caseDF.show(10);*/
		/*Encoder<MasterDetails> masterEncoder = Encoders.bean(MasterDetails.class);
		
		List<MasterDetails> masterList = new ArrayList<>();
		masterList.add(new MasterDetails());
		
		caseDF.union(sparkConfig.caseSparkSession().createDataFrame(masterList, MasterDetails.class));
		
		caseDF.printSchema();*/
	}
}
