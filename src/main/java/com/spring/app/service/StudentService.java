package com.spring.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.app.core.domain.Student;
import com.spring.app.repo.StudentRepo;

@Service
@Transactional
public class StudentService {
	
	@Autowired
	private StudentRepo stdRepo;
	
	public void addStudent(Student student)
	{
		stdRepo.save(student);
	}

}
