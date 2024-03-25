package com.project.spring.dao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.spring.dao.utils.GenericResponse;

@Component
public class ImageDaoImpl implements ImageDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final static Logger log = LogManager.getLogger(ImageDaoImpl.class);

	@Override
	public GenericResponse saveImage(String fileName) {
		try {
			String sql = "INSERT INTO images (filename) VALUES (?)";
			jdbcTemplate.update(sql, fileName);
			log.debug("successfully saving image");
			return new GenericResponse(true, "successfully saving image",
					"200");
		} catch (Exception e) {
			log.error("Error in saveImage()" + e);
			return new GenericResponse(false, "Error in saveImage() ", "500");
		}
	}
}
