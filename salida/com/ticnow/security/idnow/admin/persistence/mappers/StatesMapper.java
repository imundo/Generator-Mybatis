package com.ticnow.security.idnow.admin.persistence.mappers;

import com.ticnow.security.model.admin.States;

public interface StatesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STATES
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int deleteByPrimaryKey(Integer id_state);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STATES
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int insert(States record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STATES
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int insertSelective(States record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STATES
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    States selectByPrimaryKey(Integer id_state);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STATES
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int updateByPrimaryKeySelective(States record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table STATES
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int updateByPrimaryKey(States record);
}