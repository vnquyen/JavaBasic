package edu.java.basic;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("PIKACHU");
		a1.add("CHARMANDER");
		a1.add("BULBASUAR");
		a1.add("SQUIRTLE");
		
		Iterator<String> interator = a1.iterator();
		while(interator.hasNext()) {
			System.out.println(interator.next());
		}
	}

}
