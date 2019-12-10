package com.implementation.dynamic.stack;

public class Main {

	public static void main(String[] args) 
	{
		DynamicStack st = new DynamicStack();
		
		st.push(10);
		st.show();
		
		st.push(10);
		st.show();
		
		st.push(10);
		st.show();
		
		st.pop();
		st.show();
		
		st.pop();
		st.show();

	}

}
