/**
 * 
 */
package javasparkes.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import lombok.Data;

/**
 * @author swmohara
 *
 */
@Data
public class MasterCase implements Serializable{

/**
	 * 
	 */
	private static final long serialVersionUID = 8870525088994191252L;

private String CASE_ID								   ;
	
	private String CASE_NUMBER                             ;       
	private String CS1_CASE_NUMBER                         ;       
	private String CONTRACT_NUMBER                         ;       
	private String CONTACT_CCO_ID                          ;       
	private String TECH_ID                                 ;       
	private String SUB_TECH_ID                             ;       
	private String PROBLEM_CODE_ID                         ;       
	private String C3_SW_VERSION_ID                        ;        
	private String C3_HW_VERSION_ID                        ;        
	private String SHIP_TO_SITE_USE_ID                     ;       
	private String CUSTOMER_PROVIDED_SER_NUMBER            ;       
	private String CASE_SUMMARY                            ;      
	private String CASE_SUBJECT                            ;      
	private String CASE_ORIGIN                             ;       
	private String CASE_OWNER                              ;       
	private String CS1_REASON                              ;       
	private Timestamp CASE_CLOSED_DATE                        ;                
	private Timestamp CASE_CREATED_DATE                       ;                
	private String CASE_DESCRIPTION                        ;                
	private String CASE_COMMENTS                           ;      
	private String CASE_PRIORITY                           ;       
	private String CASE_STATUS                             ;       
	private String CASE_TYPE                               ;       
	private BigDecimal CASE_OWNER_CHANGES                         ;              
	private String IS_ACCEPTED                             ;        
	private String ACTION_CLASS                            ;       
	private String ADDITIONAL_EMAIL_CC                     ;       
	private String ALTERNATE_CONTACT_NAME                  ;       
	private String ALTERNATE_EMAIL_ADDRESS                 ;       
	private String ALTERNATE_PHONE                         ;       
	private String B2B_URGENCY                             ;       
	private String B2B_ESCALATED_TIME                      ;       
	private String B2B_FLAG                                ;       
	private String B2B_STATUS                              ;       
	private String BILL_TO_PARTY_ID                        ;       
	private BigDecimal BILL_TO_SITE_C3_ID                         ;              
	private String BILL_TO_SITE_USE_ID                     ;       
	private Timestamp CALL_END_TIME                           ;                
	private String CALL_PHONE_NUMBER                       ;        
	private Timestamp CALL_START_TIME                         ;                
	private Timestamp CASE_ACCEPTED_DATE                      ;                
	private String CASE_IMPACT_CATEGORY                    ;       
	private String CASE_IMPACT_STATUS                      ;       
	private String CASE_IMPACT_USER_COUNT                  ;       
	private String CASE_NOTIFICATION_SETTINGS              ;       
	private String CASE_OWNER_EMAIL_ID                     ;       
	private String CASE_OWNER_ROLE                         ;       
	private String CASE_REASON                             ;       
	private String CISCO_ACCOUNT_ID                        ;       
	private String COMMUNICATION_PREFERENCE                ;       
	private String CASE_COMPLEXITY                         ;       
	private String CONTACT_ME                              ;       
	private Timestamp CONTACT_ME_DATE                         ;                
	private Timestamp CONTACT_ME_FROM_TIME                    ;                
	private String CONTACT_ME_TIME                         ;        
	private String CONTACT_ME_TIME_ZONE                    ;        
	private Timestamp CONTACT_ME_TO_TIME                      ;                
	private String CONTACT_SECONDARY_EMAIL                 ;       
	private String CONTACT_TYPE                            ;       
	private String CONTRACT_STATUS                         ;        
	private String COUNTRY_INCIDENT                        ;       
	private String ACTION_PLAN                             ;                
	private String C3_CUSTOMER_ID                          ;       
	private String CUSTOMER_CATEGORY                       ;       
	private String CUSTOMER_ACTIVITY                       ;       
	private String CUSTOMER_COM_BUIS_IMPACT                ;      
	private String CUSTOMER_COMPANY_NAME                   ;       
	private String CUST_CONFIRM_PRIORITY_CHANGE            ;        
	private String CUSTOMER_CSAT                           ;       
	private String CUSTOMER_SYMPTOM                        ;                
	private Timestamp DATE_TIME_SURVEY_SENT                   ;                
	private String DESCRIBE_TROUBLESHOOTING_DONE           ;
	private String DESCRIBE_RECENT_ENV_CHANGES             ;      
	private String CSC_DISCUSSION_THREAD_ID                ;       
	private String DRAFT_CASE_NUMBER                       ;        
	private String DSD_STATUS                              ;       
	private String EF_PRODUCT_NAME                         ;       
	private String EF_UNREACHABLE                          ;        
	private String CS1_END_CLIENT_INFORMATION              ;       
	private String END_CUSTOMER_CASE_CREATE_DATE           ;       
	private String END_CUSTOMER_EMAIL                      ;       
	private String ENGINEER_SLA_STATUS_NOTE                ;                
	private String ENTITLEMENT_STATUS                      ;       
	private String ENTITLEMENT_AUDIT_ID                    ;       
	private String ENTITLEMENT_REASON                      ;       
	private String ENTITLEMENT_STATUS_CODE                 ;       
	private String CUSTOMER_EPAGE                          ;       
	private String ESCALATION_FLAG                         ;       
	private String GR_GENERAL_OF_ACCOUNT                   ;       
	private Timestamp GR_LAST_UPDATE_DATE                     ;                
	private String GR_RMA_OF_ACCOUNT                       ;       
	private String HELPDESK_TRACKING_NUMBER                ;       
	private String HTOM_EMAIL_ADDRESS                      ;       
	private Timestamp CIN_INITIAL_ACCEPTNCE_DATE              ;                
	private BigDecimal INITIAL_SOLUTION                           ;              
	private BigDecimal C3_INSTALL_SITE_ID                         ;              
	private String INTERIM_CONTACT_EMAIL                   ;       
	private String ISSUE_CATEGORY                          ;       
	private String CIN_CR_SSB_ISSUE_REASON                 ;       
	private String ISV_RESPONSE_STATUS                     ;       
	private String CASE_LABEL                              ;      
	private String RPT_LAST_REVIEW_DATE                    ;        
	private String LATEST_ACTION_PLAN                      ;                
	private String LATEST_PROBLEM_DESCRIPTION              ;                
	private String MANAGER_EMAIL                           ;       
	private String MANAGER_GROUP_ALIAS                     ;       
	private String MOBILE_PHONE                            ;        
	private String NMTG_PRODUCT_VERSION                    ;       
	private String NODE_NAME                               ;       
	private String COMM_PREFERENCE_LANG                    ;       
	private Timestamp ON_HOLD_DUE_DATE                          ;                
	private String ORIGINAL_CONTACT_EMAIL                  ;       
	private String OTHER_INFORMATION                       ; 
	private String OWNER_ID                                ;       
	private String OWNER_QUEUE                             ;        
	private String OWNER_USER                              ;        
	private String OWNER_PROFILE                           ;       
	private String PARTNER_CASE_NUMBER                     ;       
	private String PARTNER_CASE_OWNER_CCO_ID               ;       
	private String PARTNER_CASE_OWNER_EMAIL                ;       
	private String PARTNER_CASE_OWNER_NAME                 ;       
	private String PARTNER_CASE_OWNER_PHONE                ;       
	private String PARTNER_NAME                            ;       
	private String PARTNER_OWNER_GROUP_ID                  ;        
	private String PARTNER_OWNER_GROUP_NAME                ;       
	private String PICA_ID                                 ;       
	private String PORTFOLIO_NUMBER                        ;       
	private String PREVIOUS_QUEUE                          ;       
	private String PRIORITY_INDICATION                     ;       
	private Timestamp CASE_IMPACT_INCIDENT_TIME               ;                
	private String C3_PRODUCT_ID                           ;       
	private String CIN_CR_LED_PRODUCT_TYPE                 ;       
	private String CIN_CR_SSB_PRODUCT_TYPE                 ;       
	private Timestamp PURCHASE_DATE                           ;                
	private String REASON_CUST_CONSNT_NOT_TAKEN            ;       
	private String REASON_SURVEY_NOT_SENT                  ;                
	private String REQUEST_CLASS                           ;       
	private String REQUEST_SUB_CLASS                       ;       
	private String REQUEST_TYPE                            ;       
	private String REQUEUE_REASON                          ;       
	private String MISQUEUE_REASON                         ;       
	private String REQUEUE_REASON_DETAILS                  ;      
	private String RESOLUTION_CODE                         ;       
	private String RESOLUTION_SUMMARY                      ;                
	private String CDS_RESOLUTION_SUMMARY                  ;      
	private String ROUTE_OPTION_SELECTED                   ;        
	private String RTO_AUDIT_ID                            ;       
	private String RTO_FLAG                                ;       
	private String SBSC_CHANNEL_CODE                       ;       
	private String SBSC_RESOLUTION_COMMENT                 ;       
	private Timestamp SCHEDULED_DISPATCH_TIME                 ;                
	private String SCRUBBED_CUSTOMER_SYMPTOM               ;                
	private String SCRUBBED_RESOLUTION_CODE                ;       
	private String SCRUBBED_RESOLUTION_SUMMARY             ;                
	private String SCRUBBED_UNDERLYING_CAUSE               ;       
	private String SCRUBBED_UNDERLYING_CAUSE_CAT           ;       
	private String SEND_EMAIL_NOTIF_TO_CONTACT             ;       
	private String SERVICE_LINE_NAME                       ;       
	private String EXTENDED_LOSS_OF_SERVICE                ;       
	private String SHIP_TO_PARTY_ID                        ;       
	private BigDecimal C3_SHIP_TO_SITE_ID                         ;              
	private String SMART_ACCOUNT_ID                        ;        
	private String SMART_SERVICE_PROGRAMS                  ;       
	private String SN_INPUT_TYPE                           ;       
	private String SW_VERSION                              ;       
	private String SOLUTION_RELEASE                        ;       
	private String SOLUTION_TYPE                           ;       
	private String DATA_SOURCE_NAME                        ;       
	private String SPOKEN_LANGUAGE                         ;       
	private String SR_LANGUAGE                             ;       
	private String SUBSCRIPTION_REFERENCE_ID               ;       
	private String SURVEY_OPT_OUT                          ;       
	private String SURVEY_PREFERENCE                       ;       
	private String SURVEY_SENT                             ;        
	private String SURVEY_TYPE                             ;       
	private String SVO_ACCESS_ENABLED                      ;        
	private String CASE_TAG                                ;       
	private String TICKET_NUMBER                           ;       
	private String THIRD_PARTY_VENDOR                      ;       
	private String UNDERLYING_CAUSE                        ;       
	private String CASE_CATEGORY                           ;       
	private String CASE_URGENCY                            ;       
	private String CASE_CLOSE_SW_VERSION                   ;        
	private String VIRTUAL_ACCOUNT_ID                      ;        
	private String CUSTOMER_CALLED_SUPPORT_REASON          ;       
	private String RESOLUTION_WORKAROUND                   ;      
	private String WORKGROUP_NAME                          ;       
	private Timestamp LAST_UPDATE_DATE_C3_USER                ;                
	private String NETWORK_PROTOCOL                        ;       
	private String PROTOCOL_DETAILS                        ;       
	private String DEFECT_COUNT                            ;       
	private String CASE_TOPOLOGY                           ;      
	private String SLA_ATTAINMENT                          ;        
	private String CONTACT_PERSONA                         ;       
	private String CONTAINER_TYPE                          ;       
	private String HIGHEST_ELIGIBLE_SEVERITY               ;        
	private String PARENT_CONTAINER_NAME                   ;       
	private String SERVICE_TIER                            ;       
	private String TAC_SUPPORT_COVERAGE                    ;       
	private Timestamp CREATED_DATE                            ;                
	private String CREATED_BY                              ;       
	private Timestamp LAST_MODIFIED_DATE                      ;                
	private String LAST_MODIFIED_BY                        ;       
	private Timestamp C3_CREATION_DATE                        ;                
	private String C3_CREATED_BY                           ;       
	private Timestamp C3_LAST_MODIFIED_DATE                   ;                
	private String C3_LAST_MODIFIED_BY                     ;       
	private String CREATED_BY_C3                           ;       
	private String MODIFIED_BY_C3                          ;       
	private String CURRENT_CONTACT_PHONE                   ;       
	private String CURRENT_CONTACT_EMAIL                   ;       
	private String CURRENT_CONTACT_EXTENSION               ;       
	private String CURRENT_CONTACT_NAME                    ;
	
	private MasterDetails masterDetails;

	/**
	 * @return the cASE_ID
	 */
	public String getCASE_ID() {
		return CASE_ID;
	}

	/**
	 * @param cASE_ID the cASE_ID to set
	 */
	public void setCASE_ID(String cASE_ID) {
		CASE_ID = cASE_ID;
	}

	/**
	 * @return the cASE_NUMBER
	 */
	public String getCASE_NUMBER() {
		return CASE_NUMBER;
	}

	/**
	 * @param cASE_NUMBER the cASE_NUMBER to set
	 */
	public void setCASE_NUMBER(String cASE_NUMBER) {
		CASE_NUMBER = cASE_NUMBER;
	}

	/**
	 * @return the cS1_CASE_NUMBER
	 */
	public String getCS1_CASE_NUMBER() {
		return CS1_CASE_NUMBER;
	}

	/**
	 * @param cS1_CASE_NUMBER the cS1_CASE_NUMBER to set
	 */
	public void setCS1_CASE_NUMBER(String cS1_CASE_NUMBER) {
		CS1_CASE_NUMBER = cS1_CASE_NUMBER;
	}

	/**
	 * @return the cONTRACT_NUMBER
	 */
	public String getCONTRACT_NUMBER() {
		return CONTRACT_NUMBER;
	}

	/**
	 * @param cONTRACT_NUMBER the cONTRACT_NUMBER to set
	 */
	public void setCONTRACT_NUMBER(String cONTRACT_NUMBER) {
		CONTRACT_NUMBER = cONTRACT_NUMBER;
	}

