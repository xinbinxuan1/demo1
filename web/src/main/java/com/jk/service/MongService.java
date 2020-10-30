package com.jk.service;

import com.jk.entity.LogBean;
import com.jk.entity.MongBean;
import com.jk.pojo.PageResult;

public interface MongService {
    PageResult selLogMongod(Integer currPage, Integer pageSize, MongBean logBean);

    void deleteAll(String[] ids);
}
