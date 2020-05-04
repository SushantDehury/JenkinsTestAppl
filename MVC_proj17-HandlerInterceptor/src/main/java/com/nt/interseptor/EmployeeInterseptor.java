package com.nt.interseptor;

import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class EmployeeInterseptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String url = request.getServletPath();
		System.out.println(url);
		if (url.equals("/result.htm")) {
			int hour = new Date().getHours();
			System.out.println(hour);
			if (hour == 0) {
				RequestDispatcher rd = request.getRequestDispatcher("/error.jsp");
				System.out.println("111111111");
				rd.forward(request, response);
				return false;
			} else {
				return true;
			}
		}
		return true;
	}

}
