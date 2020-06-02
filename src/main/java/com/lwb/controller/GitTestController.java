package com.lwb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitTestController {

    @RequestMapping("/")
    public String show(){
       return "hello";
    }
}
