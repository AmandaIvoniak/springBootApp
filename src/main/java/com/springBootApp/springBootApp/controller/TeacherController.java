package com.springBootApp.springBootApp.controller;

import java.util.List;

import com.springBootApp.springBootApp.model.TeacherModel;
import com.springBootApp.springBootApp.repository.TeacherRepository;

//import com.springBootApp.springBootApp.repository.TeacherRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TeacherController {
    @Autowired
    private TeacherRepository tr;

    @RequestMapping(value="/registerTeacher", method = RequestMethod.GET)
    public ModelAndView getFormTeacher() {
        ModelAndView mv = new ModelAndView("teacher/teacher");
        return mv;
    }

    @RequestMapping(value="/registerTeacher", method = RequestMethod.POST)
    public String form(TeacherModel formTeacher) {
        tr.save(formTeacher);
        return "registerTeacher";
    }

    @RequestMapping(value = "/getTeacher", method = RequestMethod.POST)
    public List<TeacherModel> getList(TeacherModel formTeacher) {
        return tr.findAll();
    }
}