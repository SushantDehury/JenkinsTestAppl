package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.bo.UserBO;

@Repository
public class LoginDAOImpl implements LoginDAO {
	private static final String AUTHE_QUERY="SELECT COUNT(*) FROM USERLIST WHERE USERNAME=? AND PASSWORD=?";
	@Autowired
	private JdbcTemplate jt;

	@Override
	public int authenticate(UserBO bo) {
		int count=0;
		count=jt.queryForObject(AUTHE_QUERY,Integer.class, bo.getUser(),bo.getPwd() );
		return count;
	}

}
