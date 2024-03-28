package com.project.spring.dao.freelancer.operationRoom;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.spring.dao.Queries;

@Component
public class ApproveHiredPostDaoImpl implements ApproveHiredPostDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final static Logger log = LogManager
			.getLogger(ApproveHiredPostDaoImpl.class);

	@Override
	public int insertIntoToDo(String status, int hired_post_id) {
		try {
			log.debug(
					"Successfully adding the hired post into toDo table in the database with status onDoing");
			return jdbcTemplate.update(Queries.INSERT_HIRED_POSTS_INTO_TODO,
					status, hired_post_id);
		} catch (Exception e) {
			log.error("Error in insertIntoToDo() " + e);
			return -1;
		}
	}
	@Override
	public int updateHiredPostStatus(String status, int hired_post_id) {
		try {
			log.debug(
					"Successfully updating the hired_post's status to Accepted");
			return jdbcTemplate.update(Queries.UPDATE_HIRED_POST_STATUS, status,
					hired_post_id);
		} catch (Exception e) {
			log.error("Error in updateHiredPostStatus() " + e);
			return -1;
		}

	}
}
