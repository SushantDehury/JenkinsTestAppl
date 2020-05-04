package com.app.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.bo.User;
import com.app.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService service;
	
	@RequestMapping("/welcome.htm")
	public String getLoginPage() {
		
		return "login";
	}
	
	@RequestMapping(value="/entlog.htm",method=RequestMethod.POST)
	public String regLoginPage(Map<String,Object> map,@ModelAttribute("user")User user) {
		String msg=null;
		com.app.dto.User userDTO=new com.app.dto.User();
		BeanUtils.copyProperties(user, userDTO);
		msg=service.verifiedUser(userDTO);
		map.put("msg", msg);
		return "login";
	}

}
