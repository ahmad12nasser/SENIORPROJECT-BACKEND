package com.project.spring.dao.client.controlRoom;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.spring.dao.Queries;

@Component
public class RejectApplyRequestDaoImpl implements RejectApplyRequestDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final static Logger log = LogManager
			.getLogger(RejectApplyRequestDaoImpl.class);

	@Override
	public int rejectApplyRequest(String status, int applied_request_id) {
		try {
			log.debug(
					"Successfully reject the apply request with changing the status to Rejected");
			return jdbcTemplate.update(Queries.UPDATE_APPLIED_REQUEST_STATUS,
					status, applied_request_id);
		} catch (Exception e) {
			log.error("Error in rejectApplyRequest() " + e);
			return -1;
		}
	}
	@Override
	public int setTheStatusOfRequestAsPending(String status, int request_id) {
		try {
			log.debug(
					"Successfully setting the request's status as pending by the request_id");
			return jdbcTemplate.update(
					Queries.UPDATE_STATUS_AS_PENDING_IN_REQUESTS_TABLE, status,
					request_id);
		} catch (Exception e) {
			log.error(
					" error in setTheStatusOfRequestAsPending() in the rejecting of the applying on the request "
							+ e);
			return -1;
		}
	}
}
