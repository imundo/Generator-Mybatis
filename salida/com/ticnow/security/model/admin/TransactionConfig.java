package com.ticnow.security.model.admin;

public class TransactionConfig {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_CONFIG.id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_CONFIG.uuid
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private String uuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_CONFIG.transactionName
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private String transactionName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_CONFIG.transactionChannel
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private String transactionChannel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_CONFIG.transactionType
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private String transactionType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_CONFIG.monetary
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Boolean monetary;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_CONFIG.riskLevel
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private String riskLevel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_CONFIG.status
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_CONFIG.default_auth_id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Integer default_auth_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_CONFIG.institution_id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Long institution_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_CONFIG.maxAmount
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Long maxAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_CONFIG.minAmount
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Long minAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_CONFIG.segment_id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Integer segment_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_CONFIG.default_auth_auto_dispatch
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Boolean default_auth_auto_dispatch;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_CONFIG.requireRiskEngineEvaluation
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Boolean requireRiskEngineEvaluation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_CONFIG.timeoutSeconds
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Integer timeoutSeconds;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_CONFIG.nextActionTo
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private String nextActionTo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_CONFIG.dailyMaxAmount
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Long dailyMaxAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_CONFIG.selectOtherAuth
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Boolean selectOtherAuth;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_CONFIG.transactionShortDescription
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private String transactionShortDescription;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_CONFIG.dailyMaxCountTrx
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Integer dailyMaxCountTrx;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTION_CONFIG.transactionDescription
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private String transactionDescription;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_CONFIG.id
     *
     * @return the value of TRANSACTION_CONFIG.id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_CONFIG.id
     *
     * @param id the value for TRANSACTION_CONFIG.id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_CONFIG.uuid
     *
     * @return the value of TRANSACTION_CONFIG.uuid
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_CONFIG.uuid
     *
     * @param uuid the value for TRANSACTION_CONFIG.uuid
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_CONFIG.transactionName
     *
     * @return the value of TRANSACTION_CONFIG.transactionName
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public String getTransactionName() {
        return transactionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_CONFIG.transactionName
     *
     * @param transactionName the value for TRANSACTION_CONFIG.transactionName
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_CONFIG.transactionChannel
     *
     * @return the value of TRANSACTION_CONFIG.transactionChannel
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public String getTransactionChannel() {
        return transactionChannel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_CONFIG.transactionChannel
     *
     * @param transactionChannel the value for TRANSACTION_CONFIG.transactionChannel
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setTransactionChannel(String transactionChannel) {
        this.transactionChannel = transactionChannel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_CONFIG.transactionType
     *
     * @return the value of TRANSACTION_CONFIG.transactionType
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_CONFIG.transactionType
     *
     * @param transactionType the value for TRANSACTION_CONFIG.transactionType
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_CONFIG.monetary
     *
     * @return the value of TRANSACTION_CONFIG.monetary
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Boolean getMonetary() {
        return monetary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_CONFIG.monetary
     *
     * @param monetary the value for TRANSACTION_CONFIG.monetary
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setMonetary(Boolean monetary) {
        this.monetary = monetary;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_CONFIG.riskLevel
     *
     * @return the value of TRANSACTION_CONFIG.riskLevel
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public String getRiskLevel() {
        return riskLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_CONFIG.riskLevel
     *
     * @param riskLevel the value for TRANSACTION_CONFIG.riskLevel
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_CONFIG.status
     *
     * @return the value of TRANSACTION_CONFIG.status
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_CONFIG.status
     *
     * @param status the value for TRANSACTION_CONFIG.status
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_CONFIG.default_auth_id
     *
     * @return the value of TRANSACTION_CONFIG.default_auth_id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Integer getDefault_auth_id() {
        return default_auth_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_CONFIG.default_auth_id
     *
     * @param default_auth_id the value for TRANSACTION_CONFIG.default_auth_id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setDefault_auth_id(Integer default_auth_id) {
        this.default_auth_id = default_auth_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_CONFIG.institution_id
     *
     * @return the value of TRANSACTION_CONFIG.institution_id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Long getInstitution_id() {
        return institution_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_CONFIG.institution_id
     *
     * @param institution_id the value for TRANSACTION_CONFIG.institution_id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setInstitution_id(Long institution_id) {
        this.institution_id = institution_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_CONFIG.maxAmount
     *
     * @return the value of TRANSACTION_CONFIG.maxAmount
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Long getMaxAmount() {
        return maxAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_CONFIG.maxAmount
     *
     * @param maxAmount the value for TRANSACTION_CONFIG.maxAmount
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setMaxAmount(Long maxAmount) {
        this.maxAmount = maxAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_CONFIG.minAmount
     *
     * @return the value of TRANSACTION_CONFIG.minAmount
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Long getMinAmount() {
        return minAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_CONFIG.minAmount
     *
     * @param minAmount the value for TRANSACTION_CONFIG.minAmount
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setMinAmount(Long minAmount) {
        this.minAmount = minAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_CONFIG.segment_id
     *
     * @return the value of TRANSACTION_CONFIG.segment_id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Integer getSegment_id() {
        return segment_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_CONFIG.segment_id
     *
     * @param segment_id the value for TRANSACTION_CONFIG.segment_id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setSegment_id(Integer segment_id) {
        this.segment_id = segment_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_CONFIG.default_auth_auto_dispatch
     *
     * @return the value of TRANSACTION_CONFIG.default_auth_auto_dispatch
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Boolean getDefault_auth_auto_dispatch() {
        return default_auth_auto_dispatch;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_CONFIG.default_auth_auto_dispatch
     *
     * @param default_auth_auto_dispatch the value for TRANSACTION_CONFIG.default_auth_auto_dispatch
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setDefault_auth_auto_dispatch(Boolean default_auth_auto_dispatch) {
        this.default_auth_auto_dispatch = default_auth_auto_dispatch;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_CONFIG.requireRiskEngineEvaluation
     *
     * @return the value of TRANSACTION_CONFIG.requireRiskEngineEvaluation
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Boolean getRequireRiskEngineEvaluation() {
        return requireRiskEngineEvaluation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_CONFIG.requireRiskEngineEvaluation
     *
     * @param requireRiskEngineEvaluation the value for TRANSACTION_CONFIG.requireRiskEngineEvaluation
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setRequireRiskEngineEvaluation(Boolean requireRiskEngineEvaluation) {
        this.requireRiskEngineEvaluation = requireRiskEngineEvaluation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_CONFIG.timeoutSeconds
     *
     * @return the value of TRANSACTION_CONFIG.timeoutSeconds
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_CONFIG.timeoutSeconds
     *
     * @param timeoutSeconds the value for TRANSACTION_CONFIG.timeoutSeconds
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_CONFIG.nextActionTo
     *
     * @return the value of TRANSACTION_CONFIG.nextActionTo
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public String getNextActionTo() {
        return nextActionTo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_CONFIG.nextActionTo
     *
     * @param nextActionTo the value for TRANSACTION_CONFIG.nextActionTo
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setNextActionTo(String nextActionTo) {
        this.nextActionTo = nextActionTo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_CONFIG.dailyMaxAmount
     *
     * @return the value of TRANSACTION_CONFIG.dailyMaxAmount
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Long getDailyMaxAmount() {
        return dailyMaxAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_CONFIG.dailyMaxAmount
     *
     * @param dailyMaxAmount the value for TRANSACTION_CONFIG.dailyMaxAmount
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setDailyMaxAmount(Long dailyMaxAmount) {
        this.dailyMaxAmount = dailyMaxAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_CONFIG.selectOtherAuth
     *
     * @return the value of TRANSACTION_CONFIG.selectOtherAuth
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Boolean getSelectOtherAuth() {
        return selectOtherAuth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_CONFIG.selectOtherAuth
     *
     * @param selectOtherAuth the value for TRANSACTION_CONFIG.selectOtherAuth
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setSelectOtherAuth(Boolean selectOtherAuth) {
        this.selectOtherAuth = selectOtherAuth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_CONFIG.transactionShortDescription
     *
     * @return the value of TRANSACTION_CONFIG.transactionShortDescription
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public String getTransactionShortDescription() {
        return transactionShortDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_CONFIG.transactionShortDescription
     *
     * @param transactionShortDescription the value for TRANSACTION_CONFIG.transactionShortDescription
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setTransactionShortDescription(String transactionShortDescription) {
        this.transactionShortDescription = transactionShortDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_CONFIG.dailyMaxCountTrx
     *
     * @return the value of TRANSACTION_CONFIG.dailyMaxCountTrx
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Integer getDailyMaxCountTrx() {
        return dailyMaxCountTrx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_CONFIG.dailyMaxCountTrx
     *
     * @param dailyMaxCountTrx the value for TRANSACTION_CONFIG.dailyMaxCountTrx
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setDailyMaxCountTrx(Integer dailyMaxCountTrx) {
        this.dailyMaxCountTrx = dailyMaxCountTrx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTION_CONFIG.transactionDescription
     *
     * @return the value of TRANSACTION_CONFIG.transactionDescription
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public String getTransactionDescription() {
        return transactionDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTION_CONFIG.transactionDescription
     *
     * @param transactionDescription the value for TRANSACTION_CONFIG.transactionDescription
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setTransactionDescription(String transactionDescription) {
        this.transactionDescription = transactionDescription;
    }
}