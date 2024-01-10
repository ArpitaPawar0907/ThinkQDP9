package com.inheritance;
class Kid {
	private String name;
	private String author;
	
	 public Kid()
	{
		
	}
	public Kid(String name,String author)
	{
		this.name=name;
		this.author=author;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void readBook()
	{
		System.out.println("Kid reads a book");
	}
   public void readBook(String name,String author)
   {
	   System.out.println("Kid reades book");
   	System.out.println("Kid read s "+name+"book by author "+author);
   }
}

class BigKid extends Kid {
	private int id;
	
	
	 public BigKid()
	{
		
	}
	public BigKid(String name,String author,int id)
	{
	  super(name,author);
	  this.id=id;
	}
	
	public int getId()
    {
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public void readBook(String name,String author,int id)
    {
		System.out.println("BigKid reades book");
    	System.out.println("Book name : "+name+" Author "+author+" Book Id:"+id);
    }

}

class Teenager extends Kid{
	
	private int id;
	
	
	 public Teenager()
	{
		
	}
	public Teenager(String name,String author,int id)
	{
	  super(name,author);
	  this.id=id;
	}
	
	public int getId()
   {
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public void readBook(String name,String author,int id)
   {
		System.out.println("Teenager reades book");
   	System.out.println("Book name : "+name+" Author "+author+" Book Id:"+id);
   }

}

public class KidTest {

	public static void main(String[] args) {
		
		Kid k1=new Kid();
		BigKid b1=new BigKid();
		Teenager t1=new Teenager();
        k1.readBook();
        k1.readBook("Ramayana", "Walmiki");
    	b1.readBook("Abcd", "ACSD", 12);
    	t1.readBook("Mahabarat", "Vyasmuni", 101);

	}

}
