package com.project.spring.model.rm;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.project.spring.model.Requests;

public class RequestWithClientInfoRowMapper implements RowMapper<Requests> {

	@Override
	public Requests mapRow(ResultSet rs, int rowNum) throws SQLException {
		Requests request = new Requests();

		request.setId(rs.getInt("id"));
		request.setTitle(rs.getString("title"));
		request.setDatePosted(rs.getDate("dateposted"));
		request.setDeadline(rs.getDate("deadline"));
		request.setCateg_name(rs.getString("categ_name"));
		request.setLocation(rs.getString("location"));
		request.setDescription(rs.getString("description"));
		request.setImage(rs.getString("image"));
		request.setPrice(rs.getBigDecimal("price"));
		request.setStatus(rs.getString("request_status"));

		// Map client information
		request.setClientId(rs.getInt("client_id"));
		request.setClientFirstName(rs.getString("first_name"));
		request.setClientLastName(rs.getString("last_name"));
		request.setClientProfileImage(rs.getString("profile_image"));

		return request;
	}
}
