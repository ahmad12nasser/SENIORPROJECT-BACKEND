package com.project.spring.model.rm;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;

import org.springframework.jdbc.core.RowMapper;

import com.project.spring.model.Requests;

public class RequestWithClientInfoRowMapper implements RowMapper<Requests> {

	@Override
	public Requests mapRow(ResultSet rs, int rowNum) throws SQLException {
		Requests request = new Requests();
		int i = 0;

		request.setId(rs.getInt(++i));
		request.setTitle(rs.getString(++i));
		request.setDatePosted(rs.getDate(++i));
		request.setDeadline(rs.getDate(++i));
		request.setCateg_name(rs.getString(++i));
		request.setLocation(rs.getString(++i));
		request.setDescription(rs.getString(++i));
		request.setImage(Base64.getEncoder().encode(rs.getBytes(++i)));
		request.setPrice(rs.getBigDecimal(++i));
		request.setStatus(rs.getString(++i));
		// Map client information
		request.setClientId(rs.getInt(++i));
		request.setClientFirstName(rs.getString(++i));
		request.setClientLastName(rs.getString(++i));
		request.setClientProfileImage(
				Base64.getEncoder().encode(rs.getBytes(++i)));

		return request;
	}
}
