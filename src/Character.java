/**
 * Created by RJ on 5/13/2015.
 * Main class for creating a Character.
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
        this.characterClass = characterClass;
        this.characterDamage = characterDamage;

    }


    /**
     * Sets character health to 50 Not sure if this is needed
     *
     * @return the health of the character
     */
    public int setHealth(int health) {
        characterHealth = health;
        return characterHealth;
    }

    public String setName(String x) {
        characterName = x;
        return x;
    }

    /**
     * Gets the name of the character
     *
     * @return characterName
     */
    public String getName() {

        return characterName;
    }

    /**
     * Sets the class of the character
     *
     * @param charClass is the name of the class
     * @return the characters class
     */
    public String setClass(String charClass) {
        characterClass = charClass;
        return characterClass;
    }


    /**
     * Gets the class of the character
     *
     * @return characterClass in a sentence
     */
    public String getCharClass() {
        return characterClass;
    }

    /**
     * Gets the health of the character
     *
     * @return characterHealth in a sentence
     */
    public int getHealth() {
        return characterHealth;
    }

    /**
     * Sets character strength to 25 Not sure if this is needed
     *
     * @return the strength of the character
     */
    public int setDamage(int damage) {
        characterDamage = damage;
        return characterDamage;
    }

    /**
     * Gets the damage of the character
     *
     * @return characterDamage in a sentence
     */
    public int getDamage() {
        return characterDamage;
    }

    public boolean Alive() {
        if (getHealth() <= 0) {
            setHealth(0);
            return false;
        } else {
            return true;
        }

    }
}
