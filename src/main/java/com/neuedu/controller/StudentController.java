package com.neuedu.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.service.IstudentService;

@Controller
public class StudentController {
	@Resource
	IstudentService studentService;
	@RequestMapping("/index.do")
	public String index() {
		System.out.println(studentService.getStudents().toString());
		return "index";
	}
}
