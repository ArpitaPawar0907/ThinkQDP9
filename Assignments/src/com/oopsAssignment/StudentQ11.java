package com.oopsAssignment;

import java.util.Scanner;

public class StudentQ11 {
	private int id;
	private String name;
	private double per;
	
	StudentQ11()
	{
		
	}
	StudentQ11(int id,String name,double per )
	{
		this.id=id;
		this.name=name;
		this.per=per;
	}
	private void setId(int id)
	{
		this.id=id;
	}
	private int getId()
	{
		return id;
	}
   private void setName(String name)
   {
	   this.name=name;
   }
   public String getName()
   {
	   return name;
   }
   public void setPer(double per)
   {
	   this.per=per;
   }
   public double getPer()
   {
	   return per;
   }
   public String toString()
   {
	   return "Student id:"+id+" Name:"+name+" Percentage:"+per;
   }
   
   public static void main(String[] args) {
	
	   
	   StudentQ11 q11=new StudentQ11();
	   Scanner sc=new Scanner(System.in);
	  for(int i=1;i<=2;i++)
	  {
		  System.out.println("Enter student id");
		  q11.setId(sc.nextInt());
		  System.out.println("Enter student name");
		  q11.setName(sc.next());
		  System.out.println("Enter student per");
		  q11.setPer(sc.nextDouble());
		  System.out.println(q11);
	  }
	   
}
   
   
   
    
}
