package com.springBootApp.springBootApp.service;

import java.util.List;

import com.springBootApp.springBootApp.model.StudentModel;

public interface StudentService {

    List<StudentModel> findAll();
    StudentModel findById(long id);
    StudentModel save(StudentModel studentModel);
}