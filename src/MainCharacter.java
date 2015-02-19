public class MainCharacter {

	private String characterName = "LittleBitch";
	private int characterHealth;

	public MainCharacter(int aCharacterHealth) {
		
		characterHealth = aCharacterHealth;

	}

	/**
	 * Gets the amount of health the character has remaining
	 * @return the amount of health the character has
	 */
	public int getHealth() {
		System.out.print(characterName);
		System.out.println("'s Health =");
		return characterHealth;
	}

}
