package com.springBootApp.springBootApp.service.serviceImplement;

import java.util.List;

import com.springBootApp.springBootApp.model.TeacherModel;
import com.springBootApp.springBootApp.repository.TeacherRepository;
import com.springBootApp.springBootApp.service.TeacherService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TeacherServiceImplement
 */

@Service
public class TeacherServiceImplement implements TeacherService{

    @Autowired
    TeacherRepository teacherRepository;

	@Override
	public List<TeacherModel> findAll() {
		return teacherRepository.findAll();
	}

	@Override
	public TeacherModel findById(long id) {
		return teacherRepository.findById(id).get();
	}

	@Override
	public TeacherModel save(TeacherModel teacher) {
		return teacherRepository.save(teacher);
	}    
}