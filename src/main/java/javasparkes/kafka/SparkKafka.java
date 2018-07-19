package javasparkes.kafka;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.streaming.Duration;
import org.apache.spark.streaming.StreamingContext;
import org.apache.spark.streaming.api.java.JavaDStream;
import org.apache.spark.streaming.api.java.JavaInputDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.apache.spark.streaming.kafka010.ConsumerStrategies;
import org.apache.spark.streaming.kafka010.KafkaUtils;
import org.apache.spark.streaming.kafka010.LocationStrategies;
//import org.apache.spark.streaming.kafka.KafkaUtils;

public class SparkKafka {

    public static void main(String[] args) throws Exception {
        
        SparkConf conf = new SparkConf()
        		.setAppName("sparkkafka")
        		.setMaster("local[*]");
        
       // JavaSparkContext sc = new JavaSparkContext(conf);
        
        StreamingContext ssc = new StreamingContext(conf, new Duration(10000));
        
        //JavaStreamingContext jsc = new JavaStreamingContext(sc, new Duration(10000));
        
        JavaStreamingContext jsc = new JavaStreamingContext(ssc);
        
        Collection<String> topics = Arrays.asList("test4");
        
        HashMap<String,Object> kafkaprops = new HashMap<>();
        kafkaprops.put("bootstrap.servers", "localhost:9092");
        kafkaprops.put("group.id","100");
        kafkaprops.put("key.deserializer", "org.apache.kafka.common.serialization.IntegerDeserializer");
        kafkaprops.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");

        
        JavaInputDStream<ConsumerRecord<String, String>> ds = KafkaUtils.createDirectStream(
        		jsc, LocationStrategies.PreferConsistent(),ConsumerStrategies.<String, String>Subscribe(topics, kafkaprops));
        
        JavaDStream<String> jds = ds.map(x -> x.value());

        jds.foreachRDD(rdd -> {
            rdd.foreachPartition(partitionOfRecords -> {

                Producer<Integer, String> producer = MyKafkaProducer.getProducer();
                while (partitionOfRecords.hasNext()) {
                    producer.send(new ProducerRecord<>("test", 1, partitionOfRecords.next()));
                }

            });
        });

        jsc.start();
        jsc.awaitTermination();
    }

}