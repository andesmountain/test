package com.yuqiyu.chapter24.test.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "S_OPERATION_LOG")
public class SOperationLog {
	@Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select SQ_S_OPERATION_LOG.nextval from dual")
    private Long id;

    @Column(name = "FUNC_ID")
    private String funcId;

    @Column(name = "FUNC_NAME")
    private String funcName;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "ORG_CODE")
    private String orgCode;

    @Column(name = "ORG_NAME")
    private String orgName;

    @Column(name = "REQUEST_IP")
    private String requestIp;

    @Column(name = "LOG_MESSAGE")
    private String logMessage;

    @Column(name = "LOG_DATE")
    private Date logDate;

    @Column(name = "OPERA_DESC")
    private String operaDesc;

    @Column(name = "OPERA_RESULT")
    private String operaResult;

    @Column(name = "TEMP1")
    private String temp1;

    @Column(name = "TEMP2")
    private String temp2;

    @Column(name = "TEMP3")
    private String temp3;

    @Column(name="URL_PARAM")
    private String urlParam;

    @Column(name="PAGE_NAME")
    private String pageName;

    /**
     * @return ID
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return FUNC_ID
     */
    public String getFuncId() {
        return funcId;
    }

    /**
     * @param funcId
     */
    public void setFuncId(String funcId) {
        this.funcId = funcId;
    }

    /**
     * @return FUNC_NAME
     */
    public String getFuncName() {
        return funcName;
    }

    /**
     * @param funcName
     */
    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }

    /**
     * @return USER_ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return USER_NAME
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return ORG_CODE
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * @param orgCode
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    /**
     * @return ORG_NAME
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * @param orgName
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    /**
     * @return REQUEST_IP
     */
    public String getRequestIp() {
        return requestIp;
    }

    /**
     * @param requestIp
     */
    public void setRequestIp(String requestIp) {
        this.requestIp = requestIp;
    }

    /**
     * @return LOG_MESSAGE
     */
    public String getLogMessage() {
        return logMessage;
    }

    /**
     * @param logMessage
     */
    public void setLogMessage(String logMessage) {
        this.logMessage = logMessage;
    }

    /**
     * @return LOG_DATE
     */
    public Date getLogDate() {
        return logDate;
    }

    /**
     * @param logDate
     */
    public void setLogDate(Date logDate) {
        this.logDate = logDate;
    }

    /**
     * @return OPERA_DESC
     */
    public String getOperaDesc() {
        return operaDesc;
    }

    /**
     * @param operaDesc
     */
    public void setOperaDesc(String operaDesc) {
        this.operaDesc = operaDesc;
    }

    /**
     * @return OPERA_RESULT
     */
    public String getOperaResult() {
        return operaResult;
    }

    /**
     * @param operaResult
     */
    public void setOperaResult(String operaResult) {
        this.operaResult = operaResult;
    }

    /**
     * @return TEMP1
     */
    public String getTemp1() {
        return temp1;
    }

    /**
     * @param temp1
     */
    public void setTemp1(String temp1) {
        this.temp1 = temp1;
    }

    /**
     * @return TEMP2
     */
    public String getTemp2() {
        return temp2;
    }

    /**
     * @param temp2
     */
    public void setTemp2(String temp2) {
        this.temp2 = temp2;
    }

    /**
     * @return TEMP3
     */
    public String getTemp3() {
        return temp3;
    }

    /**
     * @param temp3
     */
    public void setTemp3(String temp3) {
        this.temp3 = temp3;
    }


    public String getUrlParam() {
        return urlParam;
    }

    public void setUrlParam(String urlParam) {
        this.urlParam = urlParam;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }
}