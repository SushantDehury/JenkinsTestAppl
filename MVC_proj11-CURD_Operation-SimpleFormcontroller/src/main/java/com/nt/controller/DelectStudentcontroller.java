package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.dto.StudentDetailsDTO;
import com.nt.service.StudentDetailsService;

public class DelectStudentcontroller extends AbstractController {
	public StudentDetailsService service;

	public DelectStudentcontroller(StudentDetailsService service) {
		this.service = service;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		String delateRecord = null;
		List<StudentDetailsDTO> listDTO = null;
		ModelAndView mav = null;
		delateRecord = service.removeStudentDetails(Integer.parseInt(req.getParameter("sno")));
		listDTO = service.fatchStudentDetails();
		mav = new ModelAndView();
		mav.addObject("result", delateRecord);
		mav.addObject("studentDetails", listDTO);
		mav.setViewName("student-details");
		return mav;

	}

}
