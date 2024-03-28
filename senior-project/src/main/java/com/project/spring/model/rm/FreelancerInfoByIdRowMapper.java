package com.project.spring.model.rm;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;

import org.springframework.jdbc.core.RowMapper;

import com.project.spring.model.Freelancer;

public class FreelancerInfoByIdRowMapper implements RowMapper<Freelancer> {

	@Override
	public Freelancer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Freelancer f = new Freelancer();
		f.setId(rs.getInt("id"));
		f.setFirstName(rs.getString("first_name"));
		f.setLastName(rs.getString("last_name"));
		f.setEmail(rs.getString("email"));
		f.setPassword(rs.getString("password"));
		f.setAge(rs.getInt("age"));
		f.setProfessionCategName(rs.getString("categ_name"));
		f.setMobile(rs.getString("mobile"));
		f.setProfileImg(
				Base64.getEncoder().encode(rs.getBytes("profile_image")));
		f.setDescription(rs.getString("description"));
		f.setLocation(rs.getString("location"));

		return f;
	}
}
