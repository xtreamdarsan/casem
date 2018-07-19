package javasparkes.service;
import java.util.Collections;

import java.util.HashMap;

import java.util.Map;

import java.util.Set;

 

import org.apache.spark.SparkConf;

import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.streaming.Duration;
import org.apache.spark.streaming.api.java.JavaDStream;
import org.apache.spark.streaming.api.java.JavaPairDStream;
import org.apache.spark.streaming.api.java.JavaPairInputDStream;

import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.apache.spark.streaming.kafka.KafkaUtils;
import org.elasticsearch.spark.streaming.api.java.JavaEsSparkStreaming;

import kafka.serializer.StringDecoder;
import scala.Tuple2;

public class SparkStringConsumer {

 

    public static void main(String[] args) throws InterruptedException {

    	
    	//===============================Configuration===================================

        SparkConf conf = new SparkConf()

                .setAppName("kafka-sandbox")

                .setMaster("local[*]");

        JavaSparkContext sc = new JavaSparkContext(conf);

        JavaStreamingContext ssc = new JavaStreamingContext(sc, new Duration(10000));

        //==============================case-Kafka========================================

        Map<String, String> caseParams = new HashMap<>();

        caseParams.put("metadata.broker.list", "localhost:9092"/*"edsskafka-dev:9092"*/);

        //kafkaParams.put("group.id", "CSOneES");

        caseParams.put("auto.offset.reset", "smallest");
        
        Set<String> caseTopic = Collections.singleton("testCase"/*"edss_cm_dl_case"*/);

 

        JavaPairInputDStream<String, String> casePairDStream = KafkaUtils.createDirectStream(ssc,

                String.class, String.class, StringDecoder.class, StringDecoder.class, caseParams, caseTopic);

        /*JavaDStream<String> caseDStream = casePairDStream.map(new Function<Tuple2<String, String>, String>() {
            *//**
			 * 
			 *//*
			private static final long serialVersionUID = 1L;

			@Override
            public String call(Tuple2<String, String> tuple2) {
              return tuple2._2();
            }
          });*/

        /*casePairDStream.foreachRDD(rdd -> {

            System.out.println("--- New RDD with " + rdd.partitions().size()

                    + " partitions and " + rdd.count() + " records");

            rdd.foreach(record -> System.out.println(record._2));

        });*/
        
        //=================================Master-Kafka====================================
        
        Map<String, String> masterParams = new HashMap<>();

        masterParams.put("metadata.broker.list", "localhost:9092"/*"edsskafka-dev:9092"*/);

        //kafkaParams.put("group.id", "CSOneES");

        masterParams.put("auto.offset.reset", "smallest");
        
        Set<String> masterTopic = Collections.singleton("testMaster"/*"edss_cm_dl_case"*/);

 

        JavaPairInputDStream<String, String> masterPairDStream = KafkaUtils.createDirectStream(ssc,

                String.class, String.class, StringDecoder.class, StringDecoder.class, masterParams, masterTopic);

       
        /*JavaDStream<String> masterDStream = masterPairDStream.map(new Function<Tuple2<String, String>, String>() {
            *//**
			 * 
			 *//*
			private static final long serialVersionUID = 1L;

			@Override
            public String call(Tuple2<String, String> tuple2) {
              return tuple2._2();
            }
          });
        
        
        JavaEsSparkStreaming.saveJsonToEs(masterDStream, "testcase1/docs");*/
        
       /* masterPairDStream.foreachRDD(rdd -> {

            System.out.println("--- New RDD with " + rdd.partitions().size()

                    + " partitions and " + rdd.count() + " records");

            rdd.foreach(record -> System.out.println(record._2));

        });*/
        
        //=================================join===========================================
        
        
        JavaPairDStream<String, Tuple2<String, String>> finalDStream =  casePairDStream.join(masterPairDStream);
        
        /*finalDStream.toJavaDStream().foreachRDD(rdd -> {
        	System.out.println("--- New RDD with " + rdd.partitions().size()

                    + " partitions and " + rdd.count() + " records");

            rdd.foreach(record -> System.out.println(record._2));
        });*/
        
        JavaEsSparkStreaming.saveToEs(finalDStream.toJavaDStream(), "casemaster/docs");

        ssc.start();

        ssc.awaitTermination();

    }

}