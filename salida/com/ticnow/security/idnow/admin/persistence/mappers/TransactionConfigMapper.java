package com.ticnow.security.idnow.admin.persistence.mappers;

import com.ticnow.security.model.admin.TransactionConfig;

public interface TransactionConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRANSACTION_CONFIG
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRANSACTION_CONFIG
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int insert(TransactionConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRANSACTION_CONFIG
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int insertSelective(TransactionConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRANSACTION_CONFIG
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    TransactionConfig selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRANSACTION_CONFIG
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int updateByPrimaryKeySelective(TransactionConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRANSACTION_CONFIG
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int updateByPrimaryKeyWithBLOBs(TransactionConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRANSACTION_CONFIG
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int updateByPrimaryKey(TransactionConfig record);
}