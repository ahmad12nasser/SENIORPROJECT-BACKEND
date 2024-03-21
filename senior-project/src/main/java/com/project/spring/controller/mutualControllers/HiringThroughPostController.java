package com.project.spring.controller.mutualControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.spring.model.TempHiredPosts;
import com.project.spring.service.client.hiringThroughPost.HiringThroughPostService;

@RestController
@RequestMapping("/posts")
public class HiringThroughPostController {

	@Autowired
	private HiringThroughPostService hiringThroughPostService;

	@PostMapping("/HiringThroughPost")
	@ResponseBody
	public ResponseEntity<String> hiringThroughPost(
			@RequestBody TempHiredPosts hiredPosts) {
		int rs = 0;
		rs = hiringThroughPostService.HiringThroughPost(hiredPosts.getPostId(),
				hiredPosts.getFreelancerId(), hiredPosts.getClientId());
		return rs > 0
				? ResponseEntity.ok("Post Hired successfully")
				: ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
						.body("Error hiring freelancer through specific post");
	}

}
