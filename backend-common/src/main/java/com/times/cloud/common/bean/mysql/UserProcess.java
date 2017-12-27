package com.times.cloud.common.bean.mysql;

import javax.persistence.*;

@Table(name = "`user_process`")
public class UserProcess {
    @Id
    @Column(name = "`ID`")
    private String id;

    @Column(name = "`USER_ID`")
    private String userId;

    @Column(name = "`PROCESS_ID`")
    private String processId;

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
}