	/**
 * 
 */
package com.akhil.jwtsercuritydemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akhil.jwtsercuritydemo.entity.Login;
import com.akhil.jwtsercuritydemo.rapository.LoginRepository;


/**
 * @author akhilajay
 *
 */
@RestController
public class LoginController {
	
@Autowired
LoginRepository loginRepository;

	/*@Autowired
	@Qualifier("loginService")
	UserDetailsService loginService;
	
	@Autowired
	JWTUtils jWTUtils;*/

	@PostMapping("/createLogin")
	public  Login createLogin(@RequestBody Login login) {

		return loginRepository.save(login);
	}

	@PostMapping("/login")
	public Login login(@RequestBody Login login) {
		return loginRepository.findByusername(login.getUsername());

	}

}
