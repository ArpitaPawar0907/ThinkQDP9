package com.outputquestions;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class Q8DuplicateElement {

	public static void main(String[] args) {

		TreeMap<Employee2, Integer> emp = new TreeMap<>(new NameComperator());

		emp.put(new Employee2(101, "arpita", 30000), 1);
		emp.put(new Employee2(102, "pranay", 45000), 2);
		emp.put(new Employee2(103, "nisha", 23000), 3);
		emp.put(new Employee2(104, "reetu", 30000), 4);
		emp.put(new Employee2(105, "prachi", 32000), 5);

		emp.put(new Employee2(104, "reetu", 30970), 4);
		for (Entry<Employee2, Integer> en : emp.entrySet()) {
			System.out.println(en.getKey());
			System.out.println(en.getValue());
			System.out.println("---------------------------");
		}

	}

}
