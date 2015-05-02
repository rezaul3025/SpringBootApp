package com.spring.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.app.core.domain.Student;
import com.spring.app.service.StudentService;

@Controller
public class SpringBootController {
	
	@Autowired
	private StudentService stdService;
	
	@RequestMapping(value="/")
	public String index()
	{
		Student st= new Student();
		
		st.setName("Tom mia");
		st.setDept("IT US");
		
		stdService.addStudent(st);
		
		return "index";
	}

}
