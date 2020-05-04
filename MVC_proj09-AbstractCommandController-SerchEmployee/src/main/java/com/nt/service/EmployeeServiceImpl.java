package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBO;
import com.nt.bo.EmployeeResultBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;
import com.nt.dto.EmployeeResultDTO;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDAO dao;

	public void setDao(EmployeeDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<EmployeeResultDTO> serchEmployee(EmployeeDTO dto) {
		EmployeeBO bo = null;
		List<EmployeeResultDTO> listRDTO = new ArrayList();
		List<EmployeeResultBO> listRBO = null;
		bo = new EmployeeBO();
		BeanUtils.copyProperties(dto, bo);
		listRBO = dao.getEmployee(bo);
		listRBO.forEach(rbo -> {
			EmployeeResultDTO rdto = new EmployeeResultDTO();
			BeanUtils.copyProperties(rbo, rdto);
			listRDTO.add(rdto);
		});

		return listRDTO;
	}

}
