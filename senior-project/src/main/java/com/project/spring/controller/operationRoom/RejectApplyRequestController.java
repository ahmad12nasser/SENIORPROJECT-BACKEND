package com.project.spring.controller.operationRoom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.spring.service.client.controlRoom.RejectApplyRequestService;

@RestController
@RequestMapping("client/controlRoom")
public class RejectApplyRequestController {
	@Autowired
	private RejectApplyRequestService rejectApplyRequestService;

	@PostMapping("/rejectApplyRequest/{applied_request_id}")
	@ResponseBody
	public ResponseEntity<String> rejectApplyRequest(
			@PathVariable int applied_request_id) {
		int rs = 0;
		rs = rejectApplyRequestService.rejectApplyRequest(applied_request_id);
		return rs > 0
				? ResponseEntity.ok("Successfully reject apply request")
				: ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
						.body("Error in rejecting apply request");
	}
}
