package com.project.spring.dao.freelancer.rating;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.spring.dao.Queries;

@Component
public class NewRatingDaoImpl implements NewRatingDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final static Logger log = LogManager
			.getLogger(NewRatingDaoImpl.class);
	@Override
	public int RecordNewRating(int freelancer_id, int client_id, int Rate,
			String comment) {
		try {
			log.debug(
					"Successfully recording new rate for the freelancer by freelancer_id = "
							+ freelancer_id);
			return jdbcTemplate.update(
					Queries.INSERT_NEW_RECORDE_RATE_FOR_FREELANCER,
					freelancer_id, client_id, Rate, comment);
		} catch (Exception e) {
			log.error("Error in RecordNewRating() " + e);
			return -1;
		}
	}
}
