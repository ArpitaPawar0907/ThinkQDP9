package com.constructor;

public class Course {
	private int id;
	private String name;
	private SubCourse course;
	Course()
	{
		new SubCourse();
	System.out.println(" Course Default Constructor");	
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId() 
	{
		return id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName() 
	{
		return name;
	}
	public void setCourse(SubCourse course)
	{
		this.course = course;
	}
	public SubCourse getCourse() 
	{
		return course;
	}
	
	public String toString()
	{
		return "{ Course id:"+id+" name:"+name+" }";
	}
	public static void main(String[] args) {
		
		Course c1=new Course();
		
		
		c1.id=101;
		c1.name="Java";
		
		
		System.out.println(c1);
		
		
	}

}
class SubCourse{
	
	private int subId;
	private String subName;
	
	SubCourse()
	{
		System.out.println("SubCourse Default constructor");
		
	}

	public void setSubId(int subId) 
	{
		this.subId = subId;
	}
	public int getSubId()
	{
		return subId;
	}
	public void setSubName(String subName) 
	{
		this.subName = subName;
	}

	public String getSubName() 
	{
		return subName;
	}

	
	
	public String toString() {
		return "SubCourse subId:"+subId+" subName:"+subName+"}";
	}
	
	
	
	
	
	
	
	
	
	
	
}