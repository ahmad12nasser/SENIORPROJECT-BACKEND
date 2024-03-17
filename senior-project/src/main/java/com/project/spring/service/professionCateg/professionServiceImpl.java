package com.project.spring.service.professionCateg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project.spring.dao.professionCateg.ProfessionCategoryDao;
import com.project.spring.model.ProfessionCategory;

@Component
public class professionServiceImpl implements professionService {

	@Autowired
	private ProfessionCategoryDao professionCategoryDao;

	@Override
	public List<ProfessionCategory> allProfessions() {
		return professionCategoryDao.allProfessions();
	}

	@Override
	public int whichProfession(ProfessionCategory professionCateg) {
		return professionCategoryDao.whichProfession(professionCateg);
	}
}
