package com.project.spring.model.rm;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;

import org.springframework.jdbc.core.RowMapper;

import com.project.spring.model.Client;

public class ClientInfoByIdRowMapper implements RowMapper<Client> {
	@Override
	public Client mapRow(ResultSet rs, int rowNum) throws SQLException {
		Client c = new Client();

		int i = 0;

		c.setId(rs.getInt(++i));
		c.setFirstName(rs.getString(++i));
		c.setLastName(rs.getString(++i));
		c.setEmail(rs.getString(++i));
		c.setPassword(rs.getString(++i));
		c.setMobile(rs.getString(++i));
		c.setAge(rs.getInt(++i));
		c.setDescription(rs.getString(++i));
		c.setLocation(rs.getString(++i));
		c.setProfileImg(Base64.getEncoder().encode(rs.getBytes(++i)));

		return c;
	}
}
