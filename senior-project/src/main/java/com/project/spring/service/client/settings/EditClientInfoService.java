package com.project.spring.service.client.settings;

import org.springframework.stereotype.Service;

import com.project.spring.dao.utils.GenericResponse;
import com.project.spring.model.Client;

@Service
public interface EditClientInfoService {
	public GenericResponse editClientInfoById(Client client);
}
