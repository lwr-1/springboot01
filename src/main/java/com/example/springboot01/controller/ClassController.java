package com.example.springboot01.controller;

import com.alibaba.fastjson.JSON;
import com.example.springboot01.pojo.Class;
import com.example.springboot01.service.ClassService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ClassController {
    @Resource
    private ClassService classService;

    @RequestMapping("/index.html")
    public Object joinHtml(){
       return "index";
    }

    /**
     * 显示所有信息
     * @return
     */
    @RequestMapping("/index.do")
    @ResponseBody
    public Object showInfo(){
        List<Class> showAllInfo = classService.showInfo();
        return JSON.toJSONString(showAllInfo);
    }
}
