package com.connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	static Connection con=null;
	public static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
	public static final String JDBC_URL="jdbc:mysql://localhost:3306/studdb";
	public static final String USERNAME="root";
	public static final String PASSWORD="root";
	public static Connection getConnect()
	{
		try
		{
			Class.forName(JDBC_DRIVER);
			System.out.println("Driver Loaded");
			con=DriverManager.getConnection(JDBC_URL,USERNAME,PASSWORD);
	       // System.out.println("Connection established....");
		}catch (Exception e) {
			
			System.out.println(e);
	    }
		return con;
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		getConnect();
//
//	}

}
