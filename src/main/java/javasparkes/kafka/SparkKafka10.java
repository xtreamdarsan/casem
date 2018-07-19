package javasparkes.kafka;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.streaming.Durations;
import org.apache.spark.streaming.api.java.JavaDStream;
import org.apache.spark.streaming.api.java.JavaInputDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.apache.spark.streaming.kafka010.ConsumerStrategies;
import org.apache.spark.streaming.kafka010.KafkaUtils;
import org.apache.spark.streaming.kafka010.LocationStrategies;
import org.elasticsearch.spark.streaming.EsSparkStreaming;
import org.elasticsearch.spark.streaming.api.java.JavaEsSparkStreaming;

import javasparkes.config.SparkConfig;

public class SparkKafka10 {
    public static void main(String[] argv) throws Exception{

    	SparkConfig sparkConfig = new SparkConfig();
    	
        // Configure Spark to connect to Kafka running on local machine
        Map<String, Object> kafkaParams = new HashMap<>();
        kafkaParams.put("kafka.bootstrap.servers", "localhost:9092");
        kafkaParams.put("key.serializer", "org.apache.kafka.common.serialization.StringDeserializer");
        kafkaParams.put("value.serializer", "org.apache.kafka.common.serialization.StringDeserializer");
       // kafkaParams.put("group.id","group1");
        //kafkaParams.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG,"latest");
        kafkaParams.put("enable.auto.commit", true);

        //Configure Spark to listen messages in topic test
        Collection<String> topics = Arrays.asList("com.cisco.cm.case");


        //Read messages in batch of 30 seconds
        JavaStreamingContext jssc = new JavaStreamingContext(sparkConfig.caseSparkConf(), Durations.seconds(30));

        // Start reading messages from Kafka and get DStream
        final JavaInputDStream<ConsumerRecord<String, String>> stream =
                KafkaUtils.createDirectStream(jssc, LocationStrategies.PreferConsistent(), 
                                              ConsumerStrategies.<String,String>Subscribe(topics,kafkaParams));

        EsSparkStreaming.saveToEs(stream.dstream(), "spark/docs");

        jssc.start();
        jssc.awaitTermination();
    }
}