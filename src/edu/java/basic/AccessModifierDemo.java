package edu.java.basic;

public class AccessModifierDemo {

	public static void main(String[] args) {
		Boss boss = new Boss();
		System.out.println(boss.age);
		System.out.println(boss.name);
		System.out.println(boss.address);
		//System.out.println(boss.numberofWives);
		
		//System.out.println(boss.showAge());
		System.out.println(boss.showName());
		System.out.println(boss.showAddress());
		System.out.println(boss.showNumberOfWives());
	}

}

class Boss {
	public int age;
	String name;
	protected String address;
	private int numberOfWives;
	
	private int showAge() {
		return age;
	}
	
	protected String showName() {
		return name;
	}
	
	String showAddress() {
		return address;
	}
	
	public int showNumberOfWives() {
		return numberOfWives;
	}
}
