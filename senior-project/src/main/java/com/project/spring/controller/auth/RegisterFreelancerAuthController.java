package com.project.spring.controller.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
			@RequestParam(value = "username", required = true) String username,
			@RequestParam(value = "email", required = true) String email,
			@RequestParam(value = "password", required = true) String password,
			@RequestParam(value = "confirmPassword", required = true) String confirmPassword,
			@RequestParam(value = "phoneNumber", required = true) String phoneNumber,
			@RequestParam(value = "portfolio", required = false) String portfolio,
			@RequestParam(value = "location", required = false) String location,
			@RequestParam(value = "Description", required = false) String Description) {

		ModelMap model = new ModelMap();
		int counter = 0;

		if (password.equals(confirmPassword)) {
			// set properties for freelancer yali luser mda5aloun
			Freelancer freelancer = new Freelancer();
			freelancer.setFirstName(firstName);
			freelancer.setLastName(lastName);
			freelancer.setUsername(username);
			freelancer.setEmail(email);
			freelancer.setPassword(password);
			freelancer.setMobile(phoneNumber);
			freelancer.setProfileImg(portfolio);
			freelancer.setLocation(location);
			freelancer.setDescription(Description);
			/*
			 * berja3 bshila lama btezbat b7out ma7ala wishProfession()
			 */
			

			/*
			 * get profession_id men profession_name user mda5alou as select int
			 * profession_categ_id =
			 * professionService.whichProfession(freelancer_profession_name);
			 *
			 * freelancer.setProfessionCategId(profession_categ_id);
			 */
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
