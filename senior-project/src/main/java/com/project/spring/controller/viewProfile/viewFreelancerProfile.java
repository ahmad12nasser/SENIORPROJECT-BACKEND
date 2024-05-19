package com.project.spring.controller.viewProfile;

import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.spring.model.Freelancer;
import com.project.spring.service.freelancer.settings.FreelancerInfoService;

@RestController
@RequestMapping("freelancer")
public class viewFreelancerProfile {

	@Autowired
	private FreelancerInfoService freelancerInfoService;

	@PostMapping("/getFreelancerInfo/{freelancer_id}")
	@ResponseBody
	public List<Freelancer> getFreelancerInfoById(
			@PathVariable int freelancer_id, HttpServletRequest req)
			throws ParseException {
		return freelancerInfoService.getFreelancerById(freelancer_id);
	}
}