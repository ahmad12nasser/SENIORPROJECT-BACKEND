package com.project.spring.dao.freelancer.settings;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.spring.dao.Queries;
import com.project.spring.dao.utils.GenericResponse;
import com.project.spring.model.Freelancer;

@Component
public class EditFreelancerInfoDaoImpl implements EditFreelancerInfoDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final static Logger log = LogManager
			.getLogger(EditFreelancerInfoDaoImpl.class);

	@Override
	public GenericResponse editFreelancerInfoById(Freelancer freelancer) {
		try {
			log.debug("Successfully updating the freelancer info");
			jdbcTemplate.update(Queries.UPDATE_FREELANCER_INFO_BY_ID,
					freelancer.getFirstName(), freelancer.getLastName(),
					freelancer.getEmail(), freelancer.getMobile(),
					freelancer.getLocation(),
					freelancer.getProfessionCategName(),
					freelancer.getDescription(), freelancer.getAge(),
					freelancer.getId());
			return new GenericResponse(true,
					"Successfully updating the freelancer info", "200");
		} catch (Exception e) {
			log.error("Error in editFreelancerInfoById() " + e);
			return new GenericResponse(false,
					"Error with updating the freelancer info", "500");
		}
	}

	@Override
	public GenericResponse changeProfileImage(Freelancer freelancer) {
		try {
			log.debug("Successfully changing profile image by freelancerId");
			jdbcTemplate.update(Queries.UPDATE_PROFILE_IMAGE_FOR_FREELANCER,
					freelancer.getProfileImg(), freelancer.getId());
			return new GenericResponse(true,
					"Successfully changing profile image by freelancer id.",
					"200");

		} catch (Exception e) {
			log.error("Error in changeProfileImage() for freelancer" + e);
			return new GenericResponse(false,
					"Error in changing the image for the freelancer in the internal server",
					"500");
		}
	}
}
