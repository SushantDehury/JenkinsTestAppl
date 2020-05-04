package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.AircraftBO;
import com.nt.dao.AircraftDAO;
import com.nt.dto.AircraftDTO;
@Service
public class AircraftServiceImpl implements AircraftService {
	@Autowired
	private AircraftDAO dao;


	@Override
	public List<AircraftDTO> getAllAircraftDetails() {
		List<AircraftBO> listBO = null;
		List<AircraftDTO> listDTO = new ArrayList();
		listBO = dao.retriveAllAircraftDetails();
		// convert listBO to ListDTO
		listBO.forEach(bo -> {
			AircraftDTO dto = new AircraftDTO();
			BeanUtils.copyProperties(bo, dto);
			listDTO.add(dto);
		});
		return listDTO;
	}

}
