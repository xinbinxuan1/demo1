package com.jk.dao;

import com.jk.entity.TreeBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TreeMapper {

    List<TreeBean> findetree(int pid);
}
