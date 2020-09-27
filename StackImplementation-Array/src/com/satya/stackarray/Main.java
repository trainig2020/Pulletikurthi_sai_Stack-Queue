package com.satya.stackarray;

//Driver code 
public class Main { 
	public static void main(String args[]) 
	{ 
		Stack s = new Stack(); 
		s.push(10); 
		s.push(20); 
		s.push(30);
		s.push(40);
		s.display();;
		System.out.println(s.peek()+ "Peek is");
		System.out.println(s.pop() + " Popped from stack");
		s.display();
		System.out.println(s.peek()+ "Peek is");
		System.out.println(s.isEmpty());
			
	} 
}