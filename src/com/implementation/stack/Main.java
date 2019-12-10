package com.implementation.stack;

public class Main {

	public static void main(String[] args) 
	{
		
		Stack stack = new Stack();
		
		stack.push(10);
		stack.push(20);
		
		System.out.println(stack.peak());
		
		stack.push(30);
		stack.pop();
		
		System.out.println("Size is : " + stack.size());
		
		System.out.println("is Empty : " + stack.isEmpty());
		
		stack.show();

	}

}
