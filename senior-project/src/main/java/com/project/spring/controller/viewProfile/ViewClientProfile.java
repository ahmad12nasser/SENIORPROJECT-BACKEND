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

import com.project.spring.model.Client;
import com.project.spring.service.client.settings.ClientInfoService;

@RestController
@RequestMapping("client")
public class ViewClientProfile {

	@Autowired
	private ClientInfoService clientInfoService;

	@PostMapping("/getClientInfo/{client_id}")
	@ResponseBody
	public List<Client> getClientInfoById(@PathVariable int client_id,
			HttpServletRequest req) throws ParseException {
		return clientInfoService.getClientInfoByClientId(client_id);
	}
}
