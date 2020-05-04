package com.nt.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.bo.StudentDetailsBO;

public class StudentDetailsDAOImpl implements StudentDetailsDAO {
	private static final String GET_ALL_STUDENT_DETAILS = "SELECT SID,SNAME,ARDSS,COURCE FROM STUDENT_DETAILS";
	private static final String GET_ALL_STUDENT_DETAILS_BY_NO = "SELECT SID,SNAME,ARDSS,COURCE FROM STUDENT_DETAILS WHERE SID=?";
	private static final String DELETE_STUDENT_DETAILS = "DELETE FROM STUDENT_DETAILS WHERE SID=?";
	private static final String UPDATE_STUDENT_DETAILS = "UPDATE STUDENT_DETAILS SET SNAME=?,ARDSS=?,COURCE=? WHERE SID=?";
	private static final String INSERT_STUDENT_DETAILS = "INSERT INTO STUDENT_DETAILS(SID,SNAME,ARDSS,COURCE) VALUES(STUDENT_SEQ.NEXTVAL,?,?,?)";
	private JdbcTemplate jt;

	public StudentDetailsDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	public List<StudentDetailsBO> getStudentDetails() {
		List<StudentDetailsBO> listBO = null;
		listBO = jt.query(GET_ALL_STUDENT_DETAILS, rs -> {
			List<StudentDetailsBO> list = new ArrayList();
			while (rs.next()) {
				StudentDetailsBO bo = new StudentDetailsBO();
				bo.setSid(rs.getInt(1));
				bo.setSname(rs.getString(2));
				bo.setArds(rs.getString(3));
				bo.setCourse(rs.getString(4));
				list.add(bo);
			}
			return list;
		});

		return listBO;
	}

	@Override
	public StudentDetailsBO getStudentDetailsByNo(int sid) {
		StudentDetailsBO bo = null;
		bo = jt.queryForObject(GET_ALL_STUDENT_DETAILS_BY_NO, (rs, index) -> {
			StudentDetailsBO bo1 = new StudentDetailsBO();
			bo1.setSid(rs.getInt(1));
			bo1.setSname(rs.getString(2));
			bo1.setArds(rs.getString(3));
			bo1.setCourse(rs.getString(4));
			return bo1;
		}, sid);
		return bo;
	}

	@Override
	public int updateStudent(StudentDetailsBO bo) {
		int count = jt.update(UPDATE_STUDENT_DETAILS, bo.getSname(), bo.getArds(), bo.getCourse(), bo.getSid());
		return count;
	}

	@Override
	public int deleteStudentRecord(int sid) {
		int result = jt.update(DELETE_STUDENT_DETAILS, sid);
		return result;
	}

	@Override
	public int insert(StudentDetailsBO bo) {
		int count = 0;
		count = jt.update(INSERT_STUDENT_DETAILS, bo.getSname(), bo.getArds(), bo.getCourse());
		return count;
	}

}
