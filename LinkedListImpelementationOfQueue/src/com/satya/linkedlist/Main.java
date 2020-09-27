package com.satya.linkedlist;

public class Main { 
	public static void main(String[] args) 
	{ 
		Queue q = new Queue(); 
		q.enqueue(10); 
		q.enqueue(20); 
		q.enqueue(30);
		q.dequeue(); 
		q.dequeue(); 
		q.enqueue(40); 
		q.enqueue(50); 
		q.enqueue(60);  
		System.out.println("Queue Front : " + q.front.data); 
		System.out.println("Queue Rear : " + q.rear.data); 
	} 
} 
