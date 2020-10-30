package com.jk.service.impl;


import com.jk.entity.MongBean;
import com.jk.pojo.PageResult;
import com.jk.service.MongService;
import org.apache.commons.codec.binary.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class MongServiceImpl implements MongService {

    @Autowired
    private MongoTemplate mongoTemplate;
    @Override
    public PageResult selLogMongod(Integer currPage, Integer pageSize, MongBean logBean) {
        Query query=new Query();
        if(logBean.getClassName()!=null && !"".equals(logBean.getClassName())){
            query.addCriteria(Criteria.where("className").regex(logBean.getClassName()));
        }

       Long total= mongoTemplate.count(query, MongBean.class);
        int start=(currPage-1)*pageSize;
        query.skip(start).limit(pageSize);
        List<MongBean> list=mongoTemplate.find(query,MongBean.class);
        Long totalPage = total % pageSize == 0 ? total / pageSize : (total / pageSize + 1);
        return new PageResult(total, list, currPage, pageSize, totalPage);
    }

    @Override
    public void deleteAll(String[] ids) {

        Query query=new Query();
        query.addCriteria(Criteria.where("id").in(ids));
        mongoTemplate.remove(query,MongBean.class);
    }
}
