package com.metaverse.springprepare;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class springpractice {

    @GetMapping("api/hello")
    @ResponseBody
    public String hello() {
        return "Hello World!";
    }
}
