package com.springBootApp.springBootApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * HelloController
 */
@RestController
public class HelloController {
    @GetMapping(value="/")
    public String getMethodName() {
        return "Hello Word";
    }
    
    
}