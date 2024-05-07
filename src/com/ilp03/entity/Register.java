package com.ilp03.entity;

import java.sql.Date;

public class Register {

	private int id;
	private Employee employee;
	private Workshop workshop;
	private Date registrationDate;
	private char perticipated;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Workshop getWorkshop() {
		return workshop;
	}
	public void setWorkshop(Workshop workshop) {
		this.workshop = workshop;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	public char getPerticipated() {
		return perticipated;
	}
	public void setPerticipated(char perticipated) {
		this.perticipated = perticipated;
	}
	
	
}
