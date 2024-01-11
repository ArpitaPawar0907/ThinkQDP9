package com.innerclassDemo;
class Parent
{
	static int num1=10;
	int num2=20;
	void display()
	{
		System.out.println(num1);
		System.out.println(num2);
	}
	static class Inner
	{
		static String msg1="Hello";
		String msg2="Welcome";
		
		void show()
		{
			System.out.println(num1);
			//System.out.println(num2);
			
			System.out.println("Messgae 1:"+msg1);
			System.out.println("Messgae 2:"+msg2);
			//display();
			
			Parent p1=new Parent();
			 p1.display();
		}
	}
}
public class StaticInnerClass {

	public static void main(String[] args) {
		
		Parent.Inner  i1=new Parent.Inner();
		i1.show();

	}

}
