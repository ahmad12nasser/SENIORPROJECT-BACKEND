package com.project.spring.dao.requests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.spring.dao.Queries;
import com.project.spring.dao.utils.GenericResponse;
import com.project.spring.model.Requests;

@Component
public class NewRequestDaoImpl implements NewRequestDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public GenericResponse createRequest(Requests requests) {
		try {
			jdbcTemplate.update(Queries.CREATE_REQUEST, requests.getClientId(),
					requests.getCateg_name(), requests.getDescription(),
					requests.getDatePosted(), requests.getDeadline(),
					requests.getLocation(), requests.getTitle(),
					requests.getPrice(), requests.getImage());
			return new GenericResponse(true, "Post created successfully",
					"200");
		} catch (Exception e) {
			e.printStackTrace();
			return new GenericResponse(false, "Error in creating post", "500");
		}
	}
}
