package com.times.cloud.common.bean.mysql;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`task`")
public class Task {
    @Id
    @Column(name = "`TASK_ID`")
    private String taskId;

    @Column(name = "`TASK_TYPE`")
    private Integer taskType;

    @Column(name = "`TASK_NAME`")
    private String taskName;

    @Column(name = "`TASK_CNNAME`")
    private String taskCnname;

    @Column(name = "`TASK_DESC`")
    private String taskDesc;

    @Column(name = "`STATE`")
    private Integer state;

    @Column(name = "`IS_DEPLOY`")
    private Integer isDeploy;

    @Column(name = "`CREATE_DATE`")
    private Date createDate;

    @Column(name = "`MODIFIED_DATE`")
    private Date modifiedDate;

    @Column(name = "`LOG`")
    private String log;

    /**
     * @return TASK_ID
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * @param taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    /**
     * @return TASK_TYPE
     */
    public Integer getTaskType() {
        return taskType;
    }

    /**
     * @param taskType
     */
    public void setTaskType(Integer taskType) {
        this.taskType = taskType;
    }

    /**
     * @return TASK_NAME
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * @param taskName
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    /**
     * @return TASK_CNNAME
     */
    public String getTaskCnname() {
        return taskCnname;
    }

    /**
     * @param taskCnname
     */
    public void setTaskCnname(String taskCnname) {
        this.taskCnname = taskCnname == null ? null : taskCnname.trim();
    }

    /**
     * @return TASK_DESC
     */
    public String getTaskDesc() {
        return taskDesc;
    }

    /**
     * @param taskDesc
     */
    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc == null ? null : taskDesc.trim();
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
     * @return IS_DEPLOY
     */
    public Integer getIsDeploy() {
        return isDeploy;
    }

    /**
     * @param isDeploy
     */
    public void setIsDeploy(Integer isDeploy) {
        this.isDeploy = isDeploy;
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
     * @return LOG
     */
    public String getLog() {
        return log;
    }

    /**
     * @param log
     */
    public void setLog(String log) {
        this.log = log == null ? null : log.trim();
    }
}