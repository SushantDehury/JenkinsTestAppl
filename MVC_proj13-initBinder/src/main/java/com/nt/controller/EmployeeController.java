package com.nt.controller;

import java.util.Date;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.EmployeeCommand;

public class EmployeeController extends SimpleFormController {
	@Override
	protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
		System.out.println("EmployeeController.initBinder()");
		SimpleDateFormat sdf=null;
		//get Mormat of the date
		sdf=new SimpleDateFormat("dd/MM/yy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}
	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		
		return new ModelAndView(getFormView(), "empCmd",((EmployeeCommand)command));
	}

}
