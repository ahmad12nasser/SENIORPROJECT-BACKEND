package com.project.spring.model.rm;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.project.spring.model.HiredPostsWithFreelancerId;

public class GetPendingHiredPostsByFreelancerIdRowMapper
		implements
			RowMapper<HiredPostsWithFreelancerId> {
	@Override
	public HiredPostsWithFreelancerId mapRow(ResultSet rs, int rowNum)
			throws SQLException {
		HiredPostsWithFreelancerId h = new HiredPostsWithFreelancerId();

		h.setClient_id(rs.getInt("client_id"));
		h.setClientFirstName(rs.getString("clientFirstName"));
		h.setClientLastName(rs.getString("clientLastName"));
		h.setClientProfileImage(rs.getString("clientProfileImage"));
		h.setId(rs.getInt("id"));
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
