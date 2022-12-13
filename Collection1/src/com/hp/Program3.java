package com.hp;
// LinkedList All Method.
import java.util.LinkedList;

public class Program3 {

	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		System.out.println(li);
		
		li.addFirst(70); //AddFirst Method 
		System.out.println(li);
		
		li.addLast(60);// AddLast Method
		System.out.println(li);
		
		System.out.println("First elemetnt is :-" + li.getFirst()); // getFirst Method
		
		System.out.println("Last Elemetnt is :-"+li.getLast()); // getLast Method 
		
		System.out.println("After Remving "+ li.removeFirst()); // removeFirst Method
		System.out.println(li);
		
		System.out.println("After Removing "+ li.removeLast());// removeLast method
		System.out.println(li);
		
		
		
		
		
	}

}
