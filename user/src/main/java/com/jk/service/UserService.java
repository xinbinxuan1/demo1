package com.jk.service;


import com.jk.entity.StaffBean;
import com.jk.pojo.PageResult;

public interface UserService {

    PageResult findPage(Integer currPage, Integer pageSize);

    void insertUser(StaffBean staff);

    void deleteUser(String[] id);

    StaffBean huiUser(Integer id);
}
