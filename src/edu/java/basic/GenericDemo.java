package edu.java.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class GenericDemo {

	public static void main(String[] args) {
		ArrayList<A> arr1 = new ArrayList<A>();
		arr1.add(new A());
		arr1.add(new A());
		arr1.add(new A());
		arr1.add(new A());
		
		for(int i = 0; i < arr1.size(); i++) {
			arr1.get(i).show();
		}
		
		HashMap<Integer, B> map1 = new HashMap<Integer, B>();
		for(int i = 0; i < 10; i++) {
			map1.put(i, new B());
		}
		
		// get all the set of keys
        Set<Integer> keys = map1.keySet();
        
        for (Integer key : keys) {
            System.out.println("Key = " + key);
            map1.get(key).go();
        }
	}

}

class A {
	public void show() {
		System.out.println("Test");
	}
}

class B {
	public void go() {
		System.out.println("Lăn tròn, lăn tròn, lăn tròn.");
	}
}
