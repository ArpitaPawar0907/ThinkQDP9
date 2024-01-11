package com.connect;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class StudentCrud {

	static Connection con=null;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	static Scanner sc=new Scanner(System.in);
	SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd");
	public StudentCrud() {
		
		con=DbConnection.getConnect();
		System.out.println("Connection established.....");
		try
		{
			st=con.createStatement();
		}catch (Exception e) {

			System.out.println(e);
		}
	}
	public void insertDetails() throws ParseException 
	{
		System.out.println("Enter student id");
		int sid=sc.nextInt();
		
		System.out.println("Enter student name");
		String sname=sc.next();
		
		System.out.println("Enter email ");
		String email=sc.next();
		
		System.out.println("Enter phone no");
		long phoneno=sc.nextLong();
		
		System.out.println("Enter courseid");
		int cid=sc.nextInt();
		
		System.out.println("Enter feeStatus");
		String feeS=sc.next();
		
		System.out.println("Enter joining date:(yyyy-mm-dd)");
		String jdate=sc.next();
		
		java.util.Date jd=null;
		
			jd = dateformat.parse(jdate);
			java.sql.Date jds=new java.sql.Date(jd.getTime());
	
		
		try {
		pst=con.prepareStatement("insert into student values (?,?,?,?,?,?,?)");
		pst.setInt(1, sid);
		pst.setString(2,sname);
		pst.setString(3,email);
		pst.setLong(4,phoneno);
		pst.setInt(5,cid );
		pst.setString(6,feeS);
		pst.setDate(7,jds);
		int noOfRows=pst.executeUpdate();
		if(noOfRows>0)
		{
			System.out.println("Student inserted");
		}
		else
		{
			System.out.println("Student not inserted");
		
		}
		}
		catch (Exception e) {
	
			System.out.println(e);
		}
	 
	}
	public void fetchDetails()
	{ 
	  
		try
		{
			//rs=st.executeQuery("select * from student");
		    rs=st.executeQuery("select * from student");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getLong(4)+" "+rs.getInt(5)+" "+rs.getString(6)+" "+rs.getDate(7));
			}
		}catch (Exception e) {
	
			System.out.println(e);
		}
	}
	public void deleteById()
	{
		System.out.println("Enter sid to be deleted");
		int id=sc.nextInt();
	}
	public boolean searchById(int sid)
	{
		 boolean found=false;
		 try
		 {
    	 pst=con.prepareStatement("select * from student");
    	 
		 }
		 catch (Exception e) {
			
			 System.out.println(e);
		}
		 
			return found;

	}
	public void updateStudent()
	{
		
	}
	public static void main(String[] args) {
	
		StudentCrud obj=new StudentCrud();

		//obj.fetchDetails();
		int choice;
		char ch='y';
		do
		{
			System.out.println("1.Add Student");
			System.out.println("2.Delete Student");
			System.out.println("3.update Student");
			System.out.println("4.View All Course");
			System.out.println("5.View Student by id");
			System.out.println("6.exit");
	
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				   try {
					obj.insertDetails();
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				   break;
			case 2:
				   obj.deleteById();
				   break;
			case 3:
				
				  break;
			case 4:
				obj.fetchDetails();
				break;
			case 5:
				  System.out.println("Enter the student id");
				  int sid=sc.nextInt();
				  
				  
				  
			case 6:
				System.exit(0);
			     break;
			
				  
					}
			
			System.out.println("Do you want to continue ");
			ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');

		
	}

}
