package com.consructor;

class Demo
{
	int a;
	int b;
	String name;
	Demo()
	{
		this(10,10);  //2)constructor chaining
		System.out.println("Default Constructor");
	}
	Demo(int a,int b)
	{
		System.out.println("Parameterized constructor");
		this.a=a;  //1)differentiate b/w argument and instance variable
		this.b=b;
		name="Shruti";
	}
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		addition(this);  //3)pass current obj to method
	}
	void addition(Demo d)
	{
	System.out.println("Sum="+(d.a+d.b));
	}
	
	Demo show()
	{
		a=a+10;
		b=b+10;
		name=name+" ThinkQuetient";
		return this;  //4)return current object
	}
	void printMe()
	{
		int a=100;// to differentiate b/w local and instance variable
		System.out.println(a);
		System.out.println(this.a);
	}
	
	void show1()
	{
		
	}
	
	
	
	
	
	
	
	
}

public class ThisDemo {

	public static void main(String[] args) {
	

		Demo obj1=new Demo();
	 System.out.println(obj1.a);
	 System.out.println(obj1.b);
	 System.out.println(obj1.name);
		System.out.println("-------------------------------------");
		Demo obj2=new Demo(2,3);
		System.out.println(obj1.a);
		 System.out.println(obj1.b);
		 System.out.println(obj1.name);
		
		System.out.println("-------------------------------------");
		Demo obj3=new Demo();
		obj2.display();
     System.out.println("-------------------------------------------------");
     Demo obj4=new Demo();
     Demo d1;
     System.out.println(obj4.a);
	 System.out.println(obj4.b);
	 System.out.println(obj4.name);
	d1=obj4;
	System.out.println(d1.a);
	 System.out.println(d1.b);
	 System.out.println(d1.name);
	
     
	}

}
