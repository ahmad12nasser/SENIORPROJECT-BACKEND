package com.project.spring.model;

import java.math.BigDecimal;

public class ToDo {

	private int id;
	private int freelancerId;
	private int clientId;
	private int requestId;
	private int postId;
	private String status;
	private String client_first_name;
	private String client_last_name;
	private String client_profileImage;
	private String request_title;
	private String request_description;
	private String request_deadLine;
	private String request_location;
	private BigDecimal request_price;
	private String post_title;
	private String post_description;
	private String post_deadLine;
	private String post_location;
	private BigDecimal post_price;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFreelancerId() {
		return freelancerId;
	}
	public void setFreelancerId(int freelancerId) {
		this.freelancerId = freelancerId;
	}
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getClient_first_name() {
		return client_first_name;
	}
	public void setClient_first_name(String client_first_name) {
		this.client_first_name = client_first_name;
	}
	public String getClient_last_name() {
		return client_last_name;
	}
	public void setClient_last_name(String client_last_name) {
		this.client_last_name = client_last_name;
	}
	public String getClient_profileImage() {
		return client_profileImage;
	}
	public void setClient_profileImage(String client_profileImage) {
		this.client_profileImage = client_profileImage;
	}
	public String getRequest_title() {
		return request_title;
	}
	public void setRequest_title(String request_title) {
		this.request_title = request_title;
	}
	public String getRequest_description() {
		return request_description;
	}
	public void setRequest_description(String request_description) {
		this.request_description = request_description;
	}
	public String getRequest_deadLine() {
		return request_deadLine;
	}
	public void setRequest_deadLine(String request_deadLine) {
		this.request_deadLine = request_deadLine;
	}
	public String getRequest_location() {
		return request_location;
	}
	public void setRequest_location(String request_location) {
		this.request_location = request_location;
	}
	public BigDecimal getRequest_price() {
		return request_price;
	}
	public void setRequest_price(BigDecimal request_price) {
		this.request_price = request_price;
	}
	public String getPost_title() {
		return post_title;
	}
	public void setPost_title(String post_title) {
		this.post_title = post_title;
	}
	public String getPost_description() {
		return post_description;
	}
	public void setPost_description(String post_description) {
		this.post_description = post_description;
	}
	public String getPost_deadLine() {
		return post_deadLine;
	}
	public void setPost_deadLine(String post_deadLine) {
		this.post_deadLine = post_deadLine;
	}
	public String getPost_location() {
		return post_location;
	}
	public void setPost_location(String post_location) {
		this.post_location = post_location;
	}
	public BigDecimal getPost_price() {
		return post_price;
	}
	public void setPost_price(BigDecimal post_price) {
		this.post_price = post_price;
	}

}
