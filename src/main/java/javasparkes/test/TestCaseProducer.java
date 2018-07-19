/**
 * 
 */
package javasparkes.test;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import javasparkes.kafka.MasterDetailsProducer;
import javasparkes.model.MasterDetails;

/**
 * @author swmohara
 *
 */
public class TestCaseProducer {

	public static void main (String args[]) {
		new TestCaseProducer().produceMaster();
	}
	
	public void produceMaster() {
		
		Properties props = new Properties();
		props.put("bootstrap.servers", "localhost:9092");
		props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.put("value.serializer", "javasparkes.test.TestCaseSerializer");
		
		ProducerRecord<String, TestCase> prod = new ProducerRecord<String, TestCase>("testCase", new TestCase());
		
		org.apache.kafka.clients.producer.Producer producer = new KafkaProducer(props);
		
		while(true) {
			producer.send(prod);
		}
		
	}
}
