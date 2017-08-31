/**
 * 
 */
package com.akhil.jwtsercuritydemo.utils;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import com.akhil.jwtsercuritydemo.entity.Login;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author akhilajay
 *
 */
public final class AuthenticationHelper {

	private AuthenticationHelper() {

	}

	public static Login getLoginCredentials(HttpServletRequest request) {
		try {
			Login login = new ObjectMapper().readValue(request.getInputStream(), Login.class);

			return login;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		}
	}
}
