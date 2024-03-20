package com.project.spring.controller.operationRoom;

import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.spring.model.HiredPosts;
import com.project.spring.service.client.WaitingAcceptFreelancerService;

@RestController
@RequestMapping("client/controlRoom")
public class GetPendingHiredPostsByClientIdContoller {
	@Autowired
	private WaitingAcceptFreelancerService waitingAcceptFreelancerService;

	@PostMapping("/getPendingHiredPosts/{client_id}")
	@ResponseBody
	public List<HiredPosts> getPendingHiredPostsByClientId(
			@PathVariable int client_id, HttpServletRequest req)
			throws ParseException {
		return waitingAcceptFreelancerService
				.getPendingHiredPostsByClientId(client_id);
	}
}
