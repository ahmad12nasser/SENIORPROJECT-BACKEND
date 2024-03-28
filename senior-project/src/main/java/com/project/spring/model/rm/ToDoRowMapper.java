package com.project.spring.model.rm;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.lob.DefaultLobHandler;
import org.springframework.jdbc.support.lob.LobHandler;

import com.project.spring.model.ToDo;

public class ToDoRowMapper implements RowMapper<ToDo> {
	private LobHandler lobHandler = new DefaultLobHandler();

	@Override
	public ToDo mapRow(ResultSet rs, int rowNum) throws SQLException {
		ToDo toDo = new ToDo();
		int i = 0;
		toDo.setId(rs.getInt(++i));
		toDo.setFreelancerId(rs.getInt(++i));
		toDo.setClientId(rs.getInt(++i));
		toDo.setStatus(rs.getString(++i));
		toDo.setClient_first_name(rs.getString(++i));
		toDo.setClient_last_name(rs.getString(++i));
		toDo.setClient_profileImage(lobHandler.getBlobAsBytes(rs, ++i));
		toDo.setRequest_title(rs.getString(++i));
		toDo.setRequest_description(rs.getString(++i));
		toDo.setRequest_deadLine(rs.getString(++i));
		toDo.setRequest_location(rs.getString(++i));
		toDo.setRequest_price(rs.getBigDecimal(++i));
		toDo.setPost_title(rs.getString(++i));
		toDo.setPost_description(rs.getString(++i));
		toDo.setPost_deadLine(rs.getString(++i));
		toDo.setPost_location(rs.getString(++i));
		toDo.setPost_price(rs.getBigDecimal(++i));

		return toDo;

	}
}
