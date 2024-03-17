package com.project.spring.model.rm;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.project.spring.model.ToDo;

public class ToDoRowMapper implements RowMapper<ToDo> {

	@Override
	public ToDo mapRow(ResultSet rs, int i) throws SQLException {
		ToDo toDo = new ToDo();
		toDo.setId(rs.getInt("todo_id"));
		toDo.setFreelancerId(rs.getInt("freelancer_id"));
		toDo.setClientId(rs.getInt("client_id"));
		toDo.setStatus(rs.getString("todo_status"));
		toDo.setClient_first_name(rs.getString("client_first_name"));
		toDo.setClient_last_name(rs.getString("client_last_name"));
		toDo.setClient_profileImage(rs.getString("client_profileImage"));
		toDo.setRequest_title(rs.getString("request_title"));
		toDo.setRequest_description(rs.getString("request_description"));
		toDo.setRequest_deadLine(rs.getString("request_deadLine"));
		toDo.setRequest_location(rs.getString("request_location"));
		toDo.setRequest_price(rs.getBigDecimal("request_price"));
		toDo.setPost_title(rs.getString("post_title"));
		toDo.setPost_description(rs.getString("post_description"));
		toDo.setPost_deadLine(rs.getString("post_deadLine"));
		toDo.setPost_location(rs.getString("post_location"));
		toDo.setPost_price(rs.getBigDecimal("post_price"));
		
		return toDo;
		
	}
}
