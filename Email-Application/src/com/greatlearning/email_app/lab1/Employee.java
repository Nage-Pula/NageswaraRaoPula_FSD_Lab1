package com.greatlearning.email_app.lab1;

public class Employee {
	
	String firstname;
	String lastname;
	String emailID;
	String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Employee(String firstname, String lastname, String emailID) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailID = emailID;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
}
