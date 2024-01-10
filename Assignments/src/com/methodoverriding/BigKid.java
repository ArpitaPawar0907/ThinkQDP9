package com.methodoverriding;


public class BigKid extends Kid {
		private String name;
		private String author;
		private int id;
		
		
		 public BigKid()
		{
			
		}
		public BigKid(String name,String author,int id)
		{
		  super(name,author);
		  this.id=id;
		}
		
		public String getName()
		{
			return name;
		}
		public void setName(String name)
		{
			this.name = name;
		}
		public String getAuthor() 
		{
			return author;
		}
		public void setAuthor(String author)
		{
			this.author = author;
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
	    	System.out.println("Book name : "+name+" Author "+author+" Book Id:"+id);
	    }

	


}
