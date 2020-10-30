package com.jk.service;

import com.jk.entity.StaffBean;
import com.jk.entity.SysUser;
import com.jk.entity.Tree;
import com.jk.mapper.UserMapper;
import com.jk.pojo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public PageResult findPage(Integer currPage, Integer pageSize) {
        Long total = userMapper.findPagecount();
        List<StaffBean> list = userMapper.findPage(currPage, pageSize);
        Long totalPage = total % pageSize == 0 ? total / pageSize : (total / pageSize + 1);
        return new PageResult(total, list, currPage, pageSize, totalPage);
    }

    @Override
    public void insertUser(StaffBean staff) {
        if (staff.getId() == null) {
            userMapper.insertUser(staff);
        } else {
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

    @Override
    public SysUser selectUserInfoByCode(String userCode) {
        return userMapper.selectUserInfoByCode(userCode);
    }

    @Override
    public List<Tree> selectListTree(Integer userId) {
        Integer pid = 1;
        List<Tree> treeList = nodeList(pid, userId);
        return treeList;
    }

    @Override
    public List<String> selectPowerKeyList(Integer userId) {
        return userMapper.selectPowerKeyList(userId);
    }

    private List<Tree> nodeList(Integer pid, Integer userId) {
        List<Tree> treeList = userMapper.selectListTree(pid, userId);
        for (Tree tree :
                treeList) {
            List<Tree> nodeList = nodeList(tree.getId(), userId);
            if (nodeList == null || nodeList.size() <= 0) {
                tree.setSelectable(true);
                tree.setLeaf(true);
            } else {
                tree.setSelectable(false);
                tree.setNodes(nodeList);
            }
        }
        return treeList;
    }


}
