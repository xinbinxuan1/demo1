package com.jk.service;


import com.jk.pojo.PageResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "user")
public interface Userservice {

    @RequestMapping("/findPage")
    public PageResult findPage(@RequestParam Integer currPage,@RequestParam Integer pageSize);
}
