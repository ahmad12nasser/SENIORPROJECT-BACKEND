package com.project.spring.model;

public class OnGoing {

	private int id;
	private int client_id;
	private int freelancer_id;
	private int applied_request_id;
	private int hired_post_id;
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getClient_id() {
		return client_id;
	}
	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}
	public int getFreelancer_id() {
		return freelancer_id;
	}
	public void setFreelancer_id(int freelancer_id) {
		this.freelancer_id = freelancer_id;
	}
	public int getApplied_request_id() {
		return applied_request_id;
	}
	public void setApplied_request_id(int applied_request_id) {
		this.applied_request_id = applied_request_id;
	}
	public int getHired_post_id() {
		return hired_post_id;
	}
	public void setHired_post_id(int hired_post_id) {
		this.hired_post_id = hired_post_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
