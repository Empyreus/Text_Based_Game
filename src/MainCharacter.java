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

    /**
     * public int setHealth(int x){
     * if (getCharClass().equalsIgnoreCase("Mage")) {
     * if ((getHealth() + x) < getMaxMageHealth()){
     * setHealth(x+getHealth());
     * }
     * else if ((getHealth() + x) >= getMaxMageHealth()){
     * setHealth(getMaxMageHealth());
     * }
     * }
     * else if (getCharClass().equalsIgnoreCase("rogue")) {
     * if ((getHealth() + x) < getMaxRogueHealth()){
     * setHealth(x+getHealth());
     * }
     * else if ((getHealth() + x) >= getMaxRogueHealth()){
     * setHealth(getMaxRogueHealth());
     * }
     * }
     * else if (getCharClass().equalsIgnoreCase("warrior")) {
     * if ((getHealth() + x) < getMaxWarriorHealth()){
     * setHealth(x+getHealth());
     * }
     * else if ((getHealth() + x) >= getMaxWarriorHealth()){
     * setHealth(getMaxWarriorHealth());
     * }
     * }
     * return getHealth();
     * }
     */

    public int setMaxMageHealth() {
        setHealth(MAX_MAGE_HEALTH);
        return getHealth();
    }

    public int getMaxMageHealth(){
        return MAX_MAGE_HEALTH;
    }

    public int setMaxRogueHealth() {
        setHealth(MAX_ROGUE_HEALTH);
        return getHealth();
    }

    public int getMaxRogueHealth(){
        return MAX_ROGUE_HEALTH;
    }

    public int setMaxWarriorHealth() {
        setHealth(MAX_WARRIOR_HEALTH);
        return getHealth();
    }

    public int getMaxWarriorHealth(){
        return MAX_WARRIOR_HEALTH;
    }
}
