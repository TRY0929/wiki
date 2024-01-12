package com.puiken.wiki.service;

import com.puiken.wiki.entity.Course;
import com.puiken.wiki.mapper.CourseMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Resource
    private CourseMapper courseMapper;

    public List<Course> list() {
        return courseMapper.selectByExample(null);
    }
}
