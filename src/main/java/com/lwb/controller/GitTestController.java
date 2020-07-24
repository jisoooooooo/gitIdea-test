package com.lwb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitTestController {

    @RequestMapping("/")
    public String show(){
        //修改之后的代码
       return "hello";
    }
    //修改代码。。。
}
