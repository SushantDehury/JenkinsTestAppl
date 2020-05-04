package com.nt.controller;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nt.command.EmployeeCommand;
import com.nt.dto.EmployeeDTO;
import com.nt.dto.EmployeeResultDTO;
import com.nt.service.EmployeeService;

@Controller
public class EmployeeController {
	@Inject
	private EmployeeService service;


	@RequestMapping("/result.htm")
	public String process(Map<String,Object> map, @ModelAttribute EmployeeCommand cmd ){
		ModelAndView mav = null;

		EmployeeDTO dto = new EmployeeDTO();
		BeanUtils.copyProperties(cmd, dto);

		List<EmployeeResultDTO> listRDTO = null;
		listRDTO = service.serchEmployee(dto);
		map.put("listEmp", listRDTO);

		return "emp_result";
	}

}
