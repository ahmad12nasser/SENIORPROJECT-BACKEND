package com.project.spring.model.rm;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.project.spring.model.NeedClientAccept;

public class GetPendingAppliedRequestsByFreelancerIdRowMapper
		implements
			RowMapper<NeedClientAccept> {

	@Override
	public NeedClientAccept mapRow(ResultSet rs, int rowNum)
			throws SQLException {
		NeedClientAccept h = new NeedClientAccept();

		h.setId(rs.getInt("id"));
		h.setTitle(rs.getString("title"));
		h.setDateposted(rs.getDate("dateposted"));
		h.setDeadline(rs.getDate("deadline"));
		h.setLocation(rs.getString("location"));
		h.setCateg_name(rs.getString("categ_name"));
		h.setDescription(rs.getString("description"));
		h.setImage(rs.getString("image"));
		h.setPrice(rs.getBigDecimal("price"));
		h.setStatus(rs.getString("status"));
		h.setFreelancer_id(rs.getInt("client_id"));
		h.setFreelancerFirstName(rs.getString("clientFirstName"));
		h.setFreelancerLastName(rs.getString("clientLastName"));
		h.setFreelancerProfileImage(rs.getString("clientProfileImage"));

		return h;
	}
}
