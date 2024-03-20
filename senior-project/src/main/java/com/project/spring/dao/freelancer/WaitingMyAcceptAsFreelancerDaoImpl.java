package com.project.spring.dao.freelancer;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.spring.dao.Queries;
import com.project.spring.model.HiredPostsWithFreelancerId;
import com.project.spring.model.rm.GetPendingHiredPostsByFreelancerIdRowMapper;

@Component
public class WaitingMyAcceptAsFreelancerDaoImpl implements WaitingMyAcceptAsFreelancerDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final static Logger log = LogManager
			.getLogger(WaitingMyAcceptAsFreelancerDaoImpl.class);

	@Override
	public List<HiredPostsWithFreelancerId> getPendingHiredPostsByFreelancerId(
			int freelancer_id) {
		try {
			log.debug(
					"Successfully fetching hired posts by freelancerId from the database");
			return jdbcTemplate.query(
					Queries.GET_PENDING_HIRED_POSTS_BY_FREELANCERID,
					new Object[]{freelancer_id},
					new GetPendingHiredPostsByFreelancerIdRowMapper());
		} catch (Exception e) {
			log.error("Error in getPendingHiredPostsByFreelancerId() " + e);
			return null;
		}
	}
}
