package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.StudentDetailsBO;
import com.nt.dao.StudentDetailsDAO;
import com.nt.dto.StudentDetailsDTO;

public class StudentDetailsServiceImpl implements StudentDetailsService {
	private StudentDetailsDAO dao;

	public StudentDetailsServiceImpl(StudentDetailsDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<StudentDetailsDTO> fatchStudentDetails() {
		List<StudentDetailsBO> listBO = null;
		List<StudentDetailsDTO> listDTO = new ArrayList();
		listBO = dao.getStudentDetails();
		// convert listBO to listDTO
		listBO.forEach(bo -> {
			StudentDetailsDTO dto = new StudentDetailsDTO();
			BeanUtils.copyProperties(bo, dto);
			listDTO.add(dto);
		});
		return listDTO;
	}

	@Override
	public StudentDetailsDTO fatchStudentDetailsByNo(int sid) {
		StudentDetailsBO bo = null;
		StudentDetailsDTO dto = null;
		bo = dao.getStudentDetailsByNo(sid);
		// convert bo to dto
		dto = new StudentDetailsDTO();
		BeanUtils.copyProperties(bo, dto);
		return dto;
	}

	@Override
	public String removeStudentDetails(int sid) {
		int count = dao.deleteStudentRecord(sid);
		if (count == 0)
			return sid+" record Deletion faild...";
		else {
			return sid+"  Record sucessifully deleted";
		}
	}

	@Override
	public String modifyStudent(StudentDetailsDTO dto) {
		StudentDetailsBO bo = new StudentDetailsBO();
		int count = 0;
		BeanUtils.copyProperties(dto, bo);
		count = dao.updateStudent(bo);
		if (count == 0)
			return  bo.getSid()+" Record Updation failed...";
		else
			return bo.getSid()+" Record sucessifully Updated..";
	}

	@Override
	public String registerStudent(StudentDetailsDTO dto) {
		StudentDetailsBO bo=null;
		int count=0;
		//convert dto to vo
		bo=new StudentDetailsBO();
		BeanUtils.copyProperties(dto, bo);
		//use dao
		count=dao.insert(bo);
		if (count == 0)
			return  " Record Registration failed...";
		else
			return " Record Registration sucessifull..";
	}
}
