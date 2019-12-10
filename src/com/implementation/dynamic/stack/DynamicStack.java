package com.implementation.dynamic.stack;

public class DynamicStack 
{
	int capacity = 2;
	int top =0;
	int stack[] = new int[capacity];
	
	public void push(int data)
	{
		if(size() == capacity)
				expandArray();
		
		stack[top] = data;
		top++;
	}

	private void expandArray() 
	{
		int len  = size();
		int newStack[] = new int[capacity*2];
		System.arraycopy(stack, 0, newStack, 0, len);
		stack = newStack;
		capacity *= 2;
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
			srinkArray();
		return data;
		
	}
	
	private void srinkArray() 
	{
		int len = size();
		if(len <= (capacity/2)/2)
		{
			capacity = capacity /2;
			int newArray[] = new int[capacity];
			System.arraycopy(stack, 0, newArray, 0, len);
			stack = newArray;
	 		
		}
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
		
		System.out.println();
		
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
