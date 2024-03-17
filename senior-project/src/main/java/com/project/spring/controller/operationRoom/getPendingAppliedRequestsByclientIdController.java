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

import com.project.spring.model.NeedClientAccept;
import com.project.spring.service.client.WaitingMyAcceptService;

@RestController
@RequestMapping("client/controlRoom")
public class getPendingAppliedRequestsByclientIdController {

	@Autowired
	private WaitingMyAcceptService waitingMyAcceptService;

	@PostMapping("/getPendingAppliedRequests/{client_id}")
	@ResponseBody
	public List<NeedClientAccept> getPendingAppliedRequestsByclientId(
			@PathVariable int client_id, HttpServletRequest req)
			throws ParseException {
		return waitingMyAcceptService
				.getPendingAppliedRequestsByclientId(client_id);
	}
}