package com.nt.dao;

import java.util.List;

import com.nt.bo.StudentDetailsBO;

public interface StudentDetailsDAO {
	public List<StudentDetailsBO> getStudentDetails();
	public StudentDetailsBO getStudentDetailsByNo(int sid);
	public int updateStudent(StudentDetailsBO ob);
	public int deleteStudentRecord(int sid);
	public int insert(StudentDetailsBO bo);

}
