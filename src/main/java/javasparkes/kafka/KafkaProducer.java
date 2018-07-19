package javasparkes.kafka;

import java.util.Properties;
import java.util.concurrent.Future;

import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

public class KafkaProducer {  
    Properties props;  
    Producer<String, String> producer;  
  
    public KafkaProducer(String brokerString) {  
        props = new Properties();  
        props.put("bootstrap.servers", brokerString);  
        props.put("acks", "all");  
        props.put("retries", 0);  
        props.put("batch.size", 16384);  
        props.put("linger.ms", 1);  
        props.put("buffer.memory", 33554432);  
        props.put("key.serializer", KafkaConstants.KAFKA_KEY_SERIALIZER);  
        props.put("value.serializer", KafkaConstants.KAFKA_VALUE_SERIALIZER);  
        producer = new org.apache.kafka.clients.producer.KafkaProducer<>(props);  
    }  
  
    /* send() method is asynchronous */  
    public Future<RecordMetadata> sendMessage(String topic, String message) {
  
        Future<RecordMetadata> future = producer.send(new ProducerRecord<>(topic, message));  
        return future;  
    }  
  
    public void sendMessage(String topic, String key, String value) {  
        producer.send(new ProducerRecord<>(topic, key, value));  
    }  
  
    public void closeProducer() {  
        producer.close();  
    }  
  
}  