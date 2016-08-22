package com.octopuscard.components;

import java.util.Date;

public class User {

	private String firstName;
	private String lastName;
	private Date birthday;
	private String passportSerial;
	private Account account;
	

	public User(String firstName, String lastName, Date birthday, String passportSerial) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
		this.passportSerial = passportSerial;
	}
	
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getPassportSerial() {
		return passportSerial;
	}
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	
}
