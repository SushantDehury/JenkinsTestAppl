package com.nt.controller;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.command.StudentCommand;

@Controller
public class StudentController {
	
	@RequestMapping(value="/home.htm",method=RequestMethod.GET)
	public String processForm(@ModelAttribute("stCmd") StudentCommand cmd) {
		return "welcome";
	}
	
	@RequestMapping(value="/home.htm",method=RequestMethod.POST)
	public String processResult(Map<String,Object> map, @ModelAttribute("stCmd") StudentCommand cmd,BindingResult errors) {
		map.put("result", cmd);
		return "welcome";
	}
	
	@ModelAttribute("stCourse")
	public List<String> courseDetails(){
		List<String> list=new ArrayList();
		list.add("JAVA");
		list.add(".NET");
		list.add("PHP");
		list.add("Python");
		return list;
	}
	@ModelAttribute("stGender")
	public List<String> genderDetails(){
		List<String> list=new ArrayList();
		list.add("MALE");
		list.add("FEMALE");
		list.add("Others");
		return list;
	}
	@InitBinder
	public void coustomDateConveter(WebDataBinder binder) {
		SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(format, true));
		
	}
}
