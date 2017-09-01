/**
 * 
 */
package com.akhil.jwtsercuritydemo.utils;

import java.util.Date;

import com.akhil.jwtsercuritydemo.entity.Login;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

/**
 * @author akhilajay
 *
 */

public final class JWTUtils {

	private JWTUtils() {

	}

	@SuppressWarnings("deprecation")
	public static String generateToken(Login user) {

		Claims claim = Jwts.claims().setIssuer("akhil");
		claim.put("username", user.getUsername());
		// claim.put("id", user.getId());

		return Jwts.builder().setClaims(claim)
				.setExpiration(new Date(System.currentTimeMillis() + JWTProperties.EXPIRATION))
				.signWith(SignatureAlgorithm.HS512, JWTProperties.SECURITY_KEY).compact();

	}

	public static Claims parseToken(String token) {
		try {
			Claims body = Jwts.parser().setSigningKey(JWTProperties.SECURITY_KEY)
					.parseClaimsJws(token.replace(JWTProperties.TOKENPREFIX, "")).getBody();
			return body;
		} catch (JwtException | ClassCastException e) {
			return null;
		}
	}

}
