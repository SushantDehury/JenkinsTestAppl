package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.nt.dto.AircraftDTO;
import com.nt.service.AircraftService;

@Controller
public class AircraftController {
	@Autowired
	private AircraftService service;

	@RequestMapping("/aircraft.htm")
	protected String prcess(Map<String, List<AircraftDTO>> map) {
		List<AircraftDTO> listDTO = null;
		listDTO = service.getAllAircraftDetails();
		// create mav obj
		map.put("aircraftList", listDTO);
		return "show_aircraft";
	}

}
