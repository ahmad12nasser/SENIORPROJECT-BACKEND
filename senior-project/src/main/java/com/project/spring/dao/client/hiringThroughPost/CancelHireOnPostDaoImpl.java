package com.project.spring.dao.client.hiringThroughPost;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.spring.dao.Queries;
import com.project.spring.dao.utils.GenericResponse;

@Component
public class CancelHireOnPostDaoImpl implements CancelHireOnPostDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final static Logger log = LogManager
			.getLogger(CancelHireOnPostDaoImpl.class);

	@Override
	public GenericResponse cancelHireOnPost(int hiredPost_id) {
		try {
			jdbcTemplate.update(Queries.DELETE_HIRED_POST_BY_ID, hiredPost_id);
			log.debug("Successfully delete the column by:  " + hiredPost_id
					+ "as hired_post_id");
			return new GenericResponse(true,
					"Successfully delete the column by:  " + hiredPost_id
							+ "as hired_post_id",
					"200");
		} catch (Exception e) {
			log.error("Error in the function cancelHireOnPost() " + e);
			return new GenericResponse(false,
					"Error in the function cancelHireOnPost() ", "500");
		}
	}
	@Override
	public GenericResponse resetStatusPostAsPending(String status,
			int post_id) {
		try {
			jdbcTemplate.update(Queries.UPDATE_STATUS_AS_PENDING_IN_POSTS_TABLE,
					status, post_id);
			log.debug(
					"Successfully updating the post table status to be as pending");
			return new GenericResponse(true,
					"Successfully updating the post table status to be as pending",
					"200");
		} catch (Exception e) {
			log.error("Error in resetStatusPostAsPending()" + e);
			return new GenericResponse(false,
					"Error in resetStatusPostAsPending()", "500");
		}
	}
}
