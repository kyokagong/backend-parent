package com.times.cloud.common.bean.mysql;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`task_relation`")
public class TaskRelation {
    @Id
    @Column(name = "`TASK_REL_ID`")
    private String taskRelId;

    @Column(name = "`TASK_ID`")
    private String taskId;

    @Column(name = "`TO_TASK_ID`")
    private String toTaskId;

    @Column(name = "`RELATION_TYPE`")
    private Integer relationType;

    @Column(name = "`CREATE_DATE`")
    private Date createDate;

    @Column(name = "`MODIFIED_DATE`")
    private Date modifiedDate;

    /**
     * @return TASK_REL_ID
     */
    public String getTaskRelId() {
        return taskRelId;
    }

    /**
     * @param taskRelId
     */
    public void setTaskRelId(String taskRelId) {
        this.taskRelId = taskRelId == null ? null : taskRelId.trim();
    }

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
     * @return TO_TASK_ID
     */
    public String getToTaskId() {
        return toTaskId;
    }

    /**
     * @param toTaskId
     */
    public void setToTaskId(String toTaskId) {
        this.toTaskId = toTaskId == null ? null : toTaskId.trim();
    }

    /**
     * @return RELATION_TYPE
     */
    public Integer getRelationType() {
        return relationType;
    }

    /**
     * @param relationType
     */
    public void setRelationType(Integer relationType) {
        this.relationType = relationType;
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