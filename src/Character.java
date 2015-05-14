/**
 * Created by RJ on 5/13/2015.
 */
public class Character {
    private String characterName; //name of character
    private String characterClass; //class of character
    private int characterDamage; //damage of character
    private int characterHealth; //health of character
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
        return getCharacterName() + "'s Class = " + characterClass;
    }

    /**
     * Gets the health of the character
     * @return characterHealth in a sentence
     */
    public String getCharacterHealth() {
        return getCharacterName() + "'s Health = " + characterHealth;
    }

    /**
     * Gets the damage of the character
     * @return characterDamage in a sentence
     */
    public String getCharacterDamage() {
        return getCharacterName() + "'s Damage = " + characterDamage;
    }
}
