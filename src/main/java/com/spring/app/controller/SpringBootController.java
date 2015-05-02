package com.spring.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringBootController {
	
	@RequestMapping(value="/")
	public String index()
	{
		return "index";
	}

}
