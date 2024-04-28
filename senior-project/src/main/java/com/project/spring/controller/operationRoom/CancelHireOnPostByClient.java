package com.project.spring.controller.operationRoom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.spring.dao.utils.GenericResponse;
import com.project.spring.model.CancelHiring;
import com.project.spring.service.client.hiringThroughPost.CancelHireOnPostService;

@RestController
@RequestMapping("client/controlRoom")
public class CancelHireOnPostByClient {

	@Autowired
	private CancelHireOnPostService cancelHireOnPostService;

	@PostMapping("/cancelHireOnPost")
	@ResponseBody
	public GenericResponse cancelHireOnPost(
			@RequestBody CancelHiring cancelHiring) {
		return cancelHireOnPostService.cancelHireOnPost(
				cancelHiring.getPost_id(), cancelHiring.getHiredPost_id());
	}
}
