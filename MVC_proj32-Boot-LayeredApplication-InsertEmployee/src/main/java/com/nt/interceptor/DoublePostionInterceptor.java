package com.nt.interceptor;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DoublePostionInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler)
			throws Exception {
		HttpSession ses=null;
		//get Session Obj
		ses=req.getSession();
		if(req.getMethod().equalsIgnoreCase("GET") && req.getServletPath().equals("/home.htm")) {
			ses.setAttribute("sToken",new Random().nextInt(10000));
			return true;
		}else {
			
		}
		return false;
	}
	

}
