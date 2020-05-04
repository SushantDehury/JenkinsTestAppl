package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.service.WishMessageGeneratorService;

public class WishMsgController extends AbstractController {

	public WishMessageGeneratorService service;

	public WishMsgController(WishMessageGeneratorService service) {
		this.service = service;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String msg = null;
		// Invoke the method
		msg = service.generateWishMessage();
		
		return new ModelAndView("result", "message", msg);
	}

}
