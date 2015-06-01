
/**
 * Created by rjsouza on 5/31/15.
 */


public class Inventory {
    private int numb;
    private String name;
    private String description;

    public Inventory(String name, String description, int x) {
        name = this.name;
        description = this.description;
        numb = x;
    }

    public String setName(String x) {
        name = x;
        return name;
    }

    public String getName() {
        return name;
    }

    public String setDescription(String x) {
        description = x;
        return description;
    }

    public String getDescription() {
        return description;
    }

    public int setNumb(int x) {
        numb = x;
        return numb;
    }

    public int getNumb() {
        return numb;
    }
}
