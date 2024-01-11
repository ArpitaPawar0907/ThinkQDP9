package com.interfacedemo;
@FunctionalInterface
interface showable
{
	void display();
	//void print();
}
interface Printable {
	void display();
}
class Demo implements showable,Printable
{

	@Override
	public void display() {
		
		System.out.println("Welcome");
		
	}
	
}
public class Multipleinheritance {

	public static void main(String[] args) {

		Demo d1=new Demo();
		d1.display();

	}

}
