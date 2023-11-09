package com.demo.test;

import java.util.ArrayList;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.services.EmpServices;
import com.demo.services.EmpServicesImpl;

public class testservices {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmpServices emp = new EmpServicesImpl();
		emp.ReadFile();
		int choice = 0;
		do {
			System.out.println("Enter Choice \n1.Add Employee \n2.Delete Employee by id  \n3. Display all \n4.Exit");
			System.out.println("Enter Choice :");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				emp.addEmp();
				break;
			case 2:
				System.out.println("Enter id ");
				int id3 = sc.nextInt();
				boolean status = emp.deletebyId(id3);
				if (status) {
					System.out.println("Success");
				} else {
					System.out.println("Not found id");
				}
				break;
			case 3:
				ArrayList<Employee> elist = emp.DisplayAll();
				elist.stream().forEach(System.out::println);
				break;
			case 4:
				emp.WriteFile();
				emp.ReadFile();
				System.out.println("Thanks for visiting");
				System.exit(0);
				break;
			default:
				break;
			}
		} while (choice != 4);
	}

}
