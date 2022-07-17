package com.bjpowernode.springboot.web;

import com.bjpowernode.springboot.student.Boy;
import com.bjpowernode.springboot.student.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @Autowired
    private Boy boy;

    @Autowired
    private Girl girl;

    @RequestMapping(value = "/student")
    @ResponseBody
    public String student() {
        return boy.getName() +boy.getAge() + girl.getName() + girl.getAge();
    }
}
