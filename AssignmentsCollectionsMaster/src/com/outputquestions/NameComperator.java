package com.outputquestions;

import java.util.Comparator;

public class NameComperator implements Comparator<Employee2>{

	@Override
	public int compare(Employee2 e1, Employee2 e2) {
		// TODO Auto-generated method stub
		return e1.getName().compareTo(e2.getName());
	}

}
