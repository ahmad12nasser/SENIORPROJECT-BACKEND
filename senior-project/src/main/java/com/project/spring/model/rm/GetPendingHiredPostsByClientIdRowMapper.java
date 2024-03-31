package com.project.spring.model.rm;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.lob.DefaultLobHandler;
import org.springframework.jdbc.support.lob.LobHandler;

import com.project.spring.model.HiredPosts;

public class GetPendingHiredPostsByClientIdRowMapper
		implements
			RowMapper<HiredPosts> {
	private LobHandler lobHandler = new DefaultLobHandler();

	@Override
	public HiredPosts mapRow(ResultSet rs, int rowNum) throws SQLException {
		HiredPosts h = new HiredPosts();

		int i = 0;

		h.setFreelancer_id(rs.getInt(++i));
		h.setTitle(rs.getString(++i));
		h.setDateposted(rs.getDate(++i));
		h.setDeadline(rs.getDate(++i));
		h.setCateg_name(rs.getString(++i));
		h.setLocation(rs.getString(++i));
		h.setDescription(rs.getString(++i));
		h.setImage(lobHandler.getBlobAsBytes(rs, ++i));
		h.setStatus(rs.getString(++i));
		h.setFreelancer_id(rs.getInt(++i));
		h.setFreelancerFirstName(rs.getString(++i));
		h.setFreelancerLastName(rs.getString(++i));
		h.setFreelancerProfileImage(lobHandler.getBlobAsBytes(rs, ++i));

		return h;
	}
}