	/**
	 * @return the cONTACT_CCO_ID
	 */
	public String getCONTACT_CCO_ID() {
		return CONTACT_CCO_ID;
	}

	/**
	 * @param cONTACT_CCO_ID the cONTACT_CCO_ID to set
	 */
	public void setCONTACT_CCO_ID(String cONTACT_CCO_ID) {
		CONTACT_CCO_ID = cONTACT_CCO_ID;
	}

	/**
	 * @return the tECH_ID
	 */
	public String getTECH_ID() {
		return TECH_ID;
	}

	/**
	 * @param tECH_ID the tECH_ID to set
	 */
	public void setTECH_ID(String tECH_ID) {
		TECH_ID = tECH_ID;
	}

	/**
	 * @return the sUB_TECH_ID
	 */
	public String getSUB_TECH_ID() {
		return SUB_TECH_ID;
	}

	/**
	 * @param sUB_TECH_ID the sUB_TECH_ID to set
	 */
	public void setSUB_TECH_ID(String sUB_TECH_ID) {
		SUB_TECH_ID = sUB_TECH_ID;
	}

	/**
	 * @return the pROBLEM_CODE_ID
	 */
	public String getPROBLEM_CODE_ID() {
		return PROBLEM_CODE_ID;
	}

	/**
	 * @param pROBLEM_CODE_ID the pROBLEM_CODE_ID to set
	 */
	public void setPROBLEM_CODE_ID(String pROBLEM_CODE_ID) {
		PROBLEM_CODE_ID = pROBLEM_CODE_ID;
	}

	/**
	 * @return the c3_SW_VERSION_ID
	 */
	public String getC3_SW_VERSION_ID() {
		return C3_SW_VERSION_ID;
	}

	/**
	 * @param c3_SW_VERSION_ID the c3_SW_VERSION_ID to set
	 */
	public void setC3_SW_VERSION_ID(String c3_SW_VERSION_ID) {
		C3_SW_VERSION_ID = c3_SW_VERSION_ID;
	}

	/**
	 * @return the c3_HW_VERSION_ID
	 */
	public String getC3_HW_VERSION_ID() {
		return C3_HW_VERSION_ID;
	}

	/**
	 * @param c3_HW_VERSION_ID the c3_HW_VERSION_ID to set
	 */
	public void setC3_HW_VERSION_ID(String c3_HW_VERSION_ID) {
		C3_HW_VERSION_ID = c3_HW_VERSION_ID;
	}

	/**
	 * @return the sHIP_TO_SITE_USE_ID
	 */
	public String getSHIP_TO_SITE_USE_ID() {
		return SHIP_TO_SITE_USE_ID;
	}

	/**
	 * @param sHIP_TO_SITE_USE_ID the sHIP_TO_SITE_USE_ID to set
	 */
	public void setSHIP_TO_SITE_USE_ID(String sHIP_TO_SITE_USE_ID) {
		SHIP_TO_SITE_USE_ID = sHIP_TO_SITE_USE_ID;
	}

	/**
	 * @return the cUSTOMER_PROVIDED_SER_NUMBER
	 */
	public String getCUSTOMER_PROVIDED_SER_NUMBER() {
		return CUSTOMER_PROVIDED_SER_NUMBER;
	}

	/**
	 * @param cUSTOMER_PROVIDED_SER_NUMBER the cUSTOMER_PROVIDED_SER_NUMBER to set
	 */
	public void setCUSTOMER_PROVIDED_SER_NUMBER(String cUSTOMER_PROVIDED_SER_NUMBER) {
		CUSTOMER_PROVIDED_SER_NUMBER = cUSTOMER_PROVIDED_SER_NUMBER;
	}

	/**
	 * @return the cASE_SUMMARY
	 */
	public String getCASE_SUMMARY() {
		return CASE_SUMMARY;
	}

	/**
	 * @param cASE_SUMMARY the cASE_SUMMARY to set
	 */
	public void setCASE_SUMMARY(String cASE_SUMMARY) {
		CASE_SUMMARY = cASE_SUMMARY;
	}

	/**
	 * @return the cASE_SUBJECT
	 */
	public String getCASE_SUBJECT() {
		return CASE_SUBJECT;
	}

	/**
	 * @param cASE_SUBJECT the cASE_SUBJECT to set
	 */
	public void setCASE_SUBJECT(String cASE_SUBJECT) {
		CASE_SUBJECT = cASE_SUBJECT;
	}

	/**
	 * @return the cASE_ORIGIN
	 */
	public String getCASE_ORIGIN() {
		return CASE_ORIGIN;
	}

	/**
	 * @param cASE_ORIGIN the cASE_ORIGIN to set
	 */
	public void setCASE_ORIGIN(String cASE_ORIGIN) {
		CASE_ORIGIN = cASE_ORIGIN;
	}

	/**
	 * @return the cASE_OWNER
	 */
	public String getCASE_OWNER() {
		return CASE_OWNER;
	}

	/**
	 * @param cASE_OWNER the cASE_OWNER to set
	 */
	public void setCASE_OWNER(String cASE_OWNER) {
		CASE_OWNER = cASE_OWNER;
	}

	/**
	 * @return the cS1_REASON
	 */
	public String getCS1_REASON() {
		return CS1_REASON;
	}

	/**
	 * @param cS1_REASON the cS1_REASON to set
	 */
	public void setCS1_REASON(String cS1_REASON) {
		CS1_REASON = cS1_REASON;
	}

	/**
	 * @return the cASE_CLOSED_DATE
	 */
	public Timestamp getCASE_CLOSED_DATE() {
		return CASE_CLOSED_DATE;
	}

	/**
	 * @param cASE_CLOSED_DATE the cASE_CLOSED_DATE to set
	 */
	public void setCASE_CLOSED_DATE(Timestamp cASE_CLOSED_DATE) {
		CASE_CLOSED_DATE = cASE_CLOSED_DATE;
	}

	/**
	 * @return the cASE_CREATED_DATE
	 */
	public Timestamp getCASE_CREATED_DATE() {
		return CASE_CREATED_DATE;
	}

	/**
	 * @param cASE_CREATED_DATE the cASE_CREATED_DATE to set
	 */
	public void setCASE_CREATED_DATE(Timestamp cASE_CREATED_DATE) {
		CASE_CREATED_DATE = cASE_CREATED_DATE;
	}

	/**
	 * @return the cASE_DESCRIPTION
	 */
	public String getCASE_DESCRIPTION() {
		return CASE_DESCRIPTION;
	}

	/**
	 * @param cASE_DESCRIPTION the cASE_DESCRIPTION to set
	 */
	public void setCASE_DESCRIPTION(String cASE_DESCRIPTION) {
		CASE_DESCRIPTION = cASE_DESCRIPTION;
	}

	/**
	 * @return the cASE_COMMENTS
	 */
	public String getCASE_COMMENTS() {
		return CASE_COMMENTS;
	}

	/**
	 * @param cASE_COMMENTS the cASE_COMMENTS to set
	 */
	public void setCASE_COMMENTS(String cASE_COMMENTS) {
		CASE_COMMENTS = cASE_COMMENTS;
	}

	/**
	 * @return the cASE_PRIORITY
	 */
	public String getCASE_PRIORITY() {
		return CASE_PRIORITY;
	}

	/**
	 * @param cASE_PRIORITY the cASE_PRIORITY to set
	 */
	public void setCASE_PRIORITY(String cASE_PRIORITY) {
		CASE_PRIORITY = cASE_PRIORITY;
	}

	/**
	 * @return the cASE_STATUS
	 */
	public String getCASE_STATUS() {
		return CASE_STATUS;
	}

	/**
	 * @param cASE_STATUS the cASE_STATUS to set
	 */
	public void setCASE_STATUS(String cASE_STATUS) {
		CASE_STATUS = cASE_STATUS;
	}

	/**
	 * @return the cASE_TYPE
	 */
	public String getCASE_TYPE() {
		return CASE_TYPE;
	}

	/**
	 * @param cASE_TYPE the cASE_TYPE to set
	 */
	public void setCASE_TYPE(String cASE_TYPE) {
		CASE_TYPE = cASE_TYPE;
	}

	/**
	 * @return the cASE_OWNER_CHANGES
	 */
	public BigDecimal getCASE_OWNER_CHANGES() {
		return CASE_OWNER_CHANGES;
	}

	/**
	 * @param cASE_OWNER_CHANGES the cASE_OWNER_CHANGES to set
	 */
	public void setCASE_OWNER_CHANGES(BigDecimal cASE_OWNER_CHANGES) {
		CASE_OWNER_CHANGES = cASE_OWNER_CHANGES;
	}

	/**
	 * @return the iS_ACCEPTED
	 */
	public String getIS_ACCEPTED() {
		return IS_ACCEPTED;
	}

	/**
	 * @param iS_ACCEPTED the iS_ACCEPTED to set
	 */
	public void setIS_ACCEPTED(String iS_ACCEPTED) {
		IS_ACCEPTED = iS_ACCEPTED;
	}

	/**
	 * @return the aCTION_CLASS
	 */
	public String getACTION_CLASS() {
		return ACTION_CLASS;
	}

	/**
	 * @param aCTION_CLASS the aCTION_CLASS to set
	 */
	public void setACTION_CLASS(String aCTION_CLASS) {
		ACTION_CLASS = aCTION_CLASS;
	}

	/**
	 * @return the aDDITIONAL_EMAIL_CC
	 */
	public String getADDITIONAL_EMAIL_CC() {
		return ADDITIONAL_EMAIL_CC;
	}

	/**
	 * @param aDDITIONAL_EMAIL_CC the aDDITIONAL_EMAIL_CC to set
	 */
	public void setADDITIONAL_EMAIL_CC(String aDDITIONAL_EMAIL_CC) {
		ADDITIONAL_EMAIL_CC = aDDITIONAL_EMAIL_CC;
	}

	/**
	 * @return the aLTERNATE_CONTACT_NAME
	 */
	public String getALTERNATE_CONTACT_NAME() {
		return ALTERNATE_CONTACT_NAME;
	}

	/**
	 * @param aLTERNATE_CONTACT_NAME the aLTERNATE_CONTACT_NAME to set
	 */
	public void setALTERNATE_CONTACT_NAME(String aLTERNATE_CONTACT_NAME) {
		ALTERNATE_CONTACT_NAME = aLTERNATE_CONTACT_NAME;
	}

	/**
	 * @return the aLTERNATE_EMAIL_ADDRESS
	 */
	public String getALTERNATE_EMAIL_ADDRESS() {
		return ALTERNATE_EMAIL_ADDRESS;
	}

	/**
	 * @param aLTERNATE_EMAIL_ADDRESS the aLTERNATE_EMAIL_ADDRESS to set
	 */
	public void setALTERNATE_EMAIL_ADDRESS(String aLTERNATE_EMAIL_ADDRESS) {
		ALTERNATE_EMAIL_ADDRESS = aLTERNATE_EMAIL_ADDRESS;
	}

	/**
	 * @return the aLTERNATE_PHONE
	 */
	public String getALTERNATE_PHONE() {
		return ALTERNATE_PHONE;
	}

	/**
	 * @param aLTERNATE_PHONE the aLTERNATE_PHONE to set
	 */
	public void setALTERNATE_PHONE(String aLTERNATE_PHONE) {
		ALTERNATE_PHONE = aLTERNATE_PHONE;
	}

	/**
	 * @return the b2B_URGENCY
	 */
	public String getB2B_URGENCY() {
		return B2B_URGENCY;
	}

	/**
	 * @param b2b_URGENCY the b2B_URGENCY to set
	 */
	public void setB2B_URGENCY(String b2b_URGENCY) {
		B2B_URGENCY = b2b_URGENCY;
	}

	/**
	 * @return the b2B_ESCALATED_TIME
	 */
	public String getB2B_ESCALATED_TIME() {
		return B2B_ESCALATED_TIME;
	}

	/**
	 * @param b2b_ESCALATED_TIME the b2B_ESCALATED_TIME to set
	 */
	public void setB2B_ESCALATED_TIME(String b2b_ESCALATED_TIME) {
		B2B_ESCALATED_TIME = b2b_ESCALATED_TIME;
	}

	/**
	 * @return the b2B_FLAG
	 */
	public String getB2B_FLAG() {
		return B2B_FLAG;
	}

	/**
	 * @param b2b_FLAG the b2B_FLAG to set
	 */
	public void setB2B_FLAG(String b2b_FLAG) {
		B2B_FLAG = b2b_FLAG;
	}

	/**
	 * @return the b2B_STATUS
	 */
	public String getB2B_STATUS() {
		return B2B_STATUS;
	}

	/**
	 * @param b2b_STATUS the b2B_STATUS to set
	 */
	public void setB2B_STATUS(String b2b_STATUS) {
		B2B_STATUS = b2b_STATUS;
	}

	/**
	 * @return the bILL_TO_PARTY_ID
	 */
	public String getBILL_TO_PARTY_ID() {
		return BILL_TO_PARTY_ID;
	}

	/**
	 * @param bILL_TO_PARTY_ID the bILL_TO_PARTY_ID to set
	 */
	public void setBILL_TO_PARTY_ID(String bILL_TO_PARTY_ID) {
		BILL_TO_PARTY_ID = bILL_TO_PARTY_ID;
	}

	/**
	 * @return the bILL_TO_SITE_C3_ID
	 */
	public BigDecimal getBILL_TO_SITE_C3_ID() {
		return BILL_TO_SITE_C3_ID;
	}

	/**
	 * @param bILL_TO_SITE_C3_ID the bILL_TO_SITE_C3_ID to set
	 */
	public void setBILL_TO_SITE_C3_ID(BigDecimal bILL_TO_SITE_C3_ID) {
		BILL_TO_SITE_C3_ID = bILL_TO_SITE_C3_ID;
	}

	/**
	 * @return the bILL_TO_SITE_USE_ID
	 */
	public String getBILL_TO_SITE_USE_ID() {
		return BILL_TO_SITE_USE_ID;
	}

