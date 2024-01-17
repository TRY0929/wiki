package com.puiken.wiki.controller;

import com.puiken.wiki.entity.Demo;
import com.puiken.wiki.req.EbookReq;
import com.puiken.wiki.resp.CommonResp;
import com.puiken.wiki.resp.EbookResp;
import com.puiken.wiki.service.DemoService;
import com.puiken.wiki.service.EbookService;
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
    private EbookService ebookService;

    @Value("${test.hello}")
    private String testProp;
    @GetMapping("/demo")
    public List<Demo> list() {
        return demoService.list();
    }

    @GetMapping("/ebook")
    public CommonResp<List<EbookResp>> getList(EbookReq req) {

        List<EbookResp> list = ebookService.list(req);
        CommonResp<List<EbookResp>> resp = new CommonResp<>();
        resp.setContent(list);
        return resp;
    }
}
