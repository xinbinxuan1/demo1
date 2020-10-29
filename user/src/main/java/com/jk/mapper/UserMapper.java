package com.jk.mapper;

import com.jk.entity.StaffBean;
import com.jk.entity.SysUser;
import com.jk.entity.Tree;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {


    Long findPagecount();

    List<StaffBean> findPage(@Param("currPage") Integer currPage,@Param("pageSize") Integer pageSize);

    void insertUser(StaffBean staff);

    void deleteUser(String[] id);

    StaffBean huiUser(Integer id);

    void updateUser(StaffBean staff);

    SysUser selectUserInfoByCode(String userCode);

    List<Tree> selectListTree(@Param("pid") Integer pid,@Param("userId") Integer userId);

    List<String> selectPowerKeyList(Integer userId);
}
