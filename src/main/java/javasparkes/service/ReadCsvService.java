/**
 * 
 */
package javasparkes.service;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.types.StructType;

import javasparkes.config.SparkConfig;

/**
 * @author swmohara
 *
 */
public class ReadCsvService {

	SparkConfig sparkConfig = new SparkConfig();

	public static void main (String args[]) {
		
		System.out.println(" Started Reading CSV File !!!");
		
		//====================================
		
		StructType schema = new StructType()
			    .add("Department", "string")
			    .add("Designation", "string")
			    .add("costToCompany", "long")
			    .add("State", "string");
		
		Dataset<Row> df = new ReadCsvService().sparkConfig.caseSparkSession().read()
			    .option("mode", "DROPMALFORMED")
			    .option("", "")
			    .schema(schema)
			    .csv("C:\\xtreamDrive\\req_docs\\req\\comp.csv");
		
		//df.show();
		
		Dataset<Row> df1 = new ReadCsvService().sparkConfig.getSqlContext().read().format("csv").option("header", "true").load("C:\\xtreamDrive\\req_docs\\req\\comp.csv");
		
		df1.show();
		
		//=====================================
		
		/*JavaRDD<String> javaRDD = new ReadCsvService().sparkConfig.caseJavaSparkContext().textFile("C:\\xtreamDrive\\req_docs\\req\\CaseList.csv");
		
		System.out.println("count : "+javaRDD.count());
		
		javaRDD.collect().forEach(x -> System.out.println(x));*/
		
		//=====================================
		
		/*StructType csv = new StructType();
		csv.add("key", "String");
		csv.add("value", "String");
		
		Dataset<Row> df = new ReadCsvService().sparkConfig.caseSparkSession().readStream().schema(csv).csv("C:\\xtreamDrive\\req_docs\\req\\CaseList.csv");
		
		df.writeStream();*/
		
		//df.show();
		
		//======================================
	}
}
