/**
 * 
 */
package javasparkes.model;

import java.io.Serializable;

/**
 * @author swmohara
 *
 */
public class KafkaResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String key;
	private String value;
	private String offset;
	private String topic;
	private String timestamp;
	private String partition;
	private String timestampType;
	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}
	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * @return the offset
	 */
	public String getOffset() {
		return offset;
	}
	/**
	 * @param offset the offset to set
	 */
	public void setOffset(String offset) {
		this.offset = offset;
	}
	/**
	 * @return the topic
	 */
	public String getTopic() {
		return topic;
	}
	/**
	 * @param topic the topic to set
	 */
	public void setTopic(String topic) {
		this.topic = topic;
	}
	/**
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}
	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	/**
	 * @return the partition
	 */
	public String getPartition() {
		return partition;
	}
	/**
	 * @param partition the partition to set
	 */
	public void setPartition(String partition) {
		this.partition = partition;
	}
	/**
	 * @return the timestampType
	 */
	public String getTimestampType() {
		return timestampType;
	}
	/**
	 * @param timestampType the timestampType to set
	 */
	public void setTimestampType(String timestampType) {
		this.timestampType = timestampType;
	}
	
	
	
}
