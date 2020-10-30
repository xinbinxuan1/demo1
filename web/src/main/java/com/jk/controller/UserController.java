package com.jk.controller;

import com.jk.entity.StaffBean;
import com.jk.entity.SysUser;
import com.jk.entity.Tree;
import com.jk.pojo.PageResult;
import com.jk.service.Userservice;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RefreshScope
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private Userservice userservice;

    @RequestMapping("/findPage")
    public PageResult findPage(Integer currPage, Integer pageSize) {
        return userservice.findPage(currPage, pageSize);
    }

    @RequestMapping("/insertUser")
    @RequiresPermissions("user:insertUser")
    public void insertUser(StaffBean staff) {
        userservice.insertUser(staff);
    }

    @RequestMapping("/deleteUser")
    @RequiresPermissions("user:deleteUser")
    public void deleteUser(String[] id) {
        userservice.deleteUser(id);
    }

    @RequestMapping("/huiUser")
    @RequiresPermissions("user:huiUser")
    public StaffBean huiUser(Integer id) {
        return userservice.huiUser(id);
    }

    @RequestMapping("/login")
    public String login(SysUser user) {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken upt = new UsernamePasswordToken(user.getUsercode(), user.getPassword());
        try {
            // 不抛异常代表登录成功
            subject.login(upt);
            return "登录成功";
        } catch (UnknownAccountException uae) {
            return "账号不存在";
        } catch (IncorrectCredentialsException ice) {
            return "密码错误";
        } catch (AuthenticationException ae) {
            return "登录失败，网络错误";
        }
    }

    @RequestMapping("/selectListTree")
    public List<Tree> selectListTree() {
        SysUser user = (SysUser) SecurityUtils.getSubject().getPrincipal();
        return userservice.selectListTree(user.getId());
    }
}
