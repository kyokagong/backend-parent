package com.times.cloud.common.bean.mysql;

import javax.persistence.*;

@Table(name = "`table_fields`")
public class TableFields {
    @Id
    @Column(name = "`ID`")
    private String id;

    @Column(name = "`TABLE_ID`")
    private String tableId;

    @Column(name = "`FIELD_ID`")
    private String fieldId;

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

    /**
     * @return FIELD_ID
     */
    public String getFieldId() {
        return fieldId;
    }

    /**
     * @param fieldId
     */
    public void setFieldId(String fieldId) {
        this.fieldId = fieldId == null ? null : fieldId.trim();
    }
}