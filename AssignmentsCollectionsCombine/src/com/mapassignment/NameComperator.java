package com.mapassignment;

import java.util.Comparator;

public class NameComperator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.getName().compareTo(e2.getName());
	}

}
