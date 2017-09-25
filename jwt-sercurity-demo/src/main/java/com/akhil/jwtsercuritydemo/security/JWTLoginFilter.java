/**
 * 
 */
package com.akhil.jwtsercuritydemo.security;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.akhil.jwtsercuritydemo.entity.Login;
import com.akhil.jwtsercuritydemo.utils.AuthenticationHelper;
import com.akhil.jwtsercuritydemo.utils.JWTProperties;
import com.akhil.jwtsercuritydemo.utils.JWTUtils;

/**
 * @author akhilajay
 *
 */

public class JWTLoginFilter extends UsernamePasswordAuthenticationFilter {

	private AuthenticationManager authenticationManager;

	public JWTLoginFilter(AuthenticationManager authenticationManager) {
		this.authenticationManager = authenticationManager;

	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest request,
			HttpServletResponse response) throws AuthenticationException {

		Login login = AuthenticationHelper.getLoginCredentials(request);

		return authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(login
						.getUsername(), login.getPassword(), new ArrayList<>()));

	}

	@Override
	protected void successfulAuthentication(HttpServletRequest request,
			HttpServletResponse response, FilterChain chain, Authentication auth)
			throws IOException, ServletException {
		Login login = new Login();
		login.setUsername(auth.getName());
		response.addHeader(JWTProperties.HEADER, JWTProperties.TOKENPREFIX
				+ JWTUtils.generateToken(login));

	}

}
