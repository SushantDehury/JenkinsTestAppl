package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.StudentCommand;
import com.nt.dto.StudentDetailsDTO;
import com.nt.service.StudentDetailsService;

public class StudentSimpleController extends SimpleFormController {
	private StudentDetailsService service;

	public StudentSimpleController(StudentDetailsService service) {
		this.service = service;
	}

	@Override
	public Object formBackingObject(HttpServletRequest req) throws Exception {
		StudentCommand cmd = null;
		StudentDetailsDTO dto = null;
		cmd = new StudentCommand();
		dto = service.fatchStudentDetailsByNo(Integer.parseInt(req.getParameter("sno")));
		// convert dto to cmd
		BeanUtils.copyProperties(dto, cmd);
		return cmd;
	}

	@Override
	protected ModelAndView onSubmit(HttpServletRequest req, HttpServletResponse res, Object comd, BindException errors)
			throws Exception {
		StudentDetailsDTO dto = null;
		List<StudentDetailsDTO> listDTO = null;
		ModelAndView mav = null;
		// Get Command Obj
		StudentCommand cmd = (StudentCommand) comd;
		// convert cmd to dto
		dto = new StudentDetailsDTO();
		BeanUtils.copyProperties(cmd, dto);
		// use service
		String updateMsg = service.modifyStudent(dto);
		listDTO = service.fatchStudentDetails();
		// get mav obj
		mav = new ModelAndView();
		mav.addObject("result", updateMsg);
		mav.addObject("studentDetails", listDTO);
		mav.setViewName("student-details");
		return mav;
	}

}
