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
    public PageResult selFacility(@RequestParam Integer currPage, @RequestParam Integer pageSize) {
        return facilityService.selFacility(currPage, pageSize);
    }

    @RequestMapping("deleteAll")
    public void deleteAll(@RequestParam String[] ids) {
        facilityService.deleteAll(ids);
    }

    @RequestMapping("insertAll")
    public void insertAll(@RequestBody FacilityBean facilityBean) {
        facilityService.insertAll(facilityBean);
    }

    @RequestMapping("selfacilitybean")
    public FacilityBean selfacilitybean(@RequestParam Integer ids) {
        return facilityService.selfacilitybean(ids);
    }

}
