package com.project.spring.dao.auth;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.spring.dao.Queries;
import com.project.spring.model.Freelancer;

@Component
public class RegisterFreelancerDaoImpl implements RegisterFreelancerDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final static Log log = LogFactory
			.getLog(RegisterFreelancerDaoImpl.class);

	@Override
	public int registerFreelancer(Freelancer freelancer) {
		try {
			int counter = jdbcTemplate.update(Queries.INSERT_INTO_FREELANCER,
					freelancer.getFirstName(), freelancer.getLastName(),
					freelancer.getUsername(), freelancer.getEmail(),
					freelancer.getPassword(), freelancer.getProfileImg(),
					freelancer.getMobile(), freelancer.getLocation(),
					freelancer.getDescription());
			return counter++;
		} catch (Exception e) {
			log.error("Error in registerFreelancer(): " + e);
			return 0;
		}

	}

}
