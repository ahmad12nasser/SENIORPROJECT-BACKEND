package com.project.spring.dao.client.controlRoom;

import java.util.List;

import com.project.spring.model.NeedClientAcceptByClientId;

public interface WaitingMyAcceptAsClientDao {

	public List<NeedClientAcceptByClientId> getPendingAppliedRequestsByclientId(
			int client_id);

}
