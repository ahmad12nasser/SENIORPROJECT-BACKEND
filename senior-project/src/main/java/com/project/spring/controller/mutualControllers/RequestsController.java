package com.project.spring.controller.mutualControllers;

import java.io.IOException;
import java.io.OutputStream;
import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.spring.dao.utils.GenericResponse;
import com.project.spring.model.AppliedRequests;
import com.project.spring.model.Requests;
import com.project.spring.service.freelancer.applyOnRequest.ApplyForRequestService;
import com.project.spring.service.requests.NewRequestService;
import com.project.spring.service.requests.RequestsService;

@RestController
@RequestMapping("/requests")
public class RequestsController {

	@Autowired
	private RequestsService requestsService;
	@Autowired
	private ApplyForRequestService applyForRequestService;
	@Autowired
	private NewRequestService newRequestService;

	@PostMapping("/getAllRequestsWithClientInfo")
	@ResponseBody
	public void getAllRequests(HttpServletRequest req, HttpServletResponse res)
			throws ParseException, IOException {
		String fileName = "jihad.png";
		OutputStream out = res.getOutputStream();
		res.setContentType("image/png");
		res.setHeader("Content-disposition",
				"attachment; filename=" + fileName);

		out.write(requestsService.getAllRequestsWithClientInfo().get(0)
				.getImage().getBytes());
		out.close();
		out.flush();
		res.flushBuffer();
	}

	@PostMapping("/applyForRequest")
	@ResponseBody
	public ResponseEntity<String> applyForRequest(
			@RequestBody AppliedRequests appliedRequests) {
		int r = 0;
		r = applyForRequestService.applyForRequest(
				appliedRequests.getRequestId(), appliedRequests.getClientId(),
				appliedRequests.getFreelancerId());
		return r > 0
				? ResponseEntity.ok("Request applied successfully")
				: ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
						.body("Error applying for request");
	}

	@PostMapping("/createRequest")
	@ResponseBody
	public GenericResponse createRequest(@RequestBody Requests requests) {
		return newRequestService.createRequest(requests);
	}
}
