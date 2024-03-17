package com.project.spring.dao.freelancer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.spring.dao.Queries;

@Component
public class ApplyForRequestDaoImpl implements ApplyForRequestDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final static Logger log = LogManager
			.getLogger(ApplyForRequestDaoImpl.class);

	@Override
	public int insertAppliedRequest(long freelancerId, String status,
			long requestId) {
		try {
			return jdbcTemplate.update(Queries.INSERT_APPLIED_REQUEST,
					freelancerId, status, requestId);
		} catch (DataAccessException e) {
			log.error("Error in insertAppliedRequest " + e);
			return -1;
		}
	}
	@Override
	public int updateRequestStatus(long requestId, String status) {
		try {
			return jdbcTemplate.update(Queries.UPDATE_REQUEST_STATUS, status,
					requestId);
		} catch (DataAccessException e) {
			log.error("Error in updateRequestStatus " + e);
			return -1;
		}
	}
}
