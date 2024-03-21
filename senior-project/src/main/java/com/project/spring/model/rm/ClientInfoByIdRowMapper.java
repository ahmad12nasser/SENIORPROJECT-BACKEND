package com.project.spring.model.rm;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.project.spring.model.Client;

public class ClientInfoByIdRowMapper implements RowMapper<Client> {
	@Override
	public Client mapRow(ResultSet rs, int rowNum) throws SQLException {
		Client c = new Client();
		c.setId(rs.getInt("id"));
		c.setFirstName(rs.getString("first_name"));
		c.setLastName(rs.getString("last_name"));
		c.setUsername(rs.getString("user_name"));
		c.setEmail(rs.getString("email"));
		c.setPassword(rs.getString("password"));
		c.setMobile(rs.getString("mobile"));
		c.setAge(rs.getInt("age"));
		c.setDescription(rs.getString("description"));
		c.setProfileImg(rs.getString("profile_image"));

		return c;
	}
}
