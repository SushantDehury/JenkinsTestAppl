package com.nt.interceptor;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DoublePostingInterseptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession ses=null;
		int ct=0;
		int st=0;
		RequestDispatcher rd=null;
		
		if(request.getMethod().equalsIgnoreCase("GET")) {
			ses=request.getSession();
			ses.setAttribute("sToken", new Random().nextInt(10000));
			return true;
		}else {
			ses=request.getSession();
			ct=Integer.parseInt(request.getParameter("cToken"));
			st=(Integer) ses.getAttribute("sToken");
			if(ct==st) {
				ses.setAttribute("sToken", new Random().nextInt(10000));
				return true;
			}else {
				rd=request.getRequestDispatcher("/double_postion_error.jsp");
				rd.forward(request, response);
				return false;
			}
		}
	}

}
