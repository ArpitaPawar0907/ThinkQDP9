package com.covarient;

class MyPerson {
	int id;
	String name;

	MyPerson() {

	}

	MyPerson(int id, String name) {
		this.id = id;
		this.name = name;
	}

	MyPerson showDetails() {
		name += " ThinkQ";
		return this;
	}

	public String toString() {
		return "id:" + id + " name:" + name;
	}
}

class MyEmployee extends MyPerson {

	float salary;

	MyEmployee() {

	}

	MyEmployee(int id, String name, float salary) {
		super(id, name);
		this.salary = salary;
	}

	MyEmployee showDetails() {
		name += " ThinkQuetient";
		salary += 1000;
		return this;
	}

	void showSalary() {
		System.out.println("Salary:" + salary);
	}

	@Override
	public String toString() {
		return super.toString()+" salary:" + salary ;
	}
	
}

public class CovarientDemo2 {

	public static void main(String[] args) {

		MyPerson p;
		MyEmployee e;

		MyPerson p1 = new MyPerson(1, "Shreyash");
		MyPerson p2 = new MyPerson(2, "Prachi");

		MyEmployee e1 = new MyEmployee(3, "Pranay", 34665f);

		p = p1.showDetails();
		System.out.println(p);

		p = p2.showDetails();
		System.out.println(p);

		p = e1.showDetails();
		System.out.println(p);

		// p.showSalary();
		e =e1.showDetails();// we does not need explicite type casting
		System.out.println(e);

		e.showSalary();
		System.out.println(e);

	}

}
