/**
 * 
 */
package javasparkes.test;

/**
 * @author swmohara
 *
 */
public class TestCase {

	private String caseNumber;
	private String caseContact;
	private String caseAdd;
	
	public TestCase() {
		this.caseNumber = "1000";
		this.caseContact = "abc";
		this.caseAdd = "address";
	}
	
	public String getCaseNumber() {
		return caseNumber;
	}
	/**
	 * @param caseNumber the caseNumber to set
	 */
	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}
	/**
	 * @return the caseContact
	 */
	public String getCaseContact() {
		return caseContact;
	}
	/**
	 * @param caseContact the caseContact to set
	 */
	public void setCaseContact(String caseContact) {
		this.caseContact = caseContact;
	}
	/**
	 * @return the caseAdd
	 */
	public String getCaseAdd() {
		return caseAdd;
	}
	/**
	 * @param caseAdd the caseAdd to set
	 */
	public void setCaseAdd(String caseAdd) {
		this.caseAdd = caseAdd;
	}
	
	
}
