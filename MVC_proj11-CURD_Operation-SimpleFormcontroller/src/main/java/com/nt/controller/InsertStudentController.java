package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.StudentCommand;
import com.nt.dto.StudentDetailsDTO;
import com.nt.service.StudentDetailsService;

public class InsertStudentController extends SimpleFormController {
	private StudentDetailsService service;

	public InsertStudentController(StudentDetailsService service) {
		this.service = service;
	}
	@Override
	protected ModelAndView handleInvalidSubmit(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		return new ModelAndView("dlp_error");
	}

	@Override
	public ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		StudentCommand cmd = (StudentCommand) command;
		StudentDetailsDTO dto = null;
		String result = null;
		// Convert cmd to dto
		dto = new StudentDetailsDTO();
		BeanUtils.copyProperties(cmd, dto);
		result = service.registerStudent(dto);
		return new ModelAndView(getSuccessView(), "result", result);
	}

}
