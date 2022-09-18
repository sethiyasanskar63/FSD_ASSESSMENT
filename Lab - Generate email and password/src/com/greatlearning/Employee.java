package com.greatlearning;

public class Employee {
	
	String firstName, lastName, department, company;
	private String email, password;
	
	public Employee() {
		super();
	}

	public Employee(String firstName, String lastName, String department, String company) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.department=department;
		this.company=company;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

}
