package com.hp;
//ArrayList Using Different Method .
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Program2 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("Vrushabh");
		al.add("Ankush");
		al.add("Darshan");
		al.add("Lokesh");
		al.add("Vaibhav");
		al.add("Suraj");
		
		Iterator<Integer > itr =al.iterator(); // Using Iterator 
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		al.add(6, "Ram");     // Add Element
		System.out.println(al);
		

		Collections.sort(al); // For Sorting 
		System.out.println(al);

		System.out.println("============================================");

		System.out.println(al.get(3)); // For Index
		
		System.out.println(al.remove(4)); //For Remove Object
		
		al.clear();
		System.out.println(al); //Using Clear Method
		
		
		
		
		
		

	}

}
