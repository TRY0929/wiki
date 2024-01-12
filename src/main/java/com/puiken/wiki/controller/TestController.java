package com.puiken.wiki.controller;

import com.puiken.wiki.entity.Demo;
import com.puiken.wiki.service.DemoService;
import com.puiken.wiki.service.TestService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Resource
    private TestService testService;

    @Resource
    private DemoService demoService;

    @Value("${test.hello}")
    private String testProp;
    @GetMapping("/demo")
    public List<Demo> list() {
        return demoService.list();
    }

    @PostMapping("/hello")
    public String helloPost(String name) {
        return "Post name: " + testProp;
    }
}
