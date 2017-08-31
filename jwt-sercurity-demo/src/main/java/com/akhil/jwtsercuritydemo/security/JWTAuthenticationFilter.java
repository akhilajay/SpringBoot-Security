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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.akhil.jwtsercuritydemo.utils.JWTProperties;
import com.akhil.jwtsercuritydemo.utils.JWTUtils;

import io.jsonwebtoken.Claims;

/**
 * @author akhilajay
 *
 */

public class JWTAuthenticationFilter extends BasicAuthenticationFilter {
	

	
	
	public JWTAuthenticationFilter(AuthenticationManager authenticationManager) {
		super(authenticationManager);
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {

		String token = request.getHeader(JWTProperties.HEADER);
		if(token==null || !token.startsWith(JWTProperties.TOKENPREFIX)) {
			filterChain.doFilter(request, response);
		}else {
			Claims claims = JWTUtils.parseToken(token);
			String username =claims.get("username").toString();
			if (username!=null) {
				UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(username, null,new ArrayList<>());
				SecurityContextHolder.getContext().setAuthentication(authentication);
				filterChain.doFilter(request, response);
			}
		}

		
	}

}
