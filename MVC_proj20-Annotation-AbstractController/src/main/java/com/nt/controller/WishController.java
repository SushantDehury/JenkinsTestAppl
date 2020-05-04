package com.nt.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.WishService;

@Controller
public class WishController {

	@Autowired
	private WishService service;
	
	/*@RequestMapping("/wish.htm")
	public ModelAndView process() {
		String wMsg = null;
		// Invoke the method
		wMsg = service.generateWishMsg();
		return new ModelAndView("result", "msg", wMsg);
	}*/
	
	/*@RequestMapping("/wish.htm")
	public Model process() {
		String wMsg = null;
		Model model=null;
		// Invoke the method
		wMsg = service.generateWishMsg();
		model=new ExtendedModelMap();
		model.addAttribute("msg", wMsg);
		return model;
	}*/
	/*@RequestMapping("/wish.htm")
	public ModelMap process() {
		String wMsg = null;
		ModelMap map=null;
		// Invoke the method
		wMsg = service.generateWishMsg();
		map=new ModelMap();
		map.put("msg", wMsg);
		return map;
	}*/
	/*@RequestMapping("/wish.htm")
	public Map process() {
		String wMsg = null;
		Map map=null;
		// Invoke the method
		wMsg = service.generateWishMsg();
		map=new HashMap();
		map.put("msg", wMsg);
		return map;
	}*/
	
	/*@RequestMapping("/wish.htm")
	public String process(ModelMap map) {
		String wMsg = null;
		// Invoke the method
		wMsg = service.generateWishMsg();
		map.put("msg", wMsg);
		
		return "result";
	}*/
	/*@RequestMapping("/wish.htm")
	public void process(Map map) {
		String wMsg = null;
		// Invoke the method
		wMsg = service.generateWishMsg();
		map.put("msg", wMsg);
	}*/
		@RequestMapping("/wish.htm")             //Best signture of AbstrctController
	public String process(Map map) {
		String wMsg = null;
		// Invoke the method
		wMsg = service.generateWishMsg();
		map.put("msg", wMsg);
		return "result";
	}
}
