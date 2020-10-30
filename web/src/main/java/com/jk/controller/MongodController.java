package com.jk.controller;

import com.jk.entity.LogBean;
import com.jk.entity.MongBean;
import com.jk.pojo.PageResult;
import com.jk.service.MongService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MongodController {
    @Autowired
    private MongService mongService;

    @RequestMapping("selLogMongod")
    public PageResult selLogMongod(Integer currPage, Integer pageSize, MongBean logBean){
        return mongService.selLogMongod(currPage,pageSize,logBean);
    }
    @RequestMapping("deleteAww")
    @RequiresPermissions("mongod:deleteAww")
    public void deleteAll(String[] ids){
        mongService.deleteAll(ids);
    }
}