	/**
	 * @param bILL_TO_SITE_USE_ID the bILL_TO_SITE_USE_ID to set
	 */
	public void setBILL_TO_SITE_USE_ID(String bILL_TO_SITE_USE_ID) {
		BILL_TO_SITE_USE_ID = bILL_TO_SITE_USE_ID;
	}

	/**
	 * @return the cALL_END_TIME
	 */
	public Timestamp getCALL_END_TIME() {
		return CALL_END_TIME;
	}

	/**
	 * @param cALL_END_TIME the cALL_END_TIME to set
	 */
	public void setCALL_END_TIME(Timestamp cALL_END_TIME) {
		CALL_END_TIME = cALL_END_TIME;
	}

	/**
	 * @return the cALL_PHONE_NUMBER
	 */
	public String getCALL_PHONE_NUMBER() {
		return CALL_PHONE_NUMBER;
	}

	/**
	 * @param cALL_PHONE_NUMBER the cALL_PHONE_NUMBER to set
	 */
	public void setCALL_PHONE_NUMBER(String cALL_PHONE_NUMBER) {
		CALL_PHONE_NUMBER = cALL_PHONE_NUMBER;
	}

	/**
	 * @return the cALL_START_TIME
	 */
	public Timestamp getCALL_START_TIME() {
		return CALL_START_TIME;
	}

	/**
	 * @param cALL_START_TIME the cALL_START_TIME to set
	 */
	public void setCALL_START_TIME(Timestamp cALL_START_TIME) {
		CALL_START_TIME = cALL_START_TIME;
	}

	/**
	 * @return the cASE_ACCEPTED_DATE
	 */
	public Timestamp getCASE_ACCEPTED_DATE() {
		return CASE_ACCEPTED_DATE;
	}

	/**
	 * @param cASE_ACCEPTED_DATE the cASE_ACCEPTED_DATE to set
	 */
	public void setCASE_ACCEPTED_DATE(Timestamp cASE_ACCEPTED_DATE) {
		CASE_ACCEPTED_DATE = cASE_ACCEPTED_DATE;
	}

	/**
	 * @return the cASE_IMPACT_CATEGORY
	 */
	public String getCASE_IMPACT_CATEGORY() {
		return CASE_IMPACT_CATEGORY;
	}

	/**
	 * @param cASE_IMPACT_CATEGORY the cASE_IMPACT_CATEGORY to set
	 */
	public void setCASE_IMPACT_CATEGORY(String cASE_IMPACT_CATEGORY) {
		CASE_IMPACT_CATEGORY = cASE_IMPACT_CATEGORY;
	}

	/**
	 * @return the cASE_IMPACT_STATUS
	 */
	public String getCASE_IMPACT_STATUS() {
		return CASE_IMPACT_STATUS;
	}

	/**
	 * @param cASE_IMPACT_STATUS the cASE_IMPACT_STATUS to set
	 */
	public void setCASE_IMPACT_STATUS(String cASE_IMPACT_STATUS) {
		CASE_IMPACT_STATUS = cASE_IMPACT_STATUS;
	}

	/**
	 * @return the cASE_IMPACT_USER_COUNT
	 */
	public String getCASE_IMPACT_USER_COUNT() {
		return CASE_IMPACT_USER_COUNT;
	}

	/**
	 * @param cASE_IMPACT_USER_COUNT the cASE_IMPACT_USER_COUNT to set
	 */
	public void setCASE_IMPACT_USER_COUNT(String cASE_IMPACT_USER_COUNT) {
		CASE_IMPACT_USER_COUNT = cASE_IMPACT_USER_COUNT;
	}

	/**
	 * @return the cASE_NOTIFICATION_SETTINGS
	 */
	public String getCASE_NOTIFICATION_SETTINGS() {
		return CASE_NOTIFICATION_SETTINGS;
	}

	/**
	 * @param cASE_NOTIFICATION_SETTINGS the cASE_NOTIFICATION_SETTINGS to set
	 */
	public void setCASE_NOTIFICATION_SETTINGS(String cASE_NOTIFICATION_SETTINGS) {
		CASE_NOTIFICATION_SETTINGS = cASE_NOTIFICATION_SETTINGS;
	}

	/**
	 * @return the cASE_OWNER_EMAIL_ID
	 */
	public String getCASE_OWNER_EMAIL_ID() {
		return CASE_OWNER_EMAIL_ID;
	}

	/**
	 * @param cASE_OWNER_EMAIL_ID the cASE_OWNER_EMAIL_ID to set
	 */
	public void setCASE_OWNER_EMAIL_ID(String cASE_OWNER_EMAIL_ID) {
		CASE_OWNER_EMAIL_ID = cASE_OWNER_EMAIL_ID;
	}

	/**
	 * @return the cASE_OWNER_ROLE
	 */
	public String getCASE_OWNER_ROLE() {
		return CASE_OWNER_ROLE;
	}

	/**
	 * @param cASE_OWNER_ROLE the cASE_OWNER_ROLE to set
	 */
	public void setCASE_OWNER_ROLE(String cASE_OWNER_ROLE) {
		CASE_OWNER_ROLE = cASE_OWNER_ROLE;
	}

	/**
	 * @return the cASE_REASON
	 */
	public String getCASE_REASON() {
		return CASE_REASON;
	}

	/**
	 * @param cASE_REASON the cASE_REASON to set
	 */
	public void setCASE_REASON(String cASE_REASON) {
		CASE_REASON = cASE_REASON;
	}

	/**
	 * @return the cISCO_ACCOUNT_ID
	 */
	public String getCISCO_ACCOUNT_ID() {
		return CISCO_ACCOUNT_ID;
	}

	/**
	 * @param cISCO_ACCOUNT_ID the cISCO_ACCOUNT_ID to set
	 */
	public void setCISCO_ACCOUNT_ID(String cISCO_ACCOUNT_ID) {
		CISCO_ACCOUNT_ID = cISCO_ACCOUNT_ID;
	}

	/**
	 * @return the cOMMUNICATION_PREFERENCE
	 */
	public String getCOMMUNICATION_PREFERENCE() {
		return COMMUNICATION_PREFERENCE;
	}

	/**
	 * @param cOMMUNICATION_PREFERENCE the cOMMUNICATION_PREFERENCE to set
	 */
	public void setCOMMUNICATION_PREFERENCE(String cOMMUNICATION_PREFERENCE) {
		COMMUNICATION_PREFERENCE = cOMMUNICATION_PREFERENCE;
	}

	/**
	 * @return the cASE_COMPLEXITY
	 */
	public String getCASE_COMPLEXITY() {
		return CASE_COMPLEXITY;
	}

	/**
	 * @param cASE_COMPLEXITY the cASE_COMPLEXITY to set
	 */
	public void setCASE_COMPLEXITY(String cASE_COMPLEXITY) {
		CASE_COMPLEXITY = cASE_COMPLEXITY;
	}

	/**
	 * @return the cONTACT_ME
	 */
	public String getCONTACT_ME() {
		return CONTACT_ME;
	}

	/**
	 * @param cONTACT_ME the cONTACT_ME to set
	 */
	public void setCONTACT_ME(String cONTACT_ME) {
		CONTACT_ME = cONTACT_ME;
	}

	/**
	 * @return the cONTACT_ME_DATE
	 */
	public Timestamp getCONTACT_ME_DATE() {
		return CONTACT_ME_DATE;
	}

	/**
	 * @param cONTACT_ME_DATE the cONTACT_ME_DATE to set
	 */
	public void setCONTACT_ME_DATE(Timestamp cONTACT_ME_DATE) {
		CONTACT_ME_DATE = cONTACT_ME_DATE;
	}

	/**
	 * @return the cONTACT_ME_FROM_TIME
	 */
	public Timestamp getCONTACT_ME_FROM_TIME() {
		return CONTACT_ME_FROM_TIME;
	}

	/**
	 * @param cONTACT_ME_FROM_TIME the cONTACT_ME_FROM_TIME to set
	 */
	public void setCONTACT_ME_FROM_TIME(Timestamp cONTACT_ME_FROM_TIME) {
		CONTACT_ME_FROM_TIME = cONTACT_ME_FROM_TIME;
	}

	/**
	 * @return the cONTACT_ME_TIME
	 */
	public String getCONTACT_ME_TIME() {
		return CONTACT_ME_TIME;
	}

	/**
	 * @param cONTACT_ME_TIME the cONTACT_ME_TIME to set
	 */
	public void setCONTACT_ME_TIME(String cONTACT_ME_TIME) {
		CONTACT_ME_TIME = cONTACT_ME_TIME;
	}

	/**
	 * @return the cONTACT_ME_TIME_ZONE
	 */
	public String getCONTACT_ME_TIME_ZONE() {
		return CONTACT_ME_TIME_ZONE;
	}

	/**
	 * @param cONTACT_ME_TIME_ZONE the cONTACT_ME_TIME_ZONE to set
	 */
	public void setCONTACT_ME_TIME_ZONE(String cONTACT_ME_TIME_ZONE) {
		CONTACT_ME_TIME_ZONE = cONTACT_ME_TIME_ZONE;
	}

	/**
	 * @return the cONTACT_ME_TO_TIME
	 */
	public Timestamp getCONTACT_ME_TO_TIME() {
		return CONTACT_ME_TO_TIME;
	}

	/**
	 * @param cONTACT_ME_TO_TIME the cONTACT_ME_TO_TIME to set
	 */
	public void setCONTACT_ME_TO_TIME(Timestamp cONTACT_ME_TO_TIME) {
		CONTACT_ME_TO_TIME = cONTACT_ME_TO_TIME;
	}

	/**
	 * @return the cONTACT_SECONDARY_EMAIL
	 */
	public String getCONTACT_SECONDARY_EMAIL() {
		return CONTACT_SECONDARY_EMAIL;
	}

	/**
	 * @param cONTACT_SECONDARY_EMAIL the cONTACT_SECONDARY_EMAIL to set
	 */
	public void setCONTACT_SECONDARY_EMAIL(String cONTACT_SECONDARY_EMAIL) {
		CONTACT_SECONDARY_EMAIL = cONTACT_SECONDARY_EMAIL;
	}

	/**
	 * @return the cONTACT_TYPE
	 */
	public String getCONTACT_TYPE() {
		return CONTACT_TYPE;
	}

	/**
	 * @param cONTACT_TYPE the cONTACT_TYPE to set
	 */
	public void setCONTACT_TYPE(String cONTACT_TYPE) {
		CONTACT_TYPE = cONTACT_TYPE;
	}

	/**
	 * @return the cONTRACT_STATUS
	 */
	public String getCONTRACT_STATUS() {
		return CONTRACT_STATUS;
	}

	/**
	 * @param cONTRACT_STATUS the cONTRACT_STATUS to set
	 */
	public void setCONTRACT_STATUS(String cONTRACT_STATUS) {
		CONTRACT_STATUS = cONTRACT_STATUS;
	}

	/**
	 * @return the cOUNTRY_INCIDENT
	 */
	public String getCOUNTRY_INCIDENT() {
		return COUNTRY_INCIDENT;
	}

	/**
	 * @param cOUNTRY_INCIDENT the cOUNTRY_INCIDENT to set
	 */
	public void setCOUNTRY_INCIDENT(String cOUNTRY_INCIDENT) {
		COUNTRY_INCIDENT = cOUNTRY_INCIDENT;
	}

	/**
	 * @return the aCTION_PLAN
	 */
	public String getACTION_PLAN() {
		return ACTION_PLAN;
	}

	/**
	 * @param aCTION_PLAN the aCTION_PLAN to set
	 */
	public void setACTION_PLAN(String aCTION_PLAN) {
		ACTION_PLAN = aCTION_PLAN;
	}

	/**
	 * @return the c3_CUSTOMER_ID
	 */
	public String getC3_CUSTOMER_ID() {
		return C3_CUSTOMER_ID;
	}

	/**
	 * @param c3_CUSTOMER_ID the c3_CUSTOMER_ID to set
	 */
	public void setC3_CUSTOMER_ID(String c3_CUSTOMER_ID) {
		C3_CUSTOMER_ID = c3_CUSTOMER_ID;
	}

	/**
	 * @return the cUSTOMER_CATEGORY
	 */
	public String getCUSTOMER_CATEGORY() {
		return CUSTOMER_CATEGORY;
	}

	/**
	 * @param cUSTOMER_CATEGORY the cUSTOMER_CATEGORY to set
	 */
	public void setCUSTOMER_CATEGORY(String cUSTOMER_CATEGORY) {
		CUSTOMER_CATEGORY = cUSTOMER_CATEGORY;
	}

	/**
	 * @return the cUSTOMER_ACTIVITY
	 */
	public String getCUSTOMER_ACTIVITY() {
		return CUSTOMER_ACTIVITY;
	}

	/**
	 * @param cUSTOMER_ACTIVITY the cUSTOMER_ACTIVITY to set
	 */
	public void setCUSTOMER_ACTIVITY(String cUSTOMER_ACTIVITY) {
		CUSTOMER_ACTIVITY = cUSTOMER_ACTIVITY;
	}

	/**
	 * @return the cUSTOMER_COM_BUIS_IMPACT
	 */
	public String getCUSTOMER_COM_BUIS_IMPACT() {
		return CUSTOMER_COM_BUIS_IMPACT;
	}

	/**
	 * @param cUSTOMER_COM_BUIS_IMPACT the cUSTOMER_COM_BUIS_IMPACT to set
	 */
	public void setCUSTOMER_COM_BUIS_IMPACT(String cUSTOMER_COM_BUIS_IMPACT) {
		CUSTOMER_COM_BUIS_IMPACT = cUSTOMER_COM_BUIS_IMPACT;
	}

	/**
	 * @return the cUSTOMER_COMPANY_NAME
	 */
	public String getCUSTOMER_COMPANY_NAME() {
		return CUSTOMER_COMPANY_NAME;
	}

	/**
	 * @param cUSTOMER_COMPANY_NAME the cUSTOMER_COMPANY_NAME to set
	 */
	public void setCUSTOMER_COMPANY_NAME(String cUSTOMER_COMPANY_NAME) {
		CUSTOMER_COMPANY_NAME = cUSTOMER_COMPANY_NAME;
	}

