package com.project.spring.model;

import java.math.BigDecimal;
import java.sql.Date;

public class HiredPosts {
	private int freelancer_id;
	private String freelancerFirstName;
	private String freelancerLastName;
	private byte[] freelancerProfileImage;
	private int id;
	private String title;
	private Date dateposted;
	private Date deadline;
	private String categ_name;
	private String location;
	private String description;
	private byte[] image;
	private BigDecimal price;
	private String Status;
	public int getFreelancer_id() {
		return freelancer_id;
	}
	public void setFreelancer_id(int freelancer_id) {
		this.freelancer_id = freelancer_id;
	}
	public String getFreelancerFirstName() {
		return freelancerFirstName;
	}
	public void setFreelancerFirstName(String freelancerFirstName) {
		this.freelancerFirstName = freelancerFirstName;
	}
	public String getFreelancerLastName() {
		return freelancerLastName;
	}
	public void setFreelancerLastName(String freelancerLastName) {
		this.freelancerLastName = freelancerLastName;
	}
	public byte[] getFreelancerProfileImage() {
		return freelancerProfileImage;
	}
	public void setFreelancerProfileImage(byte[] freelancerProfileImage) {
		this.freelancerProfileImage = freelancerProfileImage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getDateposted() {
		return dateposted;
	}
	public void setDateposted(Date dateposted) {
		this.dateposted = dateposted;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	public String getCateg_name() {
		return categ_name;
	}
	public void setCateg_name(String categ_name) {
		this.categ_name = categ_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}

}
