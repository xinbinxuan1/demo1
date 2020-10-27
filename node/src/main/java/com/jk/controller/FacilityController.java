package com.jk.controller;

import com.jk.entity.FacilityBean;
import com.jk.pojo.PageResult;
import com.jk.service.FacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FacilityController {
    @Autowired
    private FacilityService facilityService;
@RequestMapping("selFacility")
    public PageResult selFacility(@RequestParam Integer currPage,@RequestParam Integer pageSize,@RequestBody FacilityBean facilityBean){
        return facilityService.selFacility(currPage,pageSize,facilityBean);
    }
}
