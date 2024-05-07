package com.ilp03.entity;

import java.sql.Date;

public class Workshop {

	private int workshopId;
	private String workshopName;
	private Date workshopDate;
	private String description;
	private Category category;
	private Employee employee;
	private Date createdDate;
	
	public int getWorkshopId() {
		return workshopId;
	}
	public void setWorkshopId(int workshopId) {
		this.workshopId = workshopId;
	}
	public String getWorkshopName() {
		return workshopName;
	}
	public void setWorkshopName(String workshopName) {
		this.workshopName = workshopName;
	}
	public Date getWorkshopDate() {
		return workshopDate;
	}
	public void setWorkshopDate(Date workshopDate) {
		this.workshopDate = workshopDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	

	
	
	
	
	
}
