package com.jk.service;


import com.jk.entity.StaffBean;
import com.jk.pojo.PageResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "user")
public interface Userservice {

    @RequestMapping("/findPage")
    public PageResult findPage(@RequestParam Integer currPage,@RequestParam Integer pageSize);

    @RequestMapping("/insertUser")
    public void insertUser(@RequestBody StaffBean staff);

    @RequestMapping("/deleteUser")
    public void deleteUser(@RequestBody String[] id);

    @RequestMapping("/huiUser")
    public StaffBean huiUser(@RequestParam Integer id);
}
