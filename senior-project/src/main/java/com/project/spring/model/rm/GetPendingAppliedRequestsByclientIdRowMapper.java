package com.project.spring.model.rm;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;

import org.springframework.jdbc.core.RowMapper;

import com.project.spring.model.NeedClientAccept;

public class GetPendingAppliedRequestsByclientIdRowMapper
		implements
			RowMapper<NeedClientAccept> {
	@Override
	public NeedClientAccept mapRow(ResultSet rs, int rowNum)
			throws SQLException {
		NeedClientAccept rm = new NeedClientAccept();

		int i = 0;

		rm.setId(rs.getInt(++i));
		rm.setTitle(rs.getString(++i));
		rm.setDateposted(rs.getDate(++i));
		rm.setDeadline(rs.getDate(++i));
		rm.setCateg_name(rs.getString(++i));
		rm.setDescription(rs.getString(++i));
		rm.setImage(Base64.getEncoder().encode(rs.getBytes(++i)));
		rm.setPrice(rs.getBigDecimal(++i));
		rm.setStatus(rs.getString(++i));
		rm.setFreelancer_id(rs.getInt(++i));
		rm.setFreelancerFirstName(rs.getString(++i));
		rm.setFreelancerLastName(rs.getString(++i));
		rm.setFreelancerProfileImage(
				Base64.getEncoder().encode(rs.getBytes(++i)));

		return rm;
	}

}
