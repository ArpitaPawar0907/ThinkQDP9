package com.exceptionhandling;
class Person
{   
   public void display() 
   {
      System.out.println(" I am a Person ");
  }
}

class Student extends Person
{
  @Override
  public void display() throws NullPointerException
  {
      System.out.println(" I am a Student ");
  }
}



public class Q16MethodOverriding {

	public static void main(String[] args)
	  {
	      Student s1 = new Student();
	      s1.display();
	  }

}
