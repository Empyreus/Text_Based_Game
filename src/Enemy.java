/**
 * Created by rjsouza on 5/29/15.
 * Main class for creating an Enemy
 */
public class Enemy {
    private String enemyName = "";
    private int enemyHealth;
    private int enemyDamage;
    private String enemyDescription;

    /**
     * Constructs an enemy with a base of 0 health, 0 damage, and no name
     */
    public Enemy() {
        enemyHealth = 0;
        enemyName = "";
        enemyDamage = 0;

    }

    /**
     * Sets the enemy's health
     *
     * @return enemy's health
     */
    public int setHealth(int x) {
        enemyHealth = x;
        return enemyHealth;
    }

    /**
     * Causes the enemy to take damage and loose health, cannot go below 0
     *
     * @param x the amount of damage to take
     * @return remaining health
     */
    public int takeDamage(int x) {
        if ((getHealth() - x) < 0) {
            setHealth(0);
        } else {
            setHealth(getHealth() - x);
        }
        return getHealth();
    }

    /**
     * Gets the health of the enemy
     *
     * @return health of the enemy
     */
    public int getHealth() {
        return enemyHealth;
    }

    /**
     * Sets how much damage the enemy does
     *
     * @param x the amount of damage
     * @return how much damage the enemy does
     */
    public int setDamage(int x) {
        enemyDamage = x;
        return enemyDamage;
    }

    /**
     * Gets the amount of damage done by the enemy
     *
     * @return enemy's damage
     */
    public int getDamage() {
        return enemyDamage;
    }

    /**
     * Sets the name of the enemy
     *
     * @param x is the new name
     * @return the name of the enemy
     */
    public String setName(String x) {
        enemyName = x;
        return enemyName;
    }

    /**
     * Gets the name of the enemy
     *
     * @return the name of the enemy
     */
    public String getName() {
        return enemyName;
    }

    /**
     * Checks if the enemy is alive or dead, sets enemy health to 0 if dead
     *
     * @return true if enemy is alive, false if enemy is dead
     */
    public boolean Alive() {
        if (enemyHealth <= 0) {
            setHealth(0);
            return false;
        } else {
            return true;
        }

    }

    public String setEnemyDescription(String x){
        enemyDescription = x;
        return enemyDescription;
    }
    public String getEnemyDescription(){
        return enemyDescription;
    }
}

