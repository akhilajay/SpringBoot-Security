/**
 * 
 */
package com.akhil.jwtsercuritydemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author akhilajay
 *
 */
@Entity
public class Content {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String content;
	private int profilekey;

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
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content
	 *            the content to set
	 */
	public void setContent(String content) {
		this.content = content;
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

}
