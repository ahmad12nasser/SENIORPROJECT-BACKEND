package com.project.spring.service.client.controlRoom;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.spring.model.NeedClientAccept;

@Service
public interface WaitingMyAcceptAsClientService {

	public List<NeedClientAccept> getPendingAppliedRequestsByclientId(
			int client_id);
}
