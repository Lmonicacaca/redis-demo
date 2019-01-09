package com.example.redisdemo.controller;

import com.example.redisdemo.domain.dto.TtradeFlowDto;
import com.example.redisdemo.domain.request.PageRequest;
import com.example.redisdemo.domain.response.PageResponse;
import com.example.redisdemo.service.PageTestService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MapStructController {

    @Autowired
    private PageTestService pageTestService;

    @RequestMapping("/toDto")
    @ResponseBody
    public PageResponse<TtradeFlowDto> toDto(@RequestBody PageRequest pageRequest){
        PageHelper.startPage(pageRequest.getPageNum(),pageRequest.getPageSize());
        List<TtradeFlowDto> ttradeFlowDtos = pageTestService.queryTradeFlow();
        PageResponse<TtradeFlowDto> ttradeFlowDtoPageResponse = new PageResponse<TtradeFlowDto>(ttradeFlowDtos.size(),ttradeFlowDtos);
        return ttradeFlowDtoPageResponse;
    }
}
