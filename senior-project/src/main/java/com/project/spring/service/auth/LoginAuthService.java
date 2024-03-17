package com.project.spring.service.auth;

import com.project.spring.model.Client;
import com.project.spring.model.Freelancer;

public interface LoginAuthService {

	public int isClient(Client client);
	public int isFreelancer(Freelancer freelancer);
}
