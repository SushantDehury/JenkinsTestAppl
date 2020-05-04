package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.StudentCommand;
import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;

public class StudentInsertController extends SimpleFormController {
	private StudentService service;

	public StudentInsertController(StudentService service) {
		this.service = service;
	}

	@Override
	protected ModelAndView onSubmit(HttpServletRequest req, HttpServletResponse res, Object cmd, BindException errors)
			throws Exception {
		StudentDTO dto = null;
		String result = null;
		// get Command class obj
		StudentCommand command = (StudentCommand) cmd;
		if(command.getArdss().equalsIgnoreCase("Pakistan")) {
			errors.rejectValue("ardss", "addrs.globalValidate");
			return showForm(req,res, errors);
		}
		// convert commd obj to dto obj
		dto = new StudentDTO();
		BeanUtils.copyProperties(command, dto);
		// use service
		result = service.register(dto);
		return new ModelAndView(getSuccessView(), "result", result);
	}

}
