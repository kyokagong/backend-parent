package com.times.cloud.common.bean.mysql;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`meta_table`")
public class MetaTable {
    @Id
    @Column(name = "`TABLE_ID`")
    private String tableId;

    @Column(name = "`TABLE_NAME`")
    private String tableName;

    @Column(name = "`TABLE_CNNAME`")
    private String tableCnname;

    @Column(name = "`TABLE_TYPE`")
    private Integer tableType;

    @Column(name = "`CREATE_DATE`")
    private Date createDate;

    @Column(name = "`MODIFIED_DATE`")
    private Date modifiedDate;

    @Column(name = "`TABLE_DESC`")
    private String tableDesc;

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
     * @return TABLE_NAME
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * @param tableName
     */
    public void setTableName(String tableName) {
        this.tableName = tableName == null ? null : tableName.trim();
    }

    /**
     * @return TABLE_CNNAME
     */
    public String getTableCnname() {
        return tableCnname;
    }

    /**
     * @param tableCnname
     */
    public void setTableCnname(String tableCnname) {
        this.tableCnname = tableCnname == null ? null : tableCnname.trim();
    }

    /**
     * @return TABLE_TYPE
     */
    public Integer getTableType() {
        return tableType;
    }

    /**
     * @param tableType
     */
    public void setTableType(Integer tableType) {
        this.tableType = tableType;
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
     * @return TABLE_DESC
     */
    public String getTableDesc() {
        return tableDesc;
    }

    /**
     * @param tableDesc
     */
    public void setTableDesc(String tableDesc) {
        this.tableDesc = tableDesc == null ? null : tableDesc.trim();
    }
}