package com.project.spring.dao.freelancer.operationRoom;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.spring.dao.Queries;

@Component
public class DeclineHiredPostDaoImpl implements DeclineHiredPostDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final static Logger log = LogManager
			.getLogger(DeclineHiredPostDaoImpl.class);

	@Override
	public int declineHiredPost(String status, int hired_post_id) {
		try {
			log.debug(
					"Successfully declining the hired post and changing the hired_post's status in the hired_posts table ");
			return jdbcTemplate.update(Queries.UPDATE_HIRED_POST_STATUS, status,
					hired_post_id);
		} catch (Exception e) {
			log.error("Error in declineHiredPost() " + e);
			return 0;
		}
	}
}