	/**
	 * @return the cUST_CONFIRM_PRIORITY_CHANGE
	 */
	public String getCUST_CONFIRM_PRIORITY_CHANGE() {
		return CUST_CONFIRM_PRIORITY_CHANGE;
	}

	/**
	 * @param cUST_CONFIRM_PRIORITY_CHANGE the cUST_CONFIRM_PRIORITY_CHANGE to set
	 */
	public void setCUST_CONFIRM_PRIORITY_CHANGE(String cUST_CONFIRM_PRIORITY_CHANGE) {
		CUST_CONFIRM_PRIORITY_CHANGE = cUST_CONFIRM_PRIORITY_CHANGE;
	}

	/**
	 * @return the cUSTOMER_CSAT
	 */
	public String getCUSTOMER_CSAT() {
		return CUSTOMER_CSAT;
	}

	/**
	 * @param cUSTOMER_CSAT the cUSTOMER_CSAT to set
	 */
	public void setCUSTOMER_CSAT(String cUSTOMER_CSAT) {
		CUSTOMER_CSAT = cUSTOMER_CSAT;
	}

	/**
	 * @return the cUSTOMER_SYMPTOM
	 */
	public String getCUSTOMER_SYMPTOM() {
		return CUSTOMER_SYMPTOM;
	}

	/**
	 * @param cUSTOMER_SYMPTOM the cUSTOMER_SYMPTOM to set
	 */
	public void setCUSTOMER_SYMPTOM(String cUSTOMER_SYMPTOM) {
		CUSTOMER_SYMPTOM = cUSTOMER_SYMPTOM;
	}

	/**
	 * @return the dATE_TIME_SURVEY_SENT
	 */
	public Timestamp getDATE_TIME_SURVEY_SENT() {
		return DATE_TIME_SURVEY_SENT;
	}

	/**
	 * @param dATE_TIME_SURVEY_SENT the dATE_TIME_SURVEY_SENT to set
	 */
	public void setDATE_TIME_SURVEY_SENT(Timestamp dATE_TIME_SURVEY_SENT) {
		DATE_TIME_SURVEY_SENT = dATE_TIME_SURVEY_SENT;
	}

	/**
	 * @return the dESCRIBE_TROUBLESHOOTING_DONE
	 */
	public String getDESCRIBE_TROUBLESHOOTING_DONE() {
		return DESCRIBE_TROUBLESHOOTING_DONE;
	}

	/**
	 * @param dESCRIBE_TROUBLESHOOTING_DONE the dESCRIBE_TROUBLESHOOTING_DONE to set
	 */
	public void setDESCRIBE_TROUBLESHOOTING_DONE(String dESCRIBE_TROUBLESHOOTING_DONE) {
		DESCRIBE_TROUBLESHOOTING_DONE = dESCRIBE_TROUBLESHOOTING_DONE;
	}

	/**
	 * @return the dESCRIBE_RECENT_ENV_CHANGES
	 */
	public String getDESCRIBE_RECENT_ENV_CHANGES() {
		return DESCRIBE_RECENT_ENV_CHANGES;
	}

	/**
	 * @param dESCRIBE_RECENT_ENV_CHANGES the dESCRIBE_RECENT_ENV_CHANGES to set
	 */
	public void setDESCRIBE_RECENT_ENV_CHANGES(String dESCRIBE_RECENT_ENV_CHANGES) {
		DESCRIBE_RECENT_ENV_CHANGES = dESCRIBE_RECENT_ENV_CHANGES;
	}

	/**
	 * @return the cSC_DISCUSSION_THREAD_ID
	 */
	public String getCSC_DISCUSSION_THREAD_ID() {
		return CSC_DISCUSSION_THREAD_ID;
	}

	/**
	 * @param cSC_DISCUSSION_THREAD_ID the cSC_DISCUSSION_THREAD_ID to set
	 */
	public void setCSC_DISCUSSION_THREAD_ID(String cSC_DISCUSSION_THREAD_ID) {
		CSC_DISCUSSION_THREAD_ID = cSC_DISCUSSION_THREAD_ID;
	}

	/**
	 * @return the dRAFT_CASE_NUMBER
	 */
	public String getDRAFT_CASE_NUMBER() {
		return DRAFT_CASE_NUMBER;
	}

	/**
	 * @param dRAFT_CASE_NUMBER the dRAFT_CASE_NUMBER to set
	 */
	public void setDRAFT_CASE_NUMBER(String dRAFT_CASE_NUMBER) {
		DRAFT_CASE_NUMBER = dRAFT_CASE_NUMBER;
	}

	/**
	 * @return the dSD_STATUS
	 */
	public String getDSD_STATUS() {
		return DSD_STATUS;
	}

	/**
	 * @param dSD_STATUS the dSD_STATUS to set
	 */
	public void setDSD_STATUS(String dSD_STATUS) {
		DSD_STATUS = dSD_STATUS;
	}

	/**
	 * @return the eF_PRODUCT_NAME
	 */
	public String getEF_PRODUCT_NAME() {
		return EF_PRODUCT_NAME;
	}

	/**
	 * @param eF_PRODUCT_NAME the eF_PRODUCT_NAME to set
	 */
	public void setEF_PRODUCT_NAME(String eF_PRODUCT_NAME) {
		EF_PRODUCT_NAME = eF_PRODUCT_NAME;
	}

	/**
	 * @return the eF_UNREACHABLE
	 */
	public String getEF_UNREACHABLE() {
		return EF_UNREACHABLE;
	}

	/**
	 * @param eF_UNREACHABLE the eF_UNREACHABLE to set
	 */
	public void setEF_UNREACHABLE(String eF_UNREACHABLE) {
		EF_UNREACHABLE = eF_UNREACHABLE;
	}

	/**
	 * @return the cS1_END_CLIENT_INFORMATION
	 */
	public String getCS1_END_CLIENT_INFORMATION() {
		return CS1_END_CLIENT_INFORMATION;
	}

	/**
	 * @param cS1_END_CLIENT_INFORMATION the cS1_END_CLIENT_INFORMATION to set
	 */
	public void setCS1_END_CLIENT_INFORMATION(String cS1_END_CLIENT_INFORMATION) {
		CS1_END_CLIENT_INFORMATION = cS1_END_CLIENT_INFORMATION;
	}

	/**
	 * @return the eND_CUSTOMER_CASE_CREATE_DATE
	 */
	public String getEND_CUSTOMER_CASE_CREATE_DATE() {
		return END_CUSTOMER_CASE_CREATE_DATE;
	}

	/**
	 * @param eND_CUSTOMER_CASE_CREATE_DATE the eND_CUSTOMER_CASE_CREATE_DATE to set
	 */
	public void setEND_CUSTOMER_CASE_CREATE_DATE(String eND_CUSTOMER_CASE_CREATE_DATE) {
		END_CUSTOMER_CASE_CREATE_DATE = eND_CUSTOMER_CASE_CREATE_DATE;
	}

	/**
	 * @return the eND_CUSTOMER_EMAIL
	 */
	public String getEND_CUSTOMER_EMAIL() {
		return END_CUSTOMER_EMAIL;
	}

	/**
	 * @param eND_CUSTOMER_EMAIL the eND_CUSTOMER_EMAIL to set
	 */
	public void setEND_CUSTOMER_EMAIL(String eND_CUSTOMER_EMAIL) {
		END_CUSTOMER_EMAIL = eND_CUSTOMER_EMAIL;
	}

	/**
	 * @return the eNGINEER_SLA_STATUS_NOTE
	 */
	public String getENGINEER_SLA_STATUS_NOTE() {
		return ENGINEER_SLA_STATUS_NOTE;
	}

	/**
	 * @param eNGINEER_SLA_STATUS_NOTE the eNGINEER_SLA_STATUS_NOTE to set
	 */
	public void setENGINEER_SLA_STATUS_NOTE(String eNGINEER_SLA_STATUS_NOTE) {
		ENGINEER_SLA_STATUS_NOTE = eNGINEER_SLA_STATUS_NOTE;
	}

	/**
	 * @return the eNTITLEMENT_STATUS
	 */
	public String getENTITLEMENT_STATUS() {
		return ENTITLEMENT_STATUS;
	}

	/**
	 * @param eNTITLEMENT_STATUS the eNTITLEMENT_STATUS to set
	 */
	public void setENTITLEMENT_STATUS(String eNTITLEMENT_STATUS) {
		ENTITLEMENT_STATUS = eNTITLEMENT_STATUS;
	}

	/**
	 * @return the eNTITLEMENT_AUDIT_ID
	 */
	public String getENTITLEMENT_AUDIT_ID() {
		return ENTITLEMENT_AUDIT_ID;
	}

	/**
	 * @param eNTITLEMENT_AUDIT_ID the eNTITLEMENT_AUDIT_ID to set
	 */
	public void setENTITLEMENT_AUDIT_ID(String eNTITLEMENT_AUDIT_ID) {
		ENTITLEMENT_AUDIT_ID = eNTITLEMENT_AUDIT_ID;
	}

	/**
	 * @return the eNTITLEMENT_REASON
	 */
	public String getENTITLEMENT_REASON() {
		return ENTITLEMENT_REASON;
	}

	/**
	 * @param eNTITLEMENT_REASON the eNTITLEMENT_REASON to set
	 */
	public void setENTITLEMENT_REASON(String eNTITLEMENT_REASON) {
		ENTITLEMENT_REASON = eNTITLEMENT_REASON;
	}

	/**
	 * @return the eNTITLEMENT_STATUS_CODE
	 */
	public String getENTITLEMENT_STATUS_CODE() {
		return ENTITLEMENT_STATUS_CODE;
	}

	/**
	 * @param eNTITLEMENT_STATUS_CODE the eNTITLEMENT_STATUS_CODE to set
	 */
	public void setENTITLEMENT_STATUS_CODE(String eNTITLEMENT_STATUS_CODE) {
		ENTITLEMENT_STATUS_CODE = eNTITLEMENT_STATUS_CODE;
	}

	/**
	 * @return the cUSTOMER_EPAGE
	 */
	public String getCUSTOMER_EPAGE() {
		return CUSTOMER_EPAGE;
	}

	/**
	 * @param cUSTOMER_EPAGE the cUSTOMER_EPAGE to set
	 */
	public void setCUSTOMER_EPAGE(String cUSTOMER_EPAGE) {
		CUSTOMER_EPAGE = cUSTOMER_EPAGE;
	}

	/**
	 * @return the eSCALATION_FLAG
	 */
	public String getESCALATION_FLAG() {
		return ESCALATION_FLAG;
	}

	/**
	 * @param eSCALATION_FLAG the eSCALATION_FLAG to set
	 */
	public void setESCALATION_FLAG(String eSCALATION_FLAG) {
		ESCALATION_FLAG = eSCALATION_FLAG;
	}

	/**
	 * @return the gR_GENERAL_OF_ACCOUNT
	 */
	public String getGR_GENERAL_OF_ACCOUNT() {
		return GR_GENERAL_OF_ACCOUNT;
	}

	/**
	 * @param gR_GENERAL_OF_ACCOUNT the gR_GENERAL_OF_ACCOUNT to set
	 */
	public void setGR_GENERAL_OF_ACCOUNT(String gR_GENERAL_OF_ACCOUNT) {
		GR_GENERAL_OF_ACCOUNT = gR_GENERAL_OF_ACCOUNT;
	}

	/**
	 * @return the gR_LAST_UPDATE_DATE
	 */
	public Timestamp getGR_LAST_UPDATE_DATE() {
		return GR_LAST_UPDATE_DATE;
	}

	/**
	 * @param gR_LAST_UPDATE_DATE the gR_LAST_UPDATE_DATE to set
	 */
	public void setGR_LAST_UPDATE_DATE(Timestamp gR_LAST_UPDATE_DATE) {
		GR_LAST_UPDATE_DATE = gR_LAST_UPDATE_DATE;
	}

	/**
	 * @return the gR_RMA_OF_ACCOUNT
	 */
	public String getGR_RMA_OF_ACCOUNT() {
		return GR_RMA_OF_ACCOUNT;
	}

	/**
	 * @param gR_RMA_OF_ACCOUNT the gR_RMA_OF_ACCOUNT to set
	 */
	public void setGR_RMA_OF_ACCOUNT(String gR_RMA_OF_ACCOUNT) {
		GR_RMA_OF_ACCOUNT = gR_RMA_OF_ACCOUNT;
	}

	/**
	 * @return the hELPDESK_TRACKING_NUMBER
	 */
	public String getHELPDESK_TRACKING_NUMBER() {
		return HELPDESK_TRACKING_NUMBER;
	}

	/**
	 * @param hELPDESK_TRACKING_NUMBER the hELPDESK_TRACKING_NUMBER to set
	 */
	public void setHELPDESK_TRACKING_NUMBER(String hELPDESK_TRACKING_NUMBER) {
		HELPDESK_TRACKING_NUMBER = hELPDESK_TRACKING_NUMBER;
	}

	/**
	 * @return the hTOM_EMAIL_ADDRESS
	 */
	public String getHTOM_EMAIL_ADDRESS() {
		return HTOM_EMAIL_ADDRESS;
	}

	/**
	 * @param hTOM_EMAIL_ADDRESS the hTOM_EMAIL_ADDRESS to set
	 */
	public void setHTOM_EMAIL_ADDRESS(String hTOM_EMAIL_ADDRESS) {
		HTOM_EMAIL_ADDRESS = hTOM_EMAIL_ADDRESS;
	}

	/**
	 * @return the cIN_INITIAL_ACCEPTNCE_DATE
	 */
	public Timestamp getCIN_INITIAL_ACCEPTNCE_DATE() {
		return CIN_INITIAL_ACCEPTNCE_DATE;
	}

	/**
	 * @param cIN_INITIAL_ACCEPTNCE_DATE the cIN_INITIAL_ACCEPTNCE_DATE to set
	 */
	public void setCIN_INITIAL_ACCEPTNCE_DATE(Timestamp cIN_INITIAL_ACCEPTNCE_DATE) {
		CIN_INITIAL_ACCEPTNCE_DATE = cIN_INITIAL_ACCEPTNCE_DATE;
	}

