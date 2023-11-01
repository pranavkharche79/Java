package com.demo.dao;

import com.demo.beans.Person;

public interface Persondao {

	void save(Person p);

	Person[] display();

	Person searchID(int id);

	Person[] searchName(String name);

	
	


}
