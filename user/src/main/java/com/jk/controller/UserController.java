package com.jk.controller;

import com.jk.entity.StaffBean;
import com.jk.pojo.PageResult;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findPage")
    public PageResult findPage(@RequestParam Integer currPage,@RequestParam Integer pageSize){
        return userService.findPage(currPage,pageSize);
    }

    @RequestMapping("/insertUser")
    public void insertUser(@RequestBody StaffBean staff){
        userService.insertUser(staff);
    }

    @RequestMapping("/deleteUser")
    public void deleteUser(@RequestBody String[] id){
        userService.deleteUser(id);
    }

    @RequestMapping("/huiUser")
    public StaffBean huiUser(@RequestParam Integer id){
        return userService.huiUser(id);
    }
}
