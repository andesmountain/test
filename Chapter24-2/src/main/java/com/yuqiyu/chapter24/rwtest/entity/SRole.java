package com.yuqiyu.chapter24.rwtest.entity;

import javax.persistence.*;
import java.util.Date;

@Table(name = "S_ROLE")
public class SRole {
    @Id
    @Column(name = "ROLE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "select SQ_S_ROLE.nextval from dual")
    private Long roleId;

    @Column(name = "ROLE_CODE")
    private String roleCode;

    @Column(name = "ROLE_NAME")
    private String roleName;

    @Column(name = "ROLE_DESC")
    private String roleDesc;

    @Column(name = "ROLE_TYPE")
    private String roleType;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    @Column(name = "CREATOR")
    private String creator;

    @Column(name = "UPDATOR")
    private String updator;
    
    @Column(name = "MANAGE_PROVINCE")
    private String manageProvince;

    @Column(name = "MANAGE_CITY")
    private String manageCity;

    @Column(name = "MANAGE_COUNTY")
    private String manageCounty;

    /**
     * @return ROLE_ID
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * @return ROLE_CODE
     */
    public String getRoleCode() {
        return roleCode;
    }

    /**
     * @param roleCode
     */
    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    /**
     * @return ROLE_NAME
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * @param roleName
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * @return ROLE_DESC
     */
    public String getRoleDesc() {
        return roleDesc;
    }

    /**
     * @param roleDesc
     */
    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    /**
     * @return ROLE_TYPE
     */
    public String getRoleType() {
        return roleType;
    }

    /**
     * @param roleType
     */
    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    /**
     * @return CREATE_TIME
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return UPDATE_TIME
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return CREATOR
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @param creator
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * @return UPDATOR
     */
    public String getUpdator() {
        return updator;
    }

    /**
     * @param updator
     */
    public void setUpdator(String updator) {
        this.updator = updator;
    }
    

    /**
     * @return MANAGE_PROVINCE
     */
    public String getManageProvince() {
        return manageProvince;
    }

    /**
     * @param manageProvince
     */
    public void setManageProvince(String manageProvince) {
        this.manageProvince = manageProvince;
    }

    /**
     * @return MANAGE_CITY
     */
    public String getManageCity() {
        return manageCity;
    }

    /**
     * @param manageCity
     */
    public void setManageCity(String manageCity) {
        this.manageCity = manageCity;
    }

    /**
     * @return MANAGE_COUNTY
     */
    public String getManageCounty() {
        return manageCounty;
    }

    /**
     * @param manageCounty
     */
    public void setManageCounty(String manageCounty) {
        this.manageCounty = manageCounty;
    }
}