package edu.java.basic;

public class ConstructorDemo {

	public static void main(String[] args) {
		Pokemon pkm1 = new Pokemon();
		System.out.println(pkm1.getName());
		System.out.println(pkm1.getWeight());
		System.out.println(pkm1.getNickname());
		
		Pokemon pkm2 = new Pokemon("Charmander", 8.5f, "Chaien");
		System.out.println(pkm2.getName());
		System.out.println(pkm2.getWeight());
		System.out.println(pkm2.getNickname());
	}

}

class Pokemon {
	private String name;
	private float weight;
	private String nickname;
	
	public Pokemon() {
		setName("Pikachu");
		setWeight(6.0f);
		setNickname("PikaPika");
		
		System.out.println("I choose you, Pikachu.");
	}
	
	public Pokemon(String name, float weight, String nickname) {
		this.setName(name);
		this.setWeight(weight);
		this.setNickname(nickname);
		
		System.out.println("I choose you, " + name + ".");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	
}
