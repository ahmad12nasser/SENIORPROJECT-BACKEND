package com.project.spring.dao.requests;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.spring.dao.Queries;
import com.project.spring.model.Requests;
import com.project.spring.model.rm.RequestWithClientInfoRowMapper;

@Component
public class RequestsDaoImpl implements RequestsDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final static Logger log = LogManager
			.getLogger(RequestsDaoImpl.class);

	@Override
	public List<Requests> getAllRequestsWithClientInfo() {
		try {
			log.debug(
					"Successfully fetching the All requests with client info");
			return jdbcTemplate.query(Queries.GET_ALL_REQUESTS,
					new RequestWithClientInfoRowMapper());
		} catch (Exception e) {
			log.error(
					"An error occurred while retrieving requests from the database"
							+ e);
			return null;
		}
	}
}
