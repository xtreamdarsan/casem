/**
 * 
 */
package javasparkes.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.Properties;

/**
 * @author swmohara
 *
 */
public class SetProperties implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6125456135654377117L;
	private Properties prop = new Properties();
	private InputStream input = null;

	private String sparkAppName;
	private String sparkHome;
	private String sparkMaster;
	private String sparkSpeculation;
	private String sparkMaxToStringFields;
	private String sparkAllowMultipleContexts;
	private String sparkExecutorMemory;
	
	private String datasourceUrl;
	private String datasourceUsername;
	private String datasourcePassword;
	private String datasourceDriver;
	
	private String caseQuery;
	private String caseTablename;
	private String casePk;
	
	private String casenoteQuery;
	private String casenoteTablename;
	private String casenotePk;
	
	private String esIndexAutoCreate;
	private String esMappingId;
	private String esWriteOperation;
	private String esBatchSizeEntries;
	
	private String esCaseIndex;
	private String esCasenoteIndex;
	
	private String masterDetailsQuery1;
	private String masterDetailsQuery2;
	
	public SetProperties() {
		
		try {

			input = getClass().getResourceAsStream("/application.properties");
			prop.load(input);

			setSparkAppName(prop.getProperty("spark.appname"));
			setSparkHome(prop.getProperty("spark.home"));
			setSparkMaster(prop.getProperty("spark.master"));
			setSparkAllowMultipleContexts(prop.getProperty("spark.driver.allowMultipleContexts"));
			setSparkMaxToStringFields(prop.getProperty("spark.debug.maxToStringFields"));
			setSparkSpeculation(prop.getProperty("spark.speculation"));
			setSparkExecutorMemory(prop.getProperty("spark.executor.memory"));
			
			setDatasourceUrl(prop.getProperty("datasource.url"));
			setDatasourceUsername(prop.getProperty("datasource.username"));
			setDatasourcePassword(prop.getProperty("datasource.password"));
			setDatasourceDriver(prop.getProperty("datasource.driver"));
			
			setCaseQuery(prop.getProperty("case.query"));
			setCaseTablename(prop.getProperty("case.tablename"));
			setCasePk(prop.getProperty("case.pk"));
			
			setCasenoteQuery(prop.getProperty("casenote.query"));
			setCasenoteTablename(prop.getProperty("casenote.tablename"));
			setCasenotePk(prop.getProperty("casenote.pk"));
			
			setEsIndexAutoCreate(prop.getProperty("es.index.auto.create"));
			//setEsMappingId(prop.getProperty("es.mapping.id"));
			setEsWriteOperation(prop.getProperty("es.write.operation"));
			setEsBatchSizeEntries(prop.getProperty("es.batch.size.entries"));
			
			setEsCaseIndex(prop.getProperty("es.case.index"));
			setEsCasenoteIndex(prop.getProperty("es.casenote.index"));

			setMasterDetailsQuery1(prop.getProperty("masterdetails.query1"));
			setMasterDetailsQuery2(prop.getProperty("masterdetails.query2"));
			
		} catch (IOException ex) {
			ex.printStackTrace();
			System.out.println("Cant find the properties file!!!");
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public String getSparkAppName() {
		return sparkAppName;
	}

	public void setSparkAppName(String sparkAppName) {
		this.sparkAppName = sparkAppName;
	}

	/**
	 * @return the sparkHome
	 */
	public String getSparkHome() {
		return sparkHome;
	}

	/**
	 * @param sparkHome the sparkHome to set
	 */
	public void setSparkHome(String sparkHome) {
		this.sparkHome = sparkHome;
	}

	/**
	 * @return the sparkMaster
	 */
	public String getSparkMaster() {
		return sparkMaster;
	}

	/**
	 * @param sparkMaster the sparkMaster to set
	 */
	public void setSparkMaster(String sparkMaster) {
		this.sparkMaster = sparkMaster;
	}

	/**
	 * @return the sparkSpeculation
	 */
	public String getSparkSpeculation() {
		return sparkSpeculation;
	}

	/**
	 * @param sparkSpeculation the sparkSpeculation to set
	 */
	public void setSparkSpeculation(String sparkSpeculation) {
		this.sparkSpeculation = sparkSpeculation;
	}

	/**
	 * @return the sparkMaxToStringFields
	 */
	public String getSparkMaxToStringFields() {
		return sparkMaxToStringFields;
	}

	/**
	 * @param sparkMaxToStringFields the sparkMaxToStringFields to set
	 */
	public void setSparkMaxToStringFields(String sparkMaxToStringFields) {
		this.sparkMaxToStringFields = sparkMaxToStringFields;
	}

	/**
	 * @return the sparkAllowMultipleContexts
	 */
	public String getSparkAllowMultipleContexts() {
		return sparkAllowMultipleContexts;
	}

	/**
	 * @param sparkAllowMultipleContexts the sparkAllowMultipleContexts to set
	 */
	public void setSparkAllowMultipleContexts(String sparkAllowMultipleContexts) {
		this.sparkAllowMultipleContexts = sparkAllowMultipleContexts;
	}

	/**
	 * @return the datasourceUrl
	 */
	public String getDatasourceUrl() {
		return datasourceUrl;
	}

	/**
	 * @param datasourceUrl the datasourceUrl to set
	 */
	public void setDatasourceUrl(String datasourceUrl) {
		this.datasourceUrl = datasourceUrl;
	}

	/**
	 * @return the datasourceUusername
	 */
	public String getDatasourceUsername() {
		return datasourceUsername;
	}

	/**
	 * @param datasourceUusername the datasourceUusername to set
	 */
	public void setDatasourceUsername(String datasourceUusername) {
		this.datasourceUsername = datasourceUusername;
	}

	/**
	 * @return the datasourcePassword
	 */
	public String getDatasourcePassword() {
		return datasourcePassword;
	}

	/**
	 * @param datasourcePassword the datasourcePassword to set
	 */
	public void setDatasourcePassword(String datasourcePassword) {
		this.datasourcePassword = datasourcePassword;
	}

	/**
	 * @return the datasourceDriver
	 */
	public String getDatasourceDriver() {
		return datasourceDriver;
	}

	/**
	 * @param datasourceDriver the datasourceDriver to set
	 */
	public void setDatasourceDriver(String datasourceDriver) {
		this.datasourceDriver = datasourceDriver;
	}

	/**
	 * @return the caseQuery
	 */
	public String getCaseQuery() {
		return caseQuery;
	}

	/**
	 * @param caseQuery the caseQuery to set
	 */
	public void setCaseQuery(String caseQuery) {
		this.caseQuery = caseQuery;
	}

	/**
	 * @return the caseTablename
	 */
	public String getCaseTablename() {
		return caseTablename;
	}

	/**
	 * @param caseTablename the caseTablename to set
	 */
	public void setCaseTablename(String caseTablename) {
		this.caseTablename = caseTablename;
	}

	/**
	 * @return the casePk
	 */
	public String getCasePk() {
		return casePk;
	}

	/**
	 * @param casePk the casePk to set
	 */
	public void setCasePk(String casePk) {
		this.casePk = casePk;
	}

	/**
	 * @return the casenoteQuery
	 */
	public String getCasenoteQuery() {
		return casenoteQuery;
	}

	/**
	 * @param casenoteQuery the casenoteQuery to set
	 */
	public void setCasenoteQuery(String casenoteQuery) {
		this.casenoteQuery = casenoteQuery;
	}

	/**
	 * @return the casenoteTablename
	 */
	public String getCasenoteTablename() {
		return casenoteTablename;
	}

	/**
	 * @param casenoteTablename the casenoteTablename to set
	 */
	public void setCasenoteTablename(String casenoteTablename) {
		this.casenoteTablename = casenoteTablename;
	}

	/**
	 * @return the casenotePk
	 */
	public String getCasenotePk() {
		return casenotePk;
	}

	/**
	 * @param casenotePk the casenotePk to set
	 */
	public void setCasenotePk(String casenotePk) {
		this.casenotePk = casenotePk;
	}

	/**
	 * @return the esIndexAutoCreate
	 */
	public String getEsIndexAutoCreate() {
		return esIndexAutoCreate;
	}

	/**
	 * @param esIndexAutoCreate the esIndexAutoCreate to set
	 */
	public void setEsIndexAutoCreate(String esIndexAutoCreate) {
		this.esIndexAutoCreate = esIndexAutoCreate;
	}

	/**
	 * @return the esMappingId
	 */
	public String getEsMappingId() {
		return esMappingId;
	}

	/**
	 * @param esMappingId the esMappingId to set
	 */
	public void setEsMappingId(String esMappingId) {
		this.esMappingId = esMappingId;
	}

	/**
	 * @return the esWriteOperation
	 */
	public String getEsWriteOperation() {
		return esWriteOperation;
	}

	/**
	 * @param esWriteOperation the esWriteOperation to set
	 */
	public void setEsWriteOperation(String esWriteOperation) {
		this.esWriteOperation = esWriteOperation;
	}

	/**
	 * @return the esBatchSizeEntries
	 */
	public String getEsBatchSizeEntries() {
		return esBatchSizeEntries;
	}

	/**
	 * @param esBatchSizeEntries the esBatchSizeEntries to set
	 */
	public void setEsBatchSizeEntries(String esBatchSizeEntries) {
		this.esBatchSizeEntries = esBatchSizeEntries;
	}

	/**
	 * @return the esCaseIndex
	 */
	public String getEsCaseIndex() {
		return esCaseIndex;
	}

	/**
	 * @param esCaseIndex the esCaseIndex to set
	 */
	public void setEsCaseIndex(String esCaseIndex) {
		this.esCaseIndex = esCaseIndex;
	}

	/**
	 * @return the esCasenoteIndex
	 */
	public String getEsCasenoteIndex() {
		return esCasenoteIndex;
	}

	/**
	 * @param esCasenoteIndex the esCasenoteIndex to set
	 */
	public void setEsCasenoteIndex(String esCasenoteIndex) {
		this.esCasenoteIndex = esCasenoteIndex;
	}

	/**
	 * @return the sparkExecutorMemory
	 */
	public String getSparkExecutorMemory() {
		return sparkExecutorMemory;
	}

	/**
	 * @param sparkExecutorMemory the sparkExecutorMemory to set
	 */
	public void setSparkExecutorMemory(String sparkExecutorMemory) {
		this.sparkExecutorMemory = sparkExecutorMemory;
	}

	/**
	 * @return the masterDetailsQuery1
	 */
	public String getMasterDetailsQuery1() {
		return masterDetailsQuery1;
	}

	/**
	 * @param masterDetailsQuery1 the masterDetailsQuery1 to set
	 */
	public void setMasterDetailsQuery1(String masterDetailsQuery1) {
		this.masterDetailsQuery1 = masterDetailsQuery1;
	}

	/**
	 * @return the masterDetailsQuery2
	 */
	public String getMasterDetailsQuery2() {
		return masterDetailsQuery2;
	}

	/**
	 * @param masterDetailsQuery2 the masterDetailsQuery2 to set
	 */
	public void setMasterDetailsQuery2(String masterDetailsQuery2) {
		this.masterDetailsQuery2 = masterDetailsQuery2;
	}
	
	
	
}
