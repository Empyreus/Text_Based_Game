public class Enemy {
    private String enemyName = "";
    private int enemyHealth;
    private int enemyDamage;

    public Enemy() {
        enemyHealth = 0;
        enemyName = "";
        enemyDamage = 0;

    }

    public int setHealth(int x){
        enemyHealth = x;
        return enemyHealth;
    }

    public int getHealth() {
        return enemyHealth;
    }

    public int setDamage(int x){
        enemyDamage = x;
        return enemyDamage;
    }
    public int getDamage(){
        return enemyDamage;
    }

    public String setName(String x){
        enemyName = x;
        return enemyName;
    }
    public String getName(){
        return enemyName;
    }

    public boolean Alive() {
        if (enemyHealth <= 0){
            setHealth(0);
            return false;
        }
        else {
            return true;
        }

    }
}
