/**
 * Created by RJ on 5/13/2015.
 */
public class Character {
    private String characterName;
    private String characterClass;
    private int characterDamage;
    private int characterHealth;
    private int CHARACTER_MAX_HEALTH = 20;

    public Character(String characterName, String characterClass, int characterDamage) {
        this.characterName = characterName;
        this.characterClass = characterClass;
        this.characterDamage = characterDamage;

    }

    public String getCharacterName() {

        return characterName;
    }

    public String getCharacterClass() {
        return getCharacterName() + "'s Class = " + characterClass;
    }

    public String getCharacterHealth() {
        return getCharacterName() + "'s Health = " + characterHealth;
    }

    public String getCharacterDamage() {
        return getCharacterName() + "'s Damage = " + characterDamage;
    }
}
