package edu.java.basic;

public class Blockcode extends BlockcodeSuper {

	{
		System.out.println("Block Code 1");
	}
	
	static {
		System.out.println("Static Block Code 1");
	}
	
	public Blockcode() {
		//super();
		System.out.println("Constructor");
	}
	
	public static void main(String[] args) {
		Blockcode bc = new Blockcode();
		System.out.println("Pikapikachu");
	}
	
	{
		System.out.println("Block Code 2");
	}
	
	static {
		System.out.println("Static Block Code 2");
	}
}

class BlockcodeSuper {
	{
		System.out.println("Super Block Code 1");
	}
	
	static {
		System.out.println("Static Super Block Code 1");
	}
	
	public BlockcodeSuper() {
		System.out.println("Super Constructor");
	}
}