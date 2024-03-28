package com.project.spring.dao.auth;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.spring.dao.Queries;
import com.project.spring.model.Client;

@Component
public class RegisterClientDaoImpl implements RegisterClientDao {

	private @Autowired JdbcTemplate jdbcTemplate;
	private final static Log log = LogFactory
			.getLog(RegisterFreelancerDaoImpl.class);

	@Override
	public int registerClient(Client client) {
		try {
			int counter = jdbcTemplate.queryForObject(
					Queries.INSERT_INTO_CLIENT,
					new Object[]{client.getFirstName(), client.getLastName(),
							client.getEmail(), client.getPassword(),
							client.getProfileImg(), client.getAge(),
							client.getLocation(), client.getDescription(),
							client.getMobile()},

					Integer.class);
			return counter++;
		} catch (Exception e) {
			log.error("Error in registerFreelancer(): " + e);
			e.printStackTrace();
			return 0;
		}
	}

}
