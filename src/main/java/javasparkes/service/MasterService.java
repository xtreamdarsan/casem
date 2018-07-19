/**
 * 
 */
package javasparkes.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.sql.Encoder;
import org.apache.spark.sql.Encoders;

import javasparkes.config.SparkConfig;
import javasparkes.model.Case;
import javasparkes.model.MasterCase;
import javasparkes.model.MasterDetails;

/**
 * @author swmohara
 *
 */
public class MasterService implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7021128677555801707L;

	SparkConfig sparkConfig = new SparkConfig();
	
	CaseService caseService = new CaseService();
	
	public static void main(String args[]) {
		
		MasterService masterService = new MasterService();
		
		masterService.pushMasterCaseToEs();
	}
	
	JavaRDD<MasterDetails> getMasterRDD(){
		
		List<MasterDetails> masterList = new ArrayList<>();
		
		masterList.add(new MasterDetails());
		masterList.add(new MasterDetails());
		masterList.add(new MasterDetails());
		masterList.add(new MasterDetails());
		masterList.add(new MasterDetails());
		
		//Encoder<MasterDetails> masterEncoder = Encoders.bean(MasterDetails.class);
		
		JavaRDD<MasterDetails> masterRDD = sparkConfig.caseJavaSparkContext().parallelize(masterList);
		
		return masterRDD;
	}
	
	void pushMasterCaseToEs(){
		
		//Map<String, String> options = new HashMap<>();
		
		JavaRDD<Case> caseRDD = caseService.getCaseRDD();
		
		//JavaRDD<MasterDetails> masterRDD = getMasterRDD();
		
		JavaRDD<MasterCase> caseMasterRDD = caseRDD.map(new Function<Case, MasterCase>() {

			private static final long serialVersionUID = -4186760863075362920L;

			@Override
			public MasterCase call(Case c1) throws Exception {
				
				MasterCase masterCase = new MasterCase();
				
				//query for master data using case id
				
				MasterDetails masterDetails = new MasterDetails();
				
				
				//set case details
				masterCase.setCASE_ID(c1.getCASE_ID());
				masterCase.setACTION_CLASS(c1.getACTION_CLASS());
				masterCase.setACTION_PLAN(c1.getACTION_PLAN());
				masterCase.setADDITIONAL_EMAIL_CC(c1.getADDITIONAL_EMAIL_CC());
				masterCase.setALTERNATE_CONTACT_NAME(c1.getALTERNATE_CONTACT_NAME());
				masterCase.setALTERNATE_EMAIL_ADDRESS(c1.getALTERNATE_EMAIL_ADDRESS());
				masterCase.setALTERNATE_PHONE(c1.getALTERNATE_PHONE());
				masterCase.setB2B_ESCALATED_TIME(c1.getB2B_ESCALATED_TIME());
				masterCase.setB2B_FLAG(c1.getB2B_FLAG());
				masterCase.setB2B_STATUS(c1.getB2B_STATUS());
				masterCase.setB2B_URGENCY(c1.getB2B_URGENCY());
				masterCase.setBILL_TO_PARTY_ID(c1.getBILL_TO_SITE_USE_ID());
				masterCase.setBILL_TO_SITE_C3_ID(c1.getBILL_TO_SITE_C3_ID());
				masterCase.setBILL_TO_SITE_USE_ID(c1.getBILL_TO_SITE_USE_ID());
				masterCase.setC3_CREATED_BY(c1.getC3_CREATED_BY());
				masterCase.setC3_CREATION_DATE(c1.getC3_CREATION_DATE());
				masterCase.setC3_CUSTOMER_ID(c1.getC3_CUSTOMER_ID());
				masterCase.setC3_HW_VERSION_ID(c1.getC3_HW_VERSION_ID());
				masterCase.setC3_INSTALL_SITE_ID(c1.getC3_INSTALL_SITE_ID());
				masterCase.setC3_LAST_MODIFIED_BY(c1.getC3_LAST_MODIFIED_BY());
				masterCase.setC3_LAST_MODIFIED_DATE(c1.getC3_LAST_MODIFIED_DATE());
				masterCase.setC3_PRODUCT_ID(c1.getC3_PRODUCT_ID());
				masterCase.setC3_SHIP_TO_SITE_ID(c1.getC3_SHIP_TO_SITE_ID());
				masterCase.setC3_SW_VERSION_ID(c1.getC3_SW_VERSION_ID());
				masterCase.setCALL_END_TIME(c1.getCALL_END_TIME());
				masterCase.setCALL_PHONE_NUMBER(c1.getCALL_PHONE_NUMBER());
				masterCase.setCALL_START_TIME(c1.getCALL_START_TIME());
				masterCase.setCASE_ACCEPTED_DATE(c1.getCASE_ACCEPTED_DATE());
				masterCase.setCASE_CATEGORY(c1.getCASE_CATEGORY());
				masterCase.setCASE_CLOSE_SW_VERSION(c1.getCASE_CLOSE_SW_VERSION());
				masterCase.setCASE_CLOSED_DATE(c1.getCASE_CLOSED_DATE());
				masterCase.setCASE_COMMENTS(c1.getCASE_COMMENTS());
				masterCase.setCASE_COMPLEXITY(c1.getCASE_COMPLEXITY());
				masterCase.setCASE_CREATED_DATE(c1.getCASE_CREATED_DATE());
				masterCase.setCASE_DESCRIPTION(c1.getCASE_DESCRIPTION());
				masterCase.setCASE_ID(c1.getCASE_ID());
				masterCase.setCASE_IMPACT_CATEGORY(c1.getCASE_IMPACT_CATEGORY());
				masterCase.setCASE_IMPACT_INCIDENT_TIME(c1.getCASE_IMPACT_INCIDENT_TIME());
				masterCase.setCASE_IMPACT_STATUS(c1.getCASE_IMPACT_STATUS());
				masterCase.setCASE_IMPACT_USER_COUNT(c1.getCASE_IMPACT_USER_COUNT());
				masterCase.setCASE_LABEL(c1.getCASE_LABEL());
				masterCase.setCASE_NOTIFICATION_SETTINGS(c1.getCASE_NOTIFICATION_SETTINGS());
				masterCase.setCASE_NUMBER(c1.getCASE_NUMBER());
				masterCase.setCASE_ORIGIN(c1.getCASE_ORIGIN());
				masterCase.setCASE_OWNER(c1.getCASE_OWNER());
				masterCase.setCASE_OWNER_CHANGES(c1.getCASE_OWNER_CHANGES());
				masterCase.setCASE_OWNER_EMAIL_ID(c1.getCASE_OWNER_EMAIL_ID());
				masterCase.setCASE_OWNER_ROLE(c1.getCASE_OWNER_ROLE());
				masterCase.setCASE_PRIORITY(c1.getCASE_PRIORITY());
				masterCase.setCASE_REASON(c1.getCASE_REASON());
				masterCase.setCASE_STATUS(c1.getCASE_STATUS());
				masterCase.setCASE_SUBJECT(c1.getCASE_SUBJECT());
				masterCase.setCASE_SUMMARY(c1.getCASE_SUMMARY());
				masterCase.setCASE_TAG(c1.getCASE_TAG());
				masterCase.setCASE_TOPOLOGY(c1.getCASE_TOPOLOGY());
				masterCase.setCASE_TYPE(c1.getCASE_TYPE());
				masterCase.setCASE_URGENCY(c1.getCASE_URGENCY());
				masterCase.setCDS_RESOLUTION_SUMMARY(c1.getCDS_RESOLUTION_SUMMARY());
				masterCase.setCIN_CR_LED_PRODUCT_TYPE(c1.getCIN_CR_LED_PRODUCT_TYPE());
				masterCase.setCIN_CR_SSB_ISSUE_REASON(c1.getCIN_CR_SSB_ISSUE_REASON());
				masterCase.setCIN_CR_SSB_PRODUCT_TYPE(c1.getCIN_CR_SSB_PRODUCT_TYPE());
				masterCase.setCIN_INITIAL_ACCEPTNCE_DATE(c1.getCIN_INITIAL_ACCEPTNCE_DATE());
				masterCase.setCISCO_ACCOUNT_ID(c1.getCISCO_ACCOUNT_ID());
				masterCase.setCOMM_PREFERENCE_LANG(c1.getCOMM_PREFERENCE_LANG());
				masterCase.setCOMMUNICATION_PREFERENCE(c1.getCOMMUNICATION_PREFERENCE());
				masterCase.setCONTACT_CCO_ID(c1.getCONTACT_CCO_ID());
				masterCase.setCONTACT_ME(c1.getCONTACT_ME());
				masterCase.setCONTACT_ME_DATE(c1.getCONTACT_ME_DATE());
				masterCase.setCONTACT_ME_FROM_TIME(c1.getCONTACT_ME_FROM_TIME());
				masterCase.setCONTACT_ME_TIME(c1.getCONTACT_ME_TIME());
				masterCase.setCONTACT_ME_TIME_ZONE(c1.getCONTACT_ME_TIME_ZONE());
				masterCase.setCONTACT_ME_TO_TIME(c1.getCONTACT_ME_TO_TIME());
				masterCase.setCONTACT_PERSONA(c1.getCONTACT_PERSONA());
				masterCase.setCONTACT_SECONDARY_EMAIL(c1.getCONTACT_SECONDARY_EMAIL());
				masterCase.setCONTACT_TYPE(c1.getCONTACT_TYPE());
				masterCase.setCONTAINER_TYPE(c1.getCONTAINER_TYPE());
				masterCase.setCONTRACT_NUMBER(c1.getCONTRACT_NUMBER());
				masterCase.setCONTRACT_STATUS(c1.getCONTRACT_STATUS());
				masterCase.setCOUNTRY_INCIDENT(c1.getCOUNTRY_INCIDENT());
				masterCase.setCREATED_BY(c1.getCREATED_BY());
				masterCase.setCREATED_BY_C3(c1.getCREATED_BY_C3());
				masterCase.setCREATED_DATE(c1.getCREATED_DATE());
				masterCase.setCS1_CASE_NUMBER(c1.getCS1_CASE_NUMBER());
				masterCase.setCS1_END_CLIENT_INFORMATION(c1.getCS1_END_CLIENT_INFORMATION());
				masterCase.setCS1_REASON(c1.getCS1_REASON());
				masterCase.setCSC_DISCUSSION_THREAD_ID(c1.getCSC_DISCUSSION_THREAD_ID());
				masterCase.setCURRENT_CONTACT_EMAIL(c1.getCURRENT_CONTACT_EMAIL());
				
				
				//set masterDetails for the corresponding case ID
				masterCase.setMasterDetails(masterDetails);
				
				return masterCase;
			}
			
			
		});
		
		System.out.println("start counting : ");
		System.out.println("count : "+caseMasterRDD.count());
		System.out.println("counting finished");
		
	}
}
