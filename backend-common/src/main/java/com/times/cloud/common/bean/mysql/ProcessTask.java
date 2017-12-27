package com.times.cloud.common.bean.mysql;

import javax.persistence.*;

@Table(name = "`process_task`")
public class ProcessTask {
    @Id
    @Column(name = "`ID`")
    private String id;

    @Column(name = "`PROCESS_ID`")
    private String processId;

    @Column(name = "`TASK_ID`")
    private String taskId;

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
}