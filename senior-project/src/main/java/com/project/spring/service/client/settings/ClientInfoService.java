package com.project.spring.service.client.settings;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.spring.model.Client;

@Service
public interface ClientInfoService {
	public List<Client> getClientInfoByClientId(int client_id);
}
