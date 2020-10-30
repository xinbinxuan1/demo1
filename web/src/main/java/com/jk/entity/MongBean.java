package com.jk.entity;

import com.mongodb.client.model.Collation;
import lombok.Data;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;

@Data
@Document(collection="log")
public class MongBean {
    private String id;
    private String methodName;
    private String className;
    private String requestParam;
    private String responseParan;
}
