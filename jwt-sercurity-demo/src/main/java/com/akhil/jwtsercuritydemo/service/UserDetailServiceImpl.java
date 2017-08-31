/**
 * 
 */
package com.akhil.jwtsercuritydemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.akhil.jwtsercuritydemo.entity.Login;
import com.akhil.jwtsercuritydemo.rapository.LoginRepository;

import static java.util.Collections.emptyList;

/**
 * @author akhilajay
 *
 */
@Service
public class UserDetailServiceImpl implements UserDetailsService {
	
	@Autowired
	LoginRepository loginRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Login login = loginRepository.findByusername(username);
		if(login== null) {
			throw new UsernameNotFoundException("username "+username +" not found");
		}
		return new User(login.getUsername(), login.getPassword(), emptyList());
	}

}
