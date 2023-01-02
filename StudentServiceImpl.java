package com.teja.fullstack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teja.fullstack.model.Student;
import com.teja.fullstack.repositary.StudentRepositary;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepositary studentRepositary;

	@Override
	public Student saveStudent(Student student) {
		
		return studentRepositary.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepositary.findAll();
	}

}
