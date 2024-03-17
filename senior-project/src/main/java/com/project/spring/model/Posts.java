package com.project.spring.model;

import java.math.BigDecimal;
import java.sql.Date;

public class Posts {
	private int id;
	private String title;
	private Date datePosted;
	private Date deadline;
	private String location;
	private String categName;
	private String description;
	private String image;
	private BigDecimal price;
	private String status;
	private int freelancerId;
	private String freelancerFirstName;
	private String freelancerLastName;
	private String freelancerProfileImge;

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public Date getDatePosted() {
		return datePosted;
	}
	public void setDatePosted(Date datePosted) {
		this.datePosted = datePosted;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCategName() {
		return categName;
	}
	public void setCategName(String categName) {
		this.categName = categName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public int getFreelancerId() {
		return freelancerId;
	}
	public void setFreelancerId(int freelancerId) {
		this.freelancerId = freelancerId;
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
	public String getFreelancerProfileImge() {
		return freelancerProfileImge;
	}
	public void setFreelancerProfileImge(String freelancerProfileImge) {
		this.freelancerProfileImge = freelancerProfileImge;
	}
}
