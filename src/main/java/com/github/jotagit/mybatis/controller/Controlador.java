package com.github.jotagit.mybatis.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controlador {

    @GetMapping("/keepalive")
    @ResponseBody
    public String getChamada(){
        return "Hello world!";
    }
}
