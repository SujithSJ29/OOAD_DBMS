package com.ilp03.utility;

import java.util.Scanner;

import com.ilp03.service.FeedbackService;
import com.ilp03.service.FeedbackServiceIMPL;
import com.ilp03.service.WorkshopService;
import com.ilp03.service.WorkshopServiceIMPL;

public class MainUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		
		System.out.println("########### CULTURAL WORKSHOP FOR EMPLOYEE WELLNESS ##########");
		System.out.println("1.Search workshop 2.Search workshop feedbacks 3.Insert Workshop Details 0.exit");
		do {
			System.out.println("Enter the Choice : ");
			choice = scanner.nextInt();
			if(choice == 1) {
				WorkshopService workshopService = new WorkshopServiceIMPL();
				workshopService.getWorkshopDetails();
			}
			else if(choice == 2) {
				FeedbackService feedbackService = new FeedbackServiceIMPL();
				feedbackService.getEmployeeFeedback();
			}
			else if(choice == 3) {
				WorkshopService workshopService = new WorkshopServiceIMPL();
				workshopService.setWorkshopDetails();
			}
			else System.out.println("Invalid Choice!");
			
		}
		while(choice != 0);
		System.out.println("Exit");
	}

}
