package com.project.spring.dao.client.settings;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.spring.dao.Queries;
import com.project.spring.model.Client;
import com.project.spring.model.rm.ClientInfoByIdRowMapper;

@Component
public class ClientInfoDaoImpl implements ClientInfoDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final static Logger log = LogManager
			.getLogger(ClientInfoDaoImpl.class);

	@Override
	public List<Client> getClientInfoByCLientId(int client_id) {
		try {
			log.debug("Successfully fetching client info by client_id");
			return jdbcTemplate.query(Queries.GET_CLIENT_INFO_BY_ID,
					new Object[]{client_id}, new ClientInfoByIdRowMapper());
		} catch (Exception e) {
			log.error("Error in getClientInfoByClientId() " + e);
			return null;
		}
	}

}
