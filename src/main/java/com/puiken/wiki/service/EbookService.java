package com.puiken.wiki.service;

import com.puiken.wiki.entity.Ebook;
import com.puiken.wiki.entity.EbookExample;
import com.puiken.wiki.mapper.EbookMapper;
import com.puiken.wiki.req.EbookReq;
import com.puiken.wiki.resp.EbookResp;
import com.puiken.wiki.util.CopyUtil;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req) {
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        if (!ObjectUtils.isEmpty(req.getName())) {
            criteria.andNameLike("%" + req.getName() + "%");
        }
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

        List<EbookResp> respList = new ArrayList<>();

        respList = CopyUtil.copyList(ebookList, EbookResp.class);
        return respList;
    }
}
