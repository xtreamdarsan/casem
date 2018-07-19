/**
 * 
 */
package javasparkes.test;

import java.io.Serializable;

/**
 * @author swmohara
 *
 */
public class TestMaster implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1737430254695210803L;
	/**
	 * 
	 */
	
	private String caseNumber;
	private String  masterName;
	private String masterAddress;
	
	TestMaster(){
		this.caseNumber="1000";
		this.masterName="mastername";
		this.masterAddress="Banglore";
	}

	public String getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}

	public String getMasterName() {
		return masterName;
	}

	public void setMasterName(String masterName) {
		this.masterName = masterName;
	}

	public String getMasterAddress() {
		return masterAddress;
	}

	public void setMasterAddress(String masterAddress) {
		this.masterAddress = masterAddress;
	}
	
	
}

