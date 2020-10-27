package com.jk.service.impl;

import com.jk.dao.FacilityBeanMapper;
import com.jk.entity.FacilityBean;
import com.jk.pojo.PageResult;
import com.jk.service.FacilityService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityServiceImpl implements FacilityService {
    @Autowired
    private FacilityBeanMapper facilityBeanMapper;

    @Override
    public PageResult selFacility(Integer currPage, Integer pageSize, FacilityBean facilityBean) {

        Long total = facilityBeanMapper.count(facilityBean);
        List<FacilityBean> stafflist = facilityBeanMapper.findPage(currPage, pageSize, facilityBean);
        Long totalPage = total % pageSize == 0 ? total / pageSize : (total / pageSize + 1);
        return new PageResult(total, stafflist, currPage, pageSize, totalPage);
    }

}
