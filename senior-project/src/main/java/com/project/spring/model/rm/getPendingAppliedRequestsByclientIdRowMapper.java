package com.project.spring.model.rm;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.project.spring.model.NeedClientAccept;

public class getPendingAppliedRequestsByclientIdRowMapper
		implements
			RowMapper<NeedClientAccept> {
	@Override
	public NeedClientAccept mapRow(ResultSet rs, int rowNum)
			throws SQLException {
		NeedClientAccept rm = new NeedClientAccept();
		rm.setId(rs.getInt("id"));
		rm.setTitle(rs.getString("title"));
		rm.setDateposted(rs.getDate("dateposted"));
		rm.setDeadline(rs.getDate("deadline"));
		rm.setCateg_name(rs.getString("categ_name"));
		rm.setDescription(rs.getString("description"));
		rm.setImage(rs.getString("image"));
		rm.setPrice(rs.getBigDecimal("price"));
		rm.setStatus(rs.getString("status"));
		rm.setFreelancer_id(rs.getInt("freelancer_id"));
		rm.setFreelancerFirstName(rs.getString("freelancerFirstName"));
		rm.setFreelancerLastName(rs.getString("freelancerLastName"));
		rm.setFreelancerProfileImage(rs.getString("freelancerProfileImage"));
		return rm;
	}

}
