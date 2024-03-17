package com.project.spring.model;

import java.math.BigDecimal;
import java.sql.Date;

public class Requests {

	private int id;
	private String categ_name;
	private String description;
	private Date datePosted;
	private Date deadline;
	private String location;
	private String title;
	private String image;
	private BigDecimal price;
	private String status;
	private int clientId;
	private String clientFirstName;
	private String clientLastName;
	private String clientProfileImage;

	public int getClientId() {
		return clientId;
	}
	public void setClientId(int ClientId) {
		this.clientId = ClientId;
	}
	public String getClientFirstName() {
		return clientFirstName;
	}
	public void setClientFirstName(String clientFirstName) {
		this.clientFirstName = clientFirstName;
	}
	public String getClientLastName() {
		return clientLastName;
	}
	public void setClientLastName(String clientLastName) {
		this.clientLastName = clientLastName;
	}
	public String getClientProfileImage() {
		return clientProfileImage;
	}
	public void setClientProfileImage(String clientProfileImage) {
		this.clientProfileImage = clientProfileImage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCateg_name() {
		return categ_name;
	}
	public void setCateg_name(String categ_name) {
		this.categ_name = categ_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
