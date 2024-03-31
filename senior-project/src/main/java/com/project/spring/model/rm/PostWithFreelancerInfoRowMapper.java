package com.project.spring.model.rm;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.lob.DefaultLobHandler;
import org.springframework.jdbc.support.lob.LobHandler;

import com.project.spring.model.Posts;

public class PostWithFreelancerInfoRowMapper implements RowMapper<Posts> {
	private LobHandler lobHandler = new DefaultLobHandler();
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
		post.setImage(lobHandler.getBlobAsBytes(rs, ++i));
		post.setPrice(rs.getBigDecimal(++i));
		post.setStatus(rs.getString(++i));
		// Map freeLancer Info
		post.setFreelancerId(rs.getInt(++i));
		post.setFreelancerFirstName(rs.getString(++i));
		post.setFreelancerLastName(rs.getString(++i));
		post.setFreelancerProfileImge(lobHandler.getBlobAsBytes(rs, ++i));

		return post;
	}
}
