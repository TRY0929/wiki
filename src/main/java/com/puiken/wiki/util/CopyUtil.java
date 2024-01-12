package com.puiken.wiki.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class CopyUtil {
    private static final Logger LOG = LoggerFactory.getLogger(CopyUtil.class);
    public static <T> T copy(Object source, Class<T> clazz) {
        if (source == null) {
            return null;
        }

        T obj = null;
        try {
            // clazz.newInstance() is deprecated since version 9
            obj = clazz.getDeclaredConstructor().newInstance();

        } catch (Exception e) {
            // Call to 'printStackTrace()' should probably be replaced with more robust logging
            // e.printStackTrace();
            LOG.info("There is some errors in copy");
            return null;
        }

        BeanUtils.copyProperties(source, obj);
        return obj;
    }

    public static <T> List<T> copyList(List source, Class<T> clazz) {
        List<T> list = new ArrayList<>();
        if (CollectionUtils.isEmpty(source)) {
            return list;
        }

        for(Object obj : source) {
            list.add(copy(obj, clazz));
        }

        return list;
    }

}