	/**
	 * @return the iNITIAL_SOLUTION
	 */
	public BigDecimal getINITIAL_SOLUTION() {
		return INITIAL_SOLUTION;
	}

	/**
	 * @param iNITIAL_SOLUTION the iNITIAL_SOLUTION to set
	 */
	public void setINITIAL_SOLUTION(BigDecimal iNITIAL_SOLUTION) {
		INITIAL_SOLUTION = iNITIAL_SOLUTION;
	}

	/**
	 * @return the c3_INSTALL_SITE_ID
	 */
	public BigDecimal getC3_INSTALL_SITE_ID() {
		return C3_INSTALL_SITE_ID;
	}

	/**
	 * @param c3_INSTALL_SITE_ID the c3_INSTALL_SITE_ID to set
	 */
	public void setC3_INSTALL_SITE_ID(BigDecimal c3_INSTALL_SITE_ID) {
		C3_INSTALL_SITE_ID = c3_INSTALL_SITE_ID;
	}

	/**
	 * @return the iNTERIM_CONTACT_EMAIL
	 */
	public String getINTERIM_CONTACT_EMAIL() {
		return INTERIM_CONTACT_EMAIL;
	}

	/**
	 * @param iNTERIM_CONTACT_EMAIL the iNTERIM_CONTACT_EMAIL to set
	 */
	public void setINTERIM_CONTACT_EMAIL(String iNTERIM_CONTACT_EMAIL) {
		INTERIM_CONTACT_EMAIL = iNTERIM_CONTACT_EMAIL;
	}

	/**
	 * @return the iSSUE_CATEGORY
	 */
	public String getISSUE_CATEGORY() {
		return ISSUE_CATEGORY;
	}

	/**
	 * @param iSSUE_CATEGORY the iSSUE_CATEGORY to set
	 */
	public void setISSUE_CATEGORY(String iSSUE_CATEGORY) {
		ISSUE_CATEGORY = iSSUE_CATEGORY;
	}

	/**
	 * @return the cIN_CR_SSB_ISSUE_REASON
	 */
	public String getCIN_CR_SSB_ISSUE_REASON() {
		return CIN_CR_SSB_ISSUE_REASON;
	}

	/**
	 * @param cIN_CR_SSB_ISSUE_REASON the cIN_CR_SSB_ISSUE_REASON to set
	 */
	public void setCIN_CR_SSB_ISSUE_REASON(String cIN_CR_SSB_ISSUE_REASON) {
		CIN_CR_SSB_ISSUE_REASON = cIN_CR_SSB_ISSUE_REASON;
	}

	/**
	 * @return the iSV_RESPONSE_STATUS
	 */
	public String getISV_RESPONSE_STATUS() {
		return ISV_RESPONSE_STATUS;
	}

	/**
	 * @param iSV_RESPONSE_STATUS the iSV_RESPONSE_STATUS to set
	 */
	public void setISV_RESPONSE_STATUS(String iSV_RESPONSE_STATUS) {
		ISV_RESPONSE_STATUS = iSV_RESPONSE_STATUS;
	}

	/**
	 * @return the cASE_LABEL
	 */
	public String getCASE_LABEL() {
		return CASE_LABEL;
	}

	/**
	 * @param cASE_LABEL the cASE_LABEL to set
	 */
	public void setCASE_LABEL(String cASE_LABEL) {
		CASE_LABEL = cASE_LABEL;
	}

	/**
	 * @return the rPT_LAST_REVIEW_DATE
	 */
	public String getRPT_LAST_REVIEW_DATE() {
		return RPT_LAST_REVIEW_DATE;
	}

	/**
	 * @param rPT_LAST_REVIEW_DATE the rPT_LAST_REVIEW_DATE to set
	 */
	public void setRPT_LAST_REVIEW_DATE(String rPT_LAST_REVIEW_DATE) {
		RPT_LAST_REVIEW_DATE = rPT_LAST_REVIEW_DATE;
	}

	/**
	 * @return the lATEST_ACTION_PLAN
	 */
	public String getLATEST_ACTION_PLAN() {
		return LATEST_ACTION_PLAN;
	}

	/**
	 * @param lATEST_ACTION_PLAN the lATEST_ACTION_PLAN to set
	 */
	public void setLATEST_ACTION_PLAN(String lATEST_ACTION_PLAN) {
		LATEST_ACTION_PLAN = lATEST_ACTION_PLAN;
	}

	/**
	 * @return the lATEST_PROBLEM_DESCRIPTION
	 */
	public String getLATEST_PROBLEM_DESCRIPTION() {
		return LATEST_PROBLEM_DESCRIPTION;
	}

	/**
	 * @param lATEST_PROBLEM_DESCRIPTION the lATEST_PROBLEM_DESCRIPTION to set
	 */
	public void setLATEST_PROBLEM_DESCRIPTION(String lATEST_PROBLEM_DESCRIPTION) {
		LATEST_PROBLEM_DESCRIPTION = lATEST_PROBLEM_DESCRIPTION;
	}

	/**
	 * @return the mANAGER_EMAIL
	 */
	public String getMANAGER_EMAIL() {
		return MANAGER_EMAIL;
	}

	/**
	 * @param mANAGER_EMAIL the mANAGER_EMAIL to set
	 */
	public void setMANAGER_EMAIL(String mANAGER_EMAIL) {
		MANAGER_EMAIL = mANAGER_EMAIL;
	}

	/**
	 * @return the mANAGER_GROUP_ALIAS
	 */
	public String getMANAGER_GROUP_ALIAS() {
		return MANAGER_GROUP_ALIAS;
	}

	/**
	 * @param mANAGER_GROUP_ALIAS the mANAGER_GROUP_ALIAS to set
	 */
	public void setMANAGER_GROUP_ALIAS(String mANAGER_GROUP_ALIAS) {
		MANAGER_GROUP_ALIAS = mANAGER_GROUP_ALIAS;
	}

	/**
	 * @return the mOBILE_PHONE
	 */
	public String getMOBILE_PHONE() {
		return MOBILE_PHONE;
	}

	/**
	 * @param mOBILE_PHONE the mOBILE_PHONE to set
	 */
	public void setMOBILE_PHONE(String mOBILE_PHONE) {
		MOBILE_PHONE = mOBILE_PHONE;
	}

	/**
	 * @return the nMTG_PRODUCT_VERSION
	 */
	public String getNMTG_PRODUCT_VERSION() {
		return NMTG_PRODUCT_VERSION;
	}

	/**
	 * @param nMTG_PRODUCT_VERSION the nMTG_PRODUCT_VERSION to set
	 */
	public void setNMTG_PRODUCT_VERSION(String nMTG_PRODUCT_VERSION) {
		NMTG_PRODUCT_VERSION = nMTG_PRODUCT_VERSION;
	}

	/**
	 * @return the nODE_NAME
	 */
	public String getNODE_NAME() {
		return NODE_NAME;
	}

	/**
	 * @param nODE_NAME the nODE_NAME to set
	 */
	public void setNODE_NAME(String nODE_NAME) {
		NODE_NAME = nODE_NAME;
	}

	/**
	 * @return the cOMM_PREFERENCE_LANG
	 */
	public String getCOMM_PREFERENCE_LANG() {
		return COMM_PREFERENCE_LANG;
	}

	/**
	 * @param cOMM_PREFERENCE_LANG the cOMM_PREFERENCE_LANG to set
	 */
	public void setCOMM_PREFERENCE_LANG(String cOMM_PREFERENCE_LANG) {
		COMM_PREFERENCE_LANG = cOMM_PREFERENCE_LANG;
	}

	/**
	 * @return the oN_HOLD_DUE_DATE
	 */
	public Timestamp getON_HOLD_DUE_DATE() {
		return ON_HOLD_DUE_DATE;
	}

	/**
	 * @param oN_HOLD_DUE_DATE the oN_HOLD_DUE_DATE to set
	 */
	public void setON_HOLD_DUE_DATE(Timestamp oN_HOLD_DUE_DATE) {
		ON_HOLD_DUE_DATE = oN_HOLD_DUE_DATE;
	}

	/**
	 * @return the oRIGINAL_CONTACT_EMAIL
	 */
	public String getORIGINAL_CONTACT_EMAIL() {
		return ORIGINAL_CONTACT_EMAIL;
	}

	/**
	 * @param oRIGINAL_CONTACT_EMAIL the oRIGINAL_CONTACT_EMAIL to set
	 */
	public void setORIGINAL_CONTACT_EMAIL(String oRIGINAL_CONTACT_EMAIL) {
		ORIGINAL_CONTACT_EMAIL = oRIGINAL_CONTACT_EMAIL;
	}

	/**
	 * @return the oTHER_INFORMATION
	 */
	public String getOTHER_INFORMATION() {
		return OTHER_INFORMATION;
	}

	/**
	 * @param oTHER_INFORMATION the oTHER_INFORMATION to set
	 */
	public void setOTHER_INFORMATION(String oTHER_INFORMATION) {
		OTHER_INFORMATION = oTHER_INFORMATION;
	}

	/**
	 * @return the oWNER_ID
	 */
	public String getOWNER_ID() {
		return OWNER_ID;
	}

	/**
	 * @param oWNER_ID the oWNER_ID to set
	 */
	public void setOWNER_ID(String oWNER_ID) {
		OWNER_ID = oWNER_ID;
	}

	/**
	 * @return the oWNER_QUEUE
	 */
	public String getOWNER_QUEUE() {
		return OWNER_QUEUE;
	}

	/**
	 * @param oWNER_QUEUE the oWNER_QUEUE to set
	 */
	public void setOWNER_QUEUE(String oWNER_QUEUE) {
		OWNER_QUEUE = oWNER_QUEUE;
	}

	/**
	 * @return the oWNER_USER
	 */
	public String getOWNER_USER() {
		return OWNER_USER;
	}

	/**
	 * @param oWNER_USER the oWNER_USER to set
	 */
	public void setOWNER_USER(String oWNER_USER) {
		OWNER_USER = oWNER_USER;
	}

	/**
	 * @return the oWNER_PROFILE
	 */
	public String getOWNER_PROFILE() {
		return OWNER_PROFILE;
	}

	/**
	 * @param oWNER_PROFILE the oWNER_PROFILE to set
	 */
	public void setOWNER_PROFILE(String oWNER_PROFILE) {
		OWNER_PROFILE = oWNER_PROFILE;
	}

	/**
	 * @return the pARTNER_CASE_NUMBER
	 */
	public String getPARTNER_CASE_NUMBER() {
		return PARTNER_CASE_NUMBER;
	}

	/**
	 * @param pARTNER_CASE_NUMBER the pARTNER_CASE_NUMBER to set
	 */
	public void setPARTNER_CASE_NUMBER(String pARTNER_CASE_NUMBER) {
		PARTNER_CASE_NUMBER = pARTNER_CASE_NUMBER;
	}

	/**
	 * @return the pARTNER_CASE_OWNER_CCO_ID
	 */
	public String getPARTNER_CASE_OWNER_CCO_ID() {
		return PARTNER_CASE_OWNER_CCO_ID;
	}

	/**
	 * @param pARTNER_CASE_OWNER_CCO_ID the pARTNER_CASE_OWNER_CCO_ID to set
	 */
	public void setPARTNER_CASE_OWNER_CCO_ID(String pARTNER_CASE_OWNER_CCO_ID) {
		PARTNER_CASE_OWNER_CCO_ID = pARTNER_CASE_OWNER_CCO_ID;
	}

	/**
	 * @return the pARTNER_CASE_OWNER_EMAIL
	 */
	public String getPARTNER_CASE_OWNER_EMAIL() {
		return PARTNER_CASE_OWNER_EMAIL;
	}

	/**
	 * @param pARTNER_CASE_OWNER_EMAIL the pARTNER_CASE_OWNER_EMAIL to set
	 */
	public void setPARTNER_CASE_OWNER_EMAIL(String pARTNER_CASE_OWNER_EMAIL) {
		PARTNER_CASE_OWNER_EMAIL = pARTNER_CASE_OWNER_EMAIL;
	}

	/**
	 * @return the pARTNER_CASE_OWNER_NAME
	 */
	public String getPARTNER_CASE_OWNER_NAME() {
		return PARTNER_CASE_OWNER_NAME;
	}

	/**
	 * @param pARTNER_CASE_OWNER_NAME the pARTNER_CASE_OWNER_NAME to set
	 */
	public void setPARTNER_CASE_OWNER_NAME(String pARTNER_CASE_OWNER_NAME) {
		PARTNER_CASE_OWNER_NAME = pARTNER_CASE_OWNER_NAME;
	}

	/**
	 * @return the pARTNER_CASE_OWNER_PHONE
	 */
	public String getPARTNER_CASE_OWNER_PHONE() {
		return PARTNER_CASE_OWNER_PHONE;
	}

	/**
	 * @param pARTNER_CASE_OWNER_PHONE the pARTNER_CASE_OWNER_PHONE to set
	 */
	public void setPARTNER_CASE_OWNER_PHONE(String pARTNER_CASE_OWNER_PHONE) {
		PARTNER_CASE_OWNER_PHONE = pARTNER_CASE_OWNER_PHONE;
	}

	/**
	 * @return the pARTNER_NAME
	 */
	public String getPARTNER_NAME() {
		return PARTNER_NAME;
	}

	/**
	 * @param pARTNER_NAME the pARTNER_NAME to set
	 */
	public void setPARTNER_NAME(String pARTNER_NAME) {
		PARTNER_NAME = pARTNER_NAME;
	}

	/**
	 * @return the pARTNER_OWNER_GROUP_ID
	 */
	public String getPARTNER_OWNER_GROUP_ID() {
		return PARTNER_OWNER_GROUP_ID;
	}

	/**
	 * @param pARTNER_OWNER_GROUP_ID the pARTNER_OWNER_GROUP_ID to set
	 */
	public void setPARTNER_OWNER_GROUP_ID(String pARTNER_OWNER_GROUP_ID) {
		PARTNER_OWNER_GROUP_ID = pARTNER_OWNER_GROUP_ID;
	}

