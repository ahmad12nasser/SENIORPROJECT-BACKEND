package com.project.spring.model.rm;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.project.spring.model.Posts;

public class PostWithFreelancerInfoRowMapper implements RowMapper<Posts> {

	@Override
	public Posts mapRow(ResultSet rs, int rowNum) throws SQLException {
		Posts post = new Posts();

		post.setId(rs.getInt("id"));
		post.setTitle(rs.getString("title"));
		post.setDatePosted(rs.getDate("date_posted"));
		post.setDeadline(rs.getDate("deadline"));
		post.setLocation(rs.getString("location"));
		post.setCategName(rs.getString("categ_name"));
		post.setDescription(rs.getString("Description"));
		post.setImage(rs.getString("image"));
		post.setPrice(rs.getBigDecimal("price"));
		post.setStatus(rs.getString("status"));
		// Map freeLancer Info
		post.setFreelancerId(rs.getInt("freelancer_id"));
		post.setFreelancerFirstName(rs.getString("freelancerFirstName"));
		post.setFreelancerLastName(rs.getString("freelancerLastName"));
		post.setFreelancerProfileImge(rs.getString("freelancerProfileImage"));
		return post;
	}
}
