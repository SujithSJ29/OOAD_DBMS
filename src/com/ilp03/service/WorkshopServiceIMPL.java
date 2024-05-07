package com.ilp03.service;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.sql.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.ilp03.dao.WorkshopDAO;
import com.ilp03.entity.Category;
import com.ilp03.entity.Employee;
import com.ilp03.entity.Workshop;


public class WorkshopServiceIMPL implements WorkshopService {

	@Override
	public void getWorkshopDetails() {
		// TODO Auto-generated method stub
		try {
			Connection connection = WorkshopDAO.getConnection();
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the workshop Name : ");
			String workshopName = scanner.nextLine();
			List<Workshop> workshopList = WorkshopDAO.getWorkshopDetails(connection,workshopName);
			connection.close();
			for(Workshop workshop : workshopList) {
				System.out.println("##DETAILS##");
				String line = "+-----------------+--------------------------------+%n";
				System.out.printf(line);
				System.out.printf("| %-15s | %-30s |%n","Workshop Name :",workshop.getWorkshopName());
				System.out.printf(line);
				System.out.printf("| %-15s | %-30s |%n","Workshop Date :",workshop.getWorkshopDate());
				System.out.printf(line);
				System.out.printf("| %-15s | %-30s |%n","Description :",workshop.getDescription());
				System.out.printf(line);
				System.out.printf("| %-15s | %-30s |%n","Category Name :",workshop.getCategory().getCategoryName());
				System.out.printf(line);
				System.out.printf("| %-15s | %-30s |%n","Creater Name :",workshop.getEmployee().getFirstName());
				System.out.printf(line);
				System.out.printf("| %-15s | %-30s |%n","Created Date :",workshop.getCreatedDate());
				System.out.printf(line);
		}
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void setWorkshopDetails() {
		//SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyyy", Locale.ENGLISH);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Workshop Details ");
		System.out.println("workshop name : ");
		String workshopName = scanner.nextLine();
		System.out.println("Workshop Date(yyyy-mm-dd) : ");
		String date = scanner.nextLine();
		Date workshopDate = Date.valueOf(date);
		System.out.println("Description : ");
		String description = scanner.nextLine();
		System.out.println("Category Id(1.game 2.arts 3.hackathon) : ");
		int categoryId = scanner.nextInt();
		System.out.println("Creater Id : ");
		int createrId = scanner.nextInt();
		long currentTimeMilli=System.currentTimeMillis();
		Date curDate=new Date(currentTimeMilli);
		
		Workshop workshop = new Workshop();
		Employee employee = new Employee();
		Category category = new Category();
		
		workshop.setWorkshopName(workshopName);
		workshop.setWorkshopDate(workshopDate);
		workshop.setDescription(description);
		category.setId(categoryId);
		workshop.setCategory(category);
		employee.setId(createrId);
		workshop.setEmployee(employee);
		workshop.setCreatedDate(curDate);
		
		WorkshopDAO workshopDAO = new WorkshopDAO();
		workshopDAO.setWorkshopDetails(workshop);
		
	}
}
