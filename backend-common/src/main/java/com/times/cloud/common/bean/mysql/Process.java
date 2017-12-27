package com.times.cloud.common.bean.mysql;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`process`")
public class Process {
    @Id
    @Column(name = "`PROCESS_ID`")
    private String processId;

    @Column(name = "`PROCESS_NAME`")
    private String processName;

    @Column(name = "`PROCESS_CNNAME`")
    private String processCnname;

    @Column(name = "`PROCESS_DESC`")
    private String processDesc;

    @Column(name = "`LAST_TIME`")
    private Date lastTime;

    @Column(name = "`CREATE_DATE`")
    private Date createDate;

    @Column(name = "`MODIFIED_DATE`")
    private Date modifiedDate;

    @Column(name = "`STATE`")
    private Integer state;

    @Column(name = "`JSON_STR`")
    private String jsonStr;

    /**
     * @return PROCESS_ID
     */
    public String getProcessId() {
        return processId;
    }

    /**
     * @param processId
     */
    public void setProcessId(String processId) {
        this.processId = processId == null ? null : processId.trim();
    }

    /**
     * @return PROCESS_NAME
     */
    public String getProcessName() {
        return processName;
    }

    /**
     * @param processName
     */
    public void setProcessName(String processName) {
        this.processName = processName == null ? null : processName.trim();
    }

    /**
     * @return PROCESS_CNNAME
     */
    public String getProcessCnname() {
        return processCnname;
    }

    /**
     * @param processCnname
     */
    public void setProcessCnname(String processCnname) {
        this.processCnname = processCnname == null ? null : processCnname.trim();
    }

    /**
     * @return PROCESS_DESC
     */
    public String getProcessDesc() {
        return processDesc;
    }

    /**
     * @param processDesc
     */
    public void setProcessDesc(String processDesc) {
        this.processDesc = processDesc == null ? null : processDesc.trim();
    }

    /**
     * @return LAST_TIME
     */
    public Date getLastTime() {
        return lastTime;
    }

    /**
     * @param lastTime
     */
    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
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

    /**
     * @return STATE
     */
    public Integer getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * @return JSON_STR
     */
    public String getJsonStr() {
        return jsonStr;
    }

    /**
     * @param jsonStr
     */
    public void setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr == null ? null : jsonStr.trim();
    }
}