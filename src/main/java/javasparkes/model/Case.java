/**
 * 
 */
package javasparkes.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//import scala.Serializable;

/**
 * @author swmohara
 *
 */
@Entity
@Table(name="XXCTS_CM_CASE")
@Data
public class Case implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6998768954078664131L;

	/**
	 * 
	 */
	//private static final long serialVersionUID = 7873026663434278677L;
	@Id
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
	private Timestamp CASE_CLOSED_DATE                     ;
	
	private Timestamp CASE_CREATED_DATE                    ;                
	private String CASE_DESCRIPTION                        ;                
	private String CASE_COMMENTS                           ;      
	private String CASE_PRIORITY                           ;       
	private String CASE_STATUS                             ;       
	private String CASE_TYPE                               ;       
	private BigDecimal CASE_OWNER_CHANGES                  ;              
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
	
	private BigDecimal BILL_TO_SITE_C3_ID                  ;              
	private String BILL_TO_SITE_USE_ID                     ;       
	private Timestamp CALL_END_TIME                        ;                
	private String CALL_PHONE_NUMBER                       ;        
	private Timestamp CALL_START_TIME                      ;                
	private Timestamp CASE_ACCEPTED_DATE                   ;                
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
	private Timestamp CASE_IMPACT_INCIDENT_TIME            ;                
	private String C3_PRODUCT_ID                           ;       
	private String CIN_CR_LED_PRODUCT_TYPE                 ;       
	private String CIN_CR_SSB_PRODUCT_TYPE                 ;       
	private Timestamp PURCHASE_DATE                        ;                
	
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
	private Timestamp SCHEDULED_DISPATCH_TIME              ;                
	private String SCRUBBED_CUSTOMER_SYMPTOM               ;                
	
	private String SCRUBBED_RESOLUTION_CODE                ;       
	private String SCRUBBED_RESOLUTION_SUMMARY             ;                
	private String SCRUBBED_UNDERLYING_CAUSE               ;       
	private String SCRUBBED_UNDERLYING_CAUSE_CAT           ;       
	private String SEND_EMAIL_NOTIF_TO_CONTACT             ;       
	private String SERVICE_LINE_NAME                       ;       
	private String EXTENDED_LOSS_OF_SERVICE                ;       
	private String SHIP_TO_PARTY_ID                        ;       
	private BigDecimal C3_SHIP_TO_SITE_ID                  ;              
	
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
	
	/*//==========Meta Data===================
	
	private String value;
	private String key;
	private String partition;
	private String offset;
	private String timestampType;
	private String topic;
	private String timestamp;
	
	//======================================
*/	
	public String getCASE_ID() {
		return CASE_ID;
	}
	public void setCASE_ID(String cASE_ID) {
		CASE_ID = cASE_ID;
	}
	public String getCASE_NUMBER() {
		return CASE_NUMBER;
	}
	public void setCASE_NUMBER(String cASE_NUMBER) {
		CASE_NUMBER = cASE_NUMBER;
	}
	public String getCS1_CASE_NUMBER() {
		return CS1_CASE_NUMBER;
	}
	public void setCS1_CASE_NUMBER(String cS1_CASE_NUMBER) {
		CS1_CASE_NUMBER = cS1_CASE_NUMBER;
	}
	public String getCONTRACT_NUMBER() {
		return CONTRACT_NUMBER;
	}
	public void setCONTRACT_NUMBER(String cONTRACT_NUMBER) {
		CONTRACT_NUMBER = cONTRACT_NUMBER;
	}
	public String getCONTACT_CCO_ID() {
		return CONTACT_CCO_ID;
	}
	public void setCONTACT_CCO_ID(String cONTACT_CCO_ID) {
		CONTACT_CCO_ID = cONTACT_CCO_ID;
	}
	public String getTECH_ID() {
		return TECH_ID;
	}
	public void setTECH_ID(String tECH_ID) {
		TECH_ID = tECH_ID;
	}
	public String getSUB_TECH_ID() {
		return SUB_TECH_ID;
	}
	public void setSUB_TECH_ID(String sUB_TECH_ID) {
		SUB_TECH_ID = sUB_TECH_ID;
	}
	public String getPROBLEM_CODE_ID() {
		return PROBLEM_CODE_ID;
	}
	public void setPROBLEM_CODE_ID(String pROBLEM_CODE_ID) {
		PROBLEM_CODE_ID = pROBLEM_CODE_ID;
	}
	public String getC3_SW_VERSION_ID() {
		return C3_SW_VERSION_ID;
	}
	public void setC3_SW_VERSION_ID(String c3_SW_VERSION_ID) {
		C3_SW_VERSION_ID = c3_SW_VERSION_ID;
	}
	public String getC3_HW_VERSION_ID() {
		return C3_HW_VERSION_ID;
	}
	public void setC3_HW_VERSION_ID(String c3_HW_VERSION_ID) {
		C3_HW_VERSION_ID = c3_HW_VERSION_ID;
	}
	public String getSHIP_TO_SITE_USE_ID() {
		return SHIP_TO_SITE_USE_ID;
	}
	public void setSHIP_TO_SITE_USE_ID(String sHIP_TO_SITE_USE_ID) {
		SHIP_TO_SITE_USE_ID = sHIP_TO_SITE_USE_ID;
	}
	public String getCUSTOMER_PROVIDED_SER_NUMBER() {
		return CUSTOMER_PROVIDED_SER_NUMBER;
	}
	public void setCUSTOMER_PROVIDED_SER_NUMBER(String cUSTOMER_PROVIDED_SER_NUMBER) {
		CUSTOMER_PROVIDED_SER_NUMBER = cUSTOMER_PROVIDED_SER_NUMBER;
	}
	public String getCASE_SUMMARY() {
		return CASE_SUMMARY;
	}
	public void setCASE_SUMMARY(String cASE_SUMMARY) {
		CASE_SUMMARY = cASE_SUMMARY;
	}
	public String getCASE_SUBJECT() {
		return CASE_SUBJECT;
	}
	public void setCASE_SUBJECT(String cASE_SUBJECT) {
		CASE_SUBJECT = cASE_SUBJECT;
	}
	public String getCASE_ORIGIN() {
		return CASE_ORIGIN;
	}
	public void setCASE_ORIGIN(String cASE_ORIGIN) {
		CASE_ORIGIN = cASE_ORIGIN;
	}
	public String getCASE_OWNER() {
		return CASE_OWNER;
	}
	public void setCASE_OWNER(String cASE_OWNER) {
		CASE_OWNER = cASE_OWNER;
	}
	public String getCS1_REASON() {
		return CS1_REASON;
	}
	public void setCS1_REASON(String cS1_REASON) {
		CS1_REASON = cS1_REASON;
	}
	public Timestamp getCASE_CLOSED_DATE() {
		return CASE_CLOSED_DATE;
	}
	public void setCASE_CLOSED_DATE(Timestamp cASE_CLOSED_DATE) {
		CASE_CLOSED_DATE = cASE_CLOSED_DATE;
	}
	public Timestamp getCASE_CREATED_DATE() {
		return CASE_CREATED_DATE;
	}
	public void setCASE_CREATED_DATE(Timestamp cASE_CREATED_DATE) {
		CASE_CREATED_DATE = cASE_CREATED_DATE;
	}
	public String getCASE_DESCRIPTION() {
		return CASE_DESCRIPTION;
	}
	public void setCASE_DESCRIPTION(String cASE_DESCRIPTION) {
		CASE_DESCRIPTION = cASE_DESCRIPTION;
	}
	public String getCASE_COMMENTS() {
		return CASE_COMMENTS;
	}
	public void setCASE_COMMENTS(String cASE_COMMENTS) {
		CASE_COMMENTS = cASE_COMMENTS;
	}
	public String getCASE_PRIORITY() {
		return CASE_PRIORITY;
	}
	public void setCASE_PRIORITY(String cASE_PRIORITY) {
		CASE_PRIORITY = cASE_PRIORITY;
	}
	public String getCASE_STATUS() {
		return CASE_STATUS;
	}
	public void setCASE_STATUS(String cASE_STATUS) {
		CASE_STATUS = cASE_STATUS;
	}
	public String getCASE_TYPE() {
		return CASE_TYPE;
	}
	public void setCASE_TYPE(String cASE_TYPE) {
		CASE_TYPE = cASE_TYPE;
	}
	public BigDecimal getCASE_OWNER_CHANGES() {
		return CASE_OWNER_CHANGES;
	}
	public void setCASE_OWNER_CHANGES(BigDecimal cASE_OWNER_CHANGES) {
		CASE_OWNER_CHANGES = cASE_OWNER_CHANGES;
	}
	public String getIS_ACCEPTED() {
		return IS_ACCEPTED;
	}
	public void setIS_ACCEPTED(String iS_ACCEPTED) {
		IS_ACCEPTED = iS_ACCEPTED;
	}
	public String getACTION_CLASS() {
		return ACTION_CLASS;
	}
	public void setACTION_CLASS(String aCTION_CLASS) {
		ACTION_CLASS = aCTION_CLASS;
	}
	public String getADDITIONAL_EMAIL_CC() {
		return ADDITIONAL_EMAIL_CC;
	}
	public void setADDITIONAL_EMAIL_CC(String aDDITIONAL_EMAIL_CC) {
		ADDITIONAL_EMAIL_CC = aDDITIONAL_EMAIL_CC;
	}
	public String getALTERNATE_CONTACT_NAME() {
		return ALTERNATE_CONTACT_NAME;
	}
	public void setALTERNATE_CONTACT_NAME(String aLTERNATE_CONTACT_NAME) {
		ALTERNATE_CONTACT_NAME = aLTERNATE_CONTACT_NAME;
	}
	public String getALTERNATE_EMAIL_ADDRESS() {
		return ALTERNATE_EMAIL_ADDRESS;
	}
	public void setALTERNATE_EMAIL_ADDRESS(String aLTERNATE_EMAIL_ADDRESS) {
		ALTERNATE_EMAIL_ADDRESS = aLTERNATE_EMAIL_ADDRESS;
	}
	public String getALTERNATE_PHONE() {
		return ALTERNATE_PHONE;
	}
	public void setALTERNATE_PHONE(String aLTERNATE_PHONE) {
		ALTERNATE_PHONE = aLTERNATE_PHONE;
	}
	public String getB2B_URGENCY() {
		return B2B_URGENCY;
	}
	public void setB2B_URGENCY(String b2b_URGENCY) {
		B2B_URGENCY = b2b_URGENCY;
	}
	public String getB2B_ESCALATED_TIME() {
		return B2B_ESCALATED_TIME;
	}
	public void setB2B_ESCALATED_TIME(String b2b_ESCALATED_TIME) {
		B2B_ESCALATED_TIME = b2b_ESCALATED_TIME;
	}
	public String getB2B_FLAG() {
		return B2B_FLAG;
	}
	public void setB2B_FLAG(String b2b_FLAG) {
		B2B_FLAG = b2b_FLAG;
	}
	public String getB2B_STATUS() {
		return B2B_STATUS;
	}
	public void setB2B_STATUS(String b2b_STATUS) {
		B2B_STATUS = b2b_STATUS;
	}
	public String getBILL_TO_PARTY_ID() {
		return BILL_TO_PARTY_ID;
	}
	public void setBILL_TO_PARTY_ID(String bILL_TO_PARTY_ID) {
		BILL_TO_PARTY_ID = bILL_TO_PARTY_ID;
	}
	public BigDecimal getBILL_TO_SITE_C3_ID() {
		return BILL_TO_SITE_C3_ID;
	}
	public void setBILL_TO_SITE_C3_ID(BigDecimal bILL_TO_SITE_C3_ID) {
		BILL_TO_SITE_C3_ID = bILL_TO_SITE_C3_ID;
	}
	public String getBILL_TO_SITE_USE_ID() {
		return BILL_TO_SITE_USE_ID;
	}
	public void setBILL_TO_SITE_USE_ID(String bILL_TO_SITE_USE_ID) {
		BILL_TO_SITE_USE_ID = bILL_TO_SITE_USE_ID;
	}
	public Timestamp getCALL_END_TIME() {
		return CALL_END_TIME;
	}
	public void setCALL_END_TIME(Timestamp cALL_END_TIME) {
		CALL_END_TIME = cALL_END_TIME;
	}
	public String getCALL_PHONE_NUMBER() {
		return CALL_PHONE_NUMBER;
	}
	public void setCALL_PHONE_NUMBER(String cALL_PHONE_NUMBER) {
		CALL_PHONE_NUMBER = cALL_PHONE_NUMBER;
	}
	public Timestamp getCALL_START_TIME() {
		return CALL_START_TIME;
	}
	public void setCALL_START_TIME(Timestamp cALL_START_TIME) {
		CALL_START_TIME = cALL_START_TIME;
	}
	public Timestamp getCASE_ACCEPTED_DATE() {
		return CASE_ACCEPTED_DATE;
	}
	public void setCASE_ACCEPTED_DATE(Timestamp cASE_ACCEPTED_DATE) {
		CASE_ACCEPTED_DATE = cASE_ACCEPTED_DATE;
	}
	public String getCASE_IMPACT_CATEGORY() {
		return CASE_IMPACT_CATEGORY;
	}
	public void setCASE_IMPACT_CATEGORY(String cASE_IMPACT_CATEGORY) {
		CASE_IMPACT_CATEGORY = cASE_IMPACT_CATEGORY;
	}
	public String getCASE_IMPACT_STATUS() {
		return CASE_IMPACT_STATUS;
	}
	public void setCASE_IMPACT_STATUS(String cASE_IMPACT_STATUS) {
		CASE_IMPACT_STATUS = cASE_IMPACT_STATUS;
	}
	public String getCASE_IMPACT_USER_COUNT() {
		return CASE_IMPACT_USER_COUNT;
	}
	public void setCASE_IMPACT_USER_COUNT(String cASE_IMPACT_USER_COUNT) {
		CASE_IMPACT_USER_COUNT = cASE_IMPACT_USER_COUNT;
	}
	public String getCASE_NOTIFICATION_SETTINGS() {
		return CASE_NOTIFICATION_SETTINGS;
	}
	public void setCASE_NOTIFICATION_SETTINGS(String cASE_NOTIFICATION_SETTINGS) {
		CASE_NOTIFICATION_SETTINGS = cASE_NOTIFICATION_SETTINGS;
	}
	public String getCASE_OWNER_EMAIL_ID() {
		return CASE_OWNER_EMAIL_ID;
	}
	public void setCASE_OWNER_EMAIL_ID(String cASE_OWNER_EMAIL_ID) {
		CASE_OWNER_EMAIL_ID = cASE_OWNER_EMAIL_ID;
	}
	public String getCASE_OWNER_ROLE() {
		return CASE_OWNER_ROLE;
	}
	public void setCASE_OWNER_ROLE(String cASE_OWNER_ROLE) {
		CASE_OWNER_ROLE = cASE_OWNER_ROLE;
	}
	public String getCASE_REASON() {
		return CASE_REASON;
	}
	public void setCASE_REASON(String cASE_REASON) {
		CASE_REASON = cASE_REASON;
	}
	public String getCISCO_ACCOUNT_ID() {
		return CISCO_ACCOUNT_ID;
	}
	public void setCISCO_ACCOUNT_ID(String cISCO_ACCOUNT_ID) {
		CISCO_ACCOUNT_ID = cISCO_ACCOUNT_ID;
	}
	public String getCOMMUNICATION_PREFERENCE() {
		return COMMUNICATION_PREFERENCE;
	}
	public void setCOMMUNICATION_PREFERENCE(String cOMMUNICATION_PREFERENCE) {
		COMMUNICATION_PREFERENCE = cOMMUNICATION_PREFERENCE;
	}
	public String getCASE_COMPLEXITY() {
		return CASE_COMPLEXITY;
	}
	public void setCASE_COMPLEXITY(String cASE_COMPLEXITY) {
		CASE_COMPLEXITY = cASE_COMPLEXITY;
	}
	public String getCONTACT_ME() {
		return CONTACT_ME;
	}
	public void setCONTACT_ME(String cONTACT_ME) {
		CONTACT_ME = cONTACT_ME;
	}
	public Timestamp getCONTACT_ME_DATE() {
		return CONTACT_ME_DATE;
	}
	public void setCONTACT_ME_DATE(Timestamp cONTACT_ME_DATE) {
		CONTACT_ME_DATE = cONTACT_ME_DATE;
	}
	public Timestamp getCONTACT_ME_FROM_TIME() {
		return CONTACT_ME_FROM_TIME;
	}
	public void setCONTACT_ME_FROM_TIME(Timestamp cONTACT_ME_FROM_TIME) {
		CONTACT_ME_FROM_TIME = cONTACT_ME_FROM_TIME;
	}
	public String getCONTACT_ME_TIME() {
		return CONTACT_ME_TIME;
	}
	public void setCONTACT_ME_TIME(String cONTACT_ME_TIME) {
		CONTACT_ME_TIME = cONTACT_ME_TIME;
	}
	public String getCONTACT_ME_TIME_ZONE() {
		return CONTACT_ME_TIME_ZONE;
	}
	public void setCONTACT_ME_TIME_ZONE(String cONTACT_ME_TIME_ZONE) {
		CONTACT_ME_TIME_ZONE = cONTACT_ME_TIME_ZONE;
	}
	public Timestamp getCONTACT_ME_TO_TIME() {
		return CONTACT_ME_TO_TIME;
	}
	public void setCONTACT_ME_TO_TIME(Timestamp cONTACT_ME_TO_TIME) {
		CONTACT_ME_TO_TIME = cONTACT_ME_TO_TIME;
	}
	public String getCONTACT_SECONDARY_EMAIL() {
		return CONTACT_SECONDARY_EMAIL;
	}
	public void setCONTACT_SECONDARY_EMAIL(String cONTACT_SECONDARY_EMAIL) {
		CONTACT_SECONDARY_EMAIL = cONTACT_SECONDARY_EMAIL;
	}
	public String getCONTACT_TYPE() {
		return CONTACT_TYPE;
	}
	public void setCONTACT_TYPE(String cONTACT_TYPE) {
		CONTACT_TYPE = cONTACT_TYPE;
	}
	public String getCONTRACT_STATUS() {
		return CONTRACT_STATUS;
	}
	public void setCONTRACT_STATUS(String cONTRACT_STATUS) {
		CONTRACT_STATUS = cONTRACT_STATUS;
	}
	public String getCOUNTRY_INCIDENT() {
		return COUNTRY_INCIDENT;
	}
	public void setCOUNTRY_INCIDENT(String cOUNTRY_INCIDENT) {
		COUNTRY_INCIDENT = cOUNTRY_INCIDENT;
	}
	public String getACTION_PLAN() {
		return ACTION_PLAN;
	}
	public void setACTION_PLAN(String aCTION_PLAN) {
		ACTION_PLAN = aCTION_PLAN;
	}
	public String getC3_CUSTOMER_ID() {
		return C3_CUSTOMER_ID;
	}
	public void setC3_CUSTOMER_ID(String c3_CUSTOMER_ID) {
		C3_CUSTOMER_ID = c3_CUSTOMER_ID;
	}
	public String getCUSTOMER_CATEGORY() {
		return CUSTOMER_CATEGORY;
	}
	public void setCUSTOMER_CATEGORY(String cUSTOMER_CATEGORY) {
		CUSTOMER_CATEGORY = cUSTOMER_CATEGORY;
	}
	public String getCUSTOMER_ACTIVITY() {
		return CUSTOMER_ACTIVITY;
	}
	public void setCUSTOMER_ACTIVITY(String cUSTOMER_ACTIVITY) {
		CUSTOMER_ACTIVITY = cUSTOMER_ACTIVITY;
	}
	public String getCUSTOMER_COM_BUIS_IMPACT() {
		return CUSTOMER_COM_BUIS_IMPACT;
	}
	public void setCUSTOMER_COM_BUIS_IMPACT(String cUSTOMER_COM_BUIS_IMPACT) {
		CUSTOMER_COM_BUIS_IMPACT = cUSTOMER_COM_BUIS_IMPACT;
	}
	public String getCUSTOMER_COMPANY_NAME() {
		return CUSTOMER_COMPANY_NAME;
	}
	public void setCUSTOMER_COMPANY_NAME(String cUSTOMER_COMPANY_NAME) {
		CUSTOMER_COMPANY_NAME = cUSTOMER_COMPANY_NAME;
	}
	public String getCUST_CONFIRM_PRIORITY_CHANGE() {
		return CUST_CONFIRM_PRIORITY_CHANGE;
	}
	public void setCUST_CONFIRM_PRIORITY_CHANGE(String cUST_CONFIRM_PRIORITY_CHANGE) {
		CUST_CONFIRM_PRIORITY_CHANGE = cUST_CONFIRM_PRIORITY_CHANGE;
	}
	public String getCUSTOMER_CSAT() {
		return CUSTOMER_CSAT;
	}
	public void setCUSTOMER_CSAT(String cUSTOMER_CSAT) {
		CUSTOMER_CSAT = cUSTOMER_CSAT;
	}
	public String getCUSTOMER_SYMPTOM() {
		return CUSTOMER_SYMPTOM;
	}
	public void setCUSTOMER_SYMPTOM(String cUSTOMER_SYMPTOM) {
		CUSTOMER_SYMPTOM = cUSTOMER_SYMPTOM;
	}
	public Timestamp getDATE_TIME_SURVEY_SENT() {
		return DATE_TIME_SURVEY_SENT;
	}
	public void setDATE_TIME_SURVEY_SENT(Timestamp dATE_TIME_SURVEY_SENT) {
		DATE_TIME_SURVEY_SENT = dATE_TIME_SURVEY_SENT;
	}
	public String getDESCRIBE_TROUBLESHOOTING_DONE() {
		return DESCRIBE_TROUBLESHOOTING_DONE;
	}
	public void setDESCRIBE_TROUBLESHOOTING_DONE(String dESCRIBE_TROUBLESHOOTING_DONE) {
		DESCRIBE_TROUBLESHOOTING_DONE = dESCRIBE_TROUBLESHOOTING_DONE;
	}
	public String getDESCRIBE_RECENT_ENV_CHANGES() {
		return DESCRIBE_RECENT_ENV_CHANGES;
	}
	public void setDESCRIBE_RECENT_ENV_CHANGES(String dESCRIBE_RECENT_ENV_CHANGES) {
		DESCRIBE_RECENT_ENV_CHANGES = dESCRIBE_RECENT_ENV_CHANGES;
	}
	public String getCSC_DISCUSSION_THREAD_ID() {
		return CSC_DISCUSSION_THREAD_ID;
	}
	public void setCSC_DISCUSSION_THREAD_ID(String cSC_DISCUSSION_THREAD_ID) {
		CSC_DISCUSSION_THREAD_ID = cSC_DISCUSSION_THREAD_ID;
	}
	public String getDRAFT_CASE_NUMBER() {
		return DRAFT_CASE_NUMBER;
	}
	public void setDRAFT_CASE_NUMBER(String dRAFT_CASE_NUMBER) {
		DRAFT_CASE_NUMBER = dRAFT_CASE_NUMBER;
	}
	public String getDSD_STATUS() {
		return DSD_STATUS;
	}
	public void setDSD_STATUS(String dSD_STATUS) {
		DSD_STATUS = dSD_STATUS;
	}
	public String getEF_PRODUCT_NAME() {
		return EF_PRODUCT_NAME;
	}
	public void setEF_PRODUCT_NAME(String eF_PRODUCT_NAME) {
		EF_PRODUCT_NAME = eF_PRODUCT_NAME;
	}
	public String getEF_UNREACHABLE() {
		return EF_UNREACHABLE;
	}
	public void setEF_UNREACHABLE(String eF_UNREACHABLE) {
		EF_UNREACHABLE = eF_UNREACHABLE;
	}
	public String getCS1_END_CLIENT_INFORMATION() {
		return CS1_END_CLIENT_INFORMATION;
	}
	public void setCS1_END_CLIENT_INFORMATION(String cS1_END_CLIENT_INFORMATION) {
		CS1_END_CLIENT_INFORMATION = cS1_END_CLIENT_INFORMATION;
	}
	public String getEND_CUSTOMER_CASE_CREATE_DATE() {
		return END_CUSTOMER_CASE_CREATE_DATE;
	}
	public void setEND_CUSTOMER_CASE_CREATE_DATE(String eND_CUSTOMER_CASE_CREATE_DATE) {
		END_CUSTOMER_CASE_CREATE_DATE = eND_CUSTOMER_CASE_CREATE_DATE;
	}
	public String getEND_CUSTOMER_EMAIL() {
		return END_CUSTOMER_EMAIL;
	}
	public void setEND_CUSTOMER_EMAIL(String eND_CUSTOMER_EMAIL) {
		END_CUSTOMER_EMAIL = eND_CUSTOMER_EMAIL;
	}
	public String getENGINEER_SLA_STATUS_NOTE() {
		return ENGINEER_SLA_STATUS_NOTE;
	}
	public void setENGINEER_SLA_STATUS_NOTE(String eNGINEER_SLA_STATUS_NOTE) {
		ENGINEER_SLA_STATUS_NOTE = eNGINEER_SLA_STATUS_NOTE;
	}
	public String getENTITLEMENT_STATUS() {
		return ENTITLEMENT_STATUS;
	}
	public void setENTITLEMENT_STATUS(String eNTITLEMENT_STATUS) {
		ENTITLEMENT_STATUS = eNTITLEMENT_STATUS;
	}
	public String getENTITLEMENT_AUDIT_ID() {
		return ENTITLEMENT_AUDIT_ID;
	}
	public void setENTITLEMENT_AUDIT_ID(String eNTITLEMENT_AUDIT_ID) {
		ENTITLEMENT_AUDIT_ID = eNTITLEMENT_AUDIT_ID;
	}
	public String getENTITLEMENT_REASON() {
		return ENTITLEMENT_REASON;
	}
	public void setENTITLEMENT_REASON(String eNTITLEMENT_REASON) {
		ENTITLEMENT_REASON = eNTITLEMENT_REASON;
	}
	public String getENTITLEMENT_STATUS_CODE() {
		return ENTITLEMENT_STATUS_CODE;
	}
	public void setENTITLEMENT_STATUS_CODE(String eNTITLEMENT_STATUS_CODE) {
		ENTITLEMENT_STATUS_CODE = eNTITLEMENT_STATUS_CODE;
	}
	public String getCUSTOMER_EPAGE() {
		return CUSTOMER_EPAGE;
	}
	public void setCUSTOMER_EPAGE(String cUSTOMER_EPAGE) {
		CUSTOMER_EPAGE = cUSTOMER_EPAGE;
	}
	public String getESCALATION_FLAG() {
		return ESCALATION_FLAG;
	}
	public void setESCALATION_FLAG(String eSCALATION_FLAG) {
		ESCALATION_FLAG = eSCALATION_FLAG;
	}
	public String getGR_GENERAL_OF_ACCOUNT() {
		return GR_GENERAL_OF_ACCOUNT;
	}
	public void setGR_GENERAL_OF_ACCOUNT(String gR_GENERAL_OF_ACCOUNT) {
		GR_GENERAL_OF_ACCOUNT = gR_GENERAL_OF_ACCOUNT;
	}
	public Timestamp getGR_LAST_UPDATE_DATE() {
		return GR_LAST_UPDATE_DATE;
	}
	public void setGR_LAST_UPDATE_DATE(Timestamp gR_LAST_UPDATE_DATE) {
		GR_LAST_UPDATE_DATE = gR_LAST_UPDATE_DATE;
	}
	public String getGR_RMA_OF_ACCOUNT() {
		return GR_RMA_OF_ACCOUNT;
	}
	public void setGR_RMA_OF_ACCOUNT(String gR_RMA_OF_ACCOUNT) {
		GR_RMA_OF_ACCOUNT = gR_RMA_OF_ACCOUNT;
	}
	public String getHELPDESK_TRACKING_NUMBER() {
		return HELPDESK_TRACKING_NUMBER;
	}
	public void setHELPDESK_TRACKING_NUMBER(String hELPDESK_TRACKING_NUMBER) {
		HELPDESK_TRACKING_NUMBER = hELPDESK_TRACKING_NUMBER;
	}
	public String getHTOM_EMAIL_ADDRESS() {
		return HTOM_EMAIL_ADDRESS;
	}
	public void setHTOM_EMAIL_ADDRESS(String hTOM_EMAIL_ADDRESS) {
		HTOM_EMAIL_ADDRESS = hTOM_EMAIL_ADDRESS;
	}
	public Timestamp getCIN_INITIAL_ACCEPTNCE_DATE() {
		return CIN_INITIAL_ACCEPTNCE_DATE;
	}
	public void setCIN_INITIAL_ACCEPTNCE_DATE(Timestamp cIN_INITIAL_ACCEPTNCE_DATE) {
		CIN_INITIAL_ACCEPTNCE_DATE = cIN_INITIAL_ACCEPTNCE_DATE;
	}
	public BigDecimal getINITIAL_SOLUTION() {
		return INITIAL_SOLUTION;
	}
	public void setINITIAL_SOLUTION(BigDecimal iNITIAL_SOLUTION) {
		INITIAL_SOLUTION = iNITIAL_SOLUTION;
	}
	public BigDecimal getC3_INSTALL_SITE_ID() {
		return C3_INSTALL_SITE_ID;
	}
	public void setC3_INSTALL_SITE_ID(BigDecimal c3_INSTALL_SITE_ID) {
		C3_INSTALL_SITE_ID = c3_INSTALL_SITE_ID;
	}
	public String getINTERIM_CONTACT_EMAIL() {
		return INTERIM_CONTACT_EMAIL;
	}
	public void setINTERIM_CONTACT_EMAIL(String iNTERIM_CONTACT_EMAIL) {
		INTERIM_CONTACT_EMAIL = iNTERIM_CONTACT_EMAIL;
	}
	public String getISSUE_CATEGORY() {
		return ISSUE_CATEGORY;
	}
	public void setISSUE_CATEGORY(String iSSUE_CATEGORY) {
		ISSUE_CATEGORY = iSSUE_CATEGORY;
	}
	public String getCIN_CR_SSB_ISSUE_REASON() {
		return CIN_CR_SSB_ISSUE_REASON;
	}
	public void setCIN_CR_SSB_ISSUE_REASON(String cIN_CR_SSB_ISSUE_REASON) {
		CIN_CR_SSB_ISSUE_REASON = cIN_CR_SSB_ISSUE_REASON;
	}
	public String getISV_RESPONSE_STATUS() {
		return ISV_RESPONSE_STATUS;
	}
	public void setISV_RESPONSE_STATUS(String iSV_RESPONSE_STATUS) {
		ISV_RESPONSE_STATUS = iSV_RESPONSE_STATUS;
	}
	public String getCASE_LABEL() {
		return CASE_LABEL;
	}
	public void setCASE_LABEL(String cASE_LABEL) {
		CASE_LABEL = cASE_LABEL;
	}
	public String getRPT_LAST_REVIEW_DATE() {
		return RPT_LAST_REVIEW_DATE;
	}
	public void setRPT_LAST_REVIEW_DATE(String rPT_LAST_REVIEW_DATE) {
		RPT_LAST_REVIEW_DATE = rPT_LAST_REVIEW_DATE;
	}
	public String getLATEST_ACTION_PLAN() {
		return LATEST_ACTION_PLAN;
	}
	public void setLATEST_ACTION_PLAN(String lATEST_ACTION_PLAN) {
		LATEST_ACTION_PLAN = lATEST_ACTION_PLAN;
	}
	public String getLATEST_PROBLEM_DESCRIPTION() {
		return LATEST_PROBLEM_DESCRIPTION;
	}
	public void setLATEST_PROBLEM_DESCRIPTION(String lATEST_PROBLEM_DESCRIPTION) {
		LATEST_PROBLEM_DESCRIPTION = lATEST_PROBLEM_DESCRIPTION;
	}
	public String getMANAGER_EMAIL() {
		return MANAGER_EMAIL;
	}
	public void setMANAGER_EMAIL(String mANAGER_EMAIL) {
		MANAGER_EMAIL = mANAGER_EMAIL;
	}
	public String getMANAGER_GROUP_ALIAS() {
		return MANAGER_GROUP_ALIAS;
	}
	public void setMANAGER_GROUP_ALIAS(String mANAGER_GROUP_ALIAS) {
		MANAGER_GROUP_ALIAS = mANAGER_GROUP_ALIAS;
	}
	public String getMOBILE_PHONE() {
		return MOBILE_PHONE;
	}
	public void setMOBILE_PHONE(String mOBILE_PHONE) {
		MOBILE_PHONE = mOBILE_PHONE;
	}
	public String getNMTG_PRODUCT_VERSION() {
		return NMTG_PRODUCT_VERSION;
	}
	public void setNMTG_PRODUCT_VERSION(String nMTG_PRODUCT_VERSION) {
		NMTG_PRODUCT_VERSION = nMTG_PRODUCT_VERSION;
	}
	public String getNODE_NAME() {
		return NODE_NAME;
	}
	public void setNODE_NAME(String nODE_NAME) {
		NODE_NAME = nODE_NAME;
	}
	public String getCOMM_PREFERENCE_LANG() {
		return COMM_PREFERENCE_LANG;
	}
	public void setCOMM_PREFERENCE_LANG(String cOMM_PREFERENCE_LANG) {
		COMM_PREFERENCE_LANG = cOMM_PREFERENCE_LANG;
	}
	public Timestamp getON_HOLD_DUE_DATE() {
		return ON_HOLD_DUE_DATE;
	}
	public void setON_HOLD_DUE_DATE(Timestamp oN_HOLD_DUE_DATE) {
		ON_HOLD_DUE_DATE = oN_HOLD_DUE_DATE;
	}
	public String getORIGINAL_CONTACT_EMAIL() {
		return ORIGINAL_CONTACT_EMAIL;
	}
	public void setORIGINAL_CONTACT_EMAIL(String oRIGINAL_CONTACT_EMAIL) {
		ORIGINAL_CONTACT_EMAIL = oRIGINAL_CONTACT_EMAIL;
	}
	public String getOTHER_INFORMATION() {
		return OTHER_INFORMATION;
	}
	public void setOTHER_INFORMATION(String oTHER_INFORMATION) {
		OTHER_INFORMATION = oTHER_INFORMATION;
	}
	public String getOWNER_ID() {
		return OWNER_ID;
	}
	public void setOWNER_ID(String oWNER_ID) {
		OWNER_ID = oWNER_ID;
	}
	public String getOWNER_QUEUE() {
		return OWNER_QUEUE;
	}
	public void setOWNER_QUEUE(String oWNER_QUEUE) {
		OWNER_QUEUE = oWNER_QUEUE;
	}
	public String getOWNER_USER() {
		return OWNER_USER;
	}
	public void setOWNER_USER(String oWNER_USER) {
		OWNER_USER = oWNER_USER;
	}
	public String getOWNER_PROFILE() {
		return OWNER_PROFILE;
	}
	public void setOWNER_PROFILE(String oWNER_PROFILE) {
		OWNER_PROFILE = oWNER_PROFILE;
	}
	public String getPARTNER_CASE_NUMBER() {
		return PARTNER_CASE_NUMBER;
	}
	public void setPARTNER_CASE_NUMBER(String pARTNER_CASE_NUMBER) {
		PARTNER_CASE_NUMBER = pARTNER_CASE_NUMBER;
	}
	public String getPARTNER_CASE_OWNER_CCO_ID() {
		return PARTNER_CASE_OWNER_CCO_ID;
	}
	public void setPARTNER_CASE_OWNER_CCO_ID(String pARTNER_CASE_OWNER_CCO_ID) {
		PARTNER_CASE_OWNER_CCO_ID = pARTNER_CASE_OWNER_CCO_ID;
	}
	public String getPARTNER_CASE_OWNER_EMAIL() {
		return PARTNER_CASE_OWNER_EMAIL;
	}
	public void setPARTNER_CASE_OWNER_EMAIL(String pARTNER_CASE_OWNER_EMAIL) {
		PARTNER_CASE_OWNER_EMAIL = pARTNER_CASE_OWNER_EMAIL;
	}
	public String getPARTNER_CASE_OWNER_NAME() {
		return PARTNER_CASE_OWNER_NAME;
	}
	public void setPARTNER_CASE_OWNER_NAME(String pARTNER_CASE_OWNER_NAME) {
		PARTNER_CASE_OWNER_NAME = pARTNER_CASE_OWNER_NAME;
	}
	public String getPARTNER_CASE_OWNER_PHONE() {
		return PARTNER_CASE_OWNER_PHONE;
	}
	public void setPARTNER_CASE_OWNER_PHONE(String pARTNER_CASE_OWNER_PHONE) {
		PARTNER_CASE_OWNER_PHONE = pARTNER_CASE_OWNER_PHONE;
	}
	public String getPARTNER_NAME() {
		return PARTNER_NAME;
	}
	public void setPARTNER_NAME(String pARTNER_NAME) {
		PARTNER_NAME = pARTNER_NAME;
	}
	public String getPARTNER_OWNER_GROUP_ID() {
		return PARTNER_OWNER_GROUP_ID;
	}
	public void setPARTNER_OWNER_GROUP_ID(String pARTNER_OWNER_GROUP_ID) {
		PARTNER_OWNER_GROUP_ID = pARTNER_OWNER_GROUP_ID;
	}
	public String getPARTNER_OWNER_GROUP_NAME() {
		return PARTNER_OWNER_GROUP_NAME;
	}
	public void setPARTNER_OWNER_GROUP_NAME(String pARTNER_OWNER_GROUP_NAME) {
		PARTNER_OWNER_GROUP_NAME = pARTNER_OWNER_GROUP_NAME;
	}
	public String getPICA_ID() {
		return PICA_ID;
	}
	public void setPICA_ID(String pICA_ID) {
		PICA_ID = pICA_ID;
	}
	public String getPORTFOLIO_NUMBER() {
		return PORTFOLIO_NUMBER;
	}
	public void setPORTFOLIO_NUMBER(String pORTFOLIO_NUMBER) {
		PORTFOLIO_NUMBER = pORTFOLIO_NUMBER;
	}
	public String getPREVIOUS_QUEUE() {
		return PREVIOUS_QUEUE;
	}
	public void setPREVIOUS_QUEUE(String pREVIOUS_QUEUE) {
		PREVIOUS_QUEUE = pREVIOUS_QUEUE;
	}
	public String getPRIORITY_INDICATION() {
		return PRIORITY_INDICATION;
	}
	public void setPRIORITY_INDICATION(String pRIORITY_INDICATION) {
		PRIORITY_INDICATION = pRIORITY_INDICATION;
	}
	public Timestamp getCASE_IMPACT_INCIDENT_TIME() {
		return CASE_IMPACT_INCIDENT_TIME;
	}
	public void setCASE_IMPACT_INCIDENT_TIME(Timestamp cASE_IMPACT_INCIDENT_TIME) {
		CASE_IMPACT_INCIDENT_TIME = cASE_IMPACT_INCIDENT_TIME;
	}
	public String getC3_PRODUCT_ID() {
		return C3_PRODUCT_ID;
	}
	public void setC3_PRODUCT_ID(String c3_PRODUCT_ID) {
		C3_PRODUCT_ID = c3_PRODUCT_ID;
	}
	public String getCIN_CR_LED_PRODUCT_TYPE() {
		return CIN_CR_LED_PRODUCT_TYPE;
	}
	public void setCIN_CR_LED_PRODUCT_TYPE(String cIN_CR_LED_PRODUCT_TYPE) {
		CIN_CR_LED_PRODUCT_TYPE = cIN_CR_LED_PRODUCT_TYPE;
	}
	public String getCIN_CR_SSB_PRODUCT_TYPE() {
		return CIN_CR_SSB_PRODUCT_TYPE;
	}
	public void setCIN_CR_SSB_PRODUCT_TYPE(String cIN_CR_SSB_PRODUCT_TYPE) {
		CIN_CR_SSB_PRODUCT_TYPE = cIN_CR_SSB_PRODUCT_TYPE;
	}
	public Timestamp getPURCHASE_DATE() {
		return PURCHASE_DATE;
	}
	public void setPURCHASE_DATE(Timestamp pURCHASE_DATE) {
		PURCHASE_DATE = pURCHASE_DATE;
	}
	public String getREASON_CUST_CONSNT_NOT_TAKEN() {
		return REASON_CUST_CONSNT_NOT_TAKEN;
	}
	public void setREASON_CUST_CONSNT_NOT_TAKEN(String rEASON_CUST_CONSNT_NOT_TAKEN) {
		REASON_CUST_CONSNT_NOT_TAKEN = rEASON_CUST_CONSNT_NOT_TAKEN;
	}
	public String getREASON_SURVEY_NOT_SENT() {
		return REASON_SURVEY_NOT_SENT;
	}
	public void setREASON_SURVEY_NOT_SENT(String rEASON_SURVEY_NOT_SENT) {
		REASON_SURVEY_NOT_SENT = rEASON_SURVEY_NOT_SENT;
	}
	public String getREQUEST_CLASS() {
		return REQUEST_CLASS;
	}
	public void setREQUEST_CLASS(String rEQUEST_CLASS) {
		REQUEST_CLASS = rEQUEST_CLASS;
	}
	public String getREQUEST_SUB_CLASS() {
		return REQUEST_SUB_CLASS;
	}
	public void setREQUEST_SUB_CLASS(String rEQUEST_SUB_CLASS) {
		REQUEST_SUB_CLASS = rEQUEST_SUB_CLASS;
	}
	public String getREQUEST_TYPE() {
		return REQUEST_TYPE;
	}
	public void setREQUEST_TYPE(String rEQUEST_TYPE) {
		REQUEST_TYPE = rEQUEST_TYPE;
	}
	public String getREQUEUE_REASON() {
		return REQUEUE_REASON;
	}
	public void setREQUEUE_REASON(String rEQUEUE_REASON) {
		REQUEUE_REASON = rEQUEUE_REASON;
	}
	public String getMISQUEUE_REASON() {
		return MISQUEUE_REASON;
	}
	public void setMISQUEUE_REASON(String mISQUEUE_REASON) {
		MISQUEUE_REASON = mISQUEUE_REASON;
	}
	public String getREQUEUE_REASON_DETAILS() {
		return REQUEUE_REASON_DETAILS;
	}
	public void setREQUEUE_REASON_DETAILS(String rEQUEUE_REASON_DETAILS) {
		REQUEUE_REASON_DETAILS = rEQUEUE_REASON_DETAILS;
	}
	public String getRESOLUTION_CODE() {
		return RESOLUTION_CODE;
	}
	public void setRESOLUTION_CODE(String rESOLUTION_CODE) {
		RESOLUTION_CODE = rESOLUTION_CODE;
	}
	public String getRESOLUTION_SUMMARY() {
		return RESOLUTION_SUMMARY;
	}
	public void setRESOLUTION_SUMMARY(String rESOLUTION_SUMMARY) {
		RESOLUTION_SUMMARY = rESOLUTION_SUMMARY;
	}
	public String getCDS_RESOLUTION_SUMMARY() {
		return CDS_RESOLUTION_SUMMARY;
	}
	public void setCDS_RESOLUTION_SUMMARY(String cDS_RESOLUTION_SUMMARY) {
		CDS_RESOLUTION_SUMMARY = cDS_RESOLUTION_SUMMARY;
	}
	public String getROUTE_OPTION_SELECTED() {
		return ROUTE_OPTION_SELECTED;
	}
	public void setROUTE_OPTION_SELECTED(String rOUTE_OPTION_SELECTED) {
		ROUTE_OPTION_SELECTED = rOUTE_OPTION_SELECTED;
	}
	public String getRTO_AUDIT_ID() {
		return RTO_AUDIT_ID;
	}
	public void setRTO_AUDIT_ID(String rTO_AUDIT_ID) {
		RTO_AUDIT_ID = rTO_AUDIT_ID;
	}
	public String getRTO_FLAG() {
		return RTO_FLAG;
	}
	public void setRTO_FLAG(String rTO_FLAG) {
		RTO_FLAG = rTO_FLAG;
	}
	public String getSBSC_CHANNEL_CODE() {
		return SBSC_CHANNEL_CODE;
	}
	public void setSBSC_CHANNEL_CODE(String sBSC_CHANNEL_CODE) {
		SBSC_CHANNEL_CODE = sBSC_CHANNEL_CODE;
	}
	public String getSBSC_RESOLUTION_COMMENT() {
		return SBSC_RESOLUTION_COMMENT;
	}
	public void setSBSC_RESOLUTION_COMMENT(String sBSC_RESOLUTION_COMMENT) {
		SBSC_RESOLUTION_COMMENT = sBSC_RESOLUTION_COMMENT;
	}
	public Timestamp getSCHEDULED_DISPATCH_TIME() {
		return SCHEDULED_DISPATCH_TIME;
	}
	public void setSCHEDULED_DISPATCH_TIME(Timestamp sCHEDULED_DISPATCH_TIME) {
		SCHEDULED_DISPATCH_TIME = sCHEDULED_DISPATCH_TIME;
	}
	public String getSCRUBBED_CUSTOMER_SYMPTOM() {
		return SCRUBBED_CUSTOMER_SYMPTOM;
	}
	public void setSCRUBBED_CUSTOMER_SYMPTOM(String sCRUBBED_CUSTOMER_SYMPTOM) {
		SCRUBBED_CUSTOMER_SYMPTOM = sCRUBBED_CUSTOMER_SYMPTOM;
	}
	public String getSCRUBBED_RESOLUTION_CODE() {
		return SCRUBBED_RESOLUTION_CODE;
	}
	public void setSCRUBBED_RESOLUTION_CODE(String sCRUBBED_RESOLUTION_CODE) {
		SCRUBBED_RESOLUTION_CODE = sCRUBBED_RESOLUTION_CODE;
	}
	public String getSCRUBBED_RESOLUTION_SUMMARY() {
		return SCRUBBED_RESOLUTION_SUMMARY;
	}
	public void setSCRUBBED_RESOLUTION_SUMMARY(String sCRUBBED_RESOLUTION_SUMMARY) {
		SCRUBBED_RESOLUTION_SUMMARY = sCRUBBED_RESOLUTION_SUMMARY;
	}
	public String getSCRUBBED_UNDERLYING_CAUSE() {
		return SCRUBBED_UNDERLYING_CAUSE;
	}
	public void setSCRUBBED_UNDERLYING_CAUSE(String sCRUBBED_UNDERLYING_CAUSE) {
		SCRUBBED_UNDERLYING_CAUSE = sCRUBBED_UNDERLYING_CAUSE;
	}
	public String getSCRUBBED_UNDERLYING_CAUSE_CAT() {
		return SCRUBBED_UNDERLYING_CAUSE_CAT;
	}
	public void setSCRUBBED_UNDERLYING_CAUSE_CAT(String sCRUBBED_UNDERLYING_CAUSE_CAT) {
		SCRUBBED_UNDERLYING_CAUSE_CAT = sCRUBBED_UNDERLYING_CAUSE_CAT;
	}
	public String getSEND_EMAIL_NOTIF_TO_CONTACT() {
		return SEND_EMAIL_NOTIF_TO_CONTACT;
	}
	public void setSEND_EMAIL_NOTIF_TO_CONTACT(String sEND_EMAIL_NOTIF_TO_CONTACT) {
		SEND_EMAIL_NOTIF_TO_CONTACT = sEND_EMAIL_NOTIF_TO_CONTACT;
	}
	public String getSERVICE_LINE_NAME() {
		return SERVICE_LINE_NAME;
	}
	public void setSERVICE_LINE_NAME(String sERVICE_LINE_NAME) {
		SERVICE_LINE_NAME = sERVICE_LINE_NAME;
	}
	public String getEXTENDED_LOSS_OF_SERVICE() {
		return EXTENDED_LOSS_OF_SERVICE;
	}
	public void setEXTENDED_LOSS_OF_SERVICE(String eXTENDED_LOSS_OF_SERVICE) {
		EXTENDED_LOSS_OF_SERVICE = eXTENDED_LOSS_OF_SERVICE;
	}
	public String getSHIP_TO_PARTY_ID() {
		return SHIP_TO_PARTY_ID;
	}
	public void setSHIP_TO_PARTY_ID(String sHIP_TO_PARTY_ID) {
		SHIP_TO_PARTY_ID = sHIP_TO_PARTY_ID;
	}
	public BigDecimal getC3_SHIP_TO_SITE_ID() {
		return C3_SHIP_TO_SITE_ID;
	}
	public void setC3_SHIP_TO_SITE_ID(BigDecimal c3_SHIP_TO_SITE_ID) {
		C3_SHIP_TO_SITE_ID = c3_SHIP_TO_SITE_ID;
	}
	public String getSMART_ACCOUNT_ID() {
		return SMART_ACCOUNT_ID;
	}
	public void setSMART_ACCOUNT_ID(String sMART_ACCOUNT_ID) {
		SMART_ACCOUNT_ID = sMART_ACCOUNT_ID;
	}
	public String getSMART_SERVICE_PROGRAMS() {
		return SMART_SERVICE_PROGRAMS;
	}
	public void setSMART_SERVICE_PROGRAMS(String sMART_SERVICE_PROGRAMS) {
		SMART_SERVICE_PROGRAMS = sMART_SERVICE_PROGRAMS;
	}
	public String getSN_INPUT_TYPE() {
		return SN_INPUT_TYPE;
	}
	public void setSN_INPUT_TYPE(String sN_INPUT_TYPE) {
		SN_INPUT_TYPE = sN_INPUT_TYPE;
	}
	public String getSW_VERSION() {
		return SW_VERSION;
	}
	public void setSW_VERSION(String sW_VERSION) {
		SW_VERSION = sW_VERSION;
	}
	public String getSOLUTION_RELEASE() {
		return SOLUTION_RELEASE;
	}
	public void setSOLUTION_RELEASE(String sOLUTION_RELEASE) {
		SOLUTION_RELEASE = sOLUTION_RELEASE;
	}
	public String getSOLUTION_TYPE() {
		return SOLUTION_TYPE;
	}
	public void setSOLUTION_TYPE(String sOLUTION_TYPE) {
		SOLUTION_TYPE = sOLUTION_TYPE;
	}
	public String getDATA_SOURCE_NAME() {
		return DATA_SOURCE_NAME;
	}
	public void setDATA_SOURCE_NAME(String dATA_SOURCE_NAME) {
		DATA_SOURCE_NAME = dATA_SOURCE_NAME;
	}
	public String getSPOKEN_LANGUAGE() {
		return SPOKEN_LANGUAGE;
	}
	public void setSPOKEN_LANGUAGE(String sPOKEN_LANGUAGE) {
		SPOKEN_LANGUAGE = sPOKEN_LANGUAGE;
	}
	public String getSR_LANGUAGE() {
		return SR_LANGUAGE;
	}
	public void setSR_LANGUAGE(String sR_LANGUAGE) {
		SR_LANGUAGE = sR_LANGUAGE;
	}
	public String getSUBSCRIPTION_REFERENCE_ID() {
		return SUBSCRIPTION_REFERENCE_ID;
	}
	public void setSUBSCRIPTION_REFERENCE_ID(String sUBSCRIPTION_REFERENCE_ID) {
		SUBSCRIPTION_REFERENCE_ID = sUBSCRIPTION_REFERENCE_ID;
	}
	public String getSURVEY_OPT_OUT() {
		return SURVEY_OPT_OUT;
	}
	public void setSURVEY_OPT_OUT(String sURVEY_OPT_OUT) {
		SURVEY_OPT_OUT = sURVEY_OPT_OUT;
	}
	public String getSURVEY_PREFERENCE() {
		return SURVEY_PREFERENCE;
	}
	public void setSURVEY_PREFERENCE(String sURVEY_PREFERENCE) {
		SURVEY_PREFERENCE = sURVEY_PREFERENCE;
	}
	public String getSURVEY_SENT() {
		return SURVEY_SENT;
	}
	public void setSURVEY_SENT(String sURVEY_SENT) {
		SURVEY_SENT = sURVEY_SENT;
	}
	public String getSURVEY_TYPE() {
		return SURVEY_TYPE;
	}
	public void setSURVEY_TYPE(String sURVEY_TYPE) {
		SURVEY_TYPE = sURVEY_TYPE;
	}
	public String getSVO_ACCESS_ENABLED() {
		return SVO_ACCESS_ENABLED;
	}
	public void setSVO_ACCESS_ENABLED(String sVO_ACCESS_ENABLED) {
		SVO_ACCESS_ENABLED = sVO_ACCESS_ENABLED;
	}
	public String getCASE_TAG() {
		return CASE_TAG;
	}
	public void setCASE_TAG(String cASE_TAG) {
		CASE_TAG = cASE_TAG;
	}
	public String getTICKET_NUMBER() {
		return TICKET_NUMBER;
	}
	public void setTICKET_NUMBER(String tICKET_NUMBER) {
		TICKET_NUMBER = tICKET_NUMBER;
	}
	public String getTHIRD_PARTY_VENDOR() {
		return THIRD_PARTY_VENDOR;
	}
	public void setTHIRD_PARTY_VENDOR(String tHIRD_PARTY_VENDOR) {
		THIRD_PARTY_VENDOR = tHIRD_PARTY_VENDOR;
	}
	public String getUNDERLYING_CAUSE() {
		return UNDERLYING_CAUSE;
	}
	public void setUNDERLYING_CAUSE(String uNDERLYING_CAUSE) {
		UNDERLYING_CAUSE = uNDERLYING_CAUSE;
	}
	public String getCASE_CATEGORY() {
		return CASE_CATEGORY;
	}
	public void setCASE_CATEGORY(String cASE_CATEGORY) {
		CASE_CATEGORY = cASE_CATEGORY;
	}
	public String getCASE_URGENCY() {
		return CASE_URGENCY;
	}
	public void setCASE_URGENCY(String cASE_URGENCY) {
		CASE_URGENCY = cASE_URGENCY;
	}
	public String getCASE_CLOSE_SW_VERSION() {
		return CASE_CLOSE_SW_VERSION;
	}
	public void setCASE_CLOSE_SW_VERSION(String cASE_CLOSE_SW_VERSION) {
		CASE_CLOSE_SW_VERSION = cASE_CLOSE_SW_VERSION;
	}
	public String getVIRTUAL_ACCOUNT_ID() {
		return VIRTUAL_ACCOUNT_ID;
	}
	public void setVIRTUAL_ACCOUNT_ID(String vIRTUAL_ACCOUNT_ID) {
		VIRTUAL_ACCOUNT_ID = vIRTUAL_ACCOUNT_ID;
	}
	public String getCUSTOMER_CALLED_SUPPORT_REASON() {
		return CUSTOMER_CALLED_SUPPORT_REASON;
	}
	public void setCUSTOMER_CALLED_SUPPORT_REASON(String cUSTOMER_CALLED_SUPPORT_REASON) {
		CUSTOMER_CALLED_SUPPORT_REASON = cUSTOMER_CALLED_SUPPORT_REASON;
	}
	public String getRESOLUTION_WORKAROUND() {
		return RESOLUTION_WORKAROUND;
	}
	public void setRESOLUTION_WORKAROUND(String rESOLUTION_WORKAROUND) {
		RESOLUTION_WORKAROUND = rESOLUTION_WORKAROUND;
	}
	public String getWORKGROUP_NAME() {
		return WORKGROUP_NAME;
	}
	public void setWORKGROUP_NAME(String wORKGROUP_NAME) {
		WORKGROUP_NAME = wORKGROUP_NAME;
	}
	public Timestamp getLAST_UPDATE_DATE_C3_USER() {
		return LAST_UPDATE_DATE_C3_USER;
	}
	public void setLAST_UPDATE_DATE_C3_USER(Timestamp lAST_UPDATE_DATE_C3_USER) {
		LAST_UPDATE_DATE_C3_USER = lAST_UPDATE_DATE_C3_USER;
	}
	public String getNETWORK_PROTOCOL() {
		return NETWORK_PROTOCOL;
	}
	public void setNETWORK_PROTOCOL(String nETWORK_PROTOCOL) {
		NETWORK_PROTOCOL = nETWORK_PROTOCOL;
	}
	public String getPROTOCOL_DETAILS() {
		return PROTOCOL_DETAILS;
	}
	public void setPROTOCOL_DETAILS(String pROTOCOL_DETAILS) {
		PROTOCOL_DETAILS = pROTOCOL_DETAILS;
	}
	public String getDEFECT_COUNT() {
		return DEFECT_COUNT;
	}
	public void setDEFECT_COUNT(String dEFECT_COUNT) {
		DEFECT_COUNT = dEFECT_COUNT;
	}
	public String getCASE_TOPOLOGY() {
		return CASE_TOPOLOGY;
	}
	public void setCASE_TOPOLOGY(String cASE_TOPOLOGY) {
		CASE_TOPOLOGY = cASE_TOPOLOGY;
	}
	public String getSLA_ATTAINMENT() {
		return SLA_ATTAINMENT;
	}
	public void setSLA_ATTAINMENT(String sLA_ATTAINMENT) {
		SLA_ATTAINMENT = sLA_ATTAINMENT;
	}
	public String getCONTACT_PERSONA() {
		return CONTACT_PERSONA;
	}
	public void setCONTACT_PERSONA(String cONTACT_PERSONA) {
		CONTACT_PERSONA = cONTACT_PERSONA;
	}
	public String getCONTAINER_TYPE() {
		return CONTAINER_TYPE;
	}
	public void setCONTAINER_TYPE(String cONTAINER_TYPE) {
		CONTAINER_TYPE = cONTAINER_TYPE;
	}
	public String getHIGHEST_ELIGIBLE_SEVERITY() {
		return HIGHEST_ELIGIBLE_SEVERITY;
	}
	public void setHIGHEST_ELIGIBLE_SEVERITY(String hIGHEST_ELIGIBLE_SEVERITY) {
		HIGHEST_ELIGIBLE_SEVERITY = hIGHEST_ELIGIBLE_SEVERITY;
	}
	public String getPARENT_CONTAINER_NAME() {
		return PARENT_CONTAINER_NAME;
	}
	public void setPARENT_CONTAINER_NAME(String pARENT_CONTAINER_NAME) {
		PARENT_CONTAINER_NAME = pARENT_CONTAINER_NAME;
	}
	public String getSERVICE_TIER() {
		return SERVICE_TIER;
	}
	public void setSERVICE_TIER(String sERVICE_TIER) {
		SERVICE_TIER = sERVICE_TIER;
	}
	public String getTAC_SUPPORT_COVERAGE() {
		return TAC_SUPPORT_COVERAGE;
	}
	public void setTAC_SUPPORT_COVERAGE(String tAC_SUPPORT_COVERAGE) {
		TAC_SUPPORT_COVERAGE = tAC_SUPPORT_COVERAGE;
	}
	public Timestamp getCREATED_DATE() {
		return CREATED_DATE;
	}
	public void setCREATED_DATE(Timestamp cREATED_DATE) {
		CREATED_DATE = cREATED_DATE;
	}
	public String getCREATED_BY() {
		return CREATED_BY;
	}
	public void setCREATED_BY(String cREATED_BY) {
		CREATED_BY = cREATED_BY;
	}
	public Timestamp getLAST_MODIFIED_DATE() {
		return LAST_MODIFIED_DATE;
	}
	public void setLAST_MODIFIED_DATE(Timestamp lAST_MODIFIED_DATE) {
		LAST_MODIFIED_DATE = lAST_MODIFIED_DATE;
	}
	public String getLAST_MODIFIED_BY() {
		return LAST_MODIFIED_BY;
	}
	public void setLAST_MODIFIED_BY(String lAST_MODIFIED_BY) {
		LAST_MODIFIED_BY = lAST_MODIFIED_BY;
	}
	public Timestamp getC3_CREATION_DATE() {
		return C3_CREATION_DATE;
	}
	public void setC3_CREATION_DATE(Timestamp c3_CREATION_DATE) {
		C3_CREATION_DATE = c3_CREATION_DATE;
	}
	public String getC3_CREATED_BY() {
		return C3_CREATED_BY;
	}
	public void setC3_CREATED_BY(String c3_CREATED_BY) {
		C3_CREATED_BY = c3_CREATED_BY;
	}
	public Timestamp getC3_LAST_MODIFIED_DATE() {
		return C3_LAST_MODIFIED_DATE;
	}
	public void setC3_LAST_MODIFIED_DATE(Timestamp c3_LAST_MODIFIED_DATE) {
		C3_LAST_MODIFIED_DATE = c3_LAST_MODIFIED_DATE;
	}
	public String getC3_LAST_MODIFIED_BY() {
		return C3_LAST_MODIFIED_BY;
	}
	public void setC3_LAST_MODIFIED_BY(String c3_LAST_MODIFIED_BY) {
		C3_LAST_MODIFIED_BY = c3_LAST_MODIFIED_BY;
	}
	public String getCREATED_BY_C3() {
		return CREATED_BY_C3;
	}
	public void setCREATED_BY_C3(String cREATED_BY_C3) {
		CREATED_BY_C3 = cREATED_BY_C3;
	}
	public String getMODIFIED_BY_C3() {
		return MODIFIED_BY_C3;
	}
	public void setMODIFIED_BY_C3(String mODIFIED_BY_C3) {
		MODIFIED_BY_C3 = mODIFIED_BY_C3;
	}
	public String getCURRENT_CONTACT_PHONE() {
		return CURRENT_CONTACT_PHONE;
	}
	public void setCURRENT_CONTACT_PHONE(String cURRENT_CONTACT_PHONE) {
		CURRENT_CONTACT_PHONE = cURRENT_CONTACT_PHONE;
	}
	public String getCURRENT_CONTACT_EMAIL() {
		return CURRENT_CONTACT_EMAIL;
	}
	public void setCURRENT_CONTACT_EMAIL(String cURRENT_CONTACT_EMAIL) {
		CURRENT_CONTACT_EMAIL = cURRENT_CONTACT_EMAIL;
	}
	public String getCURRENT_CONTACT_EXTENSION() {
		return CURRENT_CONTACT_EXTENSION;
	}
	public void setCURRENT_CONTACT_EXTENSION(String cURRENT_CONTACT_EXTENSION) {
		CURRENT_CONTACT_EXTENSION = cURRENT_CONTACT_EXTENSION;
	}
	public String getCURRENT_CONTACT_NAME() {
		return CURRENT_CONTACT_NAME;
	}
	public void setCURRENT_CONTACT_NAME(String cURRENT_CONTACT_NAME) {
		CURRENT_CONTACT_NAME = cURRENT_CONTACT_NAME;
	}
	/**
	 * @return the value
	 *//*
	public String getValue() {
		return value;
	}
	*//**
	 * @param value the value to set
	 *//*
	public void setValue(String value) {
		this.value = value;
	}
	*//**
	 * @return the key
	 *//*
	public String getKey() {
		return key;
	}
	*//**
	 * @param key the key to set
	 *//*
	public void setKey(String key) {
		this.key = key;
	}
	*//**
	 * @return the partition
	 *//*
	public String getPartition() {
		return partition;
	}
	*//**
	 * @param partition the partition to set
	 *//*
	public void setPartition(String partition) {
		this.partition = partition;
	}
	*//**
	 * @return the offset
	 *//*
	public String getOffset() {
		return offset;
	}
	*//**
	 * @param offset the offset to set
	 *//*
	public void setOffset(String offset) {
		this.offset = offset;
	}
	*//**
	 * @return the timestampType
	 *//*
	public String getTimestampType() {
		return timestampType;
	}
	*//**
	 * @param timestampType the timestampType to set
	 *//*
	public void setTimestampType(String timestampType) {
		this.timestampType = timestampType;
	}
	*//**
	 * @return the topic
	 *//*
	public String getTopic() {
		return topic;
	}
	*//**
	 * @param topic the topic to set
	 *//*
	public void setTopic(String topic) {
		this.topic = topic;
	}
	*//**
	 * @return the timestamp
	 *//*
	public String getTimestamp() {
		return timestamp;
	}
	*//**
	 * @param timestamp the timestamp to set
	 *//*
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}*/
	
	
	
	
}
