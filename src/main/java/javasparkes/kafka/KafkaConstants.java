package javasparkes.kafka;
public class KafkaConstants {  
    public static String KAFKA_BROKER_STRING =   
            "127.0.0.1:9092,127.0.0.1:9093,127.0.0.1:9094";  
    public static String KAFKA_KEY_SERIALIZER =   
            "org.apache.kafka.common.serialization.StringSerializer";  
    public static String KAFKA_VALUE_SERIALIZER =   
            "org.apache.kafka.common.serialization.StringSerializer";  
    public static String KAFKA_TOPIC = "com.cisco.cm.case";  
    public static String KAFKA_CONSUMER_GROUP = "TEST";  
} 