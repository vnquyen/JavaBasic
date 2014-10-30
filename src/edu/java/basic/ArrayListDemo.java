package edu.java.basic;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("Pikachu");
		a1.add(new String("Sun & Moon"));
		a1.add(new Integer(7));
		a1.add(new Long(10));
		
		System.out.println(a1.get(3));
		System.out.println(a1.get(1));
		
		// create an empty array list with an initial capacity
	    ArrayList<Integer> arrlist = new ArrayList<Integer>();
	    
	    // use add() method to add values in the list
	    arrlist.add(10);
	    arrlist.add(12);
	    arrlist.add(31);
	    arrlist.add(49);
	    
	    System.out.println("Printing elements of array1");

	    // let us print all the elements available in list
	    for (Integer number : arrlist) {
	      System.out.println("Number = " + number);
	    }  
	    
	    // toArray copies content into other array
	    Integer list2[] = new Integer[arrlist.size()];
	    list2 = arrlist.toArray(list2);

	    System.out.println("Printing elements of array2");

	    // let us print all the elements available in list
	    for (Integer number : list2) {
	      System.out.println("Number = " + number);
	    }
	}

}
