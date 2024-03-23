package com.project.spring.model.rm;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.project.spring.model.LoginResponse;

public class LoggedInUserRowMapper implements RowMapper<LoginResponse> {
	@Override
	public LoginResponse mapRow(ResultSet rs, int rowNum) throws SQLException {
		LoginResponse l = new LoginResponse();

		l.setUserId(rs.getLong("id"));
		l.setUserRole(rs.getString("userRole"));

		return l;
	}
}
