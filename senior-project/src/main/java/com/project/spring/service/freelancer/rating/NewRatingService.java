package com.project.spring.service.freelancer.rating;

import org.springframework.stereotype.Service;

@Service
public interface NewRatingService {

	public int RecordNewRating(int freelancer_id, int client_id, int Rate,
			String comment);
}
