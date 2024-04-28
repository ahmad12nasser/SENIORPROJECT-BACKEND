package com.project.spring.dao.freelancer.applyOnRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.spring.dao.Queries;
import com.project.spring.dao.utils.GenericResponse;

@Component
public class CancelApplyOnRequestDaoImpl implements CancelApplyOnRequestDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final static Logger log = LogManager
			.getLogger(CancelApplyOnRequestDaoImpl.class);

	@Override
	public GenericResponse cancelApplyOnRequest(int appliedRequest_id) {
		try {
			jdbcTemplate.update(Queries.DELETE_APPLIED_REQUEST_BY_ID,
					appliedRequest_id);
			log.debug("Successfully deleting the Applied Request by "
					+ appliedRequest_id + " as appliedRequest_id");
			return new GenericResponse(true,
					"Successfully deleting the Applied Request by "
							+ appliedRequest_id + " as appliedRequest_id",
					"200");
		} catch (Exception e) {
			log.error(
					"Error in cancelApplyOnRequest() during deleting the appliedRequest "
							+ e);
			return new GenericResponse(false,
					"Error in the internal server during deleting the applied request in the data base",
					"500");
		}
	}
	@Override
	public GenericResponse resetStatusRequestAsPending(String status,
			int request_id) {
		try {
			jdbcTemplate.update(
					Queries.UPDATE_STATUS_AS_PENDING_IN_REQUESTS_TABLE, status,
					request_id);
			log.debug("Successfully setting the Request's status as Pending by "
					+ request_id + " as request_id");
			return new GenericResponse(true,
					"Successfully setting the Request's status as Pending by "
							+ request_id + " as request_id",
					"200");
		} catch (Exception e) {
			log.error(
					"Error in resetStatusRequestAsPending() during setting the request's status as Pending"
							+ e);
			return new GenericResponse(false,
					"Error in resetStatusRequestAsPending() during setting the request's status as Pending",
					"500");
		}
	}
}
