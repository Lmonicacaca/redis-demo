package com.example.redisdemo.controller;

import com.example.redisdemo.domain.entity.PageTest;
import com.example.redisdemo.domain.entity.RBillStages;
import com.example.redisdemo.domain.request.PageRequest;
import com.example.redisdemo.domain.response.PageResponse;
import com.example.redisdemo.service.PageTestService;
import com.example.redisdemo.util.RequestUtil;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class PageHelpController {

    @Autowired
    private PageTestService pageTestService;

    @RequestMapping("/toPage")
    @ResponseBody
    public Object toPage(@RequestBody PageRequest pageRequest){
        PageHelper.startPage(pageRequest.getPageNum(),pageRequest.getPageSize());
        List<PageTest> pageTestList = pageTestService.queryAll();
        PageResponse<PageTest> pageInfo = new PageResponse<PageTest>(pageTestList.size(),pageTestList);
        return  pageInfo;
    }

    @RequestMapping("/pageMap")
    @ResponseBody
    public Object pageMap(@RequestBody PageRequest pageRequest){
        PageHelper.startPage(pageRequest.getPageNum(),pageRequest.getPageSize());
        List<Map<String, Object>> queryMap = pageTestService.queryMap();
        PageResponse<Map<String,Object>> returnMap = new PageResponse<Map<String, Object>>(queryMap.size(),queryMap);
        return returnMap;
    }
    @RequestMapping("/billStagesQuery")
    @ResponseBody
    public Object billStagesQuery(@RequestBody PageRequest pageRequest){
        PageHelper.startPage(pageRequest.getPageNum(),pageRequest.getPageSize());
        List<RBillStages> queryMap = pageTestService.queryBillStages();
        PageResponse<RBillStages> returnMap = new PageResponse<RBillStages>(queryMap.size(),queryMap);
        return returnMap;
    }
    @RequestMapping("/billStagesDeleteBatch")
    @ResponseBody
    public Object billStagesDeleteBatch(HttpServletRequest request){
        Map<String, String[]> parameterMap = request.getParameterMap();
        Map<String,Object> map = new HashMap<String, Object>();
        map = RequestUtil.paramMap(map,parameterMap);
        int result = pageTestService.deleteBatchBillStages(map);
        return result;
    }
}
