import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Character Name: ");
        String mainName = in.next();
        System.out.print("Character Class: ");
        String mainClass = in.next();
        System.out.print("Character Damage: ");
        int level = in.nextInt();
        MainCharacter tommy = new MainCharacter(mainName, mainClass, level);
        System.out.println(tommy.getCharacterHealth());
        System.out.println(tommy.getCharacterDamage());
        tommy.getCharacterClass();
        System.out.println("HI");
    }
}
