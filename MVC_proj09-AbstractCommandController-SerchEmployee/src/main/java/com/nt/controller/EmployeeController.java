package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.nt.command.EmployeeCommand;
import com.nt.dto.EmployeeDTO;
import com.nt.dto.EmployeeResultDTO;
import com.nt.service.EmployeeService;

public class EmployeeController extends AbstractCommandController {
	private EmployeeService service;

	public void setService(EmployeeService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handle(HttpServletRequest req, HttpServletResponse res, Object obj, BindException be)
			throws Exception {
		ModelAndView mav = null;

		EmployeeCommand cmd = (EmployeeCommand) obj;

		EmployeeDTO dto = new EmployeeDTO();
		BeanUtils.copyProperties(cmd, dto);

		List<EmployeeResultDTO> listRDTO = null;
		listRDTO = service.serchEmployee(dto);
		mav = new ModelAndView();
		mav.setViewName("emp_result");
		mav.addObject("listEmp", listRDTO);
		System.out.println(listRDTO);

		return mav;
	}

}
