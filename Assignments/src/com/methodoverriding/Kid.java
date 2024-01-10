package com.methodoverriding;

public class Kid {
	
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
	    	System.out.println("Kid read s "+name+"book by author "+author);
	    }


}
