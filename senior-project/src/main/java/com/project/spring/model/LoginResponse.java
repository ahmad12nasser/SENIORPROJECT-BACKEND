package com.project.spring.model;

public class LoginResponse {
	private String userRole;
	private Long userId;
	public LoginResponse(String userRole, Long freelancerId) {
		this.userId = freelancerId;
		this.userRole = userRole;
	}
	public LoginResponse() {
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}

}
