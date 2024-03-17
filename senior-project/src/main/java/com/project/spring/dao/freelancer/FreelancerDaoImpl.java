package com.project.spring.dao.freelancer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.project.spring.model.Freelancer;

@Component
public class FreelancerDaoImpl implements FreelancerDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Freelancer getFreelancerById(int freelancerId) {
		String sql = "SELECT * FROM freelancer WHERE freelancer_id = ?";
		try {
			Freelancer retrievedFreelancer = jdbcTemplate.queryForObject(sql, (resultSet, i) -> {
				Freelancer result = new Freelancer();
				result.setId(resultSet.getInt("freelancer_id"));
				result.setFirstName(resultSet.getString("freelancer_f_name"));
				result.setLastName(resultSet.getString("freelancer_l_name"));
				result.setEmail(resultSet.getString("freelancer_email"));
				result.setPassword("freelancer_password");
				result.setUsername("freelancer_username");
				result.setMobile("freelancer_phone_num");
				result.setProfileImg("freelancer_img");
				result.setLocation("freelancer_location");
				result.setDescription("freelancer_Descrip");
				result.setProfessionCategName("freelancer_profession_name");

				// whichProfession() function ta 7atta a3mol get lal profession_id ta fini
				// a3mella set

				//ProfessionCategory professionCateg = new ProfessionCategory();
				//int professionId = professionService.whichProfession(professionCateg);

				return result;
			}, freelancerId);

			return retrievedFreelancer;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