	/**
	 * @return the pARTNER_OWNER_GROUP_NAME
	 */
	public String getPARTNER_OWNER_GROUP_NAME() {
		return PARTNER_OWNER_GROUP_NAME;
	}

	/**
	 * @param pARTNER_OWNER_GROUP_NAME the pARTNER_OWNER_GROUP_NAME to set
	 */
	public void setPARTNER_OWNER_GROUP_NAME(String pARTNER_OWNER_GROUP_NAME) {
		PARTNER_OWNER_GROUP_NAME = pARTNER_OWNER_GROUP_NAME;
	}

	/**
	 * @return the pICA_ID
	 */
	public String getPICA_ID() {
		return PICA_ID;
	}

	/**
	 * @param pICA_ID the pICA_ID to set
	 */
	public void setPICA_ID(String pICA_ID) {
		PICA_ID = pICA_ID;
	}

	/**
	 * @return the pORTFOLIO_NUMBER
	 */
	public String getPORTFOLIO_NUMBER() {
		return PORTFOLIO_NUMBER;
	}

	/**
	 * @param pORTFOLIO_NUMBER the pORTFOLIO_NUMBER to set
	 */
	public void setPORTFOLIO_NUMBER(String pORTFOLIO_NUMBER) {
		PORTFOLIO_NUMBER = pORTFOLIO_NUMBER;
	}

	/**
	 * @return the pREVIOUS_QUEUE
	 */
	public String getPREVIOUS_QUEUE() {
		return PREVIOUS_QUEUE;
	}

	/**
	 * @param pREVIOUS_QUEUE the pREVIOUS_QUEUE to set
	 */
	public void setPREVIOUS_QUEUE(String pREVIOUS_QUEUE) {
		PREVIOUS_QUEUE = pREVIOUS_QUEUE;
	}

	/**
	 * @return the pRIORITY_INDICATION
	 */
	public String getPRIORITY_INDICATION() {
		return PRIORITY_INDICATION;
	}

	/**
	 * @param pRIORITY_INDICATION the pRIORITY_INDICATION to set
	 */
	public void setPRIORITY_INDICATION(String pRIORITY_INDICATION) {
		PRIORITY_INDICATION = pRIORITY_INDICATION;
	}

	/**
	 * @return the cASE_IMPACT_INCIDENT_TIME
	 */
	public Timestamp getCASE_IMPACT_INCIDENT_TIME() {
		return CASE_IMPACT_INCIDENT_TIME;
	}

	/**
	 * @param cASE_IMPACT_INCIDENT_TIME the cASE_IMPACT_INCIDENT_TIME to set
	 */
	public void setCASE_IMPACT_INCIDENT_TIME(Timestamp cASE_IMPACT_INCIDENT_TIME) {
		CASE_IMPACT_INCIDENT_TIME = cASE_IMPACT_INCIDENT_TIME;
	}

	/**
	 * @return the c3_PRODUCT_ID
	 */
	public String getC3_PRODUCT_ID() {
		return C3_PRODUCT_ID;
	}

	/**
	 * @param c3_PRODUCT_ID the c3_PRODUCT_ID to set
	 */
	public void setC3_PRODUCT_ID(String c3_PRODUCT_ID) {
		C3_PRODUCT_ID = c3_PRODUCT_ID;
	}

	/**
	 * @return the cIN_CR_LED_PRODUCT_TYPE
	 */
	public String getCIN_CR_LED_PRODUCT_TYPE() {
		return CIN_CR_LED_PRODUCT_TYPE;
	}

	/**
	 * @param cIN_CR_LED_PRODUCT_TYPE the cIN_CR_LED_PRODUCT_TYPE to set
	 */
	public void setCIN_CR_LED_PRODUCT_TYPE(String cIN_CR_LED_PRODUCT_TYPE) {
		CIN_CR_LED_PRODUCT_TYPE = cIN_CR_LED_PRODUCT_TYPE;
	}

	/**
	 * @return the cIN_CR_SSB_PRODUCT_TYPE
	 */
	public String getCIN_CR_SSB_PRODUCT_TYPE() {
		return CIN_CR_SSB_PRODUCT_TYPE;
	}

	/**
	 * @param cIN_CR_SSB_PRODUCT_TYPE the cIN_CR_SSB_PRODUCT_TYPE to set
	 */
	public void setCIN_CR_SSB_PRODUCT_TYPE(String cIN_CR_SSB_PRODUCT_TYPE) {
		CIN_CR_SSB_PRODUCT_TYPE = cIN_CR_SSB_PRODUCT_TYPE;
	}

	/**
	 * @return the pURCHASE_DATE
	 */
	public Timestamp getPURCHASE_DATE() {
		return PURCHASE_DATE;
	}

	/**
	 * @param pURCHASE_DATE the pURCHASE_DATE to set
	 */
	public void setPURCHASE_DATE(Timestamp pURCHASE_DATE) {
		PURCHASE_DATE = pURCHASE_DATE;
	}

	/**
	 * @return the rEASON_CUST_CONSNT_NOT_TAKEN
	 */
	public String getREASON_CUST_CONSNT_NOT_TAKEN() {
		return REASON_CUST_CONSNT_NOT_TAKEN;
	}

	/**
	 * @param rEASON_CUST_CONSNT_NOT_TAKEN the rEASON_CUST_CONSNT_NOT_TAKEN to set
	 */
	public void setREASON_CUST_CONSNT_NOT_TAKEN(String rEASON_CUST_CONSNT_NOT_TAKEN) {
		REASON_CUST_CONSNT_NOT_TAKEN = rEASON_CUST_CONSNT_NOT_TAKEN;
	}

	/**
	 * @return the rEASON_SURVEY_NOT_SENT
	 */
	public String getREASON_SURVEY_NOT_SENT() {
		return REASON_SURVEY_NOT_SENT;
	}

	/**
	 * @param rEASON_SURVEY_NOT_SENT the rEASON_SURVEY_NOT_SENT to set
	 */
	public void setREASON_SURVEY_NOT_SENT(String rEASON_SURVEY_NOT_SENT) {
		REASON_SURVEY_NOT_SENT = rEASON_SURVEY_NOT_SENT;
	}

	/**
	 * @return the rEQUEST_CLASS
	 */
	public String getREQUEST_CLASS() {
		return REQUEST_CLASS;
	}

	/**
	 * @param rEQUEST_CLASS the rEQUEST_CLASS to set
	 */
	public void setREQUEST_CLASS(String rEQUEST_CLASS) {
		REQUEST_CLASS = rEQUEST_CLASS;
	}

	/**
	 * @return the rEQUEST_SUB_CLASS
	 */
	public String getREQUEST_SUB_CLASS() {
		return REQUEST_SUB_CLASS;
	}

	/**
	 * @param rEQUEST_SUB_CLASS the rEQUEST_SUB_CLASS to set
	 */
	public void setREQUEST_SUB_CLASS(String rEQUEST_SUB_CLASS) {
		REQUEST_SUB_CLASS = rEQUEST_SUB_CLASS;
	}

	/**
	 * @return the rEQUEST_TYPE
	 */
	public String getREQUEST_TYPE() {
		return REQUEST_TYPE;
	}

	/**
	 * @param rEQUEST_TYPE the rEQUEST_TYPE to set
	 */
	public void setREQUEST_TYPE(String rEQUEST_TYPE) {
		REQUEST_TYPE = rEQUEST_TYPE;
	}

	/**
	 * @return the rEQUEUE_REASON
	 */
	public String getREQUEUE_REASON() {
		return REQUEUE_REASON;
	}

	/**
	 * @param rEQUEUE_REASON the rEQUEUE_REASON to set
	 */
	public void setREQUEUE_REASON(String rEQUEUE_REASON) {
		REQUEUE_REASON = rEQUEUE_REASON;
	}

	/**
	 * @return the mISQUEUE_REASON
	 */
	public String getMISQUEUE_REASON() {
		return MISQUEUE_REASON;
	}

	/**
	 * @param mISQUEUE_REASON the mISQUEUE_REASON to set
	 */
	public void setMISQUEUE_REASON(String mISQUEUE_REASON) {
		MISQUEUE_REASON = mISQUEUE_REASON;
	}

	/**
	 * @return the rEQUEUE_REASON_DETAILS
	 */
	public String getREQUEUE_REASON_DETAILS() {
		return REQUEUE_REASON_DETAILS;
	}

	/**
	 * @param rEQUEUE_REASON_DETAILS the rEQUEUE_REASON_DETAILS to set
	 */
	public void setREQUEUE_REASON_DETAILS(String rEQUEUE_REASON_DETAILS) {
		REQUEUE_REASON_DETAILS = rEQUEUE_REASON_DETAILS;
	}

	/**
	 * @return the rESOLUTION_CODE
	 */
	public String getRESOLUTION_CODE() {
		return RESOLUTION_CODE;
	}

	/**
	 * @param rESOLUTION_CODE the rESOLUTION_CODE to set
	 */
	public void setRESOLUTION_CODE(String rESOLUTION_CODE) {
		RESOLUTION_CODE = rESOLUTION_CODE;
	}

	/**
	 * @return the rESOLUTION_SUMMARY
	 */
	public String getRESOLUTION_SUMMARY() {
		return RESOLUTION_SUMMARY;
	}

	/**
	 * @param rESOLUTION_SUMMARY the rESOLUTION_SUMMARY to set
	 */
	public void setRESOLUTION_SUMMARY(String rESOLUTION_SUMMARY) {
		RESOLUTION_SUMMARY = rESOLUTION_SUMMARY;
	}

	/**
	 * @return the cDS_RESOLUTION_SUMMARY
	 */
	public String getCDS_RESOLUTION_SUMMARY() {
		return CDS_RESOLUTION_SUMMARY;
	}

	/**
	 * @param cDS_RESOLUTION_SUMMARY the cDS_RESOLUTION_SUMMARY to set
	 */
	public void setCDS_RESOLUTION_SUMMARY(String cDS_RESOLUTION_SUMMARY) {
		CDS_RESOLUTION_SUMMARY = cDS_RESOLUTION_SUMMARY;
	}

	/**
	 * @return the rOUTE_OPTION_SELECTED
	 */
	public String getROUTE_OPTION_SELECTED() {
		return ROUTE_OPTION_SELECTED;
	}

	/**
	 * @param rOUTE_OPTION_SELECTED the rOUTE_OPTION_SELECTED to set
	 */
	public void setROUTE_OPTION_SELECTED(String rOUTE_OPTION_SELECTED) {
		ROUTE_OPTION_SELECTED = rOUTE_OPTION_SELECTED;
	}

	/**
	 * @return the rTO_AUDIT_ID
	 */
	public String getRTO_AUDIT_ID() {
		return RTO_AUDIT_ID;
	}

	/**
	 * @param rTO_AUDIT_ID the rTO_AUDIT_ID to set
	 */
	public void setRTO_AUDIT_ID(String rTO_AUDIT_ID) {
		RTO_AUDIT_ID = rTO_AUDIT_ID;
	}

	/**
	 * @return the rTO_FLAG
	 */
	public String getRTO_FLAG() {
		return RTO_FLAG;
	}

	/**
	 * @param rTO_FLAG the rTO_FLAG to set
	 */
	public void setRTO_FLAG(String rTO_FLAG) {
		RTO_FLAG = rTO_FLAG;
	}

	/**
	 * @return the sBSC_CHANNEL_CODE
	 */
	public String getSBSC_CHANNEL_CODE() {
		return SBSC_CHANNEL_CODE;
	}

	/**
	 * @param sBSC_CHANNEL_CODE the sBSC_CHANNEL_CODE to set
	 */
	public void setSBSC_CHANNEL_CODE(String sBSC_CHANNEL_CODE) {
		SBSC_CHANNEL_CODE = sBSC_CHANNEL_CODE;
	}

	/**
	 * @return the sBSC_RESOLUTION_COMMENT
	 */
	public String getSBSC_RESOLUTION_COMMENT() {
		return SBSC_RESOLUTION_COMMENT;
	}

	/**
	 * @param sBSC_RESOLUTION_COMMENT the sBSC_RESOLUTION_COMMENT to set
	 */
	public void setSBSC_RESOLUTION_COMMENT(String sBSC_RESOLUTION_COMMENT) {
		SBSC_RESOLUTION_COMMENT = sBSC_RESOLUTION_COMMENT;
	}

	/**
	 * @return the sCHEDULED_DISPATCH_TIME
	 */
	public Timestamp getSCHEDULED_DISPATCH_TIME() {
		return SCHEDULED_DISPATCH_TIME;
	}

	/**
	 * @param sCHEDULED_DISPATCH_TIME the sCHEDULED_DISPATCH_TIME to set
	 */
	public void setSCHEDULED_DISPATCH_TIME(Timestamp sCHEDULED_DISPATCH_TIME) {
		SCHEDULED_DISPATCH_TIME = sCHEDULED_DISPATCH_TIME;
	}

	/**
	 * @return the sCRUBBED_CUSTOMER_SYMPTOM
	 */
	public String getSCRUBBED_CUSTOMER_SYMPTOM() {
		return SCRUBBED_CUSTOMER_SYMPTOM;
	}

	/**
	 * @param sCRUBBED_CUSTOMER_SYMPTOM the sCRUBBED_CUSTOMER_SYMPTOM to set
	 */
	public void setSCRUBBED_CUSTOMER_SYMPTOM(String sCRUBBED_CUSTOMER_SYMPTOM) {
		SCRUBBED_CUSTOMER_SYMPTOM = sCRUBBED_CUSTOMER_SYMPTOM;
	}

	/**
	 * @return the sCRUBBED_RESOLUTION_CODE
	 */
	public String getSCRUBBED_RESOLUTION_CODE() {
		return SCRUBBED_RESOLUTION_CODE;
	}

	/**
	 * @param sCRUBBED_RESOLUTION_CODE the sCRUBBED_RESOLUTION_CODE to set
	 */
	public void setSCRUBBED_RESOLUTION_CODE(String sCRUBBED_RESOLUTION_CODE) {
		SCRUBBED_RESOLUTION_CODE = sCRUBBED_RESOLUTION_CODE;
	}

