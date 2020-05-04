package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.dto.AircraftDTO;
import com.nt.service.AircraftService;

public class AircraftController extends AbstractController {
	private AircraftService service;

	public AircraftController(AircraftService service) {
		this.service = service;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		List<AircraftDTO> listDTO = null;
		ModelAndView mav = null;
		listDTO = service.getAllAircraftDetails();
		// create mav obj
		mav=new ModelAndView();
		mav.setViewName("show_aircraft");
		mav.addObject("aircraftList", listDTO);
		return mav;
	}

}
