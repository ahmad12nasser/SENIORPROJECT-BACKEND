package com.project.spring.model.rm;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.lob.DefaultLobHandler;
import org.springframework.jdbc.support.lob.LobHandler;

import com.project.spring.model.Client;

public class ClientInfoByIdRowMapper implements RowMapper<Client> {
	private LobHandler lobHandler = new DefaultLobHandler();

	@Override
	public Client mapRow(ResultSet rs, int rowNum) throws SQLException {
		Client c = new Client();

		int i = 0;

		c.setId(rs.getInt(++i));
		c.setFirstName(rs.getString(++i));
		c.setLastName(rs.getString(++i));
		c.setEmail(rs.getString(++i));
		c.setPassword(rs.getString(++i));
		c.setAge(rs.getInt(++i));
		c.setMobile(rs.getString(++i));
		c.setDescription(rs.getString(++i));
		c.setLocation(rs.getString(++i));
		c.setProfileImg(lobHandler.getBlobAsBytes(rs, ++i));

		return c;
	}
}
