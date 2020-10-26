package com.jk.controller;

import com.jk.entity.FacilityBean;
import com.jk.pojo.PageResult;
import com.jk.service.FacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FacilityController {
    @Autowired
    private FacilityService facilityService;
    @RequestMapping("/selfacility")
    public PageResult selfacility(Integer currPage, Integer pageSize, FacilityBean facilityBean){
        return facilityService.selFacility(currPage,pageSize,facilityBean);
    }
}
