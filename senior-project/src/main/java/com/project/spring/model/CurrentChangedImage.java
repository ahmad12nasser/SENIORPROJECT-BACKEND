package com.project.spring.model;

import org.springframework.web.multipart.MultipartFile;

public class CurrentChangedImage {

	private int freelancer_id;
	private MultipartFile changedImage;
	public int getFreelancer_id() {
		return freelancer_id;
	}
	public void setFreelancer_id(int freelancer_id) {
		this.freelancer_id = freelancer_id;
	}
	public MultipartFile getChangedImage() {
		return changedImage;
	}
	public void setChangedImage(MultipartFile changedImage) {
		this.changedImage = changedImage;
	}

}
