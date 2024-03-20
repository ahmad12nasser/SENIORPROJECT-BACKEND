package com.project.spring.controller.operationRoom;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.spring.service.freelancer.ApproveHiredPostService;

@RestController
@RequestMapping("freelancer/operationRoom")
public class AcceptHiredPostController {
	@Autowired
	private ApproveHiredPostService approveHiredPostService;

	@PostMapping("/acceptHiredPost/{hired_post_id}")
	@ResponseBody
	public ResponseEntity<String> acceptHiredPost(
			@PathVariable int hired_post_id, HttpServletRequest req) {
		int rs = 0;
		rs = approveHiredPostService.approveApplyRequest(hired_post_id);
		return rs > 0
				? ResponseEntity.ok("Accept hired post successfully")
				: ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
						.body("Error accepting hired request");
	}
}
