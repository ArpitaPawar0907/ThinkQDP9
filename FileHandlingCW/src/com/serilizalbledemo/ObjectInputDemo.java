package com.serilizalbledemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ObjectInputDemo {

	static Scanner sc=new Scanner(System.in);
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public void readFile(File f)
	{
		try
		{
			if(f.exists())
			{
				ObjectInputStream oin=new ObjectInputStream(new FileInputStream(f));
				for(int i=0;i<3;i++)
				{
				  System.out.println( oin.readObject());
				  System.out.println("------------------------");
				   
				}
				oin.close();
			}
			else
			{
				System.out.println("No such file exists");
			}
		}catch (Exception e) {
			
			System.out.println(e);
		}
	}
	public void writeFile(File f)
	{
		try
		{
			if(!f.exists())
			{
				f.createNewFile();
			}
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(f));
			UserDemo u[]=new UserDemo[3];
			for (int i = 0; i < u.length; i++) {
				
				u[i]=new UserDemo();
				System.out.println("Enter user id");
				u[i].setUid(sc.nextInt());
				
				System.out.println("Enter user name");
			    u[i].setName(sc.next(br.readLine()));
				
				System.out.println("Enter password");
				u[i].setPass(sc.next());
				
				out.writeObject(u[i]);
				
			}
			out.close();
		}catch (Exception e) {
			
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
	
        ObjectInputDemo obj=new ObjectInputDemo();		
		File f1=new File("F:\\Java\\FileDemo\\UserDemo.txt");
         
		obj.writeFile(f1);
		obj.readFile(f1);
	}

}
