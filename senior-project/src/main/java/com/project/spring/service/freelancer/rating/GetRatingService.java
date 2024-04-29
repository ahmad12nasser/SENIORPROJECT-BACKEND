package com.project.spring.service.freelancer.rating;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.spring.model.Rating;

@Service
public interface GetRatingService {

	public List<Rating> getRatesAndCommentsForFreelancer(int freelancer_id);
}
