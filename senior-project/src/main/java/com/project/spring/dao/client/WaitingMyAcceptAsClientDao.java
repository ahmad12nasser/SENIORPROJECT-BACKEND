package com.project.spring.dao.client;

import java.util.List;

import com.project.spring.model.NeedClientAccept;

public interface WaitingMyAcceptAsClientDao {

	public List<NeedClientAccept> getPendingAppliedRequestsByclientId(
			int client_id);

}
