/**
 * 
 */
package com.akhil.jwtsercuritydemo.utils;

/**
 * @author akhilajay
 *
 */

public final class JWTProperties {

	public JWTProperties() {
		
	}
	public static String SECURITY_KEY="test@123!";
	//## expiration is in milliseconds. i give it for 2 min for testing
	public static String EXPIRATION="120000";
	public static String HEADER="Authorization";
	public static String TOKENPREFIX="Bearer ";

	

}
