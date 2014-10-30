package edu.java.basic;

public class StaticDemo {

	public static void main(String[] args) {
		Room r1 = new Room();
		r1.number = 10;
		System.out.println("Number r1: " + r1.number);
		System.out.println("Area r1 before: " + r1.area);
		Room.area = 300;
		System.out.println("Area r1 after: " + r1.area);
		
		Room r2 = new Room();
		System.out.println("Number r2: " + r2.number);
		System.out.println("Area r2: " + r2.area);
		
		Room.show();
		
		Room r3 = new Room();
		r3.number = 30;
		System.out.println("Number r3: " + r3.number);
		System.out.println("Area r3: " + r3.area);
		
	}

}

class Room {
	static int area = 200;
	int number;
	
	public static void show() {
		System.out.println("Show");
		Room.area = 500;
		
		int number = 40; //number = 40 -> error
		System.out.println(number);
	}
}
