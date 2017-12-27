package com.times.cloud.common.bean.mysql;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`task_param`")
public class TaskParam {
    @Id
    @Column(name = "`TASK_PM_ID`")
    private String taskPmId;

    @Column(name = "`PARAM_CODE`")
    private String paramCode;

    @Column(name = "`PARAM_VALUE`")
    private String paramValue;

    @Column(name = "`PARAM_CNNAME`")
    private String paramCnname;

    @Column(name = "`DESCRIPTION`")
    private String description;

    @Column(name = "`CREATE_DATE`")
    private Date createDate;

    @Column(name = "`MODIFIED_DATE`")
    private Date modifiedDate;

    /**
     * @return TASK_PM_ID
     */
    public String getTaskPmId() {
        return taskPmId;
    }

    /**
     * @param taskPmId
     */
    public void setTaskPmId(String taskPmId) {
        this.taskPmId = taskPmId == null ? null : taskPmId.trim();
    }

    /**
     * @return PARAM_CODE
     */
    public String getParamCode() {
        return paramCode;
    }

    /**
     * @param paramCode
     */
    public void setParamCode(String paramCode) {
        this.paramCode = paramCode == null ? null : paramCode.trim();
    }

    /**
     * @return PARAM_VALUE
     */
    public String getParamValue() {
        return paramValue;
    }

    /**
     * @param paramValue
     */
    public void setParamValue(String paramValue) {
        this.paramValue = paramValue == null ? null : paramValue.trim();
    }

    /**
     * @return PARAM_CNNAME
     */
    public String getParamCnname() {
        return paramCnname;
    }

    /**
     * @param paramCnname
     */
    public void setParamCnname(String paramCnname) {
        this.paramCnname = paramCnname == null ? null : paramCnname.trim();
    }

    /**
     * @return DESCRIPTION
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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