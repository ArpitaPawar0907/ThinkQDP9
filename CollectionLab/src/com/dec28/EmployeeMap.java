package com.dec28;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Map;


public class EmployeeMap {
	
	public static void displayDepartment(HashMap<Department,ArrayList<Employee>> list)
	{
	
		for(Map.Entry<Department,ArrayList<Employee>>en:list.entrySet())
		{
			System.out.println(en.getKey());
			for(Employee e:en.getValue())
			{
			System.out.println(e);	
	
			}
			
			System.out.println("---------------------------------------------");
		}
	}
	
	public static void showHighestSalary(HashMap<Department,ArrayList<Employee>> list)
	{
		for(Map.Entry<Department,ArrayList<Employee>>en:list.entrySet())
		{
			Employee emp=new Employee();
			System.out.println(en.getKey());
			for(Employee e:en.getValue())
			{
			 if(e.getSalary()>emp.getSalary())
				 emp=e;
			}
			System.out.println(emp);
			System.out.println("----------------------------------------------");
		}
	}
	
	public static void findGreaterSalary(HashMap<Department,ArrayList<Employee>> list)
	{
		for(Map.Entry<Department, ArrayList<Employee>> en:list.entrySet())
		{
			if(en.getKey().getDname().equalsIgnoreCase("IT"))
			{
				for(Employee e:en.getValue())
				{
					if(e.getSalary()<70000)
					{
						System.out.println(e);
					}
				}
			}
		}
	}
	public static void maximumEmployee(HashMap<Department,ArrayList<Employee>> list)
	{
		 Department d=new Department();
		for(Map.Entry<Department,ArrayList<Employee>> en:list.entrySet())
		{
			int count=1;
		   int maxCount=0;
		  
		   for(Employee e:en.getValue()) {
			   count++;
		   }
		  if(count>maxCount)
		  {
			  System.out.println(count);
			  maxCount=count;
			  d=en.getKey();
		  }
		}
		System.out.println(d);
		
	}
	
	public static void addNewEmployee(HashMap<Department,ArrayList<Employee>> list)
	{
		for(Map.Entry<Department,ArrayList<Employee>> en:list.entrySet())
		{
		    ArrayList<Employee>  elist=new ArrayList<Employee>();
		    if(en.getKey().getDname().equalsIgnoreCase("IT"))
		    {
		    	elist=en.getValue();
		    	elist.add(new Employee(111, "sonali",101, 65000));
		    	list.replace(en.getKey(), elist);
		    }
		    
		}
	}
	public static void employeeName(HashMap<Department,ArrayList<Employee>> list)
	{
		for(Map.Entry<Department, ArrayList<Employee>> en:list.entrySet())
		{
			for(Employee e:en.getValue())
			{
				if(e.getEname().charAt(0)=='a')
				{
					System.out.println(en.getKey());
				System.out.println(e);
				}
			}
		}
	}
    public static void main(String[] args) {
		
  
    	//Scanner sc=new Scanner(System.in);
    	ArrayList<Employee> elist1 =new ArrayList<>();
    	elist1.add(new Employee(1, "arpita", 101, 50000));
    	elist1.add(new Employee(2, "pranay", 101, 46500));
    	elist1.add(new Employee(3, "reetu", 101, 70000));
    	
    	
    	ArrayList<Employee> elist2 =new ArrayList<>();
    	elist2.add(new Employee(4, "nisha", 102, 32000));
    	elist2.add(new Employee(5, "prachi", 102, 40000));
    	elist2.add(new Employee(6, "pranali", 102, 20000));
    	
    	ArrayList<Employee> elist3 =new ArrayList<>();
    	elist3.add(new Employee(7, "basker", 103, 32000));
    	elist3.add(new Employee(8, "vikas", 103, 40000));
    	elist3.add(new Employee(9, "amit", 103, 20000));
    	elist3.add(new Employee(10, "Jyoti", 103, 26000));
    	
    	
    	
    	HashMap<Department,ArrayList<Employee>> dmap=new HashMap<>();
    	
    	dmap.put(new Department(101,"IT"),elist1);
    	dmap.put(new Department(102,"sales"),elist2);
    	dmap.put(new Department(103,"HR"),elist3);
    	System.out.println("Display deaprtments:");
    	displayDepartment(dmap);
    	System.out.println("=============================================");
    	System.out.println("Higest salary among deaprtment");
    	showHighestSalary(dmap);
    	System.out.println("===============================================");
    	System.out.println("Salary is less than 70000 ofdepartment");
    	findGreaterSalary(dmap);
    	System.out.println("=================================================");
    	System.out.println("Maximum Employee working in department ");
    	maximumEmployee(dmap);
    	System.out.println("==============================================");
    	System.out.println("Enter new Employee");
        addNewEmployee(dmap);
        displayDepartment(dmap);
    
    	
    	
    	System.out.println("=============================================");
    	System.out.println("Employee name starting with A");
    	employeeName(dmap);
    	System.out.println("=============================================");
    	
    	
	}

}
