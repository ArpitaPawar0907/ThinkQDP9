package com.filehandlingdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsonRead {

	public static void main(String[] args) {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your name");
		
		try {
			String name=br.readLine();
			System.out.println("Welcome "+name);
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	
	}

}
