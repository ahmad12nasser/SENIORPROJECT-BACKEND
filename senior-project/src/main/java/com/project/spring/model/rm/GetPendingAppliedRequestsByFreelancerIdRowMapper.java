package com.project.spring.model.rm;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.lob.DefaultLobHandler;
import org.springframework.jdbc.support.lob.LobHandler;

import com.project.spring.model.NeedClientAccept;

public class GetPendingAppliedRequestsByFreelancerIdRowMapper
		implements
			RowMapper<NeedClientAccept> {
	private LobHandler lobHandler = new DefaultLobHandler();

	@Override
	public NeedClientAccept mapRow(ResultSet rs, int rowNum)
			throws SQLException {
		NeedClientAccept h = new NeedClientAccept();

		int i = 0;

		h.setId(rs.getInt(++i));
		h.setTitle(rs.getString(++i));
		h.setDatePosted(rs.getDate(++i));
		h.setDeadline(rs.getDate(++i));
		h.setCateg_name(rs.getString(++i));
		h.setLocation(rs.getString(++i));
		h.setDescription(rs.getString(++i));
		h.setImage(lobHandler.getBlobAsBytes(rs, ++i));
		h.setPrice(rs.getBigDecimal(++i));
		h.setStatus(rs.getString(++i));
		h.setRequest_id(rs.getInt(++i));
		h.setClient_id(rs.getInt(++i));
		h.setClientFirstName(rs.getString(++i));
		h.setClientLastName(rs.getString(++i));
		h.setClientProfileImage(lobHandler.getBlobAsBytes(rs, ++i));
		h.setClientMobile(rs.getString(++i));

		return h;
	}
}
