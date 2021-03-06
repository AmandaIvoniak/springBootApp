package com.springBootApp.springBootApp.controller;

import java.util.List;

import com.springBootApp.springBootApp.model.ClassModel;
import com.springBootApp.springBootApp.repository.ClassRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ClassController {
    @Autowired
    private ClassRepository cr;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView getFormClass() {
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ModelAndView form(ClassModel formClass) {
        ModelAndView mv = new ModelAndView("index");        
        cr.save(formClass);
        return mv;
    }

    @RequestMapping(value = "/getClass", method = RequestMethod.POST)
    public List<ClassModel> getList(ClassModel formClass) {
        return cr.findAll();
    }
}

