package com.project.spring.model.rm;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.lob.DefaultLobHandler;
import org.springframework.jdbc.support.lob.LobHandler;

import com.project.spring.model.Requests;

public class GetRequestsByClientIdRowMapper implements RowMapper<Requests> {

	private LobHandler lobHandler = new DefaultLobHandler();

	@Override
	public Requests mapRow(ResultSet rs, int rowNum) throws SQLException {
		Requests r = new Requests();
		int i = 0;

		r.setId(rs.getInt(++i));
		r.setClientId(rs.getInt(++i));
		r.setTitle(rs.getString(++i));
		r.setDatePosted(rs.getDate(++i));
		r.setDeadline(rs.getDate(++i));
		r.setLocation(rs.getString(++i));
		r.setCateg_name(rs.getString(++i));
		r.setDescription(rs.getString(++i));
		r.setImage(lobHandler.getBlobAsBytes(rs, ++i));
		r.setPrice(rs.getBigDecimal(++i));
		r.setStatus(rs.getString(++i));

		return r;
	}

}
