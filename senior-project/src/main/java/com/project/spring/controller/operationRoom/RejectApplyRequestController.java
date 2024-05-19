package com.project.spring.controller.operationRoom;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.spring.service.client.controlRoom.RejectApplyRequestService;

@RestController
@RequestMapping("client/controlRoom")
public class RejectApplyRequestController {
	@Autowired
	private RejectApplyRequestService rejectApplyRequestService;

	@PostMapping("/rejectApplyRequest")
	@ResponseBody
	public ResponseEntity<String> rejectApplyRequest(
			@RequestParam("appliedRequest_id") int appliedRequest_id,
			@RequestParam("request_id") int request_id) throws IOException {
		int rs = 0;
		rs = rejectApplyRequestService.rejectApplyRequest(appliedRequest_id,
				request_id);
		return rs > 0
				? ResponseEntity.ok("Successfully reject apply request")
				: ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
						.body("Error in rejecting apply request");
	}
}
