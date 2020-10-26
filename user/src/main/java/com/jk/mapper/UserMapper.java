package com.jk.mapper;

import com.jk.entity.StaffBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {


    Long findPagecount();

    List<StaffBean> findPage(@Param("currPage") Integer currPage,@Param("pageSize") Integer pageSize);
}
