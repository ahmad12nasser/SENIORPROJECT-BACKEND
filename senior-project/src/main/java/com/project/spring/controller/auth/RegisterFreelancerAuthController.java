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

import com.project.spring.model.Freelancer;
//import com.project.spring.model.ProfessionCategory;
import com.project.spring.service.auth.RegisterFreelancerService;
//import com.project.spring.service.professionCateg.professionService;

@RestController
public class RegisterFreelancerAuthController {

	// private professionService professionService;
	@Autowired
	private RegisterFreelancerService freelancerService;

	@RequestMapping(value = "/register/freelancer", method = RequestMethod.POST)
	@ResponseBody
	public ModelMap freelancerLogin(
			@RequestParam(value = "firstName", required = true) String firstName,
			@RequestParam(value = "lastName", required = true) String lastName,
			@RequestParam(value = "email", required = true) String email,
			@RequestParam(value = "password", required = true) String password,
			@RequestParam(value = "confirmPassword", required = true) String confirmPassword,
			@RequestParam(value = "phoneNumber", required = true) String phoneNumber,
			@RequestParam(value = "portfolio", required = false) MultipartFile portfolio,
			@RequestParam(value = "location", required = true) String location,
			@RequestParam(value = "Description", required = false) String Description,
			@RequestParam(value = "professionName", required = true) String professionName,
			@RequestParam(value = "age", required = false) int age)
			throws IOException {

		ModelMap model = new ModelMap();
		int counter = 0;

		if (password.equals(confirmPassword)) {
			Freelancer freelancer = new Freelancer();
			if (portfolio != null && !portfolio.isEmpty()) {
				freelancer.setProfileImg(portfolio.getBytes());
			}
			freelancer.setFirstName(firstName);
			freelancer.setLastName(lastName);
			freelancer.setEmail(email);
			freelancer.setPassword(password);
			freelancer.setMobile(phoneNumber);
			freelancer.setLocation(location);
			freelancer.setDescription(Description);
			freelancer.setProfessionCategName(professionName);
			freelancer.setAge(age);
			counter = freelancerService.registerFreelancer(freelancer);
			if (counter > 0) {
				model.addAttribute("msg", "Successful registration");
			} else {
				model.addAttribute("msg",
						"Registration failed. Please try again.");
			}
		} else {
			model.addAttribute("msg",
					"Password and confirm password do not match.");
		}

		return model;
	}

}
