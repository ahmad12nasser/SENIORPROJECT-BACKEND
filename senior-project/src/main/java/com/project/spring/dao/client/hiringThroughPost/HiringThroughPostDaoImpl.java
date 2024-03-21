package com.project.spring.dao.client.hiringThroughPost;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.spring.dao.Queries;

@Component
public class HiringThroughPostDaoImpl implements HiringThroughPostDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final static Logger log = LogManager
			.getLogger(HiringThroughPostDao.class);

	@Override
	public int insertHiredPost(long clientId, String status, long postId) {
		try {
			return jdbcTemplate.update(Queries.INSERT_HIRED_POSTS, clientId,
					status, postId);
		} catch (Exception e) {
			log.error("Error in insertHiredPost " + e);
			return -1;
		}
	}
	@Override
	public int updatePostStatus(long postId, String status) {
		try {
			return jdbcTemplate.update(Queries.UPDATE_POST_STATUS, status,
					postId);
		} catch (Exception e) {
			log.error("Error in updatePostStatus " + e);
			return -1;
		}
	}
}
