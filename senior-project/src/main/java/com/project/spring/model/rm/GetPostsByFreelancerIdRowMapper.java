package com.project.spring.model.rm;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.project.spring.model.Posts;

public class GetPostsByFreelancerIdRowMapper implements RowMapper<Posts>{

	@Override
	public Posts mapRow(ResultSet rs, int rowNum) throws SQLException {

		Posts posts = new Posts();
		
		posts.setTitle(rs.getString("title"));
		posts.setDatePosted(rs.getDate("date_posted"));
		posts.setDeadline(rs.getDate("deadline"));
		posts.setCategName(rs.getString("categ_name"));
		posts.setLocation("location");
		posts.setDescription("description");
		posts.setImage(rs.getString("image"));
		posts.setPrice(rs.getBigDecimal("price"));
		return posts;
	}
}
