package com.enumdemo;

class DirectionC
{
	 public static final String NORTH="NORTH";
	 public static final String SOUTH="SOUTH";
	 public static final String EAST="EAST";
	 public static final String WEST="WEST";
	 
}
public class EnumDemo {

	public enum Direction{NORTH,SOUTH,EAST,WEST};
	public static void main(String[] args) {
		
		Direction d1=Direction.NORTH;
		System.out.println(d1);
		Direction d2=Direction.NORTH;
       
		if(d1==d2)
			System.out.println("Equal");
		else
			System.out.println("not equal");
		
		
		if(d1.equals(d2))
			System.out.println("Equal");
		else
			System.out.println("not equal");
		
		
		System.out.println("------------------------------------------");
		
		
		for(Direction d:Direction.values())
		{
			System.out.println(d);
		}
		
		System.out.println(Direction.valueOf("SOUTH"));
		System.out.println(Direction.SOUTH.ordinal());
	}

}
