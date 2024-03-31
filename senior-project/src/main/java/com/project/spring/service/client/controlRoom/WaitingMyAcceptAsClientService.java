package com.project.spring.service.client.controlRoom;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.spring.model.NeedClientAcceptByClientId;

@Service
public interface WaitingMyAcceptAsClientService {

	public List<NeedClientAcceptByClientId> getPendingAppliedRequestsByclientId(
			int client_id);
}
