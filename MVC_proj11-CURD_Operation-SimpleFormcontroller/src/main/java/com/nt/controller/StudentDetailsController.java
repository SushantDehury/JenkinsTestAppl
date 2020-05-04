package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.dto.StudentDetailsDTO;
import com.nt.service.StudentDetailsService;

public class StudentDetailsController extends AbstractController {
	private StudentDetailsService service;

	public StudentDetailsController(StudentDetailsService service) {
		this.service = service;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		List<StudentDetailsDTO> listDTO = null;
		listDTO = service.fatchStudentDetails();

		return new ModelAndView("student-details", "studentDetails", listDTO);
	}

}
