package com.jk.controller;

import com.jk.entity.UserSnameBean;
import com.jk.service.UserNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserNameController {
    @Autowired
    private UserNameService userNameService;
    @RequestMapping("seluser")
    public UserSnameBean seluser(@RequestBody UserSnameBean userSnameBean){
        return userNameService.seluser(userSnameBean);
    }
}
