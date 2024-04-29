package com.project.spring.service.freelancer.rating;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.spring.dao.freelancer.rating.GetRatingDao;
import com.project.spring.model.Rating;

@Component
public class GetRatingServiceImpl implements GetRatingService {

	@Autowired
	private GetRatingDao getRatingDao;

	@Override
	public List<Rating> getRatesAndCommentsForFreelancer(int freelancer_id) {
		return getRatingDao.getFreelancerRatesAndComments(freelancer_id);
	}
}
