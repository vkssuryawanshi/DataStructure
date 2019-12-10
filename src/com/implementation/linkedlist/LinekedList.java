package com.implementation.linkedlist;

public class LinekedList 
{
	Node head;
	
	public void insert(int data)
	{
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		
		if(head == null)
		{
			head = newNode;
		}
		else
		{
			Node n = head;
			while(n.next != null)
			{
				n = n.next;
			}
			n.next =newNode;
		}
		
		
	}
	
	public void inserAtStart(int data)
	{
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		
		newNode.next = head;
		head = newNode;
	}
	
	public void insertAt(int index, int data)
	{
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		
		if(index == 0)
		{
			inserAtStart(data);
			return;
		}
		Node n = head;
		for(int i=0 ; i < index - 1 ; i++ )
		{
			n = n.next;
		}
		
		newNode.next = n.next;
		n.next = newNode;
		
	}
	
	public int deleteAt(int index)
	{
		int deletedData = 0;
		
		if(index == 0)
		{
			deletedData = head.data;
			head = head.next;
		}
		else
		{
			Node n = head;
			Node n1 = null;
			for(int i=0 ; i < index-1 ; i++ )
			{
				n = n.next;
			}
			n1 = n.next;
			n.next = n1.next;
			deletedData = n1.data;
			n1 = null;
			
		}
		
		return deletedData;
	}
	
	public void show()
	{
		Node n =head;
		while(n.next!=null)
		{
			System.out.print(n.data + " ");
			n = n.next;
		}
		System.out.print(n.data);
	}

}
