package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @RequestMapping("/hello")
    public ModelAndView sayHello() {
        String message = "Success";
        return new ModelAndView("home", "message", message);
    }
}