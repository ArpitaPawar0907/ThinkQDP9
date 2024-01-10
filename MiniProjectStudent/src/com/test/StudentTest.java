package com.test;

import java.util.Scanner;

import com.dao.StudentDaoImpl;
import com.pojo.Course;
import com.pojo.Student;

public class StudentTest {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int sid;
		String sname;
		double marks;
		int choice;
		char ch;
		int noOfStud=0;
		Student st=null;
		Course c[]=new Course[3];
		c[0]=new Course(101,"Java", 35000);
		c[1]=new Course(102,".net",30000);
		c[2]=new Course(103,"Angular",33000);
		
		StudentDaoImpl sdao=new StudentDaoImpl();
		do {
		System.out.println("-------------------------------------");
		System.out.println("------Student Information------------");
		System.out.println("-------------------------------------");
		System.out.println("1.Add Student");
		System.out.println("2.Update Student");
		System.out.println("3.Delete Student");
		System.out.println("4.Show all Student");
		System.out.println("5.Search Student by id");
		System.out.println("---------------------------------------");
		System.out.println("Enter your choice:");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("-------Add Student------------------");
			System.out.println("Enter how many student do you want to add:");
			noOfStud=sc.nextInt();
			for(int i=0;i<noOfStud;i++) {
			System.out.println("Enter student id:");
			sid=sc.nextInt();
			
			System.out.println("Enter student name:");
			sname=sc.next();
			
			System.out.println("Enter marks of student:");
			marks=sc.nextDouble();
		//1	System.out.println("Course :");
//			for(Course c1:c)
//			{
//				System.out.println(c1);
//			}
//			System.out.println("Enter course id you want to apply:");
//			int cid=sc.nextInt();
//			
			st=new Student(sid, sname, marks, c[0]);
			sdao.addStudent(st);
			}
			break;
		case 2:
			System.out.println("-------Update Student------------------");
			System.out.println("Enter student id:");
			sid=sc.nextInt();
			
			System.out.println("Enter student name:");
			sname=sc.next();
			
			System.out.println("Enter marks of student:");
			marks=sc.nextDouble();
//			System.out.println("Course :");
//			for(Course c1:c)
//			{
//				System.out.println(c1);
//			}
//			System.out.println("Enter course id you want to apply:");
		//	int cid=sc.nextInt();
			
			st=new Student(sid, sname, marks, c[0]);
			sdao.updateStudent(st);
			
			break;
		case 3:
			System.out.println("-------Delete Student------------------");
			System.out.println("Enter Student id :");
			sid=sc.nextInt();
			sdao.deleteStudent(sid);
			break;
		case 4:
			System.out.println("-------Show Student------------------");
			if(noOfStud!=0)
			{
				sdao.showAllStudent();
			}else
			{
				System.out.println("No student found");
			}
				
			
			break;
		case 5:
			System.out.println("-------Student search by id------------------");
			System.out.println("Enter student id:");
			sid=sc.nextInt();
			sdao.searchStudentById(sid);
			break;
	     default:
	    	  System.out.println("Invalid operation");
	    	  break;
		}
		
		System.out.println("do u want to continue??");
		ch = sc.next().charAt(0);
	} while (ch == 'y' || ch == 'Y');

	}

}
