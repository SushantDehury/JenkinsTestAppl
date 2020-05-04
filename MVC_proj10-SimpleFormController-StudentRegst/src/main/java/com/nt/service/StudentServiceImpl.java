package com.nt.service;

import org.springframework.beans.BeanUtils;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {
	private StudentDAO dao;

	public StudentServiceImpl(StudentDAO dao) {
		this.dao = dao;
	}

	public String register(StudentDTO dto) {
		StudentBO bo = null;
		int result = 0;
		bo = new StudentBO();
		// copy dto to bo
		BeanUtils.copyProperties(dto, bo);
		// use dao
		result = dao.insert(bo);
		if (result == 0)
			return "Registration failed";
		return "Registration succeded";
	}

}
