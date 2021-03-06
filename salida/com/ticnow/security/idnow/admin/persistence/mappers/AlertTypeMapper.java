package com.ticnow.security.idnow.admin.persistence.mappers;

import com.ticnow.security.model.admin.AlertType;

public interface AlertTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ALERT_TYPE
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int deleteByPrimaryKey(Integer id_alert_type);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ALERT_TYPE
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int insert(AlertType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ALERT_TYPE
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int insertSelective(AlertType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ALERT_TYPE
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    AlertType selectByPrimaryKey(Integer id_alert_type);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ALERT_TYPE
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int updateByPrimaryKeySelective(AlertType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ALERT_TYPE
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int updateByPrimaryKey(AlertType record);
}