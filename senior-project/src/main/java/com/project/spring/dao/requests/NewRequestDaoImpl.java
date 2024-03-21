package com.project.spring.dao.requests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

	private final static Logger log = LogManager
			.getLogger(NewRequestDaoImpl.class);
	@Override
	public GenericResponse createRequest(Requests requests) {
		try {
			log.debug("Successfully creating new Request");
			jdbcTemplate.update(Queries.CREATE_REQUEST, requests.getClientId(),
					requests.getCateg_name(), requests.getDescription(),
					requests.getDatePosted(), requests.getDeadline(),
					requests.getLocation(), requests.getTitle(),
					requests.getPrice(), requests.getImage());
			return new GenericResponse(true, "Request created successfully",
					"200");
		} catch (Exception e) {
			log.error("Error In createRequest() " + e);
			return new GenericResponse(false, "Error in creating post", "500");
		}
	}
}
