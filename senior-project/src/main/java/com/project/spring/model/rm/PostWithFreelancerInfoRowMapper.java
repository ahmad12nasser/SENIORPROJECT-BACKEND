package com.project.spring.model.rm;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;

import org.springframework.jdbc.core.RowMapper;

import com.project.spring.model.Posts;

public class PostWithFreelancerInfoRowMapper implements RowMapper<Posts> {

	@Override
	public Posts mapRow(ResultSet rs, int rowNum) throws SQLException {
		Posts post = new Posts();
		int i = 0;

		post.setId(rs.getInt(++i));
		post.setTitle(rs.getString(++i));
		post.setDatePosted(rs.getDate(++i));
		post.setDeadline(rs.getDate(++i));
		post.setLocation(rs.getString(++i));
		post.setCategName(rs.getString(++i));
		post.setDescription(rs.getString(++i));
		post.setImage(Base64.getEncoder().encode(rs.getBytes(++i)));
		post.setPrice(rs.getBigDecimal(++i));
		post.setStatus(rs.getString(++i));
		// Map freeLancer Info
		post.setFreelancerId(rs.getInt(++i));
		post.setFreelancerFirstName(rs.getString(++i));
		post.setFreelancerLastName(rs.getString(++i));
		post.setFreelancerProfileImge(
				Base64.getEncoder().encode(rs.getBytes(++i)));

		return post;
	}
}
