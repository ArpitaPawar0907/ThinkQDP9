package com.containment;

public class College {

	public static void main(String[] args) {
		
		Course c1=new Course(101,"Java",36000);
		Course c2=new Course(102,"Python",36000);
		Course c3=new Course(103,"Fullstack",36000);
		
		Student s1=new Student(1,"Pranali",c1);
		Student s2=new Student(2,"Reetu",c3);
		Student s3=new Student(3,"Shreyash",c2);
		Student s4=new Student(4,"Pranay",c3);
		Student s5=new Student(5,"Nisha",c1);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		new Student(6,"Prachi",c1);
		
		Student s6=new Student(6,"Pranali",(new Course(104,"Go",30000)));
		Student s7=new Student(7,"Arpita",(new Course(104,"Go",30000)));
		System.out.println(s6);
		System.out.println(s7);
		
		
//////////////////////////////////////////////////////////////////
		
		Course c=new Course();
		c.setCid(8);
		c.setCname("Angular");
		c.setFees(34000);
		
		Student s=new Student();
		s.setSid(8);
		s.setSname("Jyoti");
		s.setCourse(c);
		
		System.out.println(s);
		
		///////////////////////////////////////////////
		
		Student st=new Student();
		st.setSid(9);
		st.setSname("Pooja");
		st.setCourse(new Course());
		st.getCourse().setCid(105);
		st.getCourse().setCname("SQL");
		st.getCourse().setFees(34000);
		
		System.out.println(st);
		

	}

}
