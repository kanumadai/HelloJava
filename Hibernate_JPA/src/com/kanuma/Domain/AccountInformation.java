package com.kanuma.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AccountInformation")
public class AccountInformation {
	
	//private Users users;
	@Id
	@Column(name = "accountId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long accountId;
	@Column(name = "userId")
	private String userId ;
	@Column(name = "loginAccount")
	private String loginAccount;
	@Column(name = "loginPassword")
	private String loginPassword ;
	@Column(name = "payAccount")
	private String payAccount;
	@Column(name = "payPassword")
	private String payPassword;
	@Column(name = "emailAddr")
	private String emailAddr;
	@Column(name = "telephone")
	private String telephone;
	@Column(name = "validDate")
	private String validDate ;
	@Column(name = "creditSafeCode")
	private String creditSafeCode ;
	@Column(name = "safeQuestion1")
	private String safeQuestion1 ;
	@Column(name = "safeQuestionAnswer1")
	private String safeQuestionAnswer1;
	@Column(name = "safeQuestion2")
	private String safeQuestion2;
	@Column(name = "safeQuestionAnswer2")
	private String safeQuestionAnswer2 ;
	@Column(name = "safeQuestion3")
	private String safeQuestion3 ;
	@Column(name = "safeQuestionAnswer3")
	private String safeQuestionAnswer3 ;
	@Column(name = "emergencyContact1")
	private String emergencyContact1 ;
	@Column(name = "emergencyContactPhone1")
	private String emergencyContactPhone1 ;
	@Column(name = "emergencyContact2")
	private String emergencyContact2 ;
	@Column(name = "emergencyContactPhone2")
	private String emergencyContactPhone2 ;
	@Column(name = "address")
	private String address ;
	@Column(name = "accountType")
	private String accountType ;
	@Column(name = "companyName")
	private String companyName ;
	@Column(name = "companyCode")
	private String companyCode ;
	@Column(name = "shopName")
	private String shopName;
	@Column(name = "shopCode")
	private String shopCode;
	@Column(name = "webSite")
	private String webSite ;
	
	@Override
	public String toString() {
		return "AccountInformation [accountId=" + accountId + ", userId=" + userId + ", loginAccount=" + loginAccount
				+ ", loginPassword=" + loginPassword + ", payAccount=" + payAccount + ", payPassword=" + payPassword
				+ ", emailAddr=" + emailAddr + ", telephone=" + telephone + ", validDate=" + validDate
				+ ", creditSafeCode=" + creditSafeCode + ", safeQuestion1=" + safeQuestion1 + ", safeQuestionAnswer1="
				+ safeQuestionAnswer1 + ", safeQuestion2=" + safeQuestion2 + ", safeQuestionAnswer2="
				+ safeQuestionAnswer2 + ", safeQuestion3=" + safeQuestion3 + ", safeQuestionAnswer3="
				+ safeQuestionAnswer3 + ", emergencyContact1=" + emergencyContact1 + ", emergencyContactPhone1="
				+ emergencyContactPhone1 + ", emergencyContact2=" + emergencyContact2 + ", emergencyContactPhone2="
				+ emergencyContactPhone2 + ", address=" + address + ", accountType=" + accountType + ", companyName="
				+ companyName + ", companyCode=" + companyCode + ", shopName=" + shopName + ", shopCode=" + shopCode
				+ ", webSite=" + webSite + "]";
	}
	
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getLoginAccount() {
		return loginAccount;
	}
	public void setLoginAccount(String loginAccount) {
		this.loginAccount = loginAccount;
	}
	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	public String getPayAccount() {
		return payAccount;
	}
	public void setPayAccount(String payAccount) {
		this.payAccount = payAccount;
	}
	public String getPayPassword() {
		return payPassword;
	}
	public void setPayPassword(String payPassword) {
		this.payPassword = payPassword;
	}
	public String getEmailAddr() {
		return emailAddr;
	}
	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getValidDate() {
		return validDate;
	}
	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}
	public String getCreditSafeCode() {
		return creditSafeCode;
	}
	public void setCreditSafeCode(String creditSafeCode) {
		this.creditSafeCode = creditSafeCode;
	}
	public String getSafeQuestion1() {
		return safeQuestion1;
	}
	public void setSafeQuestion1(String safeQuestion1) {
		this.safeQuestion1 = safeQuestion1;
	}
	public String getSafeQuestionAnswer1() {
		return safeQuestionAnswer1;
	}
	public void setSafeQuestionAnswer1(String safeQuestionAnswer1) {
		this.safeQuestionAnswer1 = safeQuestionAnswer1;
	}
	public String getSafeQuestion2() {
		return safeQuestion2;
	}
	public void setSafeQuestion2(String safeQuestion2) {
		this.safeQuestion2 = safeQuestion2;
	}
	public String getSafeQuestionAnswer2() {
		return safeQuestionAnswer2;
	}
	public void setSafeQuestionAnswer2(String safeQuestionAnswer2) {
		this.safeQuestionAnswer2 = safeQuestionAnswer2;
	}
	public String getSafeQuestion3() {
		return safeQuestion3;
	}
	public void setSafeQuestion3(String safeQuestion3) {
		this.safeQuestion3 = safeQuestion3;
	}
	public String getSafeQuestionAnswer3() {
		return safeQuestionAnswer3;
	}
	public void setSafeQuestionAnswer3(String safeQuestionAnswer3) {
		this.safeQuestionAnswer3 = safeQuestionAnswer3;
	}
	public String getEmergencyContact1() {
		return emergencyContact1;
	}
	public void setEmergencyContact1(String emergencyContact1) {
		this.emergencyContact1 = emergencyContact1;
	}
	public String getEmergencyContactPhone1() {
		return emergencyContactPhone1;
	}
	public void setEmergencyContactPhone1(String emergencyContactPhone1) {
		this.emergencyContactPhone1 = emergencyContactPhone1;
	}
	public String getEmergencyContact2() {
		return emergencyContact2;
	}
	public void setEmergencyContact2(String emergencyContact2) {
		this.emergencyContact2 = emergencyContact2;
	}
	public String getEmergencyContactPhone2() {
		return emergencyContactPhone2;
	}
	public void setEmergencyContactPhone2(String emergencyContactPhone2) {
		this.emergencyContactPhone2 = emergencyContactPhone2;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getShopCode() {
		return shopCode;
	}
	public void setShopCode(String shopCode) {
		this.shopCode = shopCode;
	}
	public String getWebSite() {
		return webSite;
	}
	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}
//	public Users getUsers() {
//		return users;
//	}
//
//	public void setUsers(Users users) {
//		this.users = users;
//	}

}
