package com.kanuma.Domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * DB instance class
 * @author Dynabook
 *
 */
@Entity
@Table(name = "Users" )
public class Users implements Serializable {

	@OneToMany(targetEntity = AccountInformation.class,mappedBy = "users")
	private Set<AccountInformation> accountInfoSet = new HashSet<AccountInformation>();
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "userId")
	private String userId;
	@Column(name = "password")
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
