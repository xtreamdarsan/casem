package javasparkes.kafka;
public class App {  
    public static void main(String[] args) {  
        KafkaProducer kafkaProducer = new KafkaProducer(KafkaConstants.KAFKA_BROKER_STRING);  
  
        /* Sending messages without a key */  
        for (int i = 0; i < 10; i++)  
            kafkaProducer.sendMessage(KafkaConstants.KAFKA_TOPIC, "Message : " + i,i+1+"");  
  
        /* Sending messages without a key */  
        for (int i = 0; i < 10; i++)  
            kafkaProducer.sendMessage(KafkaConstants.KAFKA_TOPIC, "Key : " + i, "Message : " + i);  
  
        kafkaProducer.closeProducer();  
    }  
}  