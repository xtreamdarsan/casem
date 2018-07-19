/**
 * 
 */
package javasparkes.kafka;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.streaming.api.java.JavaDStream;
import org.apache.spark.streaming.api.java.JavaInputDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.apache.spark.streaming.kafka010.ConsumerStrategies;
import org.apache.spark.streaming.kafka010.KafkaUtils;
import org.apache.spark.streaming.kafka010.LocationStrategies;
import org.elasticsearch.spark.rdd.api.java.JavaEsSpark;
import org.elasticsearch.spark.streaming.api.java.JavaEsSparkStreaming;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javasparkes.config.SparkConfig;
import javasparkes.model.MasterDetails;
import javasparkes.model.MasterDetailsDeserializer;
import scala.Tuple2;

/**
 * @author swmohara
 *
 */
public class MasterDetailsConsumer {

	public static void main(String args[]) throws InterruptedException {
		
		SparkConfig sparkConfig = new SparkConfig();
		
		new MasterDetailsConsumer().consumer(sparkConfig.getJavaEsSparkStream());
	}
	
	public void consumer(JavaStreamingContext javaStreamingContext) throws InterruptedException {
		
		Map<String, Object> kafkaParams = new HashMap<>();
		kafkaParams.put("bootstrap.servers", "localhost:9092");
		kafkaParams.put("key.deserializer", StringDeserializer.class);
		kafkaParams.put("value.deserializer", MasterDetailsDeserializer.class);
		kafkaParams.put("group.id", "1001");
		//kafkaParams.put("auto.offset.reset", "latest");
		kafkaParams.put("enable.auto.commit", false);

		Collection<String> topics = Arrays.asList("masterTopic");

		JavaInputDStream<ConsumerRecord<String, String>> stream = KafkaUtils.createDirectStream(
				  javaStreamingContext,
		    LocationStrategies.PreferConsistent(),
		    ConsumerStrategies.<String, String>Subscribe(topics, kafkaParams)
		  );
		
		
		JavaDStream<MasterDetails> mastD = stream.map(record -> {
            
			ObjectMapper obMapper = new ObjectMapper();
			
			MasterDetails master = obMapper.readValue(record.value(), MasterDetails.class);
			
            return master;
        });
		
		JavaEsSparkStreaming.saveToEs(mastD, "kafka/docs");
		
		javaStreamingContext.awaitTermination();
		
		//JavaDStream<ConsumerRecord<String, String>> sf = stream.map(new Function<ConsumerRecord<String,String>,>);//.map(record -> new Tuple2<>(record.key(), record.value()));
		
		/*sf.foreachRDD(rdd -> {
			
			rdd.collect().forEach(consumer -> {
				
				ObjectMapper ob = new ObjectMapper();
				try {
					MasterDetails master = ob.readValue(consumer.value(), MasterDetails.class);
					
					System.out.println("fetch : "+master.getCompanyName());
				} catch (JsonParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (JsonMappingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		});*/
		
		//System.out.println(sf.count());
	}
}
