package com.jk.service;


import com.jk.pojo.PageResult;

public interface UserService {

    PageResult findPage(Integer currPage, Integer pageSize);
}
