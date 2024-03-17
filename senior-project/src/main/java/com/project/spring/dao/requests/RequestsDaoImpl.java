package com.project.spring.dao.requests;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
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

	private Log log = LogFactory.getLog(RequestsDaoImpl.class);

	@Override
	public List<Requests> getAllRequestsWithClientInfo() {
		try {

			return jdbcTemplate.query(Queries.GET_ALL_REQUESTS,
					new RequestWithClientInfoRowMapper());
		} catch (Exception e) {
			log.error(
					"An error occurred while retrieving requests from the database",
					e);
			return null;
		}
	}
}
