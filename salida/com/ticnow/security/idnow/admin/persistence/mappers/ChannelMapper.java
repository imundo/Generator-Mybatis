package com.ticnow.security.idnow.admin.persistence.mappers;

import com.ticnow.security.model.admin.Channel;

public interface ChannelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHANNEL
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int deleteByPrimaryKey(Integer id_channel);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHANNEL
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int insert(Channel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHANNEL
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int insertSelective(Channel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHANNEL
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    Channel selectByPrimaryKey(Integer id_channel);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHANNEL
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int updateByPrimaryKeySelective(Channel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHANNEL
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int updateByPrimaryKey(Channel record);
}