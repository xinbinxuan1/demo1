package com.jk.service;

import com.jk.entity.FacilityBean;
import com.jk.pojo.PageResult;

public interface FacilityService {
    PageResult selFacility(Integer currPage, Integer pageSize, FacilityBean facilityBean);
}
