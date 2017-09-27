/**
 * 
 */
package com.akhil.jwtsercuritydemo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.akhil.jwtsercuritydemo.vo.UserVO;

/**
 * @author akhilajay
 *
 */
@Repository("loginDAO")
public class LoginDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public UserVO execute(String username) {

		final String SQL = "SELECT l.id as id,l.username as username "
				+ " ,l.password as password,p.firstname as firsName,p.lastname as lastName,"
				+ " l.profilekey as profilekey,"
				+ " p.homekey as homekey FROM student.login l,student.profile p "
				+ " where l.profilekey= p.id" + " and l.username=(?)";
		return jdbcTemplate.queryForObject(SQL,new Object[]{username}, new BeanPropertyRowMapper<>(
				UserVO.class));
	}
}
