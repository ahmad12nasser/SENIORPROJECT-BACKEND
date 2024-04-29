package com.project.spring.controller.settings;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.spring.dao.utils.GenericResponse;
import com.project.spring.model.Rating;
import com.project.spring.service.freelancer.rating.GetRatingService;
import com.project.spring.service.freelancer.rating.NewRatingService;

@RestController
@RequestMapping("settings")
public class RatingController {

	@Autowired
	private NewRatingService newRatingService;
	@Autowired
	private GetRatingService getRatingService;

	@PostMapping("/newRating")
	@ResponseBody
	public GenericResponse setNewRatingForFreelancer(
			@RequestBody Rating rating) {
		int f = 0;
		f = newRatingService.RecordNewRating(rating.getFreelancer_id(),
				rating.getClient_id(), rating.getRating(), rating.getComment());
		return f > 0
				? new GenericResponse(true,
						"Successfully Recording new Rate for the freelancer by "
								+ rating.getFreelancer_id()
								+ " as freelancer_id",
						"200")
				: new GenericResponse(false,
						"Error with recording new rate for the freelancer in the internal server,"
								+ " the error in setNewRatingForFreelancer()",
						"500");
	}

	@PostMapping("/getRatingWithComments/{freelancer_id}")
	@ResponseBody
	public List<Rating> getTheFreelancerRates(@PathVariable int freelancer_id) {

		return getRatingService.getRatesAndCommentsForFreelancer(freelancer_id);

	}
}
