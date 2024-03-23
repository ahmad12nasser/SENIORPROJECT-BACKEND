package com.project.spring.dao.auth;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.spring.dao.Queries;
import com.project.spring.model.Client;
import com.project.spring.model.Freelancer;
import com.project.spring.model.LoginResponse;
import com.project.spring.model.rm.LoggedInUserRowMapper;

@Component
public class LoginAuthDaoImpl implements LoginAuthDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final static Logger log = LogManager
			.getLogger(LoginAuthDaoImpl.class);

	@Override
	public List<LoginResponse> isClient(Client client) {
		try {
			return jdbcTemplate.query(
					Queries.GET_CLINET_BY_ID,
					new Object[]{client.getEmail(), client.getPassword()},
					new LoggedInUserRowMapper());
			
		} catch (EmptyResultDataAccessException e) {
			log.error("Error in isClient(): " + e);
			return null; // Return a specific value to indicate no matching client
						// found
		}
	}

	@Override
	public List<LoginResponse> isFreelancer(Freelancer freelancer) {

		try {
			return jdbcTemplate.query(
					Queries.GET_FREELNACER_BY_ID,
					new Object[]{freelancer.getEmail(), freelancer.getPassword()},
					new LoggedInUserRowMapper());
			
		} catch (EmptyResultDataAccessException e) {
			log.error("Error in isFreelancer(): " + e);
			return null;
		}
	}
}
