package com.example;

public class School {

	public static void findTopper(Student s1[])
	{
		double marks=Double.MIN_VALUE;
		Student topper=new Student();;
		for(Student s:s1)
		{
			if(s.getMarks()>marks)
			{
				topper=s;
				marks=s.getMarks();
			}
		}
		System.out.println("Topper of the students :");
		System.out.println(topper);
	}
	
	public static void sortarray(Student s[])
	{
		
		Student temp=new Student();
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
			if(s[i].getMarks()>s[j].getMarks())
			{
				temp=s[i];
				s[i]=s[j];
				s[j]=temp;
			}
			}	
		}
	}
	public static void display(Student s1[])
	{
		for(Student s:s1)
		{
			System.out.println(s);
		}
			
	}
	public static void main(String[] args) {
		
		//Student s1=new Student();
		//System.out.println(s1);
		
		Student st[]=new Student[5];
		for(int i=0;i<5;i++)
		{
			st[i]=new Student();
		}
		
		st[0]=new Student(1, "Deepti", 78);
		st[1]=new Student(2, "Arpita", 87);
		st[2]=new Student(3, "Pranay", 78);
		st[3]=new Student(4, "Reetu", 76);
		st[4]=new Student(5, "Pooja", 67);
		
         display(st);
		System.out.println("-------------------------------------------------");
		findTopper(st);
		
		System.out.println("-------------------------------------------------");
		sortarray(st);
		display(st);
		
//		System.out.println("-------------------");
//		for (int i = 0; i < st.length; i++)
//		{
//			System.out.println(st[i]);
//		}
	}

}
