package com.innerclassDemo;
class Outer
{
	static int data=10;
	void display()
	{
		class Inner
		{
			int value=100;
			void show()//static
			{
			//	System.out.println(value);
				System.out.println(data);
			}
			void show1()
			{
				System.out.println(value);
			}
		}
		Inner i1=new Inner();
		i1.show();
		i1.show1();
	}
}
public class LocalInnerClass {

	public static void main(String[] args) {
		
		Outer o1=new Outer();
		o1.display();

	}

}
