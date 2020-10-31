package com.jk.service;


import com.jk.pojo.PageResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface ReperService {

    @RequestMapping("/reperList")
    PageResult reperList(@RequestParam Integer currPage,@RequestParam Integer pageSize);
}
