package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

	@RequestMapping("/home.htm")
	public String showForm() {
		return "page1";
	}
	@RequestMapping("/link1.htm")
	public String processCourse() {
		return "page2";
	}
	
	@RequestMapping("/link2.htm")
	public String processFaculty() {
		return "page3";
	}
	@RequestMapping("/link3.htm")
	public String processAddress() {
		return "page4";
	}

}
