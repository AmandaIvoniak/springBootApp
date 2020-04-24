package com.springBootApp.springBootApp.repository;

import com.springBootApp.springBootApp.model.ClassModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<ClassModel, Long> {
}



