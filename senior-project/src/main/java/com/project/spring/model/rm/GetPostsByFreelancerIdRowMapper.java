package com.project.spring.model.rm;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.lob.DefaultLobHandler;
import org.springframework.jdbc.support.lob.LobHandler;

import com.project.spring.model.Posts;

public class GetPostsByFreelancerIdRowMapper implements RowMapper<Posts> {
	private LobHandler lobHandler = new DefaultLobHandler();

	@Override
	public Posts mapRow(ResultSet rs, int rowNum) throws SQLException {

		Posts posts = new Posts();
		int i = 0;
		posts.setId(rs.getInt(++i));
		posts.setFreelancerId(rs.getInt(++i));
		posts.setTitle(rs.getString(++i));
		posts.setDatePosted(rs.getDate(++i));
		posts.setDeadline(rs.getDate(++i));
		posts.setLocation(rs.getString(++i));
		posts.setCategName(rs.getString(++i));
		posts.setDescription(rs.getString(++i));
		posts.setImage(lobHandler.getBlobAsBytes(rs, ++i));
		posts.setPrice(rs.getBigDecimal(++i));
		posts.setStatus(rs.getString(++i));
		return posts;
	}
}
