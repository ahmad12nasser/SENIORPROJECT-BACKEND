package com.project.spring.dao.client.myRequests;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.spring.dao.Queries;
import com.project.spring.model.Requests;
import com.project.spring.model.rm.GetRequestsByClientIdRowMapper;
@Component
public class GetRequestsByClientIdDaoImpl implements GetRequestsByClientIdDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private Logger log = LogManager
			.getLogger(GetRequestsByClientIdDaoImpl.class);

	@Override
	public List<Requests> getRequestsByClientId(int clientId) {
		try {
			return jdbcTemplate.query(Queries.GET_REQUESTS_BY_CLIENTID,
					new Object[]{clientId},
					new GetRequestsByClientIdRowMapper());
		} catch (Exception e) {
			log.error(
					"An error occured while retriving requests from the database"
							+ e);
			return null;
		}
	}
}
