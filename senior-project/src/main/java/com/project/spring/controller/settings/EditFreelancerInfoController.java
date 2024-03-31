package com.project.spring.controller.settings;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.project.spring.dao.utils.GenericResponse;
import com.project.spring.model.Freelancer;
import com.project.spring.service.freelancer.settings.EditFreelancerInfoService;

@RestController
@RequestMapping("freelancer/settings")
public class EditFreelancerInfoController {
	@Autowired
	private EditFreelancerInfoService editFreelancerInfoService;

	@PostMapping("/editFreelancerInfo")
	@ResponseBody
	public GenericResponse editFreelancerInfoById(
			@RequestParam("freelancer_id") int freelancer_id,
			@RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName,
			@RequestParam("email") String email,
			@RequestParam("mobile") String mobile,
			@RequestParam("location") String location,
			@RequestParam("professionCateg") String professionCateg,
			@RequestParam("image") MultipartFile image,
			@RequestParam("age") int age,
			@RequestParam("description") String description)
			throws IOException {
		Freelancer freelancer = new Freelancer();
		if (image != null && !image.isEmpty()) {
			freelancer.setProfileImg(image.getBytes());
		}
		freelancer.setId(freelancer_id);
		freelancer.setFirstName(firstName);
		freelancer.setLastName(lastName);
		freelancer.setEmail(email);
		freelancer.setMobile(mobile);
		freelancer.setLocation(location);
		freelancer.setProfessionCategName(professionCateg);
		freelancer.setAge(age);
		freelancer.setDescription(description);

		return editFreelancerInfoService.editFreelancerInfoById(freelancer);
	}
}
