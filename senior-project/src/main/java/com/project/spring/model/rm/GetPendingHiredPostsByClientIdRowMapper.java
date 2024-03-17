package com.project.spring.model.rm;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.project.spring.model.HiredPosts;

public class GetPendingHiredPostsByClientIdRowMapper
		implements
			RowMapper<HiredPosts> {

	@Override
	public HiredPosts mapRow(ResultSet rs, int rowNum) throws SQLException {
		HiredPosts h = new HiredPosts();

		h.setFreelancer_id(rs.getInt("freelancer_id"));
		h.setFreelancerFirstName(rs.getString("freelancerFirstName"));
		h.setFreelancerLastName(rs.getString("freelancerLastName"));
		h.setFreelancerProfileImage(rs.getString("freelancerProfileImage"));
		h.setTitle(rs.getString("title"));
		h.setDateposted(rs.getDate("dateposted"));
		h.setDeadline(rs.getDate("deadline"));
		h.setCateg_name(rs.getString("categ_name"));
		h.setLocation(rs.getString("location"));
		h.setDescription(rs.getString("description"));
		h.setImage(rs.getString("image"));
		h.setPrice(rs.getBigDecimal("price"));
		h.setStatus(rs.getString("status"));

		return h;
	}
}
