package com.ticnow.security.idnow.admin.persistence.mappers;

import com.ticnow.security.model.admin.ServicesIntegrationLog;

public interface ServicesIntegrationLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SERVICES_INTEGRATION_LOG
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SERVICES_INTEGRATION_LOG
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int insert(ServicesIntegrationLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SERVICES_INTEGRATION_LOG
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int insertSelective(ServicesIntegrationLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SERVICES_INTEGRATION_LOG
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    ServicesIntegrationLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SERVICES_INTEGRATION_LOG
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int updateByPrimaryKeySelective(ServicesIntegrationLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SERVICES_INTEGRATION_LOG
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int updateByPrimaryKey(ServicesIntegrationLog record);
}