package com.spring.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
