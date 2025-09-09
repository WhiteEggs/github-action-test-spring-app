package com.example.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @RequestMapping("/hello")
    public ModelAndView sayHello() {
        String message = "Success";
        return new ModelAndView("home", Map.of("message", message, "updatedAt", "2025/09/09 15:38"));
    }
    
    @RequestMapping("/check")
    public ResponseEntity<String> check() {
        String message = "Success";
        return ResponseEntity.ok(message);
    }
    
    @RequestMapping("/echo/{message}")
    public ResponseEntity<String> echo(@PathVariable String message) {
        return ResponseEntity.ok(message);
    }
}