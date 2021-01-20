package com.kanuma.Domain;

import java.util.HashSet;
import java.util.Set;

/**
 * DB instance class
 * @author Dynabook
 *
 */
public class Users {

	private Set<AccountInformation> accountInfoSet = new HashSet<AccountInformation>();
	
	private Long id;
	private String userId;
	private String password;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", userId=" + userId + ", password=" + password + "]";
	}
	public Set<AccountInformation> getAccountInfoSet() {
		return accountInfoSet;
	}
	public void setAccountInfoSet(Set<AccountInformation> accountInfoSet) {
		this.accountInfoSet = accountInfoSet;
	}

	

}
