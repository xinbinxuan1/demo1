package com.jk.service;

import com.jk.entity.FacilityBean;
import com.jk.entity.UserSnameBean;
import com.jk.pojo.PageResult;

public interface FacilityService {

    PageResult selFacility(Integer currPage, Integer pageSize);

    void deleteAll(String[] ids);

    void insertAll(FacilityBean facilityBean);

    FacilityBean selfacilitybean(Integer ids);


}
