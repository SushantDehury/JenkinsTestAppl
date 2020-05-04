package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.nt.command.EmployeeCommand;

public class EmployeeController extends MultiActionController {
	public ModelAndView insert(HttpServletRequest req,HttpServletResponse res,EmployeeCommand cmd) {
		return new ModelAndView("welcome","empComd",cmd);
	}
	public ModelAndView update(HttpServletRequest req,HttpServletResponse res,EmployeeCommand cmd) {
		return new ModelAndView("welcome","empComd",cmd);
	}
	public ModelAndView delete(HttpServletRequest req,HttpServletResponse res,EmployeeCommand cmd) {
		return new ModelAndView("welcome","empComd",cmd);
	}
	public ModelAndView get(HttpServletRequest req,HttpServletResponse res,EmployeeCommand cmd) {
		return new ModelAndView("welcome","empComd",cmd);
	}
	public ModelAndView invalid(HttpServletRequest req,HttpServletResponse res,EmployeeCommand cmd) {
		return new ModelAndView("welcome","empComd","Invalid Operation...");
	}

}
