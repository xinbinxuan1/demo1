package com.jk.service.impl;

import com.jk.dao.TreeMapper;
import com.jk.entity.TreeBean;
import com.jk.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreeServiceImpl implements TreeService {
    @Autowired
    private TreeMapper treeMapper;
    @Override
    public List<TreeBean> queryTree() {
        int pid=0;
        List<TreeBean> list = getfind(pid);
        return list;
    }

    private List<TreeBean> getfind(int pid) {
        List<TreeBean> list=treeMapper.findetree(pid);
        for (TreeBean treeBean:list) {
            Integer id=treeBean.getId();
            List<TreeBean> list1= getfind(id);

            if (list1!=null && list1.size()>0) {
                treeBean.setNodes(list1);
                treeBean.setLeaf(true);
                treeBean.setSelectable(false);
            }else{
                treeBean.setLeaf(false);
                treeBean.setSelectable(true);
            }
        }
        return list;
    }
}
