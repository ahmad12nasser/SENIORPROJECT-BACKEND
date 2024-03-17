package com.project.spring.controller.auth;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.spring.model.Client;
import com.project.spring.model.Freelancer;
import com.project.spring.service.auth.LoginAuthService;

@RestController
public class LoginAuthController {

	@Autowired
	private LoginAuthService loginAuthService;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public ModelMap userLogin(@RequestParam String email,
			@RequestParam String password, HttpServletRequest req) {
		ModelMap model = new ModelMap();

		Freelancer freelancer = new Freelancer();
		freelancer.setEmail(email);
		freelancer.setPassword(password);

		int freelancerId = loginAuthService.isFreelancer(freelancer);
		int clientId = 0; // Assuming an initial value for clientId

		
		// If not found in freeLancer table, check in client table
		if (freelancerId == 0) {
			Client client = new Client();
			client.setEmail(email);
			client.setPassword(password);
			clientId = loginAuthService.isClient(client);
		}

		if (freelancerId != 0) {
			// User found in freeLancer table, handle accordingly
			model.addAttribute("msg",
					"Welcome, you have successfully logged in");
			req.setAttribute("loggedInFreelancerId", freelancerId);
            req.setAttribute("userRole", "freelancer"); // Setting user role

		} else if (clientId != 0) {
			// User found in client table, handle accordingly
			model.addAttribute("msg",
					"Welcome, you have successfully logged in");
			req.setAttribute("loggedInClientId", clientId);
            req.setAttribute("userRole", "client"); // Setting user role

		} else {
			// User not found in both client and freeLancer tables
			model.addAttribute("msg", "Invalid username or password");
		}

		return model;
	}
}
