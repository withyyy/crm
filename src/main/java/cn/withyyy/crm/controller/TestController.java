package cn.withyyy.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/test1")
    public String goTest1(){

        return "test1";
    }
}
