/**
 * 
 */
package javasparkes.test;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import javasparkes.kafka.MasterDetailsProducer;

/**
 * @author swmohara
 *
 */
public class TestMasterProducer {

	public static void main (String args[]) {
		new TestMasterProducer().produceMaster();
	}
	
	public void produceMaster() {
		
		Properties props = new Properties();
		props.put("bootstrap.servers", "localhost:9092");
		props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.put("value.serializer", "javasparkes.test.TestMasterSerializer");
		
		ProducerRecord<String, TestMaster> prod = new ProducerRecord<String, TestMaster>("testMaster", new TestMaster());
		
		org.apache.kafka.clients.producer.Producer producer = new KafkaProducer(props);
		
		while(true) {
			producer.send(prod);
		}
		
	}
}
