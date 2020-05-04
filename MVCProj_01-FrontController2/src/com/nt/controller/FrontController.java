package com.nt.controller;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.service.SystemDate;
import com.nt.service.SystemProperties;

public class FrontController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		SystemDate sysdt = null;
		SystemProperties sysprops = null;
		Properties props = null;
		RequestDispatcher rd=null;
		Date dt = null;
		// get Virtual path of the url
		if (req.getServletPath().equalsIgnoreCase("s1.do")) {
			sysdt = new SystemDate();
			dt = sysdt.getSysDate();
		} else if (req.getServletPath().equalsIgnoreCase("s2.do")) {
			sysprops = new SystemProperties();
			props = sysprops.getSysProps();
		}
		if (req.getServletPath().equalsIgnoreCase("s1.do")) {
			req.setAttribute("result", dt);
			rd=req.getRequestDispatcher("/view_date");
			rd.forward(req, res);
		}else if (req.getServletPath().equalsIgnoreCase("s2.do")) {
			req.setAttribute("result", props);
			rd=req.getRequestDispatcher("/view_properties");
			rd.forward(req, res);
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

}
