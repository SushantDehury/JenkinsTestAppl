package com.nt.interseptor;

import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DoublePostion extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object cmd) throws Exception {
		System.out.println(req.getServletPath());
		int ct = 0;
		int st = 0;
		HttpSession ses = null;
		RequestDispatcher rd = null;
		if (req.getMethod().equalsIgnoreCase("GET")) {
			ses = req.getSession();
			ses.setAttribute("serverToken", new Random().nextInt(1000));
			return true;
		} else {
			ses = req.getSession();
			ct = Integer.parseInt(req.getParameter("cToken"));
			st = (Integer) ses.getAttribute("serverToken");
			if (ct == st) {
				ses.setAttribute("serverToken", new Random().nextInt(1000));
				return true;
			} else {
				rd = req.getRequestDispatcher("/double_posting.jsp");
				rd.forward(req, res);
				return false;
			}

		}
	}
}
