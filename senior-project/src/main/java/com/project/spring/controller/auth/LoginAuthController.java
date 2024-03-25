package com.project.spring.controller.auth;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.spring.model.Client;
import com.project.spring.model.Freelancer;
import com.project.spring.model.LoginResponse;
import com.project.spring.service.auth.LoginAuthService;

@RestController
public class LoginAuthController {

	@Autowired
	private LoginAuthService loginAuthService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public LoginResponse userLogin(@RequestParam String email,
			@RequestParam String password, HttpServletRequest req) {
		Freelancer freelancer = new Freelancer();
		freelancer.setEmail(email);
		freelancer.setPassword(password);

		Long freelancerId = null;
		Long clientId = null;
		String roleIsClient = "";
		String roleIsFreelancer = "";
		List<LoginResponse> freelancerList = loginAuthService
				.isFreelancer(freelancer);
		if (!freelancerList.isEmpty()) {
			freelancerId = (long) freelancerList.get(0).getUserId();
			roleIsFreelancer = (String) freelancerList.get(0).getUserRole();
		} else {
			Client client = new Client();
			client.setEmail(email);
			client.setPassword(password);
			List<LoginResponse> clientList = loginAuthService.isClient(client);
			if (!clientList.isEmpty()) {
				clientId = (long) clientList.get(0).getUserId();
				roleIsClient = (String) clientList.get(0).getUserRole();
			}
		}

		if (freelancerId != null) {
			return new LoginResponse(roleIsFreelancer, freelancerId);
		} else if (clientId != null) {
			return new LoginResponse(roleIsClient, clientId);
		} else {
			return new LoginResponse("error", -1L);
		}
	}

}
