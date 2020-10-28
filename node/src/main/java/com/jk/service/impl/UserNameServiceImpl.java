package com.jk.service.impl;

import com.jk.dao.UserSnameBeanMapper;
import com.jk.entity.UserSnameBean;
import com.jk.service.UserNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserNameServiceImpl implements UserNameService {
    @Autowired
    private UserSnameBeanMapper userSnameBeanMapper;

    @Override
    public UserSnameBean seluser(UserSnameBean userSnameBean) {
        return userSnameBeanMapper.seluser(userSnameBean.getName());
    }
}