	/**
	 * @return the sCRUBBED_RESOLUTION_SUMMARY
	 */
	public String getSCRUBBED_RESOLUTION_SUMMARY() {
		return SCRUBBED_RESOLUTION_SUMMARY;
	}

	/**
	 * @param sCRUBBED_RESOLUTION_SUMMARY the sCRUBBED_RESOLUTION_SUMMARY to set
	 */
	public void setSCRUBBED_RESOLUTION_SUMMARY(String sCRUBBED_RESOLUTION_SUMMARY) {
		SCRUBBED_RESOLUTION_SUMMARY = sCRUBBED_RESOLUTION_SUMMARY;
	}

	/**
	 * @return the sCRUBBED_UNDERLYING_CAUSE
	 */
	public String getSCRUBBED_UNDERLYING_CAUSE() {
		return SCRUBBED_UNDERLYING_CAUSE;
	}

	/**
	 * @param sCRUBBED_UNDERLYING_CAUSE the sCRUBBED_UNDERLYING_CAUSE to set
	 */
	public void setSCRUBBED_UNDERLYING_CAUSE(String sCRUBBED_UNDERLYING_CAUSE) {
		SCRUBBED_UNDERLYING_CAUSE = sCRUBBED_UNDERLYING_CAUSE;
	}

	/**
	 * @return the sCRUBBED_UNDERLYING_CAUSE_CAT
	 */
	public String getSCRUBBED_UNDERLYING_CAUSE_CAT() {
		return SCRUBBED_UNDERLYING_CAUSE_CAT;
	}

	/**
	 * @param sCRUBBED_UNDERLYING_CAUSE_CAT the sCRUBBED_UNDERLYING_CAUSE_CAT to set
	 */
	public void setSCRUBBED_UNDERLYING_CAUSE_CAT(String sCRUBBED_UNDERLYING_CAUSE_CAT) {
		SCRUBBED_UNDERLYING_CAUSE_CAT = sCRUBBED_UNDERLYING_CAUSE_CAT;
	}

	/**
	 * @return the sEND_EMAIL_NOTIF_TO_CONTACT
	 */
	public String getSEND_EMAIL_NOTIF_TO_CONTACT() {
		return SEND_EMAIL_NOTIF_TO_CONTACT;
	}

	/**
	 * @param sEND_EMAIL_NOTIF_TO_CONTACT the sEND_EMAIL_NOTIF_TO_CONTACT to set
	 */
	public void setSEND_EMAIL_NOTIF_TO_CONTACT(String sEND_EMAIL_NOTIF_TO_CONTACT) {
		SEND_EMAIL_NOTIF_TO_CONTACT = sEND_EMAIL_NOTIF_TO_CONTACT;
	}

	/**
	 * @return the sERVICE_LINE_NAME
	 */
	public String getSERVICE_LINE_NAME() {
		return SERVICE_LINE_NAME;
	}

	/**
	 * @param sERVICE_LINE_NAME the sERVICE_LINE_NAME to set
	 */
	public void setSERVICE_LINE_NAME(String sERVICE_LINE_NAME) {
		SERVICE_LINE_NAME = sERVICE_LINE_NAME;
	}

	/**
	 * @return the eXTENDED_LOSS_OF_SERVICE
	 */
	public String getEXTENDED_LOSS_OF_SERVICE() {
		return EXTENDED_LOSS_OF_SERVICE;
	}

	/**
	 * @param eXTENDED_LOSS_OF_SERVICE the eXTENDED_LOSS_OF_SERVICE to set
	 */
	public void setEXTENDED_LOSS_OF_SERVICE(String eXTENDED_LOSS_OF_SERVICE) {
		EXTENDED_LOSS_OF_SERVICE = eXTENDED_LOSS_OF_SERVICE;
	}

	/**
	 * @return the sHIP_TO_PARTY_ID
	 */
	public String getSHIP_TO_PARTY_ID() {
		return SHIP_TO_PARTY_ID;
	}

	/**
	 * @param sHIP_TO_PARTY_ID the sHIP_TO_PARTY_ID to set
	 */
	public void setSHIP_TO_PARTY_ID(String sHIP_TO_PARTY_ID) {
		SHIP_TO_PARTY_ID = sHIP_TO_PARTY_ID;
	}

	/**
	 * @return the c3_SHIP_TO_SITE_ID
	 */
	public BigDecimal getC3_SHIP_TO_SITE_ID() {
		return C3_SHIP_TO_SITE_ID;
	}

	/**
	 * @param c3_SHIP_TO_SITE_ID the c3_SHIP_TO_SITE_ID to set
	 */
	public void setC3_SHIP_TO_SITE_ID(BigDecimal c3_SHIP_TO_SITE_ID) {
		C3_SHIP_TO_SITE_ID = c3_SHIP_TO_SITE_ID;
	}

	/**
	 * @return the sMART_ACCOUNT_ID
	 */
	public String getSMART_ACCOUNT_ID() {
		return SMART_ACCOUNT_ID;
	}

	/**
	 * @param sMART_ACCOUNT_ID the sMART_ACCOUNT_ID to set
	 */
	public void setSMART_ACCOUNT_ID(String sMART_ACCOUNT_ID) {
		SMART_ACCOUNT_ID = sMART_ACCOUNT_ID;
	}

	/**
	 * @return the sMART_SERVICE_PROGRAMS
	 */
	public String getSMART_SERVICE_PROGRAMS() {
		return SMART_SERVICE_PROGRAMS;
	}

	/**
	 * @param sMART_SERVICE_PROGRAMS the sMART_SERVICE_PROGRAMS to set
	 */
	public void setSMART_SERVICE_PROGRAMS(String sMART_SERVICE_PROGRAMS) {
		SMART_SERVICE_PROGRAMS = sMART_SERVICE_PROGRAMS;
	}

	/**
	 * @return the sN_INPUT_TYPE
	 */
	public String getSN_INPUT_TYPE() {
		return SN_INPUT_TYPE;
	}

	/**
	 * @param sN_INPUT_TYPE the sN_INPUT_TYPE to set
	 */
	public void setSN_INPUT_TYPE(String sN_INPUT_TYPE) {
		SN_INPUT_TYPE = sN_INPUT_TYPE;
	}

	/**
	 * @return the sW_VERSION
	 */
	public String getSW_VERSION() {
		return SW_VERSION;
	}

	/**
	 * @param sW_VERSION the sW_VERSION to set
	 */
	public void setSW_VERSION(String sW_VERSION) {
		SW_VERSION = sW_VERSION;
	}

	/**
	 * @return the sOLUTION_RELEASE
	 */
	public String getSOLUTION_RELEASE() {
		return SOLUTION_RELEASE;
	}

	/**
	 * @param sOLUTION_RELEASE the sOLUTION_RELEASE to set
	 */
	public void setSOLUTION_RELEASE(String sOLUTION_RELEASE) {
		SOLUTION_RELEASE = sOLUTION_RELEASE;
	}

	/**
	 * @return the sOLUTION_TYPE
	 */
	public String getSOLUTION_TYPE() {
		return SOLUTION_TYPE;
	}

	/**
	 * @param sOLUTION_TYPE the sOLUTION_TYPE to set
	 */
	public void setSOLUTION_TYPE(String sOLUTION_TYPE) {
		SOLUTION_TYPE = sOLUTION_TYPE;
	}

	/**
	 * @return the dATA_SOURCE_NAME
	 */
	public String getDATA_SOURCE_NAME() {
		return DATA_SOURCE_NAME;
	}

	/**
	 * @param dATA_SOURCE_NAME the dATA_SOURCE_NAME to set
	 */
	public void setDATA_SOURCE_NAME(String dATA_SOURCE_NAME) {
		DATA_SOURCE_NAME = dATA_SOURCE_NAME;
	}

	/**
	 * @return the sPOKEN_LANGUAGE
	 */
	public String getSPOKEN_LANGUAGE() {
		return SPOKEN_LANGUAGE;
	}

	/**
	 * @param sPOKEN_LANGUAGE the sPOKEN_LANGUAGE to set
	 */
	public void setSPOKEN_LANGUAGE(String sPOKEN_LANGUAGE) {
		SPOKEN_LANGUAGE = sPOKEN_LANGUAGE;
	}

	/**
	 * @return the sR_LANGUAGE
	 */
	public String getSR_LANGUAGE() {
		return SR_LANGUAGE;
	}

	/**
	 * @param sR_LANGUAGE the sR_LANGUAGE to set
	 */
	public void setSR_LANGUAGE(String sR_LANGUAGE) {
		SR_LANGUAGE = sR_LANGUAGE;
	}

	/**
	 * @return the sUBSCRIPTION_REFERENCE_ID
	 */
	public String getSUBSCRIPTION_REFERENCE_ID() {
		return SUBSCRIPTION_REFERENCE_ID;
	}

	/**
	 * @param sUBSCRIPTION_REFERENCE_ID the sUBSCRIPTION_REFERENCE_ID to set
	 */
	public void setSUBSCRIPTION_REFERENCE_ID(String sUBSCRIPTION_REFERENCE_ID) {
		SUBSCRIPTION_REFERENCE_ID = sUBSCRIPTION_REFERENCE_ID;
	}

	/**
	 * @return the sURVEY_OPT_OUT
	 */
	public String getSURVEY_OPT_OUT() {
		return SURVEY_OPT_OUT;
	}

	/**
	 * @param sURVEY_OPT_OUT the sURVEY_OPT_OUT to set
	 */
	public void setSURVEY_OPT_OUT(String sURVEY_OPT_OUT) {
		SURVEY_OPT_OUT = sURVEY_OPT_OUT;
	}

	/**
	 * @return the sURVEY_PREFERENCE
	 */
	public String getSURVEY_PREFERENCE() {
		return SURVEY_PREFERENCE;
	}

	/**
	 * @param sURVEY_PREFERENCE the sURVEY_PREFERENCE to set
	 */
	public void setSURVEY_PREFERENCE(String sURVEY_PREFERENCE) {
		SURVEY_PREFERENCE = sURVEY_PREFERENCE;
	}

	/**
	 * @return the sURVEY_SENT
	 */
	public String getSURVEY_SENT() {
		return SURVEY_SENT;
	}

	/**
	 * @param sURVEY_SENT the sURVEY_SENT to set
	 */
	public void setSURVEY_SENT(String sURVEY_SENT) {
		SURVEY_SENT = sURVEY_SENT;
	}

	/**
	 * @return the sURVEY_TYPE
	 */
	public String getSURVEY_TYPE() {
		return SURVEY_TYPE;
	}

	/**
	 * @param sURVEY_TYPE the sURVEY_TYPE to set
	 */
	public void setSURVEY_TYPE(String sURVEY_TYPE) {
		SURVEY_TYPE = sURVEY_TYPE;
	}

	/**
	 * @return the sVO_ACCESS_ENABLED
	 */
	public String getSVO_ACCESS_ENABLED() {
		return SVO_ACCESS_ENABLED;
	}

	/**
	 * @param sVO_ACCESS_ENABLED the sVO_ACCESS_ENABLED to set
	 */
	public void setSVO_ACCESS_ENABLED(String sVO_ACCESS_ENABLED) {
		SVO_ACCESS_ENABLED = sVO_ACCESS_ENABLED;
	}

	/**
	 * @return the cASE_TAG
	 */
	public String getCASE_TAG() {
		return CASE_TAG;
	}

	/**
	 * @param cASE_TAG the cASE_TAG to set
	 */
	public void setCASE_TAG(String cASE_TAG) {
		CASE_TAG = cASE_TAG;
	}

	/**
	 * @return the tICKET_NUMBER
	 */
	public String getTICKET_NUMBER() {
		return TICKET_NUMBER;
	}

	/**
	 * @param tICKET_NUMBER the tICKET_NUMBER to set
	 */
	public void setTICKET_NUMBER(String tICKET_NUMBER) {
		TICKET_NUMBER = tICKET_NUMBER;
	}

	/**
	 * @return the tHIRD_PARTY_VENDOR
	 */
	public String getTHIRD_PARTY_VENDOR() {
		return THIRD_PARTY_VENDOR;
	}

	/**
	 * @param tHIRD_PARTY_VENDOR the tHIRD_PARTY_VENDOR to set
	 */
	public void setTHIRD_PARTY_VENDOR(String tHIRD_PARTY_VENDOR) {
		THIRD_PARTY_VENDOR = tHIRD_PARTY_VENDOR;
	}

	/**
	 * @return the uNDERLYING_CAUSE
	 */
	public String getUNDERLYING_CAUSE() {
		return UNDERLYING_CAUSE;
	}

	/**
	 * @param uNDERLYING_CAUSE the uNDERLYING_CAUSE to set
	 */
	public void setUNDERLYING_CAUSE(String uNDERLYING_CAUSE) {
		UNDERLYING_CAUSE = uNDERLYING_CAUSE;
	}

	/**
	 * @return the cASE_CATEGORY
	 */
	public String getCASE_CATEGORY() {
		return CASE_CATEGORY;
	}

	/**
	 * @param cASE_CATEGORY the cASE_CATEGORY to set
	 */
	public void setCASE_CATEGORY(String cASE_CATEGORY) {
		CASE_CATEGORY = cASE_CATEGORY;
	}

	/**
	 * @return the cASE_URGENCY
	 */
	public String getCASE_URGENCY() {
		return CASE_URGENCY;
	}

	/**
	 * @param cASE_URGENCY the cASE_URGENCY to set
	 */
	public void setCASE_URGENCY(String cASE_URGENCY) {
		CASE_URGENCY = cASE_URGENCY;
	}

	/**
	 * @return the cASE_CLOSE_SW_VERSION
	 */
	public String getCASE_CLOSE_SW_VERSION() {
		return CASE_CLOSE_SW_VERSION;
	}

	/**
	 * @param cASE_CLOSE_SW_VERSION the cASE_CLOSE_SW_VERSION to set
	 */
	public void setCASE_CLOSE_SW_VERSION(String cASE_CLOSE_SW_VERSION) {
		CASE_CLOSE_SW_VERSION = cASE_CLOSE_SW_VERSION;
	}

