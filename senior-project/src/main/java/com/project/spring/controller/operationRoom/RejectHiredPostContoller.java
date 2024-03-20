package com.project.spring.controller.operationRoom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.spring.service.freelancer.DeclineHiredPostService;

@RestController
@RequestMapping("freelancer/operationRoom")
public class RejectHiredPostContoller {
	@Autowired
	private DeclineHiredPostService declineHiredPostService;

	@PostMapping("/rejectHiredPost/{hired_post_id}")
	@ResponseBody
	public ResponseEntity<String> rejectHiredPost(
			@PathVariable int hired_post_id) {
		int rs = 0;

		rs = declineHiredPostService.declineHiredPost(hired_post_id);

		return rs > 0
				? ResponseEntity.ok("Successfully Rejecting the hired post")
				: ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
						.body("Error in rejecting hired post");
	}
}
