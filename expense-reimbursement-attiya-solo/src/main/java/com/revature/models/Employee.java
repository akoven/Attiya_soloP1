package com.revature.models;

public class Employee {
	
	private int employeeId;
	private String firstname;
	private String lastname;
	private String department;
	private float expenses;
	
	private String address;
	private String city;
	private String state;
	private int zip;
	private String username;
	private String password;
	
	public Employee() {
		super();
	}

	public Employee(int employeeId, String firstname, String lastname, String department, float expenses) {
		super();
		this.employeeId = employeeId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.department = department;
		this.expenses = expenses;
	}

	public Employee(int employeeId, String firstname, String lastname, String department, String address, String city, String state,
			int zip, String username, String password) {
		super();
		this.employeeId = employeeId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.department = department;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.username = username;
		this.password = password;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public float getExpenses() {
		return expenses;
	}
	public void setExpenses(float expenses) {
		this.expenses = expenses;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", department=" + department + ", expenses=" + expenses + ", address=" 
				+ address + ", city=" + city + ", state=" + state + ", zip=" + zip
				+ ", username=" + username + ", password=" + password + "]";
	}
	
	

}