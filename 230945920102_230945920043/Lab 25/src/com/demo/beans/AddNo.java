package com.demo.beans;

import java.util.ArrayList;
import java.util.List;

public class AddNo {
	public void add()
	{
		List<Integer> lst=new ArrayList<>();
		lst.add(100);
		lst.add(101);
		lst.add(102);
		lst.stream().forEach((a)->{System.out.println(a);});
	}
}
