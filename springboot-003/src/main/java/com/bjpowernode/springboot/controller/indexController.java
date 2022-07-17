package com.bjpowernode.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class indexController {
    @RequestMapping(value = "/say")
    @ResponseBody
    public String say() {
        return "hello say";
    }

    @RequestMapping(value = "/map")
    @ResponseBody
    public Map<String, Object> mapValue() {
        Map<String, Object> retMap = new HashMap<String, Object>();
        retMap.put("message", "springboot project");
        return retMap;
    }
}
