package com.ticnow.security.model.admin;

public class UserDevices {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_DEVICES.id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_DEVICES.user_id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private Integer user_id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column USER_DEVICES.uuid_device
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    private String uuid_device;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_DEVICES.id
     *
     * @return the value of USER_DEVICES.id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_DEVICES.id
     *
     * @param id the value for USER_DEVICES.id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_DEVICES.user_id
     *
     * @return the value of USER_DEVICES.user_id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_DEVICES.user_id
     *
     * @param user_id the value for USER_DEVICES.user_id
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column USER_DEVICES.uuid_device
     *
     * @return the value of USER_DEVICES.uuid_device
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public String getUuid_device() {
        return uuid_device;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column USER_DEVICES.uuid_device
     *
     * @param uuid_device the value for USER_DEVICES.uuid_device
     *
     * @mbggenerated Wed Mar 21 14:07:09 CLST 2018
     */
    public void setUuid_device(String uuid_device) {
        this.uuid_device = uuid_device;
    }
}