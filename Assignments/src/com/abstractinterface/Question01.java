package com.abstractinterface;
interface Phone
{
	void display();
}
class PhoneBook implements Phone
{
	public String name;
	public long contactNo;
	public PhoneBook() {
		
	}
	public PhoneBook(String name, long contactNo) {
		this.name = name;
		this.contactNo = contactNo;
	}
	public void display()
	{
		System.out.println("Name:"+name);
        System.out.println("contact:"+contactNo);
	}
	
}
public class Question01 {

	
	public static void main(String[] args) {
		
		PhoneBook p1=new PhoneBook("Arpita", 987654321);
		p1.display();
	}
}
