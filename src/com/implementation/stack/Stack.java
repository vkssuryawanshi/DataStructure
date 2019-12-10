package com.implementation.stack;

public class Stack 
{
	int top =0;
	int stack[] = new int[5];
	
	public void push(int data)
	{
		if(top == 5)
		{
			System.out.println("Stack is full..");
			return;
		}
		stack[top] = data;
		top++;
	}

	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty...");
			return 0;
		}
		int data;
		top--;
		data = stack[top];
		stack[top] = 0;
		return data;
		
	}
	
	public int peak()
	{
		int data;
		data = stack[top];
		
		return data;
	}

	public void show() 
	{
		for(int n :stack)
			System.out.print(n + " ");
		
	}
	public int size()
	{
		return top;
	}
	
	public boolean isEmpty()
	{
		return top <= 0;
	}
	

}
