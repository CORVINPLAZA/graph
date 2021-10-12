package com.jy.dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String indexPage() {
        return "/index";
    }

    @GetMapping("/graph")
    public String graphPage() {
        return "/graph";
    }

    @RequestMapping(value = "/")
    public String main() throws Exception {
        return "/index";
    }

}
