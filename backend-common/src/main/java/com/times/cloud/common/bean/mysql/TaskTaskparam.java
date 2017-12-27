package com.times.cloud.common.bean.mysql;

import javax.persistence.*;

@Table(name = "`task_taskparam`")
public class TaskTaskparam {
    @Id
    @Column(name = "`ID`")
    private String id;

    @Column(name = "`TASK_ID`")
    private String taskId;

    @Column(name = "`TASK_PM_ID`")
    private String taskPmId;

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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
}