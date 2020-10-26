package com.jk.controller;

import com.jk.pojo.PageResult;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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


}
