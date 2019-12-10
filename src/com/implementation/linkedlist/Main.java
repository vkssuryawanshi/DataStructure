package com.implementation.linkedlist;

public class Main 
{

	public static void main(String[] args) 
	{
		LinekedList list = new LinekedList();
		
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		
		list.insertAt(2, 25);
		
		list.inserAtStart(05);
		
		
		list.show();
		
		// list.deleteAt(1);
		System.out.println("Deleted Data : " + list.deleteAt(2));
		
		list.show();

	}

}
