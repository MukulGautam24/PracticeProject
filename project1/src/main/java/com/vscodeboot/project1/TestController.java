package com.vscodeboot.project1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TestController {
    @RequestMapping("/ab")
    @ResponseBody
    public String requestMethodName() {
        return "Hey guys this is me and me is I.";
    }
    
    
}
