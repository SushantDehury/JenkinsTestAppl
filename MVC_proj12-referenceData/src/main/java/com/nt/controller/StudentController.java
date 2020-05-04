package com.nt.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.mvc.SimpleFormController;

public class StudentController extends SimpleFormController {

	@Override
	protected Map referenceData(HttpServletRequest request) throws Exception {
		Map<String,List<String>> map=new HashMap();
		List<String> qlist=null,clist=null,hlist=null;
		
		qlist=new ArrayList();
		qlist.add("BCA");
		qlist.add("MCA");
		qlist.add("B-Tech");
		qlist.add("M-Tech");
		map.put("quliList", qlist);
		
		clist=new ArrayList();
		clist.add("JAVA");
		clist.add(".NET");
		clist.add("PHP");
		clist.add("HTML");
		map.put("courseList", clist);
		
		hlist=new ArrayList();
		hlist.add("CREIKET");
		hlist.add("Read NewsPaper");
		hlist.add("Internet Suffer");
		map.put("hobbiList", hlist);
		
		return map;
	}

}
