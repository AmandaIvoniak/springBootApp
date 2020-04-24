package com.springBootApp.springBootApp.repository;

import com.springBootApp.springBootApp.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentModel, Long> {
}



