package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.AircraftBO;
import com.nt.dao.AircraftDAO;
import com.nt.dto.AircraftDTO;

public class AircraftServiceImpl implements AircraftService {
	private AircraftDAO dao;

	public AircraftServiceImpl(AircraftDAO dao) {
		this.dao = dao;
	}

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
