package com.ticnow.security.model.admin;

public class RiskLevel {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column RISK_LEVEL.id_risk_level
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Integer id_risk_level;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column RISK_LEVEL.risk_name
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private String risk_name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column RISK_LEVEL.id_risk_level
     *
     * @return the value of RISK_LEVEL.id_risk_level
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Integer getId_risk_level() {
        return id_risk_level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column RISK_LEVEL.id_risk_level
     *
     * @param id_risk_level the value for RISK_LEVEL.id_risk_level
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setId_risk_level(Integer id_risk_level) {
        this.id_risk_level = id_risk_level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column RISK_LEVEL.risk_name
     *
     * @return the value of RISK_LEVEL.risk_name
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public String getRisk_name() {
        return risk_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column RISK_LEVEL.risk_name
     *
     * @param risk_name the value for RISK_LEVEL.risk_name
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setRisk_name(String risk_name) {
        this.risk_name = risk_name;
    }
}