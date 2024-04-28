package com.project.spring.dao.requests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.spring.dao.Queries;
import com.project.spring.dao.utils.GenericResponse;

@Component
public class DeleteRequestByIdDaoImpl implements DeleteRequestByIdDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final static Logger log = LogManager
			.getLogger(DeleteRequestByIdDaoImpl.class);

	@Override
	public GenericResponse deleteRequestById(int request_id) {
		try {
			jdbcTemplate.update(Queries.DELETE_REQUEST_BY_REQUEST_ID,
					request_id);
			log.debug("Successfully Delete the Request by " + request_id
					+ " as request_id");

			return new GenericResponse(true,
					"Successfully Delete the Request by " + request_id
							+ " as request_id",
					"200");
		} catch (Exception e) {
			log.error("Error in deleteRequestById() during deleting the request"
					+ e);
			return new GenericResponse(false,
					"Error in deleteRequestById() during deleting the request by "
							+ request_id + " as request_id",
					"500");
		}
	}
}
