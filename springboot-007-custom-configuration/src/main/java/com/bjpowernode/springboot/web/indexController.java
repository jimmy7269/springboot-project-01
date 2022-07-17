package com.bjpowernode.springboot.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.PublicKey;


@Controller
public class indexController {

    @Value("${school.name}")
    private String schoolName;

    @Value("${school.location}")
    private String schoolLocation;

    @RequestMapping(value = "/say")
    @ResponseBody
    public String say(String message) {
        return message + schoolName + schoolLocation;
    }
}
