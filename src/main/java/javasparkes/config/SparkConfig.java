/**
 * 
 */
package javasparkes.config;

import java.io.Serializable;

import org.apache.spark.SparkConf;
import org.apache.spark.SparkContext;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.SQLContext;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.streaming.Duration;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.elasticsearch.spark.streaming.api.java.JavaEsSparkStreaming;


/**
 * @author swmohara
 *
 */
public class SparkConfig implements Serializable{
	
	
	SetProperties setProperties = new SetProperties();
	
	
	private static final long serialVersionUID = 2438934399439142765L;

	public SparkConf caseSparkConf() {
        SparkConf sparkConf = new SparkConf()
                .setAppName(setProperties.getSparkAppName())
                .setSparkHome(setProperties.getSparkHome())
                .setMaster(setProperties.getSparkMaster())
                .set("spark.speculation", setProperties.getSparkSpeculation())
        		.set("spark.debug.maxToStringFields", setProperties.getSparkMaxToStringFields())
        		.set("spark.driver.allowMultipleContexts",setProperties.getSparkAllowMultipleContexts())
        		.set("spark.executor.memory",setProperties.getSparkExecutorMemory());
        		//.set("spark.sql.shuffle.partitions", "5");
        
        return sparkConf;
    }
	
	public SparkContext getSparlContext() {
		return new SparkContext(caseSparkConf());
	}
	
    public JavaSparkContext caseJavaSparkContext() {
        return new JavaSparkContext(caseSparkConf());
    }
    
    public SparkSession caseSparkSession() {
        return SparkSession
                .builder()
                .config(caseSparkConf())
                .master("local[2]")
                .sparkContext(getSparlContext())
                .appName(setProperties.getSparkAppName())
                .getOrCreate();
    }
    
    public SQLContext getSqlContext() {
    	return new SQLContext(caseSparkSession());
    }
    
    public JavaStreamingContext getJavaEsSparkStream() {
    	
    	JavaStreamingContext javaStreamingContext = new JavaStreamingContext(caseSparkConf(), Duration.apply(10000));
    	
    	return javaStreamingContext;
    }
}
