package com.oopsAssignment;

public class StudentQ10 {
	private int id=101;
	private String name="Arpita";
	
	
	StudentQ10()
	{
		
	}
	StudentQ10(int id,String name )
	{
		this.id=id;
		this.name=name;
		
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
   
   public String toString()
   {
	   return "Student id:"+id+" Name:"+name;
   }
   
   
   public static void main(String[] args) {
	
	   StudentQ10 q10=new StudentQ10();
	   System.out.println(q10);
	   
	   q10.id=102;
	   q10.name="sonali";
	   System.out.println(q10);
	   
	   
}
   
   
   
}
