package com.teja.fullstack.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teja.fullstack.model.Student;

public interface StudentRepositary extends JpaRepository<Student, Integer>{

}
