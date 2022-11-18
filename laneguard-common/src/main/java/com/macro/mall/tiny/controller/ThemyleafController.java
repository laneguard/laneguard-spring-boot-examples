package com.macro.mall.tiny.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThemyleafController {

    @GetMapping("/link")
    public String test1(Model model) {
        model.addAttribute("arg1","hello world");
        return "template1";
    }

    @GetMapping("/")
    public String baseUrl(Model model) {
        model.addAttribute("arg2","welcome");
        return "login";
    }
}
