package com.ticnow.security.idnow.admin.persistence.mappers;

import com.ticnow.security.model.admin.ProfileUserModules;

public interface ProfileUserModulesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROFILE_USER_MODULES
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int deleteByPrimaryKey(Integer id_profile_user_modules);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROFILE_USER_MODULES
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int insert(ProfileUserModules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROFILE_USER_MODULES
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int insertSelective(ProfileUserModules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROFILE_USER_MODULES
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    ProfileUserModules selectByPrimaryKey(Integer id_profile_user_modules);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROFILE_USER_MODULES
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int updateByPrimaryKeySelective(ProfileUserModules record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PROFILE_USER_MODULES
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int updateByPrimaryKey(ProfileUserModules record);
}