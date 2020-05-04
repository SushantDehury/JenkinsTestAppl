package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WishController {
	
	@RequestMapping("/home.htm")
	public  String showForm() {
		return "welcome";
	}

}
