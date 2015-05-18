/**
 * Created by RJ on 5/13/2015.
 */

public class Character {
    private String characterName; //name of character
    private String characterClass; //class of character
    private int characterDamage; //damage of character
    private int characterHealth = 15; //health of character
    private int CHARACTER_MAX_HEALTH = 20; //max health of a character

    /**
     * Creates a new Character
     *
     * @param characterName   is the name of the new character
     * @param characterClass  is the class of the new character
     * @param characterDamage is the damage of the new character
     */
    public Character(String characterName, String characterClass, int characterDamage) {
        this.characterName = characterName;
        boolean correctSelection = false;
        while (correctSelection = false)
            if (characterClass.equalsIgnoreCase("Mage")) {
                this.characterClass = characterClass;
                correctSelection = true;
            } else if (characterClass.equalsIgnoreCase("Paladine")) {
                this.characterClass = characterClass;
                correctSelection = true;


            } else if (characterClass.equalsIgnoreCase("Warrior")) {
                this.characterClass = characterClass;
                correctSelection = true;

            } else {
                System.out.println("Must be Mage, Paladine, or Warrior");

            }
        this.characterDamage = characterDamage;

    }

    /**
     * Gets the name of the character
     *
     * @return characterName
     */
    public String getCharacterName() {

        return characterName;
    }

    /**
     * Gets the class of the character
     *
     * @return characterClass in a sentence
     */
    public String getCharacterClass() {
        return characterClass;
    }

    /**
     * Gets the health of the character
     *
     * @return characterHealth in a sentence
     */
    public int getCharacterHealth() {
        return characterHealth;
    }

    /**
     * Gets the damage of the character
     *
     * @return characterDamage in a sentence
     */
    public int getCharacterDamage() {
        return characterDamage;
    }
}
