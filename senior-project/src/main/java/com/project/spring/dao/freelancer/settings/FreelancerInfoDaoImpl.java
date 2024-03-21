package com.project.spring.dao.freelancer.settings;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.spring.dao.Queries;
import com.project.spring.model.Freelancer;
import com.project.spring.model.rm.FreelancerInfoByIdRowMapper;

@Component
public class FreelancerInfoDaoImpl implements FreelancerInfoDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final static Logger log = LogManager
			.getLogger(FreelancerInfoDaoImpl.class);
	@Override
	public List<Freelancer> getFreelancerById(int freelancer_id) {
		try {
			log.debug("Successfully fetching freelancer's info");
			return jdbcTemplate.query(Queries.GET_FREELANCER_INFO_BY_ID,
					new Object[]{freelancer_id},
					new FreelancerInfoByIdRowMapper());
		} catch (Exception e) {
			log.error("Error in getFreelancerById() " + e);
			return null;
		}
	}
}