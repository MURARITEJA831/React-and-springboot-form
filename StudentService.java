package com.teja.fullstack.service;

import java.util.List;

import com.teja.fullstack.model.Student;

public interface StudentService {
	Student saveStudent(Student student);
	List<Student> getAllStudents();
}
