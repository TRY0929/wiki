package com.puiken.wiki.controller;

import com.puiken.wiki.entity.Test;
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

    @Value("${test.hello}")
    private String testProp;
    @GetMapping("/hello")
    public String hello() {
        return "hello, world!3";
    }

    @PostMapping("/hello")
    public String helloPost(String name) {
        return "Post name: " + testProp;
    }

    @GetMapping("/test/list")
    public List<Test> list() {
        return testService.list();
    }
}
