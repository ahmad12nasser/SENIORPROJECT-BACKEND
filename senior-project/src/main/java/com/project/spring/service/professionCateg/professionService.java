package com.project.spring.service.professionCateg;

import com.project.spring.model.ProfessionCategory;
import java.util.List;;
public interface professionService {

	public  int whichProfession(ProfessionCategory professionCateg);
	public List<ProfessionCategory> allProfessions();
	
	}
