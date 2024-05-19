package com.project.spring.model.rm;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.lob.DefaultLobHandler;
import org.springframework.jdbc.support.lob.LobHandler;

import com.project.spring.model.NeedClientAcceptByClientId;

public class GetPendingAppliedRequestsByclientIdRowMapper
		implements
			RowMapper<NeedClientAcceptByClientId> {
	private LobHandler lobHandler = new DefaultLobHandler();

	@Override
	public NeedClientAcceptByClientId mapRow(ResultSet rs, int rowNum)
			throws SQLException {
		NeedClientAcceptByClientId m = new NeedClientAcceptByClientId();

		int i = 0;
		m.setId(rs.getInt(++i));
		m.setTitle(rs.getString(++i));
		m.setDateposted(rs.getDate(++i));
		m.setDeadline(rs.getDate(++i));
		m.setCateg_name(rs.getString(++i));
		m.setLocation(rs.getString(++i));
		m.setDescription(rs.getString(++i));
		m.setImage(lobHandler.getBlobAsBytes(rs, ++i));
		m.setStatus(rs.getString(++i));
		m.setRequest_id(rs.getInt(++i));
		m.setPrice(rs.getBigDecimal(++i));
		m.setFreelancer_id(rs.getInt(++i));
		m.setFreelancerFirstName(rs.getString(++i));
		m.setFreelancerLastName(rs.getString(++i));
		m.setFreelancerProfileImage(lobHandler.getBlobAsBytes(rs, ++i));
		m.setFreelancerMobile(rs.getString(++i));

		return m;
	}

}
