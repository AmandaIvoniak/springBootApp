package com.springBootApp.springBootApp.service.serviceImplement;

import java.util.List;

import com.springBootApp.springBootApp.model.ClassModel;
import com.springBootApp.springBootApp.repository.ClassRepository;
import com.springBootApp.springBootApp.service.ClassService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TeacherServiceImplement
 */

@Service
public class ClassServiceImplement implements ClassService{

    @Autowired
    ClassRepository classRepository;

	@Override
	public List<ClassModel> findAll() {
		return classRepository.findAll();
	}

	@Override
	public ClassModel findById(long id) {
		return classRepository.findById(id).get();
	}

	@Override
	public ClassModel save(ClassModel classModel) {
		return classRepository.save(classModel);
	}    
}