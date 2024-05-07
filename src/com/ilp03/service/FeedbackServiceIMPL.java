package com.ilp03.service;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

import com.ilp03.dao.FeedbackDAO;
import com.ilp03.entity.Feedback;


public class FeedbackServiceIMPL implements FeedbackService {

	@Override
	public void getEmployeeFeedback() {
		// TODO Auto-generated method stub
		try {
			Connection connection = FeedbackDAO.getConnection();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the workshop Name : ");
			String workshopName = scanner.nextLine();
			List<Feedback> feedbackList = FeedbackDAO.getEmployeeFeedback(connection,workshopName);
			connection.close();
			String line = "+-----------------+----------------------------------------------------+%n";
			System.out.printf(line);
			System.out.printf("| %-15s | %-50s |%n","FULL NAME","FEEDBACK");
			System.out.printf(line);
			for(Feedback feedback : feedbackList) {
				System.out.printf("| %-15s | %-50s |%n",feedback.getRegister().getEmployee().getFirstName()+" "+feedback.getRegister().getEmployee().getLastName(),feedback.getDescription());
				System.out.printf(line);
		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		
	}

	}

}
