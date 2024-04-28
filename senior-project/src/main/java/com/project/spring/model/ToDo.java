package com.project.spring.model;

import java.math.BigDecimal;
import java.sql.Date;

public class ToDo {

	private int id;
	private int freelancerId;
	private int clientId;
	private int appliedRequest_Id;
	private int hiredPost_id;
	private String status;
	private String client_first_name;
	private String client_last_name;
	private byte[] client_profileImage;
	private String clientMobile;
	private String request_title;
	private String request_description;
	private Date request_deadLine;
	private Date request_datePosted;
	private String request_categ_name;
	private String request_location;
	private BigDecimal request_price;
	private String post_title;
	private String post_description;
	private Date post_deadLine;
	private Date post_datePosted;
	private String post_categ_name;
	private String post_location;
	private BigDecimal post_price;
	private int request_id;
	private int post_id;

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

	public int getAppliedRequest_Id() {
		return appliedRequest_Id;
	}
	public void setAppliedRequest_Id(int appliedRequest_Id) {
		this.appliedRequest_Id = appliedRequest_Id;
	}
	public int getHiredPost_id() {
		return hiredPost_id;
	}
	public void setHiredPost_id(int hiredPost_id) {
		this.hiredPost_id = hiredPost_id;
	}
	public int getRequest_id() {
		return request_id;
	}
	public void setRequest_id(int request_id) {
		this.request_id = request_id;
	}
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
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
	public byte[] getClient_profileImage() {
		return client_profileImage;
	}
	public void setClient_profileImage(byte[] client_profileImage) {
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
	public Date getRequest_deadLine() {
		return request_deadLine;
	}
	public void setRequest_deadLine(Date request_deadLine) {
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
	public Date getPost_deadLine() {
		return post_deadLine;
	}
	public void setPost_deadLine(Date post_deadLine) {
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
	public Date getRequest_datePosted() {
		return request_datePosted;
	}
	public void setRequest_datePosted(Date request_datePosted) {
		this.request_datePosted = request_datePosted;
	}
	public String getRequest_categ_name() {
		return request_categ_name;
	}
	public void setRequest_categ_name(String request_categ_name) {
		this.request_categ_name = request_categ_name;
	}
	public Date getPost_datePosted() {
		return post_datePosted;
	}
	public void setPost_datePosted(Date post_datePosted) {
		this.post_datePosted = post_datePosted;
	}
	public String getPost_categ_name() {
		return post_categ_name;
	}
	public void setPost_categ_name(String post_categ_name) {
		this.post_categ_name = post_categ_name;
	}
	public String getClientMobile() {
		return clientMobile;
	}
	public void setClientMobile(String clientMobile) {
		this.clientMobile = clientMobile;
	}

}
