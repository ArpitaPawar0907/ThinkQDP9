package com.connect;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class CallableStateMentDemo {


	public static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
	static Connection con=null;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	CallableStatement cst;
	static Scanner sc=new Scanner(System.in);
    public CallableStateMentDemo() {
    	con = DbConnection.getConnect();
		System.out.println("connection established...");
		try 
		{
			st = con.createStatement();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
    public void callFunction1() {
		System.out.println("Enter a number");
		int num = sc.nextInt();
		try {
			cst = con.prepareCall("{ ?= call oddeven(?)}");
			cst.registerOutParameter(1, Types.VARCHAR);
			cst.setInt(2, num);
			
			boolean status = cst.execute();
			if(!status) {
				System.out.println("The number "+num+" is : "+cst.getString(1));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
    
    public static void main(String[] args) {
	
		CallableStateMentDemo obj=new CallableStateMentDemo();
		

		obj.callFunction1();
	}

}
