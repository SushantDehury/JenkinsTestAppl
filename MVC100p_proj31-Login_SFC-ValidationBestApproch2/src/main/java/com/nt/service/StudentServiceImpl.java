package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDAO dao;

	@Override
	public String registerStudent(StudentDTO dto) {
		StudentBO bo = null;
		int count = 0;
		// convert dto to bo
		bo = new StudentBO();
		BeanUtils.copyProperties(dto, bo);
		// use dao
		count = dao.insertStudent(bo);
		if (count == 0)
			return "Rregistration failed...";
		else
			return " Student ID "+count+" Registration done....";
	}

}
