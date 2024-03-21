package com.project.spring.controller.mutualControllers;

import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.spring.model.Requests;
import com.project.spring.service.client.myRequests.GetRequestsByClientIdService;

@RestController
@RequestMapping("/client")
public class GetRequestsByClientIdController {

	@Autowired
	private GetRequestsByClientIdService getRequestsByClientIdService;

	@PostMapping("/getMyRequests/{clientId}")
	@ResponseBody
	public List<Requests> getRequestsByClientId(@PathVariable int clientId,
			HttpServletRequest req) throws ParseException {
		return getRequestsByClientIdService.getRequestsByClientId(clientId);
	}
}
