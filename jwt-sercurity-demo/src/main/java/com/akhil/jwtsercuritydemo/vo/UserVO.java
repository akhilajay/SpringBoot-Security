/**
 * 
 */
package com.akhil.jwtsercuritydemo.vo;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

/**
 * @author akhilajay
 *
 */
public class UserVO  {

	

	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private int id;
	private int profilekey;
	private int homekey;

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the profilekey
	 */
	public int getProfilekey() {
		return profilekey;
	}

	/**
	 * @param profilekey
	 *            the profilekey to set
	 */
	public void setProfilekey(int profilekey) {
		this.profilekey = profilekey;
	}

	/**
	 * @return the homekey
	 */
	public int getHomekey() {
		return homekey;
	}

	/**
	 * @param homekey
	 *            the homekey to set
	 */
	public void setHomekey(int homekey) {
		this.homekey = homekey;
	}

}
