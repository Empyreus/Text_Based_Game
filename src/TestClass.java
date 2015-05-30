import java.util.Scanner;


public class TestClass {

    public static void main(String[] args) throws InterruptedException {
        boolean running = true;
        while (running == true) {
            Scanner in = new Scanner(System.in);
            short z = 1500;
            short x = 10000;
            MainCharacter mainCharacter = new MainCharacter("", "", 0);
            Thread.sleep(z);
            System.out.println("This game can only be exited at predetermained places. If exit option is available, it will be said. Now lets begin.");
            Thread.sleep(2000);
            System.out.print("Character Name: ");
            String mainName = in.next();
            String mainClass = "";

            System.out.print("Please choose Mage, Rogue, or Warrior for an Class: ");
            //System.out.print("Character Class: ");
            String possibleClass = in.next();
            boolean correctSelection = false;
            while (correctSelection == false) {


                if (possibleClass.equalsIgnoreCase("Mage")) {
                    mainCharacter.setClass("Mage");
                    mainCharacter.setDamage(6);
                    mainCharacter.setHealth(15);

                    correctSelection = true;

                } else if (possibleClass.equalsIgnoreCase("Rogue")) {
                    mainCharacter.setClass("Rogue");
                    mainCharacter.setDamage(4);
                    mainCharacter.setHealth(20);
                    correctSelection = true;

                } else if (possibleClass.equalsIgnoreCase("Warrior")) {
                    mainCharacter.setClass("Warrior");
                    mainCharacter.setDamage(2);
                    mainCharacter.setHealth(25);
                    correctSelection = true;

                } else {
                    System.out.println("Please choose Mage, Rogue, or Warrior");
                    possibleClass = in.next();

                }
            }

            Thread.sleep(500);
            System.out.println("Character Health = " + mainCharacter.getHealth());
            Thread.sleep(z);
            System.out.println("Character Damage = " + mainCharacter.getDamage());
            Thread.sleep(z);
            System.out.println("You open your eyes to find a room. In this room you see a Skeleton before the only door.");
            Skeleton skeleton1 = new Skeleton();
            Thread.sleep(5000);

            System.out.println("Skeleton Health = " + skeleton1.getHealth());
            Thread.sleep(z);
            System.out.println("Skeleton Damage = " + skeleton1.getDamage());
            Thread.sleep(z);
            System.out.println("Type 1 to Attack or 2 to Run. Type Exit to exit game");
            String choice1 = in.next();
            if (choice1.equalsIgnoreCase("exit")) {
                running = false;
            }

            while (skeleton1.Alive() == true && choice1.equalsIgnoreCase("1")) {

                Thread.sleep(1000);
                System.out.println("You walk forward to attack skeleton. You punch the skeleton.");
                Thread.sleep(z);
                System.out.println("You deal " + mainCharacter.getDamage() + " Damage");
                Thread.sleep(z);
                System.out.println("Skeletons health = " + skeleton1.setHealth(skeleton1.getHealth() - mainCharacter.getDamage()));
                Thread.sleep(z);
                if (skeleton1.Alive() == true) {
                    System.out.println("To attack again press 1 to run press 2");
                    choice1 = in.next();
                } else {
                    System.out.println("Skeleton Killed!");
                }

            }
            while (skeleton1.Alive() == true && choice1.equalsIgnoreCase("2")) {

                Thread.sleep(1000);
                System.out.println("The Skeleton walks forward to attack you. Skeleton punches you.");
                Thread.sleep(z);
                System.out.println("Skeleton deals 1 damage");
                Thread.sleep(z);
                System.out.println("Your health = " + mainCharacter.getName() + mainCharacter.setHealth(mainCharacter.getHealth() - skeleton1.getDamage()));
                Thread.sleep(z);
                if (skeleton1.Alive() == true) {
                    System.out.println("To attack again press 1 to run press 2");
                    choice1 = in.next();
                } else {
                    System.out.println("Skeleton Killed!");
                }
            }

        }
    }

}

