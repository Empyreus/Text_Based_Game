import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Character Name: ");
        String mainName = in.next();
        String mainClass = "";

        System.out.print("Character Class: ");
        String possibleClass = in.next();
        boolean correctSelection = false;
        while (correctSelection == false) {

            if (possibleClass.equalsIgnoreCase("Mage")) {
                possibleClass = mainClass;
                correctSelection = true;
            } else if (possibleClass.equalsIgnoreCase("Rogue")) {
                possibleClass = mainClass;
                correctSelection = true;

            } else if (possibleClass.equalsIgnoreCase("Warrior")) {
                possibleClass = mainClass;
                correctSelection = true;

            } else {
                System.out.println("Please choose Mage, Rogue, or Warrior");
                possibleClass = in.next();
            }
        }
        System.out.print("Character Damage: ");
        int level = in.nextInt();

        MainCharacter tommy = new MainCharacter(mainName, mainClass, level);
        System.out.println(tommy.getCharacterHealth());
        System.out.println(tommy.getCharacterDamage());
        tommy.getCharacterClass();
    }
}
