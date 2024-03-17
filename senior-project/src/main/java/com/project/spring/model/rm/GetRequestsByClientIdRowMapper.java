package com.project.spring.model.rm;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.project.spring.model.Requests;

public class GetRequestsByClientIdRowMapper implements RowMapper<Requests> {

	@Override
	public Requests mapRow(ResultSet rs, int rowNum) throws SQLException {
		Requests r = new Requests();

		r.setTitle(rs.getString("title"));
		r.setDatePosted(rs.getDate("dateposted"));
		r.setDeadline(rs.getDate("deadline"));
		r.setCateg_name(rs.getString("categ_name"));
		r.setLocation(rs.getString("location"));
		r.setDescription(rs.getString("description"));
		r.setImage(rs.getString("image"));
		r.setPrice(rs.getBigDecimal("price"));
		r.setStatus(rs.getString("status"));

		return r;
	}

}
