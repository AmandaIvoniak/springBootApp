package com.springBootApp.springBootApp.service;

import java.util.List;

import com.springBootApp.springBootApp.model.ClassModel;

public interface ClassService {

    List<ClassModel> findAll();
    ClassModel findById(long id);
    ClassModel save(ClassModel classModel);
}