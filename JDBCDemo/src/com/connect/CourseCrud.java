package com.connect;

import java.sql.*;
import java.util.Scanner;

public class CourseCrud {

	static Connection con=null;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	static Scanner sc=new Scanner(System.in);
	public CourseCrud() {
		
		con=DbConnection.getConnect();
		System.out.println("Connection established.....");
		try
		{
			st=con.createStatement();
			
		}
		catch (Exception e) {
			
			System.out.println(e);
		}
	}
	public void insertDetails()

	{
		System.out.println("Enter id");
		int courseid=sc.nextInt();
		System.out.println("Enter course name");
		String cname=sc.next();
		System.out.println("Enter duration");
		int dur=sc.nextInt();
		System.out.println("Enter fees");
		float fees=sc.nextFloat();
		
		try
		{
			pst=con.prepareStatement("insert into course values (?,?,?,?)");
			pst.setInt(1, courseid);
			pst.setString(2,cname);
			pst.setInt(3, dur);
			pst.setFloat(4,fees);
			int noOfRows=pst.executeUpdate();
			if(noOfRows>0)
			{
				System.out.println("Course inserted");
			}
			else
			{
				System.out.println("Course not inserted");
			}
		}catch (Exception e) {
	
			System.out.println(e);
		}
	}
	public void fetchDetails()
	{
		try
		{
			rs=st.executeQuery("select * from course");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getFloat(4));
			}
		}catch (Exception e) {

			System.out.println(e);
		}
	}
	public void deleteById()
	{
		System.out.println("Enter the courseid to be deleted");
		int id=sc.nextInt();
		
		try
		{
			pst=con.prepareStatement("delete from course where courseid=?");
			pst.setInt(1,id);
			
			int noOfrowsDeleted=pst.executeUpdate();
			//int noOfrowsDeleted=st.executeUpdate("delete from course where courseid="+id);
			if(noOfrowsDeleted>0)
			{
				System.out.println("Course "+id+" deleted");
			}
			else
			{
				System.out.println("Course is not present");
			}
		}catch (Exception e) {
		
			System.out.println(e);
		}
	}
     public boolean searchCourseById(int id)
     {
    	 boolean found=false;
    	 try {
			pst=con.prepareStatement("select * from course where courseid=?");
			pst.setInt(1, id);
			
			rs=pst.executeQuery();
			while(rs.next())
			{
				found=true;
				System.out.println("Course id :"+rs.getInt(1));
				System.out.println("Course name :"+rs.getString(2));
				System.out.println("Course duration :"+rs.getInt(3));
				System.out.println("Course fees:"+rs.getFloat(4));
			}
		} catch (SQLException e) {
		System.out.println(e);	
		}
    	 return found;
     }
     public void updateCourse() 
     {
    	 System.out.println("Enter course id to be updated");
    	 int cid=sc.nextInt();
    	 if(searchCourseById(cid))
    	 {
    		 System.out.println("Enter new fees ");
    		 float fees=sc.nextFloat();
    		 try {
    		 pst=con.prepareStatement("update course set fees=? where courseid=?");
    		 pst.setFloat(1,fees);
    		 pst.setInt(2,cid);
    		 
    		 int noOfRow=pst.executeUpdate();
    		 if(noOfRow>0)
    		 {
    			 System.out.println("Course updated");
    		 }
    		 else
    		 {
    			 System.out.println("error .....");
    		 }
    		 }
    		 catch (Exception e) {
			
    			 System.out.println(e);
			}
    		 
    	 }
    	 else
    	 {
    		 System.out.println("Course is not available");
    	 }
     }
     public void deleteCoursebyName()
     {
    	 System.out.println("Enter course name");
    	 String cname=sc.next();
    	 try
    	 {
    		 pst=con.prepareStatement("delete from course where cname=?");
    		 pst.setString(1, cname);
    		 
    		 int noOfRow=pst.executeUpdate();
    		 if(noOfRow>0)
    		 {
    			 System.out.println("Course deleted...");
    			 
    		 }
    		 else
    		 {
    			 System.out.println("error.......");
    		 }
    	 }catch (Exception e) {
			
    		 System.out.println(e);
		}
     }
	public static void main(String[] args) {
	
		CourseCrud obj=new CourseCrud();
		
      

		int choice;
		char ch='y';
		do
		{
			System.out.println("1.Add Course");
			System.out.println("2.Delete Course");
			System.out.println("3.update Course");
			System.out.println("4.View All Course");
			System.out.println("5.View Course by id");
			System.out.println("6.exit");
			System.out.println("7.Delete course by name");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				   obj.insertDetails();
				   break;
			case 2:
				   obj.deleteById();
				   break;
			case 3:
				  obj.updateCourse();
				  break;
			case 4:
				obj.fetchDetails();
				break;
			case 5:
				  System.out.println("Enter course id to be search");
				  int cid=sc.nextInt();
				  boolean present=obj.searchCourseById(cid);
				  if(!present)
				  {
					  System.out.println("Course is not found");
				  }
				  
				  
			case 6:
				System.exit(0);
			     break;
			case 7:
				  obj.deleteCoursebyName();
				  break;
				  
				// cw
				//delete course by name
				//delete course by id using pst
			}
			
			System.out.println("Do you want to continue ");
			ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
		
		
	}

}
