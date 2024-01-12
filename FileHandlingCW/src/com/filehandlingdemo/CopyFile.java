package com.filehandlingdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	
	public void copyFileContent(File f1,File f2)
	{
		if(f1.exists())
		{
			try {
				f2.createNewFile();
				
				FileInputStream fin=new FileInputStream(f1);
				FileOutputStream fout=new FileOutputStream(f2);
				int i=0;
				while((i=fin.read())!=-1)
				{
					fout.write(i);
				}
				System.out.println("File Copied sucessfully");
				fin.close();
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("There is no such file to copy");
		}
	}
	public static void main(String[] args) {
		
		CopyFile c1=new CopyFile();
		
		File f1=new File("F:\\Java\\FileDemo\\Arpita.txt");
		File f2=new File("F:\\Java\\FileDemo\\CopyFile.txt");
		
		c1.copyFileContent(f1, f2);
		
	}

}
