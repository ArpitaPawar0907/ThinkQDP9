package com.inheritance;
class Parent
{
	int a=10;
	void display()
	{
		System.out.println("In Parent class:"+a);
	}
}
class Child extends Parent{
	int a=100;
	void show()
	{
		int a=1000;
		display();
		super.display();
		System.out.println("---------------------");
		System.out.println("Local "+a);
		System.out.println("instance:"+this.a);
		System.out.println("Super class:"+super.a);
	}
	void display()
	{
		System.out.println("In Child class:"+a);
	}
}
public class SuperDemo {

	public static void main(String[] args) {
	
		
		Child c1=new Child();
		c1.display();
		c1.show();
		

	}

}
