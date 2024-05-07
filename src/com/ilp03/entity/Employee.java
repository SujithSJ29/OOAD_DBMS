package com.ilp03.entity;

public class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private String sex;
	private String address;
	private long phoneNumber;
	private Employee employeeCreatedById;
	private Employee employeeUpdatedById;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Employee getEmployeeCretaedById() {
		return employeeCreatedById;
	}
	public void setEmployeeCretaedById(Employee employeeCretaedById) {
		this.employeeCreatedById = employeeCretaedById;
	}
	public Employee getEmployeeUpdatedById() {
		return employeeUpdatedById;
	}
	public void setEmployeeUpdatedById(Employee employeeUpdatedById) {
		this.employeeUpdatedById = employeeUpdatedById;
	}
	
	
	
	
	
}
