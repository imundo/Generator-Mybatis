package com.ticnow.security.idnow.admin.persistence.mappers;

import com.ticnow.security.model.admin.InstitutionSegments;

public interface InstitutionSegmentsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INSTITUTION_SEGMENTS
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INSTITUTION_SEGMENTS
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int insert(InstitutionSegments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INSTITUTION_SEGMENTS
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int insertSelective(InstitutionSegments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INSTITUTION_SEGMENTS
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    InstitutionSegments selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INSTITUTION_SEGMENTS
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int updateByPrimaryKeySelective(InstitutionSegments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table INSTITUTION_SEGMENTS
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int updateByPrimaryKey(InstitutionSegments record);
}