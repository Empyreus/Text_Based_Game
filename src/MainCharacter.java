public class MainCharacter extends Character {

    private int characterHealth;
    private int characterStrength;
    private String characterName;

    /**
     * Constructs a character with 50 health and 25 strength
     */
    public MainCharacter(String characterName, String charaterClass, int characterDamage) {
        super(characterName, charaterClass, characterDamage);


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
