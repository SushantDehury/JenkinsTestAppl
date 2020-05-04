package com.nt.service;

import java.util.List;

import com.nt.dto.StudentDetailsDTO;

public interface StudentDetailsService {
	public List<StudentDetailsDTO> fatchStudentDetails();
	public StudentDetailsDTO fatchStudentDetailsByNo(int sid);
	public String removeStudentDetails(int sid);
	public String modifyStudent(StudentDetailsDTO dto);
	public String registerStudent(StudentDetailsDTO dto);
	
}
