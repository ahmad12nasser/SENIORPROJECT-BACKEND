package com.project.spring.dao.client.settings;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.spring.dao.Queries;
import com.project.spring.dao.utils.GenericResponse;
import com.project.spring.model.Client;

@Component
public class EditClientInfoDaoImpl implements EditClientInfoDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final static Logger log = LogManager
			.getLogger(EditClientInfoDaoImpl.class);

	@Override
	public GenericResponse editClientInfo(Client client) {
		try {
			log.debug("Successfully updating the client info");
			jdbcTemplate.update(Queries.UPDATE_CLIENT_INFO_BY_ID,
					client.getFirstName(), client.getLastName(),
					client.getEmail(), client.getMobile(),
					client.getDescription(), client.getAge(),
					client.getLocation(), client.getId());
			return new GenericResponse(true, "Client Info Edited Successfully",
					"200");
		} catch (Exception e) {
			log.error("Error in editClientInfo() " + e);
			return new GenericResponse(false, "Error In Editing Client Info ",
					"500");
		}
	}
	@Override
	public GenericResponse changeProfileImage(Client client) {
		try {
			log.debug(
					"Successfully changing profile image for client by client_id");
			jdbcTemplate.update(Queries.UPDATE_PROFILE_IMAGE_FOR_CLIENT,
					client.getProfileImg(), client.getId());
			return new GenericResponse(true,
					"Successfully changing profile image for client by client_id.",
					"200");
		} catch (Exception e) {
			log.error("Error in changeProfileImage() for client " + e);
			return new GenericResponse(false,
					"Error in changing the image for client in the internal server",
					"500");
		}
	}
}
