package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SkipController {

    @RequestMapping("touser")
    public String touser(){
        return "user";
    }

    @RequestMapping("tofacility")
    public String tofacility(){
        return "facility";
    }
    @RequestMapping("tologin")
    public String tologin(){
        return "login";
    }
    @RequestMapping("toindex")
    public String toindex(){
        return "index";
    }

}
