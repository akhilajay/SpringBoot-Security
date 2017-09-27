/**
 * 
 */
package com.akhil.jwtsercuritydemo.vo;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author TACME
 *
 */
public class CurrentUser implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1543760675512800462L;

	/**
	 * @param firstName
	 * @param lastName
	 * @param username
	 * @param password
	 * @param id
	 * @param profilekey
	 * @param homekey
	 */
	public CurrentUser(String firstName, String lastName, String username,
			String password, int id, int profilekey, int homekey) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.id = id;
		this.profilekey = profilekey;
		this.homekey = homekey;
	}

	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private int id;
	private int profilekey;
	private int homekey;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Set<GrantedAuthority> authorities = new HashSet<>();
		return authorities;
	}

	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @param firstName the firstName to set
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
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
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
	 * @param profilekey the profilekey to set
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
	 * @param homekey the homekey to set
	 */
	public void setHomekey(int homekey) {
		this.homekey = homekey;
	}


	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return username;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
