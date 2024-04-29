package com.project.spring.dao.freelancer.rating;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.spring.dao.Queries;
import com.project.spring.model.Rating;
import com.project.spring.model.rm.RatingRowMapper;

@Component
public class GetRatingDaoImpl implements GetRatingDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final static Logger log = LogManager
			.getLogger(GetRatingDaoImpl.class);

	@Override
	public List<Rating> getFreelancerRatesAndComments(int freelancer_id) {
		try {
			log.debug(
					"Successfully getting the rates and the comments for the freelancer by freelancer_id");
			return jdbcTemplate.query(
					Queries.GET_RATES_AND_COMMENTS_FOR_FREELANCER,
					new Object[]{freelancer_id}, new RatingRowMapper());
		} catch (Exception e) {
			log.error("Error in getFreelancerRatesAndComments() " + e);
			return null;
		}
	}
}
