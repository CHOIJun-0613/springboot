package com.onyou.project02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class Project02Controller {

    @GetMapping("/hi")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    public String niceToMeetYou(){
        return "greetings";
    }

}
