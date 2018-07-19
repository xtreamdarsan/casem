/**
 * 
 */
package javasparkes.model;

import java.util.Map;

import org.apache.commons.lang3.SerializationUtils;
import org.apache.kafka.common.serialization.Deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author swmohara
 *
 */
public class CaseDeserializer implements Deserializer<Case>{

	@Override
	public void configure(Map<String, ?> configs, boolean isKey) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Case deserialize(String topic, byte[] data) {
		// TODO Auto-generated method stub
		ObjectMapper mapper = new ObjectMapper();
		Case caseO = null;
	    try {
	    caseO = mapper.readValue(data, Case.class);
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	    return caseO;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

}
