package com.ticnow.security.idnow.admin.persistence.mappers;

import com.ticnow.security.model.admin.UserClient;

public interface UserClientMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_CLIENT
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_CLIENT
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int insert(UserClient record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_CLIENT
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int insertSelective(UserClient record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_CLIENT
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    UserClient selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_CLIENT
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int updateByPrimaryKeySelective(UserClient record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table USER_CLIENT
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int updateByPrimaryKey(UserClient record);
}