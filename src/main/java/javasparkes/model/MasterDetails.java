/**
 * 
 */
package javasparkes.model;

import java.io.Serializable;

import lombok.Data;

/**
 * @author swmohara
 *
 */

public class MasterDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7253977447373718285L;

	private String hardwareDetails;

	private String softwareDetails;

	private String companySiteName;

	private String contactName;

	private String companyName;

	private String contractType;

	private String serviceLineStatus;

	private String contractUsageType;

	private String contactTypeIndicator;

	private String contactCCIENumber;
	
	private String caseNumber;
	//=========================
	
	
	
	//=========================
	
	public String getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}

	public MasterDetails() {
		this.contractType = "contractType";
		this.contractUsageType = "contractUsageType";
		this.contactTypeIndicator = "contactTypeIndicator";
		this.serviceLineStatus = "serviceLineStatus";
		this.contactName = "contactName";
		this.companyName = "companyName";
		this.companySiteName = "companySiteName";
		this.hardwareDetails = "hardwareDetails";
		this.softwareDetails = "softwareDetails";
		this.contactCCIENumber = "contactCCIENumber";
	}

	public String getContractUsageType() {
		return contractUsageType;
	}

	public void setContractUsageType(String contractUsageType) {
		this.contractUsageType = contractUsageType;
	}

	public String getServiceLineStatus() {
		return serviceLineStatus;
	}

	public void setServiceLineStatus(String serviceLineStatus) {
		this.serviceLineStatus = serviceLineStatus;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanySiteName() {
		return companySiteName;
	}

	public void setCompanySiteName(String companySiteName) {
		this.companySiteName = companySiteName;
	}

	public String getHardwareDetails() {
		return hardwareDetails;
	}

	public void setHardwareDetails(String hardwareDetails) {
		this.hardwareDetails = hardwareDetails;
	}

	public String getSoftwareDetails() {
		return softwareDetails;
	}

	public void setSoftwareDetails(String softwareDetails) {
		this.softwareDetails = softwareDetails;
	}

	/**
	 * @return the contractType
	 */
	public String getContractType() {
		return contractType;
	}

	/**
	 * @param contractType the contractType to set
	 */
	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	/**
	 * @return the contactTypeIndicator
	 */
	public String getContactTypeIndicator() {
		return contactTypeIndicator;
	}

	/**
	 * @param contactTypeIndicator the contactTypeIndicator to set
	 */
	public void setContactTypeIndicator(String contactTypeIndicator) {
		this.contactTypeIndicator = contactTypeIndicator;
	}

	/**
	 * @return the contactCCIENumber
	 */
	public String getContactCCIENumber() {
		return contactCCIENumber;
	}

	/**
	 * @param contactCCIENumber the contactCCIENumber to set
	 */
	public void setContactCCIENumber(String contactCCIENumber) {
		this.contactCCIENumber = contactCCIENumber;
	}
	
	
}
