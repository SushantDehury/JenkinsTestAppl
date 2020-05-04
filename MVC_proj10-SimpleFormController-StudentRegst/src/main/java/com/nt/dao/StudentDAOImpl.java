package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
	private static final String INSERT_STUDENT_DETAILS = "INSERT INTO STUDENT_DETAILS VALUES(STUDENT_SEQ.NEXTVAL,?,?,?)";
	private JdbcTemplate jt;

	public StudentDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	public int insert(StudentBO bo) {
		int count = 0;
		count = jt.update(INSERT_STUDENT_DETAILS, bo.getSname(), bo.getArdss(), bo.getCource());

		return count;
	}

}
