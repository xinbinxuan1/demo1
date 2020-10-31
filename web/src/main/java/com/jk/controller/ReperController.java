package com.jk.controller;

import com.jk.pojo.PageResult;
import com.jk.service.ReperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reqer")
public class ReperController {

    @Autowired
    private ReperService reperService;

    public PageResult reperList(Integer currPage,Integer pageSize){
        return reperService.reperList(currPage,pageSize);
    }

}
