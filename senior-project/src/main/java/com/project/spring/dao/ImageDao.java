package com.project.spring.dao;

import com.project.spring.dao.utils.GenericResponse;

public interface ImageDao {
	public GenericResponse saveImage(String filename);
}
