/**
 * 
 */
package javasparkes.kafka;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import javasparkes.model.MasterDetails;

/**
 * @author swmohara
 *
 */
public class MasterDetailsProducer {

	public static void main (String args[]) {
		new MasterDetailsProducer().produceMaster();
	}
	
	public void produceMaster() {
		
		Properties props = new Properties();
		props.put("bootstrap.servers", "localhost:9092");
		props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.put("value.serializer", "javasparkes.model.MasterDetailsSerializer");
		
		ProducerRecord<String, MasterDetails> prod = new ProducerRecord<String, MasterDetails>("masterTopic", new MasterDetails());
		
		org.apache.kafka.clients.producer.Producer producer = new KafkaProducer(props);
		
		while(true) {
			producer.send(prod);
		}
		
	}
}
