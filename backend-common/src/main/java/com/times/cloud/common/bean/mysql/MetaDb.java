package com.times.cloud.common.bean.mysql;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`meta_db`")
public class MetaDb {
    @Id
    @Column(name = "`DB_ID`")
    private String dbId;

    @Column(name = "`DB_NAME`")
    private String dbName;

    @Column(name = "`DB_CNNAME`")
    private String dbCnname;

    @Column(name = "`DB_TYPE`")
    private Integer dbType;

    @Column(name = "`CREATE_DATE`")
    private Date createDate;

    @Column(name = "`MODIFIED_DATE`")
    private Date modifiedDate;

    @Column(name = "`DB_DESC`")
    private String dbDesc;

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
     * @return DB_NAME
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * @param dbName
     */
    public void setDbName(String dbName) {
        this.dbName = dbName == null ? null : dbName.trim();
    }

    /**
     * @return DB_CNNAME
     */
    public String getDbCnname() {
        return dbCnname;
    }

    /**
     * @param dbCnname
     */
    public void setDbCnname(String dbCnname) {
        this.dbCnname = dbCnname == null ? null : dbCnname.trim();
    }

    /**
     * @return DB_TYPE
     */
    public Integer getDbType() {
        return dbType;
    }

    /**
     * @param dbType
     */
    public void setDbType(Integer dbType) {
        this.dbType = dbType;
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
     * @return DB_DESC
     */
    public String getDbDesc() {
        return dbDesc;
    }

    /**
     * @param dbDesc
     */
    public void setDbDesc(String dbDesc) {
        this.dbDesc = dbDesc == null ? null : dbDesc.trim();
    }
}