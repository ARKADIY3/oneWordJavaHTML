package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoControllers {

    @GetMapping("/demo")
    public String demoMain(Model model){
        return "demo-main";
    }
}
