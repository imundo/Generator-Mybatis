package com.ticnow.security.idnow.admin.persistence.mappers;

import com.ticnow.security.model.admin.TransactionsRulesStats;

public interface TransactionsRulesStatsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRANSACTIONS_RULES_STATS
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRANSACTIONS_RULES_STATS
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int insert(TransactionsRulesStats record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRANSACTIONS_RULES_STATS
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int insertSelective(TransactionsRulesStats record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRANSACTIONS_RULES_STATS
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    TransactionsRulesStats selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRANSACTIONS_RULES_STATS
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int updateByPrimaryKeySelective(TransactionsRulesStats record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TRANSACTIONS_RULES_STATS
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    int updateByPrimaryKey(TransactionsRulesStats record);
}