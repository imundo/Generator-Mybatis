package com.ticnow.security.idnow.admin.persistence.mappers;

import com.ticnow.security.model.admin.EnrollDeviceStepsLogs;

public interface EnrollDeviceStepsLogsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENROLL_DEVICE_STEPS_LOGS
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENROLL_DEVICE_STEPS_LOGS
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int insert(EnrollDeviceStepsLogs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENROLL_DEVICE_STEPS_LOGS
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int insertSelective(EnrollDeviceStepsLogs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENROLL_DEVICE_STEPS_LOGS
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    EnrollDeviceStepsLogs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENROLL_DEVICE_STEPS_LOGS
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int updateByPrimaryKeySelective(EnrollDeviceStepsLogs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENROLL_DEVICE_STEPS_LOGS
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int updateByPrimaryKey(EnrollDeviceStepsLogs record);
}