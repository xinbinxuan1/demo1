package com.jk.service;

import com.jk.entity.FacilityBean;
import com.jk.entity.SysUser;
import com.jk.entity.TreeBean;
import com.jk.pojo.PageResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "node")
public interface FacilityService {
    @RequestMapping("selFacility")
    public PageResult selFacility(@RequestParam Integer currPage, @RequestParam Integer pageSize);

    @RequestMapping("queryTree")
    public List<TreeBean> queryTree();

    @RequestMapping("deleteAll")
    public void deleteAll(@RequestParam String[] ids);

    @RequestMapping("insertAll")
    public void insertAll(@RequestBody FacilityBean facilityBean);

    @RequestMapping("selfacilitybean")
    public FacilityBean selfacilitybean(@RequestParam Integer ids);

    @RequestMapping("seluser")
    public SysUser seluser(@RequestBody SysUser userSnameBean);
}
