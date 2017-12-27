package com.times.cloud.common.bean.mysql;

import javax.persistence.*;

@Table(name = "`db_table`")
public class DbTable {
    @Id
    @Column(name = "`ID`")
    private String id;

    @Column(name = "`DB_ID`")
    private String dbId;

    @Column(name = "`TABLE_ID`")
    private String tableId;

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
     * @return DB_ID
     */
    public String getDbId() {
        return dbId;
    }

    /**
     * @param dbId
     */
    public void setDbId(String dbId) {
        this.dbId = dbId == null ? null : dbId.trim();
    }

    /**
     * @return TABLE_ID
     */
    public String getTableId() {
        return tableId;
    }

    /**
     * @param tableId
     */
    public void setTableId(String tableId) {
        this.tableId = tableId == null ? null : tableId.trim();
    }
}