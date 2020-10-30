package com.jk.controller;

import com.jk.entity.FacilityBean;
import com.jk.entity.SysUser;
import com.jk.entity.TreeBean;
import com.jk.pojo.PageResult;
import com.jk.service.FacilityService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RefreshScope
@RestController
public class FacilityController {
    @Autowired
    private FacilityService facilityService;

    @RequestMapping("/selFacility")
    public PageResult selfacility(Integer currPage, Integer pageSize) {
        return facilityService.selFacility(currPage, pageSize);
    }

    @RequestMapping("/deleteAll")
    @RequiresPermissions("goods:deleteAll")
    public void deleteAll(String[] ids) {
        facilityService.deleteAll(ids);
    }

    @RequestMapping("/insertAll")
    @RequiresPermissions("goods:insertAll")
    public void insertAll(FacilityBean facilityBean) {
        facilityService.insertAll(facilityBean);
    }

    @RequestMapping("/selfacilityId")
    @RequiresPermissions("goods:selfacilityId")
    public FacilityBean selfacilityId(Integer ids) {
        return facilityService.selfacilitybean(ids);
    }
}
