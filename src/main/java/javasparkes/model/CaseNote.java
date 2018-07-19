/**
 * 
 */
package javasparkes.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author swmohara
 *
 */
@Entity
@Table(name="XXCTS_CM_CASE_NOTES")
public class CaseNote implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5172929607333957711L;

	@Id
	private String CASE_NOTES_ID                      ;       
	
	private String CASE_NUMBER                        ;       
	private String NOTE_TYPES                         ;       
	private String CASE_NOTES_TITLE                   ;
	private String NOTE_NAME                          ;       
	private String B2B_NOTE_STATUS                    ;       
	private String CASE_NOTE_TYPE                     ;       
	private String CASE_OWNER_EMAIL                   ;       
	private Timestamp CS1_CREATION_DATE                    ;                
	private String ENG_FAILURE_ANALYSIS               ;       
	private String NOTE_STATUS                        ;       
	private String IS_JUNK                            ;        
	private Timestamp LAST_EXTERNAL_UPDATE_TIME            ;                
	private String IS_DELETED                         ;        
	private String NOTES_DETAILS                      ;                
	private String NOTES_SUBSCRIPTION_ALERT           ;       
	private String NOTE_STATUS_VALUE                  ;       
	private String OLD_CASE_COMMENT_ID                ;        
	private String RMA_ORDER_NUMBER                   ;        
	private Timestamp CREATED_DATE                         ;                
	private String CREATED_BY                         ;       
	private Timestamp LAST_MODIFIED_DATE                   ;                
	private String LAST_MODIFIED_BY                   ;       
	private Timestamp C3_CREATION_DATE                     ;                
	private String C3_CREATED_BY                      ;       
	private Timestamp C3_LAST_MODIFIED_DATE                ;                
	private String C3_LAST_MODIFIED_BY                ;       
	private String CREATED_BY_C3                      ;       
	private String MODIFIED_BY_C3   				  ;
	
	public String getCASE_NOTES_ID() {
		return CASE_NOTES_ID;
	}
	public void setCASE_NOTES_ID(String cASE_NOTES_ID) {
		CASE_NOTES_ID = cASE_NOTES_ID;
	}
	public String getCASE_NUMBER() {
		return CASE_NUMBER;
	}
	public void setCASE_NUMBER(String cASE_NUMBER) {
		CASE_NUMBER = cASE_NUMBER;
	}
	public String getNOTE_TYPES() {
		return NOTE_TYPES;
	}
	public void setNOTE_TYPES(String nOTE_TYPES) {
		NOTE_TYPES = nOTE_TYPES;
	}
	public String getCASE_NOTES_TITLE() {
		return CASE_NOTES_TITLE;
	}
	public void setCASE_NOTES_TITLE(String cASE_NOTES_TITLE) {
		CASE_NOTES_TITLE = cASE_NOTES_TITLE;
	}
	public String getNOTE_NAME() {
		return NOTE_NAME;
	}
	public void setNOTE_NAME(String nOTE_NAME) {
		NOTE_NAME = nOTE_NAME;
	}
	public String getB2B_NOTE_STATUS() {
		return B2B_NOTE_STATUS;
	}
	public void setB2B_NOTE_STATUS(String b2b_NOTE_STATUS) {
		B2B_NOTE_STATUS = b2b_NOTE_STATUS;
	}
	public String getCASE_NOTE_TYPE() {
		return CASE_NOTE_TYPE;
	}
	public void setCASE_NOTE_TYPE(String cASE_NOTE_TYPE) {
		CASE_NOTE_TYPE = cASE_NOTE_TYPE;
	}
	public String getCASE_OWNER_EMAIL() {
		return CASE_OWNER_EMAIL;
	}
	public void setCASE_OWNER_EMAIL(String cASE_OWNER_EMAIL) {
		CASE_OWNER_EMAIL = cASE_OWNER_EMAIL;
	}
	public Timestamp getCS1_CREATION_DATE() {
		return CS1_CREATION_DATE;
	}
	public void setCS1_CREATION_DATE(Timestamp cS1_CREATION_DATE) {
		CS1_CREATION_DATE = cS1_CREATION_DATE;
	}
	public String getENG_FAILURE_ANALYSIS() {
		return ENG_FAILURE_ANALYSIS;
	}
	public void setENG_FAILURE_ANALYSIS(String eNG_FAILURE_ANALYSIS) {
		ENG_FAILURE_ANALYSIS = eNG_FAILURE_ANALYSIS;
	}
	public String getNOTE_STATUS() {
		return NOTE_STATUS;
	}
	public void setNOTE_STATUS(String nOTE_STATUS) {
		NOTE_STATUS = nOTE_STATUS;
	}
	public String getIS_JUNK() {
		return IS_JUNK;
	}
	public void setIS_JUNK(String iS_JUNK) {
		IS_JUNK = iS_JUNK;
	}
	public Timestamp getLAST_EXTERNAL_UPDATE_TIME() {
		return LAST_EXTERNAL_UPDATE_TIME;
	}
	public void setLAST_EXTERNAL_UPDATE_TIME(Timestamp lAST_EXTERNAL_UPDATE_TIME) {
		LAST_EXTERNAL_UPDATE_TIME = lAST_EXTERNAL_UPDATE_TIME;
	}
	public String getIS_DELETED() {
		return IS_DELETED;
	}
	public void setIS_DELETED(String iS_DELETED) {
		IS_DELETED = iS_DELETED;
	}
	public String getNOTES_DETAILS() {
		return NOTES_DETAILS;
	}
	public void setNOTES_DETAILS(String nOTES_DETAILS) {
		NOTES_DETAILS = nOTES_DETAILS;
	}
	public String getNOTES_SUBSCRIPTION_ALERT() {
		return NOTES_SUBSCRIPTION_ALERT;
	}
	public void setNOTES_SUBSCRIPTION_ALERT(String nOTES_SUBSCRIPTION_ALERT) {
		NOTES_SUBSCRIPTION_ALERT = nOTES_SUBSCRIPTION_ALERT;
	}
	public String getNOTE_STATUS_VALUE() {
		return NOTE_STATUS_VALUE;
	}
	public void setNOTE_STATUS_VALUE(String nOTE_STATUS_VALUE) {
		NOTE_STATUS_VALUE = nOTE_STATUS_VALUE;
	}
	public String getOLD_CASE_COMMENT_ID() {
		return OLD_CASE_COMMENT_ID;
	}
	public void setOLD_CASE_COMMENT_ID(String oLD_CASE_COMMENT_ID) {
		OLD_CASE_COMMENT_ID = oLD_CASE_COMMENT_ID;
	}
	public String getRMA_ORDER_NUMBER() {
		return RMA_ORDER_NUMBER;
	}
	public void setRMA_ORDER_NUMBER(String rMA_ORDER_NUMBER) {
		RMA_ORDER_NUMBER = rMA_ORDER_NUMBER;
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
