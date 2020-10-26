package com.jk.controller;

import com.jk.pojo.PageResult;
import com.jk.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private Userservice userservice;

    @RequestMapping("/findPage")
    public PageResult findPage(Integer currPage,Integer pageSize){
        return userservice.findPage(currPage,pageSize);
    }


}
