package com.project.spring.dao.freelancer;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.spring.dao.Queries;
import com.project.spring.model.NeedClientAccept;
import com.project.spring.model.rm.GetPendingAppliedRequestsByFreelancerIdRowMapper;

@Component
public class WaitingClientAcceptDaoImpl implements WaitingClientAcceptDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final static Logger log = LogManager
			.getLogger(WaitingClientAcceptDaoImpl.class);

	@Override
	public List<NeedClientAccept> getPendingAppliedRequestsByFreelancerId(
			int freelancer_id) {
		try {
			log.debug(
					"Successfully fetching the applied requests by freelancerId from the database");
			return jdbcTemplate.query(
					Queries.GET_PENDING_APPLIED_REQUESTS_BY_FREELANCERID,
					new Object[]{freelancer_id},
					new GetPendingAppliedRequestsByFreelancerIdRowMapper());
		} catch (Exception e) {
			log.error(
					"An error occured while retriving applied requests from the database"
							+ e);
			return null;
		}
	}
}
