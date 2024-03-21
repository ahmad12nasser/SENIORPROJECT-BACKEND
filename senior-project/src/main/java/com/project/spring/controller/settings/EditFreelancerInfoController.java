package com.project.spring.controller.settings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
			@RequestBody Freelancer freelancer) {
		return editFreelancerInfoService.editFreelancerInfoById(freelancer);
	}
}
