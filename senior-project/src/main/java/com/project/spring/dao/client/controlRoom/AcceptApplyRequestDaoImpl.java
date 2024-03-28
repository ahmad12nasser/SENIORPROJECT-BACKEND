package com.project.spring.dao.client.controlRoom;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.spring.dao.Queries;

@Component
public class AcceptApplyRequestDaoImpl implements AcceptApplyRequestDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final static Logger log = LogManager
			.getLogger(AcceptApplyRequestDaoImpl.class);

	@Override
	public int insertIntoToDo(String status, int applied_request_id) {
		try {
			log.debug(
					"Successfully adding the applied request into toDo table in database");
			return jdbcTemplate.update(Queries.INSERT_APPLIED_REQUEST_INTO_TODO,
					status, applied_request_id);
		} catch (Exception e) {
			log.error("Error in insertIntoToDo() " + e);
			return -1;
		}
	}
	@Override
	public int updateAppliedRequestsStatus(String status,
			int applied_request_id) {
		try {
			log.debug(
					"Successfully updating the applied_request's status to Accepted");
			return jdbcTemplate.update(Queries.UPDATE_APPLIED_REQUEST_STATUS,
					status, applied_request_id);
		} catch (Exception e) {
			log.error("Error in updateAppliedRequestsStatus() " + e);
			return -1;
		}
	}
}
