package com.project.spring.dao.freelancer.rating;

import org.springframework.stereotype.Component;

@Component
public interface NewRatingDao {

	public int RecordNewRating(int freelancer_id, int client_id, int Rate,
			String comment);
}
