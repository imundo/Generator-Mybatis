package com.ticnow.security.idnow.admin.persistence.mappers;

import com.ticnow.security.model.admin.Risk;

public interface RiskMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RISK
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int deleteByPrimaryKey(Integer id_risk);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RISK
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int insert(Risk record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RISK
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int insertSelective(Risk record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RISK
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    Risk selectByPrimaryKey(Integer id_risk);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RISK
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int updateByPrimaryKeySelective(Risk record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RISK
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int updateByPrimaryKey(Risk record);
}