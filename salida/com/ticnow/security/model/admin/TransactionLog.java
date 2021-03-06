package com.ticnow.security.model.admin;

import java.util.Date;

public class TransactionLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_LOG.id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_LOG.uuid
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private String uuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_LOG.client_id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Integer client_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_LOG.methodApplied
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private String methodApplied;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_LOG.initTime
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Date initTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_LOG.endTime
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Date endTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_LOG.transactionType
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private String transactionType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_LOG.sourceAddress
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private String sourceAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_LOG.location
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private String location;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_LOG.request
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private String request;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_LOG.response
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private String response;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_LOG.riskLevel
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private String riskLevel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_LOG.result
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private String result;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_LOG.internalRisk
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private String internalRisk;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_LOG.channel
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private String channel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_LOG.appSource
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private String appSource;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_LOG.uuidDevice
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private String uuidDevice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_LOG.deviceName
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private String deviceName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_LOG.id
     *
     * @return the value of TRANSACTION_LOG.id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_LOG.id
     *
     * @param id the value for TRANSACTION_LOG.id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_LOG.uuid
     *
     * @return the value of TRANSACTION_LOG.uuid
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_LOG.uuid
     *
     * @param uuid the value for TRANSACTION_LOG.uuid
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_LOG.client_id
     *
     * @return the value of TRANSACTION_LOG.client_id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Integer getClient_id() {
        return client_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_LOG.client_id
     *
     * @param client_id the value for TRANSACTION_LOG.client_id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setClient_id(Integer client_id) {
        this.client_id = client_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_LOG.methodApplied
     *
     * @return the value of TRANSACTION_LOG.methodApplied
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public String getMethodApplied() {
        return methodApplied;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_LOG.methodApplied
     *
     * @param methodApplied the value for TRANSACTION_LOG.methodApplied
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setMethodApplied(String methodApplied) {
        this.methodApplied = methodApplied;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_LOG.initTime
     *
     * @return the value of TRANSACTION_LOG.initTime
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Date getInitTime() {
        return initTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_LOG.initTime
     *
     * @param initTime the value for TRANSACTION_LOG.initTime
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setInitTime(Date initTime) {
        this.initTime = initTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_LOG.endTime
     *
     * @return the value of TRANSACTION_LOG.endTime
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_LOG.endTime
     *
     * @param endTime the value for TRANSACTION_LOG.endTime
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_LOG.transactionType
     *
     * @return the value of TRANSACTION_LOG.transactionType
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_LOG.transactionType
     *
     * @param transactionType the value for TRANSACTION_LOG.transactionType
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_LOG.sourceAddress
     *
     * @return the value of TRANSACTION_LOG.sourceAddress
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public String getSourceAddress() {
        return sourceAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_LOG.sourceAddress
     *
     * @param sourceAddress the value for TRANSACTION_LOG.sourceAddress
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_LOG.location
     *
     * @return the value of TRANSACTION_LOG.location
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public String getLocation() {
        return location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_LOG.location
     *
     * @param location the value for TRANSACTION_LOG.location
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_LOG.request
     *
     * @return the value of TRANSACTION_LOG.request
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public String getRequest() {
        return request;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_LOG.request
     *
     * @param request the value for TRANSACTION_LOG.request
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setRequest(String request) {
        this.request = request;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_LOG.response
     *
     * @return the value of TRANSACTION_LOG.response
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public String getResponse() {
        return response;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_LOG.response
     *
     * @param response the value for TRANSACTION_LOG.response
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setResponse(String response) {
        this.response = response;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_LOG.riskLevel
     *
     * @return the value of TRANSACTION_LOG.riskLevel
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public String getRiskLevel() {
        return riskLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_LOG.riskLevel
     *
     * @param riskLevel the value for TRANSACTION_LOG.riskLevel
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_LOG.result
     *
     * @return the value of TRANSACTION_LOG.result
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public String getResult() {
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_LOG.result
     *
     * @param result the value for TRANSACTION_LOG.result
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_LOG.internalRisk
     *
     * @return the value of TRANSACTION_LOG.internalRisk
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public String getInternalRisk() {
        return internalRisk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_LOG.internalRisk
     *
     * @param internalRisk the value for TRANSACTION_LOG.internalRisk
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setInternalRisk(String internalRisk) {
        this.internalRisk = internalRisk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_LOG.channel
     *
     * @return the value of TRANSACTION_LOG.channel
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public String getChannel() {
        return channel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_LOG.channel
     *
     * @param channel the value for TRANSACTION_LOG.channel
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_LOG.appSource
     *
     * @return the value of TRANSACTION_LOG.appSource
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public String getAppSource() {
        return appSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_LOG.appSource
     *
     * @param appSource the value for TRANSACTION_LOG.appSource
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setAppSource(String appSource) {
        this.appSource = appSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_LOG.uuidDevice
     *
     * @return the value of TRANSACTION_LOG.uuidDevice
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public String getUuidDevice() {
        return uuidDevice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_LOG.uuidDevice
     *
     * @param uuidDevice the value for TRANSACTION_LOG.uuidDevice
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setUuidDevice(String uuidDevice) {
        this.uuidDevice = uuidDevice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_LOG.deviceName
     *
     * @return the value of TRANSACTION_LOG.deviceName
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_LOG.deviceName
     *
     * @param deviceName the value for TRANSACTION_LOG.deviceName
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
}