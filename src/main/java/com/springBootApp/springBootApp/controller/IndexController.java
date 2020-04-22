package com.springBootApp.springBootApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * IndexController
 */
@RestController
public class IndexController {
    @Autowired
    // IndexService
    @RequestMapping(value="/", method = RequestMethod.GET)
    // IndexService
    public ModelAndView getIndex() {
        ModelAndView mv = new ModelAndView("index");

        return mv;
        }    
    
}