package com.project.spring.dao.client;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.spring.dao.Queries;
import com.project.spring.model.HiredPosts;
import com.project.spring.model.rm.GetPendingHiredPostsByClientIdRowMapper;

@Component
public class WaitingAcceptFreelancerDaoImpl
		implements
			WaitingAcceptFreelancerDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private Logger log = LogManager
			.getLogger(WaitingAcceptFreelancerDaoImpl.class);

	@Override
	public List<HiredPosts> getPendingHiredPostsByClientId(int client_id) {
		try {
			log.debug(
					"Success in fetching the hiredPosts by clientId from database");
			return jdbcTemplate.query(
					Queries.GET_PENDING_HIRED_POSTS_BY_CIENTID,
					new Object[]{client_id},
					new GetPendingHiredPostsByClientIdRowMapper());
		} catch (Exception e) {
			log.error(
					"An error occured while retriving hiredPosts from the database"
							+ e);
			return null;
		}
	}
}
