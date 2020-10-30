package com.jk.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RefreshScope
@Controller
@RequestMapping("/page")
public class SkipController {

    @RequestMapping("/touser")
    @RequiresPermissions("user:findPage")
    public String touser(){
        return "user";
    }

    @RequestMapping("/tofacility")
    @RequiresPermissions("goods:tofacility")
    public String tofacility(){
        return "facility";
    }

    @RequestMapping("/toLogin")
    public String tologin(){
        return "login";
    }
    @RequestMapping("/toindex")
    public String toindex(){
        return "index";
    }

    @RequestMapping("/toorder")
    public String toorder(){
        return "order";
    }

}
