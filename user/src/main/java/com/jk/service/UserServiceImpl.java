package com.jk.service;

import com.jk.entity.StaffBean;
import com.jk.mapper.UserMapper;
import com.jk.pojo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public PageResult findPage(Integer currPage, Integer pageSize) {
        Long total = userMapper.findPagecount();
        List<StaffBean> list = userMapper.findPage(currPage,pageSize);
        Long totalPage = total%pageSize == 0 ? total/pageSize : (total/pageSize + 1);
        return new PageResult(total, list, currPage, pageSize, totalPage);
    }

    @Override
    public void insertUser(StaffBean staff) {
        if (staff.getId()==null){
            userMapper.insertUser(staff);
        }else{
            userMapper.updateUser(staff);
        }
    }

    @Override
    public void deleteUser(String[] id) {
        userMapper.deleteUser(id);
    }

    @Override
    public StaffBean huiUser(Integer id) {
        return userMapper.huiUser(id);
    }
}
