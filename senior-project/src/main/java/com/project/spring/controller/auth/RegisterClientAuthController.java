package com.project.spring.controller.auth;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.project.spring.model.Client;
import com.project.spring.service.auth.RegisterClientService;

@RestController
public class RegisterClientAuthController {

	@Autowired
	private RegisterClientService clientService;

	@RequestMapping(value = "/register/client", method = RequestMethod.POST)
	@ResponseBody
	public ModelMap clientLogin(@RequestParam("firstName") String first_name,
			@RequestParam("lastName") String last_name,
			@RequestParam("email") String email,
			@RequestParam("password") String password,
			@RequestParam("confirmPassword") String confirmPassword,
			@RequestParam("profile_image") MultipartFile profile_image,
			@RequestParam("mobile") String mobile, @RequestParam("age") int age,
			@RequestParam("location") String location,
			@RequestParam("description") String description)
			throws IOException {
		ModelMap model = new ModelMap();
		int counter = 0;

		if (password.equals(confirmPassword)) {
			Client client = new Client();
			if (profile_image != null && !profile_image.isEmpty()) {
				client.setProfileImg(profile_image.getBytes());
			}
			client.setFirstName(first_name);
			client.setLastName(last_name);
			client.setEmail(email);
			client.setPassword(password);
			client.setMobile(mobile);
			client.setLocation(location);
			client.setDescription(description);
			client.setAge(age);

			counter = clientService.registerClient(client);
			if (counter > 0) {
				model.addAttribute("msg", "Client Registration Successful");
			} else {
				model.addAttribute("msg", "Incorrect Registration");
			}
		} else {
			model.addAttribute("msg",
					"Password and confirm password do not match.");
		}

		return model;
	}

}
