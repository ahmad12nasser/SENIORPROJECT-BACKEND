package com.project.spring.dao.requests;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Component;

import com.project.spring.dao.Queries;
import com.project.spring.dao.utils.GenericResponse;
import com.project.spring.model.Requests;

@Component
public class NewRequestDaoImpl implements NewRequestDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private final static Logger log = LogManager
			.getLogger(NewRequestDaoImpl.class);

	@Override
	public GenericResponse createRequest(Requests requests) {
		try {

			jdbcTemplate.update(Queries.CREATE_REQUEST,
					new PreparedStatementSetter() {
						@Override
						public void setValues(PreparedStatement ps)
								throws SQLException {
							int i = 0;
							ps.setLong(++i, requests.getClientId());
							ps.setString(++i, requests.getCateg_name());
							ps.setString(++i, requests.getDescription());
							ps.setDate(++i, requests.getDatePosted());
							ps.setDate(++i, requests.getDeadline());
							ps.setString(++i, requests.getLocation());
							ps.setString(++i, requests.getTitle());
							ps.setBigDecimal(++i, requests.getPrice());
							ps.setBytes(++i, requests.getImage());
						}
					});
			return new GenericResponse(true, "Request created successfully",
					"200");
		} catch (Exception e) {
			log.error("Error in createRequest(): ", e);
			return new GenericResponse(false, "Failed to create request",
					"500");
		}
	}
}
