package com.nt.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.command.EmployeeCommand;
import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	
	@RequestMapping(value="/home.htm",method=RequestMethod.GET)
	public String showForm(@ModelAttribute("empCmd")EmployeeCommand cmd) {
		return "welcome";
	}
	
	@RequestMapping(value="/home.htm",method=RequestMethod.POST)
	public String processForm(Map<String,Object> map,@Valid @ModelAttribute("empCmd")EmployeeCommand cmd,BindingResult errors) {
		EmployeeDTO dto=null;
		String result=null;
		
		if(errors.hasErrors()) {
			return "welcome";
		}
		
		//Convert command obj to dto
		dto=new EmployeeDTO();
		BeanUtils.copyProperties(cmd, dto);
		//use service
		result=service.registerEmployee(dto);
		map.put("empResult", result);
		return "register_page";
	}

}









