package com.project.spring.controller.settings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
	public GenericResponse editClientInfoById(@RequestBody Client client) {
		return editClientInfoService.editClientInfoById(client);
	}
}
