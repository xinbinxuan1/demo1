package com.jk.dao;

import com.jk.entity.UserSnameBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserSnameBeanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserSnameBean record);

    int insertSelective(UserSnameBean record);

    UserSnameBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserSnameBean record);

    int updateByPrimaryKey(UserSnameBean record);

    UserSnameBean seluser(@Param("name") String name);
}