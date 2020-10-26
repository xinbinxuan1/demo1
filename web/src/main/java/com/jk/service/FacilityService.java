package com.jk.service;

import com.jk.entity.FacilityBean;
import com.jk.entity.TreeBean;
import com.jk.pojo.PageResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value="node")
public interface FacilityService {
    @RequestMapping("selFacility")
    public PageResult selFacility(@RequestParam Integer currPage, @RequestParam Integer pageSize, @RequestParam FacilityBean facilityBean);
    @RequestMapping("queryTree")
    public List<TreeBean> queryTree();
}