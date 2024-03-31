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

import com.project.spring.model.NeedClientAcceptByClientId;
import com.project.spring.service.client.controlRoom.WaitingMyAcceptAsClientService;

@RestController
@RequestMapping("client/controlRoom")
public class GetPendingAppliedRequestsByclientIdController {

	@Autowired
	private WaitingMyAcceptAsClientService waitingMyAcceptAsClientService;

	@PostMapping("/getPendingAppliedRequests/{client_id}")
	@ResponseBody
	public List<NeedClientAcceptByClientId> getPendingAppliedRequestsByclientId(
			@PathVariable int client_id, HttpServletRequest req)
			throws ParseException {
		return waitingMyAcceptAsClientService
				.getPendingAppliedRequestsByclientId(client_id);
	}
}
