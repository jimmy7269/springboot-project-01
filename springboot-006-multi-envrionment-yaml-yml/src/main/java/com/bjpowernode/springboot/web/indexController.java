package com.bjpowernode.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

@Controller
public class indexController {
    @RequestMapping(value = "/say")
    @ResponseBody
    public Map<String, String> say(String key, String value) {
        Map<String, String> retMap = new HashMap<String, String>();
        retMap.put(key, value);
        return retMap;
    }
}
