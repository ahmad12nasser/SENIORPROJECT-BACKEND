package com.project.spring.model.rm;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;

import org.springframework.jdbc.core.RowMapper;

import com.project.spring.model.NeedClientAccept;

public class GetPendingAppliedRequestsByFreelancerIdRowMapper
		implements
			RowMapper<NeedClientAccept> {

	@Override
	public NeedClientAccept mapRow(ResultSet rs, int rowNum)
			throws SQLException {
		NeedClientAccept h = new NeedClientAccept();

		int i = 0;

		h.setId(rs.getInt(++i));
		h.setTitle(rs.getString(++i));
		h.setDateposted(rs.getDate(++i));
		h.setDeadline(rs.getDate(++i));
		h.setLocation(rs.getString(++i));
		h.setCateg_name(rs.getString(++i));
		h.setDescription(rs.getString(++i));
		h.setImage(Base64.getEncoder().encode(rs.getBytes(++i)));
		h.setPrice(rs.getBigDecimal(++i));
		h.setStatus(rs.getString(++i));
		h.setFreelancer_id(rs.getInt(++i));
		h.setFreelancerFirstName(rs.getString(++i));
		h.setFreelancerLastName(rs.getString(++i));
		h.setFreelancerProfileImage(
				Base64.getEncoder().encode(rs.getBytes(++i)));

		return h;
	}
}
