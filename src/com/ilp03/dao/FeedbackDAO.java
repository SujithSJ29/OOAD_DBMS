package com.ilp03.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.ilp03.entity.Employee;
import com.ilp03.entity.Feedback;
import com.ilp03.entity.Register;


public class FeedbackDAO {
	
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
	
	public static ArrayList<Feedback> getEmployeeFeedback(Connection connection,String workshopName){
		
		ArrayList<Feedback> feedbackList = new ArrayList<Feedback>();
		String query = " select employee.first_name,employee.last_name,feedback.description from feedback"
				+ " inner join register on register.id=feedback.register_id"
				+ " inner join employee on employee.id=register.employee_id"
				+ " inner join workshop on workshop.id=register.workshop_id"
				+ " where workshop.name='"+workshopName+"';";
		//System.out.println(query);
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			
			
			while(resultSet.next()) {
				Feedback feedback = new Feedback();
				Register register = new Register();
				Employee employee = new Employee();
				
				String firstName = resultSet.getString(1);
				String lastName = resultSet.getString(2);
				String feedbackDescription = resultSet.getString(3);
				
				employee.setFirstName(firstName);
				employee.setLastName(lastName);
				register.setEmployee(employee);
				
				feedback.setRegister(register);
				feedback.setDescription(feedbackDescription);
				
				feedbackList.add(feedback);
			}
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return feedbackList;
	}

}
