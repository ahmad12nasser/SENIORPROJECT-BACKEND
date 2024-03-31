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
import com.project.spring.model.Client;
import com.project.spring.service.client.settings.EditClientInfoService;

@RestController
@RequestMapping("client/settings")
public class EditClientInfoController {
	@Autowired
	private EditClientInfoService editClientInfoService;

	@PostMapping("/editClientInfo")
	@ResponseBody
	public GenericResponse editClientInfoById(@RequestParam("id") int client_id,
			@RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName,
			@RequestParam("email") String email,
			@RequestParam("mobile") String mobile,
			@RequestParam("image") MultipartFile profileImage,
			@RequestParam("location") String location,
			@RequestParam("description") String description,
			@RequestParam("age") int age) throws IOException {
		Client client = new Client();
		if (profileImage != null && !profileImage.isEmpty()) {
			client.setProfileImg(profileImage.getBytes());
		}
		client.setAge(age);
		client.setId(client_id);
		client.setFirstName(firstName);
		client.setLastName(lastName);
		client.setEmail(email);
		client.setMobile(mobile);
		client.setLocation(location);
		client.setDescription(description);
		return editClientInfoService.editClientInfoById(client);
	}
}
