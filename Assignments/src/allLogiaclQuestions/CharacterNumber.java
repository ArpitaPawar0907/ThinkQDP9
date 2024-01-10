package allLogiaclQuestions;

import java.util.Scanner;

public class CharacterNumber {

	 public static void check(char a)
	 {
		 if(a>='0'&&a<='9')
			 System.out.println("Charater is number");
		 else if((a>='a'&& a<='z')||(a>='A'&& a<='Z'))
			    System.out.println("Charater is alphabet");
		      else 
			      System.out.println("Charater is special symbol");
	 }
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Character ");
		char ch=sc.next().charAt(0);
       
		check(ch);
		
		sc.close();

	}

}
