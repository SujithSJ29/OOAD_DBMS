package com.ilp03.dao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.ilp03.entity.Category;
import com.ilp03.entity.Employee;
import com.ilp03.entity.Workshop;


public class WorkshopDAO {
	
	public static Connection getConnection() {
		String connectionString = "jdbc:mysql://localhost:3306/workshop_db?";
		String userName = "root";
		String password = "Sujith@123";
		Connection connection =  null;
		
		try {
			connection = DriverManager.getConnection(connectionString,userName,password);
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
	}
	
	public static void closeConnection(Connection connection) {
		try {
			connection.close();
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static ArrayList<Workshop> getWorkshopDetails(Connection connection,String workshopName){
		
		ArrayList<Workshop> workshopList = new ArrayList<Workshop>();
		String query = "select workshop.id,workshop.name,workshop.workshop_date,workshop.description,category.name,employee.first_name,workshop.created_date from workshop"
				+ " inner join category on category.id=workshop.category_id"
				+ " inner join employee on employee.id=workshop.created_by_id"
				+ " where workshop.name='"+workshopName+"';";
		//System.out.println(query);
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			
			
			while(resultSet.next()) {
				Workshop workshop = new Workshop();
				Category category = new Category();
				Employee employee = new Employee();
				
				int workshopId = resultSet.getInt(1);
				workshopName = resultSet.getString(2);
				Date workshopDate = resultSet.getDate(3);
				String description = resultSet.getString(4);
				category.setCategoryName(resultSet.getString(5));
				employee.setFirstName(resultSet.getString(6));
				Date createdDate = resultSet.getDate(7);
				
				workshop.setWorkshopName(workshopName);
				workshop.setWorkshopDate(workshopDate);
				workshop.setDescription(description);
				workshop.setCategory(category);
				workshop.setEmployee(employee);
				workshop.setCreatedDate(createdDate);
				
				workshopList.add(workshop);
			}
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return workshopList;
	}
	
	public static void setWorkshopDetails(Workshop workshop) {
		
		String workshopName = workshop.getWorkshopName();
		Date workshopDate = workshop.getWorkshopDate();
		String workshopDescription = workshop.getDescription();
		int categoryId = workshop.getCategory().getId();
		int createrId = workshop.getEmployee().getId();
		Date createDate = workshop.getCreatedDate();
		
		String query = " insert into workshop(name,workshop_date,description,category_id,created_by_id,created_date)"
				+ " values('"+workshopName+"','"+workshopDate+"','"+workshopDescription+"',"+categoryId+","+createrId+",'"+createDate+"');";
		
		try {
			Connection connection = WorkshopDAO.getConnection();
			Statement statement = connection.createStatement();
			statement.executeUpdate(query);
			System.out.println("Successfully Inserted");
			
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

