package com.project.spring.service.auth;

import java.util.List;

import com.project.spring.model.Client;
import com.project.spring.model.Freelancer;
import com.project.spring.model.LoginResponse;

public interface LoginAuthService {

	public List<LoginResponse> isClient(Client client);
	public List<LoginResponse> isFreelancer(Freelancer freelancer);
}
