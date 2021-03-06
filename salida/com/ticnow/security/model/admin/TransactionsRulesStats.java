package com.ticnow.security.model.admin;

import java.util.Date;

public class TransactionsRulesStats {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTIONS_RULES_STATS.id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTIONS_RULES_STATS.uuid
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private String uuid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTIONS_RULES_STATS.sum_amount
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Long sum_amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTIONS_RULES_STATS.average_amount
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Double average_amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTIONS_RULES_STATS.max_amount
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Long max_amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTIONS_RULES_STATS.metricStat
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private String metricStat;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTIONS_RULES_STATS.average_risk_score
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Double average_risk_score;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTIONS_RULES_STATS.last_risk_score
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Double last_risk_score;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTIONS_RULES_STATS.enroll_scoring
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Double enroll_scoring;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTIONS_RULES_STATS.count_trx
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Double count_trx;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTIONS_RULES_STATS.last_date_transaction
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Date last_date_transaction;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTIONS_RULES_STATS.count_error_trx
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Double count_error_trx;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTIONS_RULES_STATS.count_accept_trx
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Double count_accept_trx;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTIONS_RULES_STATS.count_allow_risk_trx
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Double count_allow_risk_trx;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTIONS_RULES_STATS.count_deny_risk_trx
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Double count_deny_risk_trx;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTIONS_RULES_STATS.count_challenge_risk_trx
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Double count_challenge_risk_trx;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTIONS_RULES_STATS.institution_id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Long institution_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTIONS_RULES_STATS.id_channel
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Integer id_channel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTIONS_RULES_STATS.id_institution_transaction
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Long id_institution_transaction;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TRANSACTIONS_RULES_STATS.client_id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Integer client_id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTIONS_RULES_STATS.id
     *
     * @return the value of TRANSACTIONS_RULES_STATS.id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTIONS_RULES_STATS.id
     *
     * @param id the value for TRANSACTIONS_RULES_STATS.id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTIONS_RULES_STATS.uuid
     *
     * @return the value of TRANSACTIONS_RULES_STATS.uuid
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTIONS_RULES_STATS.uuid
     *
     * @param uuid the value for TRANSACTIONS_RULES_STATS.uuid
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTIONS_RULES_STATS.sum_amount
     *
     * @return the value of TRANSACTIONS_RULES_STATS.sum_amount
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Long getSum_amount() {
        return sum_amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTIONS_RULES_STATS.sum_amount
     *
     * @param sum_amount the value for TRANSACTIONS_RULES_STATS.sum_amount
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setSum_amount(Long sum_amount) {
        this.sum_amount = sum_amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTIONS_RULES_STATS.average_amount
     *
     * @return the value of TRANSACTIONS_RULES_STATS.average_amount
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Double getAverage_amount() {
        return average_amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTIONS_RULES_STATS.average_amount
     *
     * @param average_amount the value for TRANSACTIONS_RULES_STATS.average_amount
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setAverage_amount(Double average_amount) {
        this.average_amount = average_amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTIONS_RULES_STATS.max_amount
     *
     * @return the value of TRANSACTIONS_RULES_STATS.max_amount
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Long getMax_amount() {
        return max_amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTIONS_RULES_STATS.max_amount
     *
     * @param max_amount the value for TRANSACTIONS_RULES_STATS.max_amount
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setMax_amount(Long max_amount) {
        this.max_amount = max_amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTIONS_RULES_STATS.metricStat
     *
     * @return the value of TRANSACTIONS_RULES_STATS.metricStat
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public String getMetricStat() {
        return metricStat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTIONS_RULES_STATS.metricStat
     *
     * @param metricStat the value for TRANSACTIONS_RULES_STATS.metricStat
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setMetricStat(String metricStat) {
        this.metricStat = metricStat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTIONS_RULES_STATS.average_risk_score
     *
     * @return the value of TRANSACTIONS_RULES_STATS.average_risk_score
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Double getAverage_risk_score() {
        return average_risk_score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTIONS_RULES_STATS.average_risk_score
     *
     * @param average_risk_score the value for TRANSACTIONS_RULES_STATS.average_risk_score
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setAverage_risk_score(Double average_risk_score) {
        this.average_risk_score = average_risk_score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTIONS_RULES_STATS.last_risk_score
     *
     * @return the value of TRANSACTIONS_RULES_STATS.last_risk_score
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Double getLast_risk_score() {
        return last_risk_score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTIONS_RULES_STATS.last_risk_score
     *
     * @param last_risk_score the value for TRANSACTIONS_RULES_STATS.last_risk_score
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setLast_risk_score(Double last_risk_score) {
        this.last_risk_score = last_risk_score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTIONS_RULES_STATS.enroll_scoring
     *
     * @return the value of TRANSACTIONS_RULES_STATS.enroll_scoring
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Double getEnroll_scoring() {
        return enroll_scoring;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTIONS_RULES_STATS.enroll_scoring
     *
     * @param enroll_scoring the value for TRANSACTIONS_RULES_STATS.enroll_scoring
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setEnroll_scoring(Double enroll_scoring) {
        this.enroll_scoring = enroll_scoring;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTIONS_RULES_STATS.count_trx
     *
     * @return the value of TRANSACTIONS_RULES_STATS.count_trx
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Double getCount_trx() {
        return count_trx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTIONS_RULES_STATS.count_trx
     *
     * @param count_trx the value for TRANSACTIONS_RULES_STATS.count_trx
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setCount_trx(Double count_trx) {
        this.count_trx = count_trx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTIONS_RULES_STATS.last_date_transaction
     *
     * @return the value of TRANSACTIONS_RULES_STATS.last_date_transaction
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Date getLast_date_transaction() {
        return last_date_transaction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTIONS_RULES_STATS.last_date_transaction
     *
     * @param last_date_transaction the value for TRANSACTIONS_RULES_STATS.last_date_transaction
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setLast_date_transaction(Date last_date_transaction) {
        this.last_date_transaction = last_date_transaction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTIONS_RULES_STATS.count_error_trx
     *
     * @return the value of TRANSACTIONS_RULES_STATS.count_error_trx
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Double getCount_error_trx() {
        return count_error_trx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTIONS_RULES_STATS.count_error_trx
     *
     * @param count_error_trx the value for TRANSACTIONS_RULES_STATS.count_error_trx
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setCount_error_trx(Double count_error_trx) {
        this.count_error_trx = count_error_trx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTIONS_RULES_STATS.count_accept_trx
     *
     * @return the value of TRANSACTIONS_RULES_STATS.count_accept_trx
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Double getCount_accept_trx() {
        return count_accept_trx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTIONS_RULES_STATS.count_accept_trx
     *
     * @param count_accept_trx the value for TRANSACTIONS_RULES_STATS.count_accept_trx
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setCount_accept_trx(Double count_accept_trx) {
        this.count_accept_trx = count_accept_trx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTIONS_RULES_STATS.count_allow_risk_trx
     *
     * @return the value of TRANSACTIONS_RULES_STATS.count_allow_risk_trx
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Double getCount_allow_risk_trx() {
        return count_allow_risk_trx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTIONS_RULES_STATS.count_allow_risk_trx
     *
     * @param count_allow_risk_trx the value for TRANSACTIONS_RULES_STATS.count_allow_risk_trx
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setCount_allow_risk_trx(Double count_allow_risk_trx) {
        this.count_allow_risk_trx = count_allow_risk_trx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTIONS_RULES_STATS.count_deny_risk_trx
     *
     * @return the value of TRANSACTIONS_RULES_STATS.count_deny_risk_trx
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Double getCount_deny_risk_trx() {
        return count_deny_risk_trx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTIONS_RULES_STATS.count_deny_risk_trx
     *
     * @param count_deny_risk_trx the value for TRANSACTIONS_RULES_STATS.count_deny_risk_trx
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setCount_deny_risk_trx(Double count_deny_risk_trx) {
        this.count_deny_risk_trx = count_deny_risk_trx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTIONS_RULES_STATS.count_challenge_risk_trx
     *
     * @return the value of TRANSACTIONS_RULES_STATS.count_challenge_risk_trx
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Double getCount_challenge_risk_trx() {
        return count_challenge_risk_trx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTIONS_RULES_STATS.count_challenge_risk_trx
     *
     * @param count_challenge_risk_trx the value for TRANSACTIONS_RULES_STATS.count_challenge_risk_trx
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setCount_challenge_risk_trx(Double count_challenge_risk_trx) {
        this.count_challenge_risk_trx = count_challenge_risk_trx;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTIONS_RULES_STATS.institution_id
     *
     * @return the value of TRANSACTIONS_RULES_STATS.institution_id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Long getInstitution_id() {
        return institution_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTIONS_RULES_STATS.institution_id
     *
     * @param institution_id the value for TRANSACTIONS_RULES_STATS.institution_id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setInstitution_id(Long institution_id) {
        this.institution_id = institution_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTIONS_RULES_STATS.id_channel
     *
     * @return the value of TRANSACTIONS_RULES_STATS.id_channel
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Integer getId_channel() {
        return id_channel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTIONS_RULES_STATS.id_channel
     *
     * @param id_channel the value for TRANSACTIONS_RULES_STATS.id_channel
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setId_channel(Integer id_channel) {
        this.id_channel = id_channel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTIONS_RULES_STATS.id_institution_transaction
     *
     * @return the value of TRANSACTIONS_RULES_STATS.id_institution_transaction
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Long getId_institution_transaction() {
        return id_institution_transaction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTIONS_RULES_STATS.id_institution_transaction
     *
     * @param id_institution_transaction the value for TRANSACTIONS_RULES_STATS.id_institution_transaction
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setId_institution_transaction(Long id_institution_transaction) {
        this.id_institution_transaction = id_institution_transaction;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TRANSACTIONS_RULES_STATS.client_id
     *
     * @return the value of TRANSACTIONS_RULES_STATS.client_id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Integer getClient_id() {
        return client_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TRANSACTIONS_RULES_STATS.client_id
     *
     * @param client_id the value for TRANSACTIONS_RULES_STATS.client_id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setClient_id(Integer client_id) {
        this.client_id = client_id;
    }
}