package edu.java.basic;

public class ErrorRuntimeDemo {

	public static void main(String[] args) {
		String s = "PikachuPikachu";
		
		try {
			//Error StringIndexOutOfBoundsException
			//System.out.println(s.substring(50));
			System.out.println(s.substring(10));
			
			int a = 3;
			int b = 0;
			System.out.println("a/b: " + (a/b));
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("Error " + e.toString());
		} catch(ArithmeticException e) {
			System.out.println("Error " + e.toString());
		} catch(Exception e) {
			System.out.println("Error " + e.toString());
		} finally {
			System.out.println("Always done.");
		}
		
	}

}
