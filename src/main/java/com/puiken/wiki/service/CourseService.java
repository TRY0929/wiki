package com.puiken.wiki.service;

import com.puiken.wiki.entity.Course;
import com.puiken.wiki.entity.CourseExample;
import com.puiken.wiki.mapper.CourseMapper;
import com.puiken.wiki.req.CourseReq;
import com.puiken.wiki.resp.CourseResp;
import com.puiken.wiki.util.CopyUtil;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    @Resource
    private CourseMapper courseMapper;

    public List<CourseResp> list(CourseReq req) {
        CourseExample courseExample = new CourseExample();
        CourseExample.Criteria criteria = courseExample.createCriteria();
        if (!ObjectUtils.isEmpty(req.getName())) {
            criteria.andNameLike("%" + req.getName() + "%");
        }
        List<Course> courseList = courseMapper.selectByExample(courseExample);

        List<CourseResp> respList = new ArrayList<>();

        respList = CopyUtil.copyList(courseList, CourseResp.class);
        return respList;
    }
}
