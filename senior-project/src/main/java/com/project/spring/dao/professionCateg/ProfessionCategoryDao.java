package com.project.spring.dao.professionCateg;

import java.util.List;

import com.project.spring.model.ProfessionCategory;

public interface ProfessionCategoryDao {
	public  int whichProfession(ProfessionCategory professionCateg);
	public List<ProfessionCategory> allProfessions();
}
