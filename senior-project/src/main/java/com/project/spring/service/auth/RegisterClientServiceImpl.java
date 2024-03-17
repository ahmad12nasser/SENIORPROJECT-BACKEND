package com.project.spring.service.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.spring.dao.auth.RegisterClientDao;
import com.project.spring.model.Client;

@Component
public class RegisterClientServiceImpl implements RegisterClientService {

	@Autowired
	private RegisterClientDao clientDao;
	@Override
	public int registerClient(Client client) {
		return clientDao.registerClient(client);
	}
}
