package edu.java.basic;

public class EnumDemo {
	enum POKEMON {
		PIKACHU(6.0f), CHARMANDER(8.5f), BULBASAUR(6.9f), SQUIRTLE(9.0f);
		private float kilogram;
		
		POKEMON(float kilogram) {
			this.kilogram = kilogram;
		}
		
		public float getKilogram() {
			return kilogram;
		}
	}
	public static void main(String[] args) {
		System.out.println(POKEMON.PIKACHU);
		POKEMON baby = POKEMON.BULBASAUR;
		System.out.println(baby);
		System.out.println(baby.CHARMANDER);
		
		if(baby == POKEMON.SQUIRTLE) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		switch(baby) {
			case CHARMANDER:
				System.out.println("I choose you, Charmander.");
				System.out.println("Charmander: " + baby.getKilogram() + "kg");
				break;
			case BULBASAUR:
				System.out.println("Join my team, Bulbasaur.");
				System.out.println("Bulbasaur: " + baby.getKilogram() + "kg");
				break;
			case SQUIRTLE:
				System.out.println("Join my team, Squirtle.");
				System.out.println("Squirtle: " + baby.getKilogram() + "kg");
				break;
			default:
				System.out.println("I love you, Pikachu.");
				System.out.println("Pikachu: " + baby.getKilogram() + "kg");
				break;
		}
	}

}
