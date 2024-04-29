package com.project.spring.model.rm;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.lob.DefaultLobHandler;
import org.springframework.jdbc.support.lob.LobHandler;

import com.project.spring.model.Rating;

public class RatingRowMapper implements RowMapper<Rating> {

	private LobHandler lobHandler = new DefaultLobHandler();

	@Override
	public Rating mapRow(ResultSet rs, int rowNum) throws SQLException {
		Rating r = new Rating();
		int i = 0;
		r.setRating(rs.getInt(++i));
		r.setComment(rs.getString(++i));

		return r;
	}
}
