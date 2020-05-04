package com.nt.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.command.UserCommand;
import com.nt.dto.UserDTO;
import com.nt.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService Service;
	
	@RequestMapping(value="/login.htm",method=RequestMethod.GET)
	public String pocessForm(Map<String,Object> map) {
		UserCommand cmd=null;
		cmd=new UserCommand();
		cmd.setUser("sushant");
		cmd.setPwd("dehury");
		map.put("cmd", cmd);
		return "login";
	}
	
	@RequestMapping(value="/login.htm",method=RequestMethod.POST)
	public String processResult(Map<String,Object> map,@Valid @ModelAttribute("cmd") UserCommand cmd,BindingResult errors) {
		UserDTO dto=null;
		String result=null;
		if(errors.hasErrors()) {
			return "login";
		}
		dto=new UserDTO();
		BeanUtils.copyProperties(cmd, dto);
		result=Service.validate(dto);
		map.put("result", result);
		return "login";
	}
}
