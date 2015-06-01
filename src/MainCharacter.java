/**
 * Created by rjsouza on 5/29/15.
 * MainCharacter of the stories Class, subclass of Character
 */
public class MainCharacter extends Character {

    private int characterHealth;
    private int characterStrength;
    private String characterName;
    private int MAX_MAGE_HEALTH = 15;
    private int MAX_ROGUE_HEALTH = 20;
    private int MAX_WARRIOR_HEALTH = 25;

    /**
     * Constructs a character
     */
    public MainCharacter(String characterName, String characterClass, int characterDamage) {
        super(characterName, characterClass, characterDamage);


    }

    public int setMaxMageHealth() {
        setHealth(MAX_MAGE_HEALTH);
        return getHealth();
    }

    public int setMaxRogueHealth() {
        setHealth(MAX_ROGUE_HEALTH);
        return getHealth();
    }

    public int setMaxWarriorHealth() {
        setHealth(MAX_WARRIOR_HEALTH);
        return getHealth();
    }

}
