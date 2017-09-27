/**
 * 
 */
package com.akhil.jwtsercuritydemo.service;

import static java.util.Collections.emptyList;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.akhil.jwtsercuritydemo.dao.LoginDAO;
import com.akhil.jwtsercuritydemo.vo.CurrentUser;
import com.akhil.jwtsercuritydemo.vo.JWTFactory;
import com.akhil.jwtsercuritydemo.vo.UserVO;

/**
 * @author akhilajay
 *
 */
@Service("newUserDetailServiceImpl")
public class NewUserDetailServiceImpl implements UserDetailsService{
	
	@Autowired
	LoginDAO loginDao;

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		UserVO userVO = loginDao.execute(username);
		return  JWTFactory.create(userVO);
	}

}
