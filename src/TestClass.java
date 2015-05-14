import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) {
        MainCharacter tommy = new MainCharacter("Tom", "Druid", 12);
        System.out.println(tommy.getCharacterHealth());
        System.out.println(tommy.getCharacterDamage());
        tommy.getCharacterClass();
        System.out.println("HI");
        Scanner in = new Scanner(System.in);
    }
}
