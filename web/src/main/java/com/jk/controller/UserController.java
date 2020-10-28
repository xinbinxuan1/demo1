package com.jk.controller;

import com.jk.entity.StaffBean;
import com.jk.pojo.PageResult;
import com.jk.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class UserController {

    @Autowired
    private Userservice userservice;

    @RequestMapping("/findPage")
    public PageResult findPage(Integer currPage,Integer pageSize){
        return userservice.findPage(currPage,pageSize);
    }

    @RequestMapping("/insertUser")
    public void insertUser(StaffBean staff){
        userservice.insertUser(staff);
    }

    @RequestMapping("/deleteUser")
    public void deleteUser(String[] id){
        userservice.deleteUser(id);
    }

    @RequestMapping("/huiUser")
    public StaffBean huiUser(Integer id){
        return userservice.huiUser(id);
    }

}
