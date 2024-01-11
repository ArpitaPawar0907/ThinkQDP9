package com.stackDemo;

class MyStack
{
	
	int top=-1;
	int size;
	int stk[];
	public MyStack(int size) {
		
	//	top=-1;
		this.size=size;
		stk=new int[this.size];
		stk[0]=23;
		top++;
	}

	boolean push(int data)
	{
		if((size-1)<top)
		{
			stk[top]=data;
			top++;
			return true;
	}
		else {
			return false;
					
				}
	}
	
	void pop()
	{
		if(top>-1)
		{
			System.out.println(stk[top]);
			top--;
		
		}
		else
		{
			System.out.println("underflow");
			
		}
	}
	void display()
	{
		System.out.print("[");
		for(int i=0;i<=top;i++)
		{
			System.out.print(stk[i]+" ,");
		}
		System.out.print("]");
	}
}
public class StackArray {

	public static void main(String[] args) {
		
		MyStack m1=new MyStack(5);
	m1.display();
		

	}

}
