package com.neuedu.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
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
	
	@RequestMapping("/getData.do")
	@ResponseBody
	public List getData(String name) {
		System.out.println(name);
		List<String> list=new ArrayList<>();
		list.add(name);
		return list;
	}
}
