package com.containtment;

public class Person {
	  private String name;
	  private int age;
	  private String email;
	  private Address addr;
	  
	  Person()
	  {
		  
	  }
	  Person(String name,int age,String email,Address addr)
	  {
		  this.name=name;
		  this.age=age;
		  this.addr=addr;
		  this.email=email;
	  }
	  
	  public void setName(String name)
	  {
		  this.name=name;
	  }
	  public String getName()
	  {
		  return name;
	  }
	  public void setAge(int age)
	  {
		  this.age=age;
	  }
	  public int getAge()
	  {
		  return age;
		  
	  }
	  
	  public void setEmail(String email)
	  {
		  this.email=email;
		  
	  }
	  public String getEmail()
	  {
		  return email;
	  }
	  public void setAddr(Address addr)
	  {
		  this.addr=addr;
	  }
	  public Address getAddr()
	  {
		  return addr;
	  }
	  
	  public String toString()
	  {
		  return "Person:"+ name+" age"+age+" Email:"+email+"Address"+addr;
	  }
	  

}
