package com.puiken.wiki.controller;

import com.puiken.wiki.entity.Demo;
import com.puiken.wiki.req.CourseReq;
import com.puiken.wiki.resp.CommonResp;
import com.puiken.wiki.resp.CourseResp;
import com.puiken.wiki.service.CourseService;
import com.puiken.wiki.service.DemoService;
import com.puiken.wiki.service.TestService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Resource
    private TestService testService;

    @Resource
    private DemoService demoService;

    @Resource
    private CourseService courseService;

    @Value("${test.hello}")
    private String testProp;
    @GetMapping("/demo")
    public List<Demo> list() {
        return demoService.list();
    }

    @GetMapping("/course")
    public CommonResp<List<CourseResp>> getList(CourseReq req) {

        List<CourseResp> list = courseService.list(req);
        CommonResp<List<CourseResp>> resp = new CommonResp<>();
        resp.setContent(list);
        return resp;
    }
}
