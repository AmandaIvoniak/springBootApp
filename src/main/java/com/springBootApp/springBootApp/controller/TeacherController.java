package com.springBootApp.springBootApp.controller;

import com.springBootApp.springBootApp.repository.TeacherRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TeacherController {
    @Autowired
    private TeacherRepository tr;

    @RequestMapping(value="/registerTeacher" , method = RequestMethod.GET)
    // IndexService
    public ModelAndView getFormTeacher() {
        ModelAndView mv = new ModelAndView("teacher/teacher");

        return mv;
        }    
        
    // public String form() {
    //     return "formTeacher";
    // }
}