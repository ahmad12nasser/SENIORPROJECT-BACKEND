package com.project.spring.dao.client;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.spring.dao.Queries;
import com.project.spring.model.NeedClientAccept;
import com.project.spring.model.rm.getPendingAppliedRequestsByclientIdRowMapper;

@Component
public class WaitingMyAcceptDaoImpl implements WaitingMyAcceptDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private Logger log = LogManager.getLogger(WaitingMyAcceptDaoImpl.class);

	@Override
	public List<NeedClientAccept> getPendingAppliedRequestsByclientId(
			int client_id) {
		try {
			log.debug(
					"Success in fetching Applied Requests that's need the client's Accept from the database");
			return jdbcTemplate.query(
					Queries.GET_PENDING_APPLIED_REQUESTS_BY_CLIENTID,
					new Object[]{client_id},
					new getPendingAppliedRequestsByclientIdRowMapper());
		} catch (Exception e) {
			log.error(
					"Error in fetching the Applied Requests that's need the client's Accept from the database"
							+ e);
			return null;
		}
	}
}
