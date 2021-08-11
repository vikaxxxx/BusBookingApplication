package com.timesinternet.busbooking.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Users {
	@Id
	@Column(name="userId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;
	
	@Column(name="userName")
	private String userName;
	
	@Column(name="userPhoneNumber")
	private String userPhoneNumber;
	
	@Column(name="userAddress")
	private String userAddress;
	
	public Users() {
		
	}
	
	public Users( String userName, String userPhoneNumber, String userAddress) {
		this.userName = userName;
		this.userPhoneNumber = userPhoneNumber;
		this.userAddress = userAddress;
	} 
	public Users(int userId, String userName, String userPhoneNumber, String userAddress) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPhoneNumber = userPhoneNumber;
		this.userAddress = userAddress;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}

	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	
	
	
	
	
}
