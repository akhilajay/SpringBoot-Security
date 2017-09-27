/**
 * 
 */
package com.akhil.jwtsercuritydemo.vo;


/**
 * @author TACME
 *
 */
public class JWTFactory {

	/**
	 * 
	 */
	private JWTFactory() {
		// TODO Auto-generated constructor stub
	}

	public static CurrentUser create(UserVO userVO) {
		return new CurrentUser(userVO.getFirstName(), userVO.getFirstName(),
				userVO.getUsername(), userVO.getPassword(), userVO.getId(),
				userVO.getProfilekey(), userVO.getHomekey());
	}
}
