package com.ticnow.security.idnow.admin.persistence.mappers;

import com.ticnow.security.model.admin.ExternalChallengesResponse;

public interface ExternalChallengesResponseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXTERNAL_CHALLENGES_RESPONSE
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXTERNAL_CHALLENGES_RESPONSE
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int insert(ExternalChallengesResponse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXTERNAL_CHALLENGES_RESPONSE
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int insertSelective(ExternalChallengesResponse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXTERNAL_CHALLENGES_RESPONSE
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    ExternalChallengesResponse selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXTERNAL_CHALLENGES_RESPONSE
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int updateByPrimaryKeySelective(ExternalChallengesResponse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table EXTERNAL_CHALLENGES_RESPONSE
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int updateByPrimaryKey(ExternalChallengesResponse record);
}