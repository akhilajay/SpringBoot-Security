package com.akhil.jwtsercuritydemo;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.akhil.jwtsercuritydemo.entity.Login;
import com.akhil.jwtsercuritydemo.utils.JWTUtils;

import io.jsonwebtoken.Claims;

@RunWith(SpringRunner.class)
@SpringBootTest

public class JWTServiceTest {

	String token = "eyJhbGciOiJIUzUxMiJ9.eyJpc3MiOiJha2hpbCIsInVzZXJuYW1lIjoiand0dGVzdCIsImlkIjoxfQ.O-_rh7gUCIyh3sfbYjkBGCQuLhIHjzxyIhpz6KzDgoh_sVNigAZyfewlBph6aPl40eVeurt3Map1QdJdv8ruog";

	@Test
	@Ignore
	public void testGenerateToken() {
		Login login = new Login();
		login.setId(1);
		login.setUsername("jwttest");
		login.setPassword("jwtpwd");
		assertEquals(token, JWTUtils.generateToken(login));
	}

	@Test
	public void testParseToken() {
		Claims claim = JWTUtils.parseToken(token);
		assertEquals("akhil", JWTUtils.parseToken(token).getIssuer());

	}

}
