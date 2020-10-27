package com.jk.dao;

import com.jk.entity.FacilityBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FacilityBeanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FacilityBean record);

    int insertSelective(FacilityBean record);

    FacilityBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FacilityBean record);

    int updateByPrimaryKey(FacilityBean record);

    Long count();

    List<FacilityBean> findPage(@Param("currPage") Integer currPage,@Param("pageSize") Integer pageSize);

    void deleteAll(String[] ids);
}