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
					freelancer.getUsername(), freelancer.getEmail(),
					freelancer.getPassword(), freelancer.getMobile(),
					freelancer.getLocation(),
					freelancer.getProfessionCategName(),
					freelancer.getDescription(), freelancer.getAge(),
					freelancer.getProfileImg(), freelancer.getId());
			return new GenericResponse(true,
					"Successfully updating the freelancer info", "200");
		} catch (Exception e) {
			log.error("Error in editFreelancerInfoById() " + e);
			return new GenericResponse(false,
					"Error with updating the freelancer info", "500");
		}
	}
}
