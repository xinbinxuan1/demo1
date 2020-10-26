package com.jk.entity;

public class StaffBean {
    private Integer id;

    private String descriptionName;

    private String userName;

    private String cellPhone;

    private String nodePermissions;

    private String platePermissions;

    private String remark;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescriptionName() {
        return descriptionName;
    }

    public void setDescriptionName(String descriptionName) {
        this.descriptionName = descriptionName == null ? null : descriptionName.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone == null ? null : cellPhone.trim();
    }

    public String getNodePermissions() {
        return nodePermissions;
    }

    public void setNodePermissions(String nodePermissions) {
        this.nodePermissions = nodePermissions == null ? null : nodePermissions.trim();
    }

    public String getPlatePermissions() {
        return platePermissions;
    }

    public void setPlatePermissions(String platePermissions) {
        this.platePermissions = platePermissions == null ? null : platePermissions.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}