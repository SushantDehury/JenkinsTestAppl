package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import com.nt.command.EmployeeCommand;

public class EmployeeController extends AbstractWizardFormController {

	@Override
	protected ModelAndView processFinish(HttpServletRequest req, HttpServletResponse res, Object cmd,
			BindException errors) throws Exception {
		
		return new ModelAndView("result","command",((EmployeeCommand)cmd));
	}
	@Override
	protected ModelAndView processCancel(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		return new ModelAndView("welcome");
	}

}
