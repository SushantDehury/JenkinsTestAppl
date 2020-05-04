package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

@Service
public class EmployeeSreviceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO dao;

	@Override
	public String registerEmployee(EmployeeDTO dto) {
		EmployeeBO bo = null;
		int count = 0;
		// Convert dto to bo
		bo = new EmployeeBO();
		BeanUtils.copyProperties(dto, bo);
		count = dao.insert(bo);
		if (count == 0)
			return "Registration failed...";
		else
			return "Registration Successfull......";
	}

}
