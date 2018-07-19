package javasparkes.inc;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Encoder;
import org.apache.spark.sql.Encoders;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.streaming.OutputMode;
import org.apache.spark.sql.streaming.StreamingQueryException;

import javasparkes.config.SetProperties;
import javasparkes.model.CaseNote;
import javasparkes.model.MasterDetails;

public class MasterR12Service {

	public static void main(String[] args) {
		
		System.out.println(" fetch Casenote By Spark !!!");
		
		SetProperties setProperties = new SetProperties();
		
		SparkSession sparkSession = SparkSession.builder()
				.appName("MasterR12Service")
				.master("local[*]")
				.getOrCreate();
		
		String URL = setProperties.getDatasourceUrl();
		
		
		
		Properties masterProp = new Properties();
		//masterProp.put("url", URL);
		masterProp.put("user", setProperties.getDatasourceUsername());
		masterProp.put("password", setProperties.getDatasourcePassword());
		//masterProp.put("dbtable", setProperties.getMasterDetailsQuery1()+"687050043"+setProperties.getMasterDetailsQuery2());
		masterProp.put("Driver", setProperties.getDatasourceDriver());
		
		
//		Map<String, String> masterPropMap = new HashMap<>();
//		//masterPropMap.put("url", "URL");
//		masterPropMap.put("user", setProperties.getDatasourceUsername());
//		masterPropMap.put("password", setProperties.getDatasourcePassword());
//		//masterPropMap.put("dbtable", setProperties.getMasterDetailsQuery1()/*+"687050043"+setProperties.getMasterDetailsQuery2()*/);
//		masterPropMap.put("Driver", setProperties.getDatasourceDriver());
//		System.out.println(setProperties.getMasterDetailsQuery1());
//		Encoder<MasterDetails> masterEncoder = Encoders.bean(MasterDetails.class);
		
//		Dataset<MasterDetails> masterDS = sparkSession.read()
//			.jdbc(URL, setProperties.getMasterDetailsQuery1(), masterProp).as(masterEncoder);
//		masterDS.printSchema();
//		masterDS.show(10);
		
		
		Dataset<Row> masterDF = sparkSession.read()
				.jdbc(URL, "(SELECT XSP1.PART_NUMBER AS hardwareDetails,XSP2.PART_NUMBER AS softwareDetails,HZ_P_SHIP.PARTY_NAME AS companySiteName,NVL(HZ_PART.PARTY_NAME,XCC.CURRENT_CONTACT_NAME) AS contactName,  HZ_P_SHIP1.PARTY_NAME AS companyName, XXHDR.SERVICE_LINE_NAME AS contractType,   XXHDR.SERVICE_LINE_STATUS AS serviceLineStatus,  XDSC.CONTRACT_ATTRIBUTE7 AS contractUsageType,  NVL (XFUX.ACCESS_LEVEL, 9999) AS contactTypeIndicator,  XFUX.CCIE_NUMEBR AS contactCCIENumber, XCC.CASE_NUMBER As caseNumber FROM XXCTS_CM_CASE XCC, APPS.XXCTS_FEA_FND_USER_EXT XFUX,  APPS.XXCCS_DS_SAHDR_CORE XDSC,  APPS.XXCTS_ENT_CONTSUM_HDR XXHDR, APPS.HZ_PARTIES HZ_P_SHIP1,  APPS.HZ_PARTIES HZ_PART,  APPS.HZ_PARTIES HZ_P_SHIP,  APPS.HZ_CUST_ACCOUNTS HZ_CA_SHIP,  APPS.HZ_LOCATIONS HZ_L_SHIP,  APPS.HZ_PARTY_SITES HZ_PS_SHIP, APPS.HZ_CUST_SITE_USES_ALL HZ_CSUA_SHIP, APPS.HZ_CUST_ACCT_SITES_ALL HZ_CASA_SHIP,  APPS.HZ_PARTIES HP,  APPS.XXCTS_SRM_PRODUCT_PARTS XSP1,  APPS.XXCTS_SRM_PRODUCT_PARTS XSP2,  APPS.XXCTS_SRM_PART_VERSIONS XPV1,  APPS.XXCTS_SRM_PART_VERSIONS XPV2	WHERE  1 = 1 AND XDSC.CONTRACT_NUMBER(+) = XCC.CONTRACT_NUMBER AND UPPER (XFUX.USER_NAME(+)) = UPPER (XCC.CONTACT_CCO_ID) AND XXHDR.CONTRACT_NUMBER(+) = XCC.CONTRACT_NUMBER AND XXHDR.SERVICE_LINE_NUMBER(+) = 1 AND HZ_P_SHIP1.PARTY_ID(+) = XCC.C3_CUSTOMER_ID AND XCC.CONTACT_CCO_ID = HZ_PART.ATTRIBUTE17(+) AND XCC.C3_SHIP_TO_SITE_ID = HZ_CSUA_SHIP.CUST_ACCT_SITE_ID(+) AND HZ_CSUA_SHIP.SITE_USE_CODE(+) = 'SHIP_TO' AND HZ_CASA_SHIP.CUST_ACCT_SITE_ID(+) = HZ_CSUA_SHIP.CUST_ACCT_SITE_ID  AND HZ_CA_SHIP.CUST_ACCOUNT_ID(+) = HZ_CASA_SHIP.CUST_ACCOUNT_ID AND HZ_P_SHIP.PARTY_ID(+) = HZ_CA_SHIP.PARTY_ID AND HZ_PS_SHIP.PARTY_SITE_ID(+) = HZ_CASA_SHIP.PARTY_SITE_ID AND HZ_L_SHIP.LOCATION_ID(+) = HZ_PS_SHIP.LOCATION_ID AND HZ_PS_SHIP.PARTY_SITE_ID(+) = XCC.C3_INSTALL_SITE_ID AND XPV1.VERSION_ID(+) = XCC.C3_HW_VERSION_ID AND XPV2.VERSION_ID(+) = XCC.C3_SW_VERSION_ID AND XPV1.PRODUCT_PART_ID = XSP1.PRODUCT_PART_ID(+) AND XPV2.PRODUCT_PART_ID = XSP2.PRODUCT_PART_ID(+) AND XCC.CASE_NUMBER ='681584469' AND ROWNUM = 1) APPS", masterProp);
		
		masterDF.printSchema();
		
		masterDF.show();	
	
		
		
//		Dataset<Row> masterDF =  sparkSession.read()
//			.format("jdbc")
//			.options(masterPropMap)
//			.load();
//		
//		masterDF.printSchema();
		
		/*Dataset<Row> masterDF = sparkSession.sqlContext()
			.read()
			.format("jdbc")
			.options(masterPropMap)
			.load();
		
		masterDF.printSchema();*/
			
//		Dataset<Row> sqlRow = sparkSession.sql("SELECT XSP1.PART_NUMBER AS hardwareDetails,XSP2.PART_NUMBER softwareDetails,HZ_P_SHIP.PARTY_NAME AS companySiteName,NVL(HZ_PART.PARTY_NAME,XCC.CURRENT_CONTACT_NAME) AS contactName,  HZ_P_SHIP1.PARTY_NAME AS companyName, XXHDR.SERVICE_LINE_NAME AS contractType,   XXHDR.SERVICE_LINE_STATUS AS serviceLineStatus,  XDSC.CONTRACT_ATTRIBUTE7 AS contractUsageType,  NVL (XFUX.ACCESS_LEVEL, 9999) AS contactTypeIndicator,  XFUX.CCIE_NUMEBR AS contactCCIENumber, XCC.CASE_NUMBER As caseNumber FROM XXCTS_CM_CASE XCC, APPS.XXCTS_FEA_FND_USER_EXT XFUX,  APPS.XXCCS_DS_SAHDR_CORE XDSC,  APPS.XXCTS_ENT_CONTSUM_HDR XXHDR, APPS.HZ_PARTIES HZ_P_SHIP1,  APPS.HZ_PARTIES HZ_PART,  APPS.HZ_PARTIES HZ_P_SHIP,  APPS.HZ_CUST_ACCOUNTS HZ_CA_SHIP,  APPS.HZ_LOCATIONS HZ_L_SHIP,  APPS.HZ_PARTY_SITES HZ_PS_SHIP, APPS.HZ_CUST_SITE_USES_ALL HZ_CSUA_SHIP, APPS.HZ_CUST_ACCT_SITES_ALL HZ_CASA_SHIP,  APPS.HZ_PARTIES HP,  APPS.XXCTS_SRM_PRODUCT_PARTS XSP1,  APPS.XXCTS_SRM_PRODUCT_PARTS XSP2,  APPS.XXCTS_SRM_PART_VERSIONS XPV1,  APPS.XXCTS_SRM_PART_VERSIONS XPV2	WHERE  1 = 1 AND XDSC.CONTRACT_NUMBER(+) = XCC.CONTRACT_NUMBER AND UPPER (XFUX.USER_NAME(+)) = UPPER (XCC.CONTACT_CCO_ID) AND XXHDR.CONTRACT_NUMBER(+) = XCC.CONTRACT_NUMBER AND XXHDR.SERVICE_LINE_NUMBER(+) = 1 AND HZ_P_SHIP1.PARTY_ID(+) = XCC.C3_CUSTOMER_ID AND XCC.CONTACT_CCO_ID = HZ_PART.ATTRIBUTE17(+) AND XCC.C3_SHIP_TO_SITE_ID = HZ_CSUA_SHIP.CUST_ACCT_SITE_ID(+) AND HZ_CSUA_SHIP.SITE_USE_CODE(+) = 'SHIP_TO' AND HZ_CASA_SHIP.CUST_ACCT_SITE_ID(+) = HZ_CSUA_SHIP.CUST_ACCT_SITE_ID  AND HZ_CA_SHIP.CUST_ACCOUNT_ID(+) = HZ_CASA_SHIP.CUST_ACCOUNT_ID AND HZ_P_SHIP.PARTY_ID(+) = HZ_CA_SHIP.PARTY_ID AND HZ_PS_SHIP.PARTY_SITE_ID(+) = HZ_CASA_SHIP.PARTY_SITE_ID AND HZ_L_SHIP.LOCATION_ID(+) = HZ_PS_SHIP.LOCATION_ID AND HZ_PS_SHIP.PARTY_SITE_ID(+) = XCC.C3_INSTALL_SITE_ID AND XPV1.VERSION_ID(+) = XCC.C3_HW_VERSION_ID AND XPV2.VERSION_ID(+) = XCC.C3_SW_VERSION_ID AND XPV1.PRODUCT_PART_ID = XSP1.PRODUCT_PART_ID(+) AND XPV2.PRODUCT_PART_ID = XSP2.PRODUCT_PART_ID(+) AND XCC.CASE_NUMBER ='681584469' AND ROWNUM = 1");
//		sqlRow.printSchema();
		
//		Dataset<Row> sql = sparkSession.sql("SELECT * FROM XXCTS_CM_CASE_NOTES WHERE CASE_NUMBER IN (  SELECT CASE_NUMBER FROM XXCTS_CM_CASE_NOTES xccn WHERE 1 = 1 AND CASE_NUMBER IN WHERE 1 = 1 AND xcc.CASE_NUMBER = xccn.CASE_NUMBER AND xcc.CASE_CREATED_DATE > SYSDATE - 84.6 GROUP BY xcc.CASE_NUMBER ) GROUP BY CASE_NUMBER HAVING COUNT (1) < 15");
//		sql.printSchema();
		
	}

}
