public class Enemy {
	private String enemyName = "Slade";
	private int enemyHealth;
//Test
	public Enemy() {
		enemyHealth = 100;

	}

	public int getHealth() {
		System.out.println(enemyName + enemyHealth);
		return enemyHealth;
	}
}
