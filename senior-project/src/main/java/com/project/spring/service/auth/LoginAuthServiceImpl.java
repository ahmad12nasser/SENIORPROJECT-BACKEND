package com.project.spring.service.auth;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.spring.dao.auth.LoginAuthDao;
import com.project.spring.model.Client;
import com.project.spring.model.Freelancer;
import com.project.spring.model.LoginResponse;

@Component
public class LoginAuthServiceImpl implements LoginAuthService {

	private @Autowired LoginAuthDao loginAuthDao;

	@Override
	public List<LoginResponse> isClient(Client client) {
		return loginAuthDao.isClient(client);
	}

	@Override
	public List<LoginResponse> isFreelancer(Freelancer freelancer) {
		return loginAuthDao.isFreelancer(freelancer);
	}
}
