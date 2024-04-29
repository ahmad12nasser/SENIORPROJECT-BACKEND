package com.project.spring.service.freelancer.rating;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.spring.dao.freelancer.rating.NewRatingDao;

@Component
public class NewRatingServiceImpl implements NewRatingService {

	@Autowired
	private NewRatingDao newRatingDao;

	@Override
	public int RecordNewRating(int freelancer_id, int client_id, int Rate,
			String comment) {
		return newRatingDao.RecordNewRating(freelancer_id, client_id, Rate,
				comment);
	}
}
