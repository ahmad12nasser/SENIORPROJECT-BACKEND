package com.project.spring.service.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.spring.dao.auth.LoginAuthDao;
import com.project.spring.model.Client;
import com.project.spring.model.Freelancer;

@Component
public class LoginAuthServiceImpl implements LoginAuthService {

	private @Autowired LoginAuthDao loginAuthDao;

	@Override
	public int isClient(Client client) {
		return loginAuthDao.isClient(client);
	}

	@Override
	public int isFreelancer(Freelancer freelancer) {
		return loginAuthDao.isFreelancer(freelancer);
	}
}
