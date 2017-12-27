package com.times.cloud.common.bean.mysql;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`user`")
public class User {
    @Id
    @Column(name = "`USER_ID`")
    private String userId;

    @Column(name = "`USER_TYPE`")
    private Integer userType;

    @Column(name = "`USER_NAME`")
    private String userName;

    @Column(name = "`USER_CNNAME`")
    private String userCnname;

    @Column(name = "`PASSWORD`")
    private String password;

    @Column(name = "`USER_DESC`")
    private String userDesc;

    @Column(name = "`STATE`")
    private String state;

    @Column(name = "`CREATE_DATE`")
    private Date createDate;

    @Column(name = "`MODIFIED_DATE`")
    private Date modifiedDate;

    /**
     * @return USER_ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * @return USER_TYPE
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * @param userType
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * @return USER_NAME
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * @return USER_CNNAME
     */
    public String getUserCnname() {
        return userCnname;
    }

    /**
     * @param userCnname
     */
    public void setUserCnname(String userCnname) {
        this.userCnname = userCnname == null ? null : userCnname.trim();
    }

    /**
     * @return PASSWORD
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * @return USER_DESC
     */
    public String getUserDesc() {
        return userDesc;
    }

    /**
     * @param userDesc
     */
    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc == null ? null : userDesc.trim();
    }

    /**
     * @return STATE
     */
    public String getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * @return CREATE_DATE
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return MODIFIED_DATE
     */
    public Date getModifiedDate() {
        return modifiedDate;
    }

    /**
     * @param modifiedDate
     */
    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }
}