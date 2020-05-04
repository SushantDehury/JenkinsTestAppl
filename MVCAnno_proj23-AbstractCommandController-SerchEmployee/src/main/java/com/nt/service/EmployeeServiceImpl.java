package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBO;
import com.nt.bo.EmployeeResultBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;
import com.nt.dto.EmployeeResultDTO;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Inject
	private EmployeeDAO dao;

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
