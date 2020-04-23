package com.springBootApp.springBootApp.repository;

import com.springBootApp.springBootApp.model.TeacherModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<TeacherModel, Long> {
}