	/**
	 * @return the vIRTUAL_ACCOUNT_ID
	 */
	public String getVIRTUAL_ACCOUNT_ID() {
		return VIRTUAL_ACCOUNT_ID;
	}

	/**
	 * @param vIRTUAL_ACCOUNT_ID the vIRTUAL_ACCOUNT_ID to set
	 */
	public void setVIRTUAL_ACCOUNT_ID(String vIRTUAL_ACCOUNT_ID) {
		VIRTUAL_ACCOUNT_ID = vIRTUAL_ACCOUNT_ID;
	}

	/**
	 * @return the cUSTOMER_CALLED_SUPPORT_REASON
	 */
	public String getCUSTOMER_CALLED_SUPPORT_REASON() {
		return CUSTOMER_CALLED_SUPPORT_REASON;
	}

	/**
	 * @param cUSTOMER_CALLED_SUPPORT_REASON the cUSTOMER_CALLED_SUPPORT_REASON to set
	 */
	public void setCUSTOMER_CALLED_SUPPORT_REASON(String cUSTOMER_CALLED_SUPPORT_REASON) {
		CUSTOMER_CALLED_SUPPORT_REASON = cUSTOMER_CALLED_SUPPORT_REASON;
	}

	/**
	 * @return the rESOLUTION_WORKAROUND
	 */
	public String getRESOLUTION_WORKAROUND() {
		return RESOLUTION_WORKAROUND;
	}

	/**
	 * @param rESOLUTION_WORKAROUND the rESOLUTION_WORKAROUND to set
	 */
	public void setRESOLUTION_WORKAROUND(String rESOLUTION_WORKAROUND) {
		RESOLUTION_WORKAROUND = rESOLUTION_WORKAROUND;
	}

	/**
	 * @return the wORKGROUP_NAME
	 */
	public String getWORKGROUP_NAME() {
		return WORKGROUP_NAME;
	}

	/**
	 * @param wORKGROUP_NAME the wORKGROUP_NAME to set
	 */
	public void setWORKGROUP_NAME(String wORKGROUP_NAME) {
		WORKGROUP_NAME = wORKGROUP_NAME;
	}

	/**
	 * @return the lAST_UPDATE_DATE_C3_USER
	 */
	public Timestamp getLAST_UPDATE_DATE_C3_USER() {
		return LAST_UPDATE_DATE_C3_USER;
	}

	/**
	 * @param lAST_UPDATE_DATE_C3_USER the lAST_UPDATE_DATE_C3_USER to set
	 */
	public void setLAST_UPDATE_DATE_C3_USER(Timestamp lAST_UPDATE_DATE_C3_USER) {
		LAST_UPDATE_DATE_C3_USER = lAST_UPDATE_DATE_C3_USER;
	}

	/**
	 * @return the nETWORK_PROTOCOL
	 */
	public String getNETWORK_PROTOCOL() {
		return NETWORK_PROTOCOL;
	}

	/**
	 * @param nETWORK_PROTOCOL the nETWORK_PROTOCOL to set
	 */
	public void setNETWORK_PROTOCOL(String nETWORK_PROTOCOL) {
		NETWORK_PROTOCOL = nETWORK_PROTOCOL;
	}

	/**
	 * @return the pROTOCOL_DETAILS
	 */
	public String getPROTOCOL_DETAILS() {
		return PROTOCOL_DETAILS;
	}

	/**
	 * @param pROTOCOL_DETAILS the pROTOCOL_DETAILS to set
	 */
	public void setPROTOCOL_DETAILS(String pROTOCOL_DETAILS) {
		PROTOCOL_DETAILS = pROTOCOL_DETAILS;
	}

	/**
	 * @return the dEFECT_COUNT
	 */
	public String getDEFECT_COUNT() {
		return DEFECT_COUNT;
	}

	/**
	 * @param dEFECT_COUNT the dEFECT_COUNT to set
	 */
	public void setDEFECT_COUNT(String dEFECT_COUNT) {
		DEFECT_COUNT = dEFECT_COUNT;
	}

	/**
	 * @return the cASE_TOPOLOGY
	 */
	public String getCASE_TOPOLOGY() {
		return CASE_TOPOLOGY;
	}

	/**
	 * @param cASE_TOPOLOGY the cASE_TOPOLOGY to set
	 */
	public void setCASE_TOPOLOGY(String cASE_TOPOLOGY) {
		CASE_TOPOLOGY = cASE_TOPOLOGY;
	}

	/**
	 * @return the sLA_ATTAINMENT
	 */
	public String getSLA_ATTAINMENT() {
		return SLA_ATTAINMENT;
	}

	/**
	 * @param sLA_ATTAINMENT the sLA_ATTAINMENT to set
	 */
	public void setSLA_ATTAINMENT(String sLA_ATTAINMENT) {
		SLA_ATTAINMENT = sLA_ATTAINMENT;
	}

	/**
	 * @return the cONTACT_PERSONA
	 */
	public String getCONTACT_PERSONA() {
		return CONTACT_PERSONA;
	}

	/**
	 * @param cONTACT_PERSONA the cONTACT_PERSONA to set
	 */
	public void setCONTACT_PERSONA(String cONTACT_PERSONA) {
		CONTACT_PERSONA = cONTACT_PERSONA;
	}

	/**
	 * @return the cONTAINER_TYPE
	 */
	public String getCONTAINER_TYPE() {
		return CONTAINER_TYPE;
	}

	/**
	 * @param cONTAINER_TYPE the cONTAINER_TYPE to set
	 */
	public void setCONTAINER_TYPE(String cONTAINER_TYPE) {
		CONTAINER_TYPE = cONTAINER_TYPE;
	}

	/**
	 * @return the hIGHEST_ELIGIBLE_SEVERITY
	 */
	public String getHIGHEST_ELIGIBLE_SEVERITY() {
		return HIGHEST_ELIGIBLE_SEVERITY;
	}

	/**
	 * @param hIGHEST_ELIGIBLE_SEVERITY the hIGHEST_ELIGIBLE_SEVERITY to set
	 */
	public void setHIGHEST_ELIGIBLE_SEVERITY(String hIGHEST_ELIGIBLE_SEVERITY) {
		HIGHEST_ELIGIBLE_SEVERITY = hIGHEST_ELIGIBLE_SEVERITY;
	}

	/**
	 * @return the pARENT_CONTAINER_NAME
	 */
	public String getPARENT_CONTAINER_NAME() {
		return PARENT_CONTAINER_NAME;
	}

	/**
	 * @param pARENT_CONTAINER_NAME the pARENT_CONTAINER_NAME to set
	 */
	public void setPARENT_CONTAINER_NAME(String pARENT_CONTAINER_NAME) {
		PARENT_CONTAINER_NAME = pARENT_CONTAINER_NAME;
	}

	/**
	 * @return the sERVICE_TIER
	 */
	public String getSERVICE_TIER() {
		return SERVICE_TIER;
	}

	/**
	 * @param sERVICE_TIER the sERVICE_TIER to set
	 */
	public void setSERVICE_TIER(String sERVICE_TIER) {
		SERVICE_TIER = sERVICE_TIER;
	}

	/**
	 * @return the tAC_SUPPORT_COVERAGE
	 */
	public String getTAC_SUPPORT_COVERAGE() {
		return TAC_SUPPORT_COVERAGE;
	}

	/**
	 * @param tAC_SUPPORT_COVERAGE the tAC_SUPPORT_COVERAGE to set
	 */
	public void setTAC_SUPPORT_COVERAGE(String tAC_SUPPORT_COVERAGE) {
		TAC_SUPPORT_COVERAGE = tAC_SUPPORT_COVERAGE;
	}

	/**
	 * @return the cREATED_DATE
	 */
	public Timestamp getCREATED_DATE() {
		return CREATED_DATE;
	}

	/**
	 * @param cREATED_DATE the cREATED_DATE to set
	 */
	public void setCREATED_DATE(Timestamp cREATED_DATE) {
		CREATED_DATE = cREATED_DATE;
	}

	/**
	 * @return the cREATED_BY
	 */
	public String getCREATED_BY() {
		return CREATED_BY;
	}

	/**
	 * @param cREATED_BY the cREATED_BY to set
	 */
	public void setCREATED_BY(String cREATED_BY) {
		CREATED_BY = cREATED_BY;
	}

	/**
	 * @return the lAST_MODIFIED_DATE
	 */
	public Timestamp getLAST_MODIFIED_DATE() {
		return LAST_MODIFIED_DATE;
	}

	/**
	 * @param lAST_MODIFIED_DATE the lAST_MODIFIED_DATE to set
	 */
	public void setLAST_MODIFIED_DATE(Timestamp lAST_MODIFIED_DATE) {
		LAST_MODIFIED_DATE = lAST_MODIFIED_DATE;
	}

	/**
	 * @return the lAST_MODIFIED_BY
	 */
	public String getLAST_MODIFIED_BY() {
		return LAST_MODIFIED_BY;
	}

	/**
	 * @param lAST_MODIFIED_BY the lAST_MODIFIED_BY to set
	 */
	public void setLAST_MODIFIED_BY(String lAST_MODIFIED_BY) {
		LAST_MODIFIED_BY = lAST_MODIFIED_BY;
	}

	/**
	 * @return the c3_CREATION_DATE
	 */
	public Timestamp getC3_CREATION_DATE() {
		return C3_CREATION_DATE;
	}

	/**
	 * @param c3_CREATION_DATE the c3_CREATION_DATE to set
	 */
	public void setC3_CREATION_DATE(Timestamp c3_CREATION_DATE) {
		C3_CREATION_DATE = c3_CREATION_DATE;
	}

	/**
	 * @return the c3_CREATED_BY
	 */
	public String getC3_CREATED_BY() {
		return C3_CREATED_BY;
	}

	/**
	 * @param c3_CREATED_BY the c3_CREATED_BY to set
	 */
	public void setC3_CREATED_BY(String c3_CREATED_BY) {
		C3_CREATED_BY = c3_CREATED_BY;
	}

	/**
	 * @return the c3_LAST_MODIFIED_DATE
	 */
	public Timestamp getC3_LAST_MODIFIED_DATE() {
		return C3_LAST_MODIFIED_DATE;
	}

	/**
	 * @param c3_LAST_MODIFIED_DATE the c3_LAST_MODIFIED_DATE to set
	 */
	public void setC3_LAST_MODIFIED_DATE(Timestamp c3_LAST_MODIFIED_DATE) {
		C3_LAST_MODIFIED_DATE = c3_LAST_MODIFIED_DATE;
	}

	/**
	 * @return the c3_LAST_MODIFIED_BY
	 */
	public String getC3_LAST_MODIFIED_BY() {
		return C3_LAST_MODIFIED_BY;
	}

	/**
	 * @param c3_LAST_MODIFIED_BY the c3_LAST_MODIFIED_BY to set
	 */
	public void setC3_LAST_MODIFIED_BY(String c3_LAST_MODIFIED_BY) {
		C3_LAST_MODIFIED_BY = c3_LAST_MODIFIED_BY;
	}

	/**
	 * @return the cREATED_BY_C3
	 */
	public String getCREATED_BY_C3() {
		return CREATED_BY_C3;
	}

	/**
	 * @param cREATED_BY_C3 the cREATED_BY_C3 to set
	 */
	public void setCREATED_BY_C3(String cREATED_BY_C3) {
		CREATED_BY_C3 = cREATED_BY_C3;
	}

	/**
	 * @return the mODIFIED_BY_C3
	 */
	public String getMODIFIED_BY_C3() {
		return MODIFIED_BY_C3;
	}

	/**
	 * @param mODIFIED_BY_C3 the mODIFIED_BY_C3 to set
	 */
	public void setMODIFIED_BY_C3(String mODIFIED_BY_C3) {
		MODIFIED_BY_C3 = mODIFIED_BY_C3;
	}

	/**
	 * @return the cURRENT_CONTACT_PHONE
	 */
	public String getCURRENT_CONTACT_PHONE() {
		return CURRENT_CONTACT_PHONE;
	}

	/**
	 * @param cURRENT_CONTACT_PHONE the cURRENT_CONTACT_PHONE to set
	 */
	public void setCURRENT_CONTACT_PHONE(String cURRENT_CONTACT_PHONE) {
		CURRENT_CONTACT_PHONE = cURRENT_CONTACT_PHONE;
	}

	/**
	 * @return the cURRENT_CONTACT_EMAIL
	 */
	public String getCURRENT_CONTACT_EMAIL() {
		return CURRENT_CONTACT_EMAIL;
	}

	/**
	 * @param cURRENT_CONTACT_EMAIL the cURRENT_CONTACT_EMAIL to set
	 */
	public void setCURRENT_CONTACT_EMAIL(String cURRENT_CONTACT_EMAIL) {
		CURRENT_CONTACT_EMAIL = cURRENT_CONTACT_EMAIL;
	}

	/**
	 * @return the cURRENT_CONTACT_EXTENSION
	 */
	public String getCURRENT_CONTACT_EXTENSION() {
		return CURRENT_CONTACT_EXTENSION;
	}

	/**
	 * @param cURRENT_CONTACT_EXTENSION the cURRENT_CONTACT_EXTENSION to set
	 */
	public void setCURRENT_CONTACT_EXTENSION(String cURRENT_CONTACT_EXTENSION) {
		CURRENT_CONTACT_EXTENSION = cURRENT_CONTACT_EXTENSION;
	}

	/**
	 * @return the cURRENT_CONTACT_NAME
	 */
	public String getCURRENT_CONTACT_NAME() {
		return CURRENT_CONTACT_NAME;
	}

	/**
	 * @param cURRENT_CONTACT_NAME the cURRENT_CONTACT_NAME to set
	 */
	public void setCURRENT_CONTACT_NAME(String cURRENT_CONTACT_NAME) {
		CURRENT_CONTACT_NAME = cURRENT_CONTACT_NAME;
	}

	/**
	 * @return the masterDetails
	 */
	public MasterDetails getMasterDetails() {
		return masterDetails;
	}

	/**
	 * @param masterDetails the masterDetails to set
	 */
	public void setMasterDetails(MasterDetails masterDetails) {
		this.masterDetails = masterDetails;
	}
	
	
}
