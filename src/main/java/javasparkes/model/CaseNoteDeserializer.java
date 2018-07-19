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
public class CaseNoteDeserializer implements Deserializer<CaseNote>{

	@Override
	public void configure(Map<String, ?> configs, boolean isKey) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CaseNote deserialize(String topic, byte[] data) {
		ObjectMapper mapper = new ObjectMapper();
		CaseNote caseNote = null;
	    try {
	    	caseNote = mapper.readValue(data, CaseNote.class);
	    } catch (Exception e) {
	      e.printStackTrace();
	    }
	    return caseNote;
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

}
