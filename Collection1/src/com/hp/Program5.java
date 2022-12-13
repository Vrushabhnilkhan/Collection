package com.hp;

//Queue 
import java.util.LinkedList;
import java.util.Queue;

public class Program5 {

	public static void main(String[] args) {

		Queue q = new LinkedList();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		System.out.println(q);

		q.remove();
		System.out.println("After removing" + q);

		System.out.println("head of quque is :-" + q.peek());

		System.out.println("Size of Queue is :-" + q.size());

	}

}
