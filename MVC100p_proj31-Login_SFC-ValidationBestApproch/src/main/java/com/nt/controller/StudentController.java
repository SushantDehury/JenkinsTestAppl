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

import com.nt.command.StudentCommand;
import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService service;

	@RequestMapping(value = "/home.htm", method = RequestMethod.GET)
	public String showForm(@ModelAttribute("stuCmd") StudentCommand cmd) {
		return "welcome";
	}

	@RequestMapping(value = "/home.htm", method = RequestMethod.POST)
	public String processForm(Map<String, Object> map, @Valid @ModelAttribute("stuCmd") StudentCommand cmd,
			BindingResult errors) {
		StudentDTO dto = null;
		String result = null;

		// Write Validate logic
		if (errors.hasErrors()) {
			return "welcome";
		}

		// convert comd to dto
		dto = new StudentDTO();
		BeanUtils.copyProperties(cmd, dto);
		// use service
		result = service.registerStudent(dto);
		map.put("stuResult", result);
		// return "register_student";
		return "welcome";
	}

}
