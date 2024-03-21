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

import com.project.spring.model.HiredPostsWithFreelancerId;
import com.project.spring.service.freelancer.operationRoom.WaitingMyAcceptAsFreelancerService;

@RestController
@RequestMapping("freelancer/operationRoom")
public class GetPendingHiredPostsByFreelancerIdController {
	@Autowired
	private WaitingMyAcceptAsFreelancerService waitingMyAcceptAsFreelancerService;

	@PostMapping("/getWaitingHiredPosts/{freelancer_id}")
	@ResponseBody
	public List<HiredPostsWithFreelancerId> getPendingHiredPostsByFreelancerId(
			@PathVariable int freelancer_id, HttpServletRequest req)
			throws ParseException {
		return waitingMyAcceptAsFreelancerService
				.getPendingHiredPostsByFreelancerId(freelancer_id);
	}
}
