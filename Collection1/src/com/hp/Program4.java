package com.hp;

//Stack methods
import java.util.Stack;

public class Program4 {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s);

		System.out.println(s.search(45)); // If Element is not Found Return -1

		System.out.println("The Elemetnt at the Top is " + s.peek());

		System.out.println(s.pop());// Pop Method

		System.out.println("After Removing" + s);

	}

}
