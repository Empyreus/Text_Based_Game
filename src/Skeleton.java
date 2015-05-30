/**
 * Created by rjsouza on 5/29/15.
 * Subclass of Enemy, creates a new enemy skeleton.
 */
public class Skeleton extends Enemy{
    /**
     * Creates a enemy skeleton, with 1 damage, 10 health, and a name of "Skeleton"
     */
    public Skeleton(){
        setDamage(1);
        setHealth(10);
        setName("Skeleton");
    }

}
