package com.demo.service;
import java.util.Scanner;

import com.demo.beans.Person;
import com.demo.dao.Persondao;
import com.demo.dao.PersondaoImpl;
public class PersonServiceImpl implements PersonService{
	Persondao pdao=new PersondaoImpl();
		
	@Override
	public void addNewPeople() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the person id");
		int id=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the person name");
		String name=sc.nextLine();
		
		System.out.println("Enter the person mobile number");
		String number=sc.nextLine();
		 
		Person p=new Person(id,name,number);
		pdao.save(p);
	}

	@Override
	public Person[] displayAll() {
		return pdao.display();
		
	}

	@Override
	public Person searchById(int id) {
		
		return pdao.searchID(id);
	}

	@Override
	public Person[] searchByName(String name) {
		
		return pdao.searchName(name);
	}

	
	
}
