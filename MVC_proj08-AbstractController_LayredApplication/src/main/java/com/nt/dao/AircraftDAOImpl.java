package com.nt.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.nt.bo.AircraftBO;

public class AircraftDAOImpl implements AircraftDAO {
	private static final String GET_AIRCRAFT_DETAILS = "SELECT PID,NAME,ORIGIN,TYPE,TOTAL FROM AIRFORCE_AIRCRAFT_DETAILS";

	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public List<AircraftBO> retriveAllAircraftDetails(){
		List<AircraftBO> listBO = null;
		listBO = jt.query(GET_AIRCRAFT_DETAILS, rs -> {
			List<AircraftBO> list = new ArrayList();
			while (rs.next()) {
				AircraftBO bo = new AircraftBO();
				bo.setPid(rs.getInt(1));
				bo.setName(rs.getString(2));
				bo.setOrigin(rs.getString(3));
				bo.setType(rs.getString(4));
				bo.setTolal(rs.getInt(5));
				list.add(bo);
			}
			return list;
		});

		return listBO;

	}

}
