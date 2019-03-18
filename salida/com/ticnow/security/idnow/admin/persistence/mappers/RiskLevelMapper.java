package com.ticnow.security.idnow.admin.persistence.mappers;

import com.ticnow.security.model.admin.RiskLevel;

public interface RiskLevelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RISK_LEVEL
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int deleteByPrimaryKey(Integer id_risk_level);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RISK_LEVEL
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int insert(RiskLevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RISK_LEVEL
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int insertSelective(RiskLevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RISK_LEVEL
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    RiskLevel selectByPrimaryKey(Integer id_risk_level);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RISK_LEVEL
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int updateByPrimaryKeySelective(RiskLevel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RISK_LEVEL
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int updateByPrimaryKey(RiskLevel record);
}