package com.project.spring.model.rm;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;

import org.springframework.jdbc.core.RowMapper;

import com.project.spring.model.HiredPostsWithFreelancerId;

public class GetPendingHiredPostsByFreelancerIdRowMapper
		implements
			RowMapper<HiredPostsWithFreelancerId> {
	@Override
	public HiredPostsWithFreelancerId mapRow(ResultSet rs, int rowNum)
			throws SQLException {
		HiredPostsWithFreelancerId h = new HiredPostsWithFreelancerId();

		int i = 0;

		h.setClient_id(rs.getInt(++i));
		h.setClientFirstName(rs.getString(++i));
		h.setClientLastName(rs.getString(++i));
		h.setClientProfileImage(Base64.getEncoder().encode(rs.getBytes(++i)));
		h.setId(rs.getInt(++i));
		h.setTitle(rs.getString(++i));
		h.setDateposted(rs.getDate(++i));
		h.setDeadline(rs.getDate(++i));
		h.setCateg_name(rs.getString(++i));
		h.setLocation(rs.getString(++i));
		h.setDescription(rs.getString(++i));
		h.setImage(Base64.getEncoder().encode(rs.getBytes(++i)));
		h.setPrice(rs.getBigDecimal(++i));
		h.setStatus(rs.getString(++i));

		return h;
	}

}
