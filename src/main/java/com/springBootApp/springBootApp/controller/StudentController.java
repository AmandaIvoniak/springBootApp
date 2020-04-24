package com.springBootApp.springBootApp.controller;

import java.util.List;

import com.springBootApp.springBootApp.model.StudentModel;
import com.springBootApp.springBootApp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository sr;

    @RequestMapping(value="/saveStudent", method = RequestMethod.POST)
    public String form(StudentModel formStudent) {
        sr.save(formStudent);
        return "/";
    }

    @RequestMapping(value = "/getStudent", method = RequestMethod.POST)
    public List<StudentModel> getList(StudentModel formStudent) {
        return sr.findAll();
    }
}