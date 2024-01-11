package com.connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ResultSetCrud {
	static Connection con = null;
	Statement st;
	ResultSet rs;
	static Scanner sc = new Scanner(System.in);
	
	ResultSetCrud(){
		con = DbConnection.getConnect();
//		System.out.println("connection established...");
		try {
			st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs= st.executeQuery("select * from course");
		} catch (SQLException e) {
			System.out.println(e);;
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
			rs.moveToInsertRow();
			rs.updateInt(1,courseid);
			rs.updateString(2,cname);
			rs.updateInt(3,dur);
			rs.updateFloat(4,fees);
			rs.insertRow();
		}catch (Exception e) {
	
			System.out.println(e);
		}
	}

	public void deleteByCourse() 
	{
		System.out.println("enter course idro b deleted");
		int id=sc.nextInt();
		try {
			rs.beforeFirst();
			while(rs.next())
			{
				if(rs.getInt(1)==id)
				{
				rs.deleteRow();
				System.out.println(" course deletes");
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public void updateFees()
	{
		System.out.println("Enter course name");
		String cname=sc.next();
		try
		{
			rs.beforeFirst();
			while(rs.next())
			{
				if(rs.getString(2).equalsIgnoreCase(cname))
				{
					System.out.println("old fees:"+rs.getFloat(4));
					System.out.println("Enter new fees");
					float fees=sc.nextFloat();
					rs.updateFloat(4,fees);
					rs.updateRow();
				}
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	 public boolean searchCourseById(int id)
     {
    	 boolean found=false;
    	 try {
    		 
    		 
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
    
	public void fetchCourseDetails()
	{
		try {
			rs.beforeFirst();//take cursor before first row
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getFloat(4));
			}
		} 
		catch (SQLException e) {
			System.out.println(e);
		}
	}
	public void fetchCourseDetailsBackWord()
	{
		try {
			rs.afterLast();
			while(rs.previous()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getFloat(4));
			}
		} 
		catch (SQLException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		
		ResultSetCrud obj = new ResultSetCrud();
	

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
				   obj.deleteByCourse();
				   break;
			case 3:
				  obj.updateFees();
				  break;
			case 4:
				obj.fetchCourseDetails();
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
				 obj.fetchCourseDetailsBackWord();
				  break;
			}
			
			System.out.println("Do you want to continue ");
			ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');	}
}
