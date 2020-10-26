package com.jk.entity;


import lombok.Data;

@Data
public class StaffBean {
    private Integer id;

    private String descriptionName;

    private String userName;

    private String cellPhone;

    private String nodePermissions;

    private String platePermissions;

    private String remark;

    private Integer status;

}