package com.project.spring.model.rm;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.lob.DefaultLobHandler;
import org.springframework.jdbc.support.lob.LobHandler;

import com.project.spring.model.Freelancer;

public class FreelancerInfoByIdRowMapper implements RowMapper<Freelancer> {
	private LobHandler lobHandler = new DefaultLobHandler();
	@Override
	public Freelancer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Freelancer f = new Freelancer();
		int i = 0;
		f.setId(rs.getInt(++i));
		f.setFirstName(rs.getString(++i));
		f.setLastName(rs.getString(++i));
		f.setEmail(rs.getString(++i));
		f.setPassword(rs.getString(++i));
		f.setAge(rs.getInt(++i));
		f.setProfessionCategName(rs.getString(++i));
		f.setMobile(rs.getString(++i));
		f.setLocation(rs.getString(++i));
		f.setProfileImg(lobHandler.getBlobAsBytes(rs, ++i));
		f.setDescription(rs.getString(++i));

		return f;
	}
}
