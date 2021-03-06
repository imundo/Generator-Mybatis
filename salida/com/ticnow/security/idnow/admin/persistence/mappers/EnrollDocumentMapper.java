package com.ticnow.security.idnow.admin.persistence.mappers;

import com.ticnow.security.model.admin.EnrollDocument;

public interface EnrollDocumentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENROLL_DOCUMENT
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENROLL_DOCUMENT
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int insert(EnrollDocument record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENROLL_DOCUMENT
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int insertSelective(EnrollDocument record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENROLL_DOCUMENT
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    EnrollDocument selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENROLL_DOCUMENT
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int updateByPrimaryKeySelective(EnrollDocument record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENROLL_DOCUMENT
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int updateByPrimaryKeyWithBLOBs(EnrollDocument record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ENROLL_DOCUMENT
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int updateByPrimaryKey(EnrollDocument record);
}