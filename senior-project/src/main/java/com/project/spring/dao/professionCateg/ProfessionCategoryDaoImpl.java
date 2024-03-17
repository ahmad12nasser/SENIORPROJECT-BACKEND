package com.project.spring.dao.professionCateg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.spring.model.ProfessionCategory;

@Component
public class ProfessionCategoryDaoImpl implements ProfessionCategoryDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int whichProfession(ProfessionCategory professionCateg) {

		String sql = "select profession_categ_id from profession_categ where profession_categ_name=? ";
				try {
		            int profession_categ_id = jdbcTemplate.update(sql, String.class, professionCateg.getProfession_name());
		            
					return profession_categ_id;
					
				} catch (Exception e) {
					e.printStackTrace();
					return 0;
				}
	}
	@Override
    public List<ProfessionCategory> allProfessions() {
        String sql = "SELECT * FROM profession_Categ";
        
        try {
            List<ProfessionCategory> professionCategories = jdbcTemplate.query(sql, (resultSet, i) -> {
                ProfessionCategory category = new ProfessionCategory();
                category.setId(resultSet.getInt("profession_categ_id"));
                category.setProfession_name(resultSet.getString("profession_categ_name"));
                // Set other properties if needed
                return category;
            });

            return professionCategories;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
