public class MainCharacter extends Character {

	private String characterName = "LittleBitch";
	private int characterHealth;
	private int characterStrength;

	/**
	 * Constructs a character with 50 health and 25 strength
	 */
	public MainCharacter() {

		setCharacterHealth();
		setCharacterStrength();

	}

	/**
	 * Gets the amount of health the character has remaining
	 * 
	 * @return the amount of health the character has
	 */
	public int getCharacterHealth() {
		System.out.print(characterName);
		System.out.println("'s Health = " + characterHealth);
		return characterHealth; // Cannot get this to return the character
								// health after Systme.out.print statements

	}

	/**
	 * Gets the strength points of the character
	 * 
	 * @return the strength points of the character
	 */
	public int getCharacterStrength() {
		System.out.print(characterName);
		System.out.println("'s Strength = " + characterStrength);
		return characterStrength; // Cannot get this to return the character
									// strength after Systme.out.print
									// statements
	}

	/**
	 * Sets character health to 50 Not sure if this is needed
	 * 
	 * @return the health of the character
	 */
	public int setCharacterHealth() {
		this.characterHealth = 50;
		return characterHealth;
	}

	/**
	 * Sets character strength to 25 Not sure if this is needed
	 * 
	 * @return the strength of the character
	 */
	public int setCharacterStrength() {
		this.characterStrength = 25;
		return characterStrength;
	}
}
