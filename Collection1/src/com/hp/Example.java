package com.hp;

//ArrayList Program with Different Method 
import java.util.ArrayList;

public class Example {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);

		ArrayList al2 = new ArrayList();
		al2.add(60);
		al2.add(70);
		al2.add(80);
		al2.add(90);
		al2.add(100);

		al.addAll(al2);// Add Method
		System.out.println(al);

	}

}
