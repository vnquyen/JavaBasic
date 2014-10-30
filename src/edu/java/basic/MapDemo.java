package edu.java.basic;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("Red", "Bulbasaur");
		map.put("Green","Charmander");
		map.put("Blue", "Squirtle");
		map.put(new Integer(7), "Pikachu");
		
		System.out.println(map.get("Red"));
		System.out.println(map.get(7));
		System.out.println(map.get("Satoshi"));
		System.out.println(map.size());
		
		map.remove(7);
		System.out.println(map);
		map.clear();
		System.out.println(map);
	}

}
