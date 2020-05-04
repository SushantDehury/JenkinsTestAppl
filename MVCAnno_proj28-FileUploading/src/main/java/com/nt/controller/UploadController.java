package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.nt.command.UploadCommand;

@Controller
public class UploadController {

	@RequestMapping(value="/home.htm",method=RequestMethod.GET)
	public String showForm(@ModelAttribute("fileCmd") UploadCommand cmd) {
		return "welcome";
	}
	@RequestMapping(value="home.htm",method=RequestMethod.POST)
	public String processForm(Map<String,Object> map,@ModelAttribute("fileCmd")UploadCommand cmd) {
		//get all the  file
		MultipartFile file1=cmd.getFile1();
		MultipartFile file2=cmd.getFile2();
		
		
		return "upload";
	}

}
