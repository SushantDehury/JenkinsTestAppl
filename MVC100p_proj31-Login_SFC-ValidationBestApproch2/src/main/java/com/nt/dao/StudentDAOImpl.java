package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.bo.StudentBO;

@Repository
public class StudentDAOImpl implements StudentDAO {
	public static final String INSERT_STUDENT = "INSERT INTO STUDENT VALUES(STUDENT_SEQ.NEXTVAL,?,?,?)";
	@Autowired
	private JdbcTemplate jt;

	@Override
	public int insertStudent(StudentBO bo) {
		int count = 0;
		count = jt.update(INSERT_STUDENT, bo.getName(), bo.getAddress(), bo.getPhone());
		return count;
	}

}
