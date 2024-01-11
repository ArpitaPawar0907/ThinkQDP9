package com.covarient;
class First
{
	Number value;
	Object display()//if return type is number then child can't hava character and boolen data type
	{
		return value;
	}
}
class Second extends First
{
	Integer myValue;
	Integer display()
	{
		myValue=20;
		return myValue;
	}
}
class Third extends First
{
	Character ch;
	Character display()
	{
		ch='A';
		return ch;
	}
}
public class CovarientWrapper {

	public static void main(String[] args) {

		First f1=new First();
		f1.value=89;
		System.out.println(f1.display());
		
		Second s1=new Second();
		System.out.println(s1.display());
		
		Third t1=new Third();
		System.out.println(t1.display());
		
		System.out.println(t1.display()+2);

	}

}
