package edu.java.basic;

public class InnerClassDemo {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.show();
		
		C c = new C();
		c.show();
	}

}

class Outer {
	public void show() {
		Inner inner = new Inner();
		inner.display();
	}
	
	class Inner {
		public void display() {
			System.out.println("I'm an inner class.");
		}
	}
}

class C {
	public void show() {
		Outer.Inner inner2 = new Outer().new Inner();
		inner2.display();
	}
}