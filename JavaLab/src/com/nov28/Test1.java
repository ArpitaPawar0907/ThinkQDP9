package com.nov28;

public class Test1 {
	protected static final boolean bool=true;
	  Test1(final boolean obj)
	  {
		  Boolean bool=new Boolean(obj);
		  bool=this.bool;
		  printlt(bool);
	  }
	  private void printlt(boolean val)
	  {
		  System.out.println("value of variable bool is"+!val);
	  }
	  public static void main(String[] args) {
		new Test1(new Boolean(!true));
	}

}
