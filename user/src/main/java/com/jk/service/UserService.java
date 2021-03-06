package com.jk.service;


import com.jk.entity.StaffBean;
import com.jk.entity.SysUser;
import com.jk.entity.Tree;
import com.jk.pojo.PageResult;

import java.util.List;

public interface UserService {

    PageResult findPage(Integer currPage, Integer pageSize);

    void insertUser(StaffBean staff);

    void deleteUser(String[] id);

    StaffBean huiUser(Integer id);

    SysUser selectUserInfoByCode(String userCode);

    List<Tree> selectListTree(Integer userId);

    List<String> selectPowerKeyList(Integer userId);
}
