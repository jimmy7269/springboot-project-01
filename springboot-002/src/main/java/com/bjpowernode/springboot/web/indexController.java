package com.bjpowernode.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class indexController {

    @RequestMapping(value = "/springboot/say")
    @ResponseBody
    public String say() {
        return "hello SpringBoot";
    }
}
