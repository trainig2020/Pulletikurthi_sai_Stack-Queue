package com.satya.stackarray;

/* Java program to implement basic stack 
operations */
public class Stack { 
	static final int MAXI = 3; 
	int top=-1; 
	int a[] = new int[MAXI]; // Maximum size of Stack 

	boolean isEmpty() 
	{ 
		return (top < 0); 
	} 
//	Stack() 
//	{ 
//		top = -1; 
//	} 

	boolean push(int x) 
	{ 
		if (top >= (MAXI -1)) { 
			System.out.println("Stack Overflow"); 
			return false; 
		} 
		else { 
			a[++top] = x; 
			System.out.println(x + " pushed into stack"); 
			return true; 
		} 
	} 

	int pop() 
	{ 
		if (top < 0) { 
			System.out.println("Stack Underflow"); 
			return 0; 
		} 
		else { 
			int x = a[top--]; 
			System.out.println("pop value :" + top);
			return x; 
		} 
	} 

	int peek() 
	{ 
		if (top < 0) { 
			System.out.println("Stack Underflow"); 
			return 0; 
		} 
		else { 
			int x = a[top]; 
			return x; 
		} 
	} 
	
	void display() {
		System.out.println("Printing the values of stack");
		for ( int i = 0 ; i <= top ; i++) {
			System.out.println(a[i]);
		}
	}
} 



