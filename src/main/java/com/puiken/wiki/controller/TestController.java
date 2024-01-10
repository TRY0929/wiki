package com.puiken.wiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class TestController {
    @GetMapping("/hello")
    public String hello() {
        return "hello, world!";
    }

    @PostMapping("hello")
    public String helloPost(String name) {
        return "Post name: " + name;
    }
}