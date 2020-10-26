package com.jk.controller;

import com.jk.entity.TreeBean;
import com.jk.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TreeController {
    @Autowired
    private TreeService treeService;
    @RequestMapping("queryTree")

    public List<TreeBean> queryTree(){

        return treeService.queryTree();
    }

}
