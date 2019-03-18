package com.ticnow.security.idnow.admin.persistence.mappers;

import com.ticnow.security.model.admin.DeviceEnrollImages;

public interface DeviceEnrollImagesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEVICE_ENROLL_IMAGES
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEVICE_ENROLL_IMAGES
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int insert(DeviceEnrollImages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEVICE_ENROLL_IMAGES
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int insertSelective(DeviceEnrollImages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEVICE_ENROLL_IMAGES
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    DeviceEnrollImages selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEVICE_ENROLL_IMAGES
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int updateByPrimaryKeySelective(DeviceEnrollImages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEVICE_ENROLL_IMAGES
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int updateByPrimaryKeyWithBLOBs(DeviceEnrollImages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DEVICE_ENROLL_IMAGES
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int updateByPrimaryKey(DeviceEnrollImages record);
}