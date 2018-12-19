package com.neuedu.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.neuedu.dao.IstudentDao;
import com.neuedu.pojo.Student;
@Service
public class StudentServiceImpl implements IstudentService{
	@Resource
	IstudentDao dao;
	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return dao.getStudents();
	}
	
}
