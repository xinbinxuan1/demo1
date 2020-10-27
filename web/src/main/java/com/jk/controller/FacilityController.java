package com.jk.controller;

import com.jk.entity.FacilityBean;
import com.jk.entity.TreeBean;
import com.jk.pojo.PageResult;
import com.jk.service.FacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FacilityController {
    @Autowired
    private FacilityService facilityService;
    @RequestMapping("/selFacility")
    public PageResult selfacility(Integer currPage,Integer pageSize){
        System.out.println(currPage);
        System.out.println(pageSize);
        return facilityService.selFacility(currPage,pageSize);
    }
    @RequestMapping("/seltree")
    public List<TreeBean> seltree(){
        return facilityService.queryTree();
    }
    @RequestMapping("/deleteAll")
    public void deleteAll(String[] ids){
        facilityService.deleteAll(ids);
    }
    @RequestMapping("/insertAll")
    public void insertAll(FacilityBean facilityBean){
        facilityService.insertAll(facilityBean);
    }
    @RequestMapping("/selfacilityId")
    public FacilityBean selfacilityId(Integer ids){
        return facilityService.selfacilitybean(ids);
    }
}
