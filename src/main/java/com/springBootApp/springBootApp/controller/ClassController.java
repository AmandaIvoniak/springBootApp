package com.springBootApp.springBootApp.controller;

import java.util.List;
import java.util.Optional;

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
        final ModelAndView mv = new ModelAndView("index");
        return mv;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String form(ClassModel formClass) {
        cr.save(formClass);
        return "/";
    }

    @RequestMapping(value = "/getClass", method = RequestMethod.POST)
    public List<ClassModel> getList(ClassModel formClass) {
        return cr.findAll();
    }

    @RequestMapping(value = "/getClassById", method = RequestMethod.POST) // arrumar e criar um novo
    public Optional<ClassModel> getListId(Long idClass) {
        return cr.findById(idClass);
    }
}

