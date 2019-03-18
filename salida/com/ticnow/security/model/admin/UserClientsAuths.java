package com.ticnow.security.model.admin;

import java.util.Date;

public class UserClientsAuths {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_CLIENTS_AUTHS.id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_CLIENTS_AUTHS.registerDate
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Date registerDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_CLIENTS_AUTHS.updateDate
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Date updateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_CLIENTS_AUTHS.status
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_CLIENTS_AUTHS.user_id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Integer user_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_CLIENTS_AUTHS.authenticator_id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Integer authenticator_id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_CLIENTS_AUTHS.id
     *
     * @return the value of USER_CLIENTS_AUTHS.id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_CLIENTS_AUTHS.id
     *
     * @param id the value for USER_CLIENTS_AUTHS.id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_CLIENTS_AUTHS.registerDate
     *
     * @return the value of USER_CLIENTS_AUTHS.registerDate
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Date getRegisterDate() {
        return registerDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_CLIENTS_AUTHS.registerDate
     *
     * @param registerDate the value for USER_CLIENTS_AUTHS.registerDate
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_CLIENTS_AUTHS.updateDate
     *
     * @return the value of USER_CLIENTS_AUTHS.updateDate
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_CLIENTS_AUTHS.updateDate
     *
     * @param updateDate the value for USER_CLIENTS_AUTHS.updateDate
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_CLIENTS_AUTHS.status
     *
     * @return the value of USER_CLIENTS_AUTHS.status
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_CLIENTS_AUTHS.status
     *
     * @param status the value for USER_CLIENTS_AUTHS.status
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_CLIENTS_AUTHS.user_id
     *
     * @return the value of USER_CLIENTS_AUTHS.user_id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_CLIENTS_AUTHS.user_id
     *
     * @param user_id the value for USER_CLIENTS_AUTHS.user_id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_CLIENTS_AUTHS.authenticator_id
     *
     * @return the value of USER_CLIENTS_AUTHS.authenticator_id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Integer getAuthenticator_id() {
        return authenticator_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_CLIENTS_AUTHS.authenticator_id
     *
     * @param authenticator_id the value for USER_CLIENTS_AUTHS.authenticator_id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setAuthenticator_id(Integer authenticator_id) {
        this.authenticator_id = authenticator_id;
    }
}