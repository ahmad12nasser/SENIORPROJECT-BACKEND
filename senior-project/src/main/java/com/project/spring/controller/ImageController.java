package com.project.spring.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.project.spring.dao.ImageDao;

@RestController
@RequestMapping("api")
public class ImageController {

	@Autowired
	private ImageDao imageDao;

	private String uploadPath = "assests/images";

	@PostMapping("/images")
	public String uploadImage(@RequestParam("image") MultipartFile image)
			throws IOException {
		if (image.isEmpty()) {
			return "Please select an image to upload";
		}

		String fileName = UUID.randomUUID().toString() + "."
				+ image.getOriginalFilename().split("\\.")[1];
		Path filePath = Paths.get(uploadPath, fileName);
		Files.write(filePath, image.getBytes());

		imageDao.saveImage(fileName); // Call method to save image info in
										// database
		return "assests/images/" + fileName; // Return the relative URL of the
												// uploaded image
	}
}
