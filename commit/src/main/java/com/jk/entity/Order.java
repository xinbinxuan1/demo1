package com.jk.entity;

import lombok.Data;

@Data
public class Order {
    private Integer roderId;
    private String roderDate;
    private String userCode;
    private Integer roderPrice;
    private String roderZhfs;
    private String roderDdly;
    private String roderDdzt;
}
