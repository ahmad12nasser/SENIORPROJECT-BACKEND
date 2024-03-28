package com.project.spring.model.rm;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;

import org.springframework.jdbc.core.RowMapper;

import com.project.spring.model.HiredPosts;

public class GetPendingHiredPostsByClientIdRowMapper
		implements
			RowMapper<HiredPosts> {

	@Override
	public HiredPosts mapRow(ResultSet rs, int rowNum) throws SQLException {
		HiredPosts h = new HiredPosts();

		int i = 0;

		h.setFreelancer_id(rs.getInt(++i));
		h.setFreelancerFirstName(rs.getString(++i));
		h.setFreelancerLastName(rs.getString(++i));
		h.setFreelancerProfileImage(
				Base64.getEncoder().encode(rs.getBytes(++i)));
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
