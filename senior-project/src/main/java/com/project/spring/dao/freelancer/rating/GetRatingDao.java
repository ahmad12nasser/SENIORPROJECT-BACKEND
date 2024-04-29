package com.project.spring.dao.freelancer.rating;

import java.util.List;

import org.springframework.stereotype.Component;

import com.project.spring.model.Rating;

@Component
public interface GetRatingDao {

	public List<Rating> getFreelancerRatesAndComments(int freelancer_id);
}
