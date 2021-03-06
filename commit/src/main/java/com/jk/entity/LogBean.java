package com.jk.entity;

import lombok.Data;
import lombok.ToString;

import java.lang.annotation.Documented;

@Data
@ToString
public class LogBean {
    private String id;
    private String methodName;
    private String className;
    private String requestParam;
    private String responseParan;
}
