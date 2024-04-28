package com.project.spring.controller.operationRoom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.spring.dao.utils.GenericResponse;
import com.project.spring.service.freelancer.applyOnRequest.CancelApplyOnRequestService;

@RestController
@RequestMapping("freelancer/operationRoom")
public class CancelApplyOnRequestByFreelancer {

	@Autowired
	private CancelApplyOnRequestService cancelApplyOnRequestService;

	@PostMapping("/cancelApplyOnRequest/{request_id}/{appliedRequest_id}")
	@ResponseBody
	public GenericResponse cancelApplyOnRequest(
			@PathVariable int appliedRequest_id, @PathVariable int request_id) {
		return cancelApplyOnRequestService
				.cancelApplyOnRequest(appliedRequest_id, request_id);
	}
}
