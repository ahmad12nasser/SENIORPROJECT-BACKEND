package com.project.spring.controller.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.spring.model.Client;
import com.project.spring.service.auth.RegisterClientService;

@RestController
public class RegisterClientAuthController {

	@Autowired
	private RegisterClientService clientService;

	@RequestMapping(value = "/register/client", method = RequestMethod.POST)
	@ResponseBody
	public ModelMap clientLogin(
			@RequestParam("first_name") String first_name,
			@RequestParam("last_name") String last_name,
			@RequestParam("user_name") String user_name,
			@RequestParam("client_email") String email,
			@RequestParam("password") String password,
			@RequestParam("confirmPassword") String confirmPassword,
			@RequestParam("client_img") String profile_image,
			@RequestParam("phone_number") String mobile,
			@RequestParam("age") int age,
			@RequestParam("description") String description) {
		ModelMap model = new ModelMap();
		int counter = 0;

		if (password.equals(confirmPassword)) {
			Client client = new Client();
			client.setFirstName(first_name);
			client.setLastName(last_name);
			client.setEmail(email);
			client.setUsername(user_name);
			client.setPassword(password);
			client.setMobile(mobile);
			client.setDescription(description);
			client.setAge(age);

			counter = clientService.registerClient(client);
			if (counter > 0) {
				model.addAttribute("msg", "Client Registration Successful");
			} else {
				model.addAttribute("msg", "Incorrect Registration");
			}
		}else {
			model.addAttribute("msg", "Password and confirm password do not match.");
		}
		

		return model;
	}

}
