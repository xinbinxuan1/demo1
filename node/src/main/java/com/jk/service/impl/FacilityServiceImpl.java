package com.jk.service.impl;

import com.jk.dao.FacilityBeanMapper;
import com.jk.entity.FacilityBean;
import com.jk.pojo.PageResult;
import com.jk.service.FacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityServiceImpl implements FacilityService {
    @Autowired
    private FacilityBeanMapper facilityBeanMapper;

    @Override
    public PageResult selFacility(Integer currPage, Integer pageSize) {

        Long total = facilityBeanMapper.count();
        List<FacilityBean> stafflist = facilityBeanMapper.findPage(currPage, pageSize);
        Long totalPage = total % pageSize == 0 ? total / pageSize : (total / pageSize + 1);
        return new PageResult(total, stafflist, currPage, pageSize, totalPage);
    }

    @Override
    public void deleteAll(String[] ids) {
        facilityBeanMapper.deleteAll(ids);
    }

    @Override
    public void insertAll(FacilityBean facility) {
        if(facility.getId()==null){
            facilityBeanMapper.insert(facility);
        }else {
            facilityBeanMapper.updateByPrimaryKey(facility);
        }

    }

    @Override
    public FacilityBean selfacilitybean(Integer ids) {
        return facilityBeanMapper.selectByPrimaryKey(ids);
    }

}
