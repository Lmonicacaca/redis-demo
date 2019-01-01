package com.example.redisdemo.controller;

import com.example.redisdemo.domain.entity.PageTest;
import com.example.redisdemo.domain.request.PageRequest;
import com.example.redisdemo.domain.response.PageResponse;
import com.example.redisdemo.service.PageTestService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PageHelpController {

    @Autowired
    private PageTestService pageTestService;

    @RequestMapping("/toPage")
    @ResponseBody
    public Object toPage(@RequestBody PageRequest pageRequest){
        PageHelper.startPage(pageRequest.getPageNum(),pageRequest.getPageSize());
        List<PageTest> pageTestList = pageTestService.queryAll();
        PageResponse<PageTest> pageInfo = new PageResponse<>(pageTestList.size(),pageTestList);
        return  pageInfo;
    }
}
