package com.springBootApp.springBootApp.service.serviceImplement;

import java.util.List;

import com.springBootApp.springBootApp.model.StudentModel;
import com.springBootApp.springBootApp.repository.StudentRepository;
import com.springBootApp.springBootApp.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TeacherServiceImplement
 */

@Service
public class StudentServiceImplement implements StudentService{

    @Autowired
    StudentRepository studentRepository;

	@Override
	public List<StudentModel> findAll() {
		return studentRepository.findAll();
	}

	@Override
	public StudentModel findById(long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public StudentModel save(StudentModel StudentModel) {
		return studentRepository.save(StudentModel);
	}    
}