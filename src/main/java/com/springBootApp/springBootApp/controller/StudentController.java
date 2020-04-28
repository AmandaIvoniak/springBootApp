package com.springBootApp.springBootApp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.springBootApp.springBootApp.model.StudentModel;
import com.springBootApp.springBootApp.repository.ClassRepository;
import com.springBootApp.springBootApp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository sr;
    private ClassRepository cr;

    @RequestMapping(value="/saveStudent", method = RequestMethod.POST)
    public String form(StudentModel formStudent) {
        System.out.println("formStudent");
        System.out.println(formStudent.getClassName());
        
        sr.save(formStudent);
        return "/";
    }

    @RequestMapping(value = "/getStudent", method = RequestMethod.POST)
    public List<StudentModel> getList(StudentModel formStudent) {
        return sr.findAll();
    }

    @RequestMapping(value = "/getClassOpen", method = RequestMethod.POST)
    public List<StudentModel> getListOpenClass(StudentModel formStudent) {
        System.out.println("aQUI");
        
        List<StudentModel> openClass = new ArrayList<StudentModel>();
        Integer count = sr.findAll().size();


        for (int i = 0; i < count; i++) {
            Integer classValidateNumber = Math.toIntExact(sr.findAll().get(i).getClassName());
            List<StudentModel> result = sr.findAll().stream()
            .filter(a -> Objects.equals(a.getClassName(), classValidateNumber))
            .collect(Collectors.toList());
                
            if(result.size() < 5){
                System.out.println(result);
                openClass.add(sr.findAll().get(i));
            }
        }
        return openClass;
    }
}