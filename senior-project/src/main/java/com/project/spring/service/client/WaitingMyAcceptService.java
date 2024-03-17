package com.project.spring.service.client;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.spring.model.NeedClientAccept;

@Service
public interface WaitingMyAcceptService {

	public List<NeedClientAccept> getPendingAppliedRequestsByclientId(
			int client_id);
}
