package com.springBootApp.springBootApp.service;

import java.util.List;

import com.springBootApp.springBootApp.model.TeacherModel;

public interface TeacherService {

    List<TeacherModel> findAll();
    TeacherModel findById(long id);
    TeacherModel save(TeacherModel teacher);
}