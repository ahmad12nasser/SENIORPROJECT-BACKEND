package com.project.spring.dao.requests;

import java.io.ByteArrayInputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.support.lob.DefaultLobHandler;
import org.springframework.jdbc.support.lob.LobHandler;
import org.springframework.stereotype.Component;

import com.project.spring.dao.Queries;
import com.project.spring.dao.utils.GenericResponse;
import com.project.spring.model.Requests;

@Component
public class NewRequestDaoImpl implements NewRequestDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private LobHandler lobHandler = new DefaultLobHandler();

	private final static Logger log = LogManager
			.getLogger(NewRequestDaoImpl.class);
	@Override
	public GenericResponse createRequest(Requests requests) {
		try {
			log.debug("Successfully creating new Request");
			log.debug("ByteArrayInputStream: " + new ByteArrayInputStream(
					requests.getImage().split(",")[1].split(" ")[0]
							.getBytes()));
			byte[] im = requests.getImage().split(",")[1].split(" ")[0]
					.getBytes();
			jdbcTemplate.update(Queries.CREATE_REQUEST,
					new PreparedStatementSetter() {
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
							lobHandler.getLobCreator().setBlobAsBytes(ps, ++i,
									im);
						}
					});
			return new GenericResponse(true, "Request created successfully",
					"200");
		} catch (Exception e) {
			log.error("Error In createRequest() " + e);
			return new GenericResponse(false, "Error in creating post", "500");
		}
	}
}
