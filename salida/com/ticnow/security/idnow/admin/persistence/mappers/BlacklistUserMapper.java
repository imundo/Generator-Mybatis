package com.ticnow.security.idnow.admin.persistence.mappers;

import com.ticnow.security.model.admin.BlacklistUser;

public interface BlacklistUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BLACKLIST_USER
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int deleteByPrimaryKey(Integer id_blacklist_user);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BLACKLIST_USER
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int insert(BlacklistUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BLACKLIST_USER
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int insertSelective(BlacklistUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BLACKLIST_USER
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    BlacklistUser selectByPrimaryKey(Integer id_blacklist_user);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BLACKLIST_USER
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int updateByPrimaryKeySelective(BlacklistUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BLACKLIST_USER
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int updateByPrimaryKey(BlacklistUser record);
}