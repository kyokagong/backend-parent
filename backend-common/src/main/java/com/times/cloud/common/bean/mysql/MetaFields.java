package com.times.cloud.common.bean.mysql;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`meta_fields`")
public class MetaFields {
    @Id
    @Column(name = "`FIELD_ID`")
    private String fieldId;

    @Column(name = "`FIELD_NAME`")
    private String fieldName;

    @Column(name = "`FIELD_CNNAME`")
    private String fieldCnname;

    @Column(name = "`FIELD_TYPE`")
    private Integer fieldType;

    @Column(name = "`CREATE_DATE`")
    private Date createDate;

    @Column(name = "`MODIFIED_DATE`")
    private Date modifiedDate;

    @Column(name = "`FIELD_DESC`")
    private String fieldDesc;

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

    /**
     * @return FIELD_NAME
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * @param fieldName
     */
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName == null ? null : fieldName.trim();
    }

    /**
     * @return FIELD_CNNAME
     */
    public String getFieldCnname() {
        return fieldCnname;
    }

    /**
     * @param fieldCnname
     */
    public void setFieldCnname(String fieldCnname) {
        this.fieldCnname = fieldCnname == null ? null : fieldCnname.trim();
    }

    /**
     * @return FIELD_TYPE
     */
    public Integer getFieldType() {
        return fieldType;
    }

    /**
     * @param fieldType
     */
    public void setFieldType(Integer fieldType) {
        this.fieldType = fieldType;
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
     * @return FIELD_DESC
     */
    public String getFieldDesc() {
        return fieldDesc;
    }

    /**
     * @param fieldDesc
     */
    public void setFieldDesc(String fieldDesc) {
        this.fieldDesc = fieldDesc == null ? null : fieldDesc.trim();
    }
}