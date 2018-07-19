/**
 * 
 */
package javasparkes.model;

import java.util.Map;

import org.apache.kafka.common.serialization.Deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author swmohara
 *
 */
public class MasterDetailsDeserializer implements Deserializer<MasterDetails>{

	@Override
	public void configure(Map<String, ?> configs, boolean isKey) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MasterDetails deserialize(String topic, byte[] data) {
		ObjectMapper mapper = new ObjectMapper();
		MasterDetails masterDetails = null;
	    try {
	    	masterDetails = mapper.readValue(data, MasterDetails.class);
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	    return masterDetails;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

}
