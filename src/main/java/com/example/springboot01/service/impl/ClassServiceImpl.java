package com.example.springboot01.service.impl;

import com.example.springboot01.dao.ClassMapper;
import com.example.springboot01.pojo.Class;
import com.example.springboot01.service.ClassService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ClassServiceImpl implements ClassService {
    @Resource
    private ClassMapper classMapper;
    @Override
    public List<Class> showInfo() {
        return classMapper.showInfo();
    }
}
