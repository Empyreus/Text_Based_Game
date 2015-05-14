/**
 * Created by RJ on 5/13/2015.
 */
public class Character {
    private String characterName;
    private String charcterClass;
    private int characterDamage;
    private int CHARACTER_HEALTH = 20;

    public Character(String characterName, String characterClass, int damage) {
        this.characterName = characterName;
        this.charcterClass = characterClass;
        characterDamage = damage;

    }

    public String getCharacterName() {
        return characterName;
    }

    public String getCharcterClass() {
        return charcterClass;
    }

    public int getCharacterHealth() {
        return CHARACTER_HEALTH;
    }

    public int getCharacterDamage() {
        return characterDamage;
    }
}
