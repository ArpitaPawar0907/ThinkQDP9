package com.enumdemo;

    enum Seasons{SUMMER,WINTER,MONSOON,SPRING};
public class SeasonTest {
 public static void main(String[] args) {
	
	 Seasons s=Seasons.SUMMER;
	 
	 switch(s)
	 {
	 case SUMMER:
		        System.out.println("Cotter cloths");
		        break;

	 case WINTER:
		        System.out.println("Woolean cloths");
		        break;

	 case SPRING:
		        System.out.println("full sleves cloths");
		        break;

	 case MONSOON:
		        System.out.println("carry an umbrealla");
		        break;
	 default:
             	System.out.println("error....");
	 }
}
}
