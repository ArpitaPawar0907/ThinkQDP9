
package com.varargs;
class Parent
{
	public static void display(double ...ar)
	{
		System.out.println("In double");
		for( double a:ar )
		{
			System.out.println(a);
		}
	}
}
class Child extends Parent
{
//	@Override
//	public static void display(double ...ar)
//	{
//		System.out.println("In double");
//		for( double a:ar )
//		{
//			System.out.println(a);
//		}
//	}
}
public class VaragsOverriding {

	public static void main(String[] args) {

	Child.display(3,45);

	}

}
