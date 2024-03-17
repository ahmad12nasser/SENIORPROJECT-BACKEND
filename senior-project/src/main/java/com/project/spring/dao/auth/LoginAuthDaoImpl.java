package com.project.spring.dao.auth;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.spring.dao.Queries;
import com.project.spring.model.Client;
import com.project.spring.model.Freelancer;

@Component
public class LoginAuthDaoImpl implements LoginAuthDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final static Logger log = LogManager
			.getLogger(LoginAuthDaoImpl.class);

	@Override
	public int isClient(Client client) {
		try {
			int client_id = jdbcTemplate.queryForObject(
					Queries.GET_CLINET_BY_ID,
					new Object[]{client.getEmail(), client.getPassword()},
					Integer.class);
			return client_id;
		} catch (EmptyResultDataAccessException e) {
			log.error("Error in isClient(): " + e);
			return 0; // Return a specific value to indicate no matching client
						// found
		}
	}

	@Override
	public int isFreelancer(Freelancer freelancer) {

		try {
			int freelancer_id = jdbcTemplate.queryForObject(
					Queries.GET_FREELNACER_BY_ID, new Object[]{
							freelancer.getEmail(), freelancer.getPassword()},
					int.class);
			return freelancer_id;
		} catch (EmptyResultDataAccessException e) {
			log.error("Error in isFreelancer(): " + e);
			return 0;
		}
	}
}
