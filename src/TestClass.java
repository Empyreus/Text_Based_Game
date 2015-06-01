/**
 * Runs the program with the story
 */

import java.util.ArrayList;
import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) throws InterruptedException {
        boolean running = true;
        ArrayList<Inventory> inventory = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        short a = 0;
        short b = 0;
        short c = 0;
        short d = 0;
        short x = 0;
        MainCharacter mainCharacter = new MainCharacter("", "", 0);
        Thread.sleep(b);
        System.out.println("This game can only be exited at predetermined places. If exit option is available, it will be said. Now lets begin.");
        Thread.sleep(b);
        System.out.print("Character Name: ");
        String mainName = in.next();
        String mainClass = "";

        System.out.print("Please choose Mage, Rogue, or Warrior for an Class: ");
        String possibleClass = in.next();
        boolean correctSelection = false;
        while (!correctSelection) {


            if (possibleClass.equalsIgnoreCase("Mage")) {
                mainCharacter.setClass("Mage");
                mainCharacter.setDamage(6);
                mainCharacter.setMaxMageHealth();
                correctSelection = true;

            } else if (possibleClass.equalsIgnoreCase("Rogue")) {
                mainCharacter.setClass("Rogue");
                mainCharacter.setDamage(4);
                mainCharacter.setMaxRogueHealth();
                correctSelection = true;

            } else if (possibleClass.equalsIgnoreCase("Warrior")) {
                mainCharacter.setClass("Warrior");
                mainCharacter.setDamage(2);
                mainCharacter.setMaxWarriorHealth();
                correctSelection = true;

            } else {
                System.out.println("Please choose Mage, Rogue, or Warrior");
                possibleClass = in.next();

            }
        }

        System.out.println("Character Health = " + mainCharacter.getHealth());
        System.out.println("Character Damage = " + mainCharacter.getDamage());
        System.out.println("You open your eyes to find a room. In this room you see a Skeleton before the only door.");
        Skeleton skeleton1 = new Skeleton();

        System.out.println("Skeleton Health = " + skeleton1.getHealth());
        System.out.println("Skeleton Damage = " + skeleton1.getDamage());
        System.out.println("Type 1 to Attack or 2 to Run. Type Exit to exit game");
        String choice1 = in.next();
        while (skeleton1.Alive()) {
            if (choice1.equalsIgnoreCase("exit")) {
                //running = false;
            } else if (choice1.equalsIgnoreCase("1") || choice1.equalsIgnoreCase("2")) {

                while (skeleton1.Alive() && choice1.equalsIgnoreCase("1")) {

                    Thread.sleep(a);
                    System.out.println("You walk forward to attack skeleton. You punch the skeleton.");
                    Thread.sleep(b);
                    System.out.println("You deal " + mainCharacter.getDamage() + " Damage");
                    Thread.sleep(b);
                    System.out.println("Skeletons health remaining = " + skeleton1.takeDamage(mainCharacter.getDamage()));
                    Thread.sleep(b);
                    System.out.println("The Skeleton walks forward to attack you. Skeleton punches you.");
                    Thread.sleep(b);
                    System.out.println("Skeleton deals 1 damage");
                    Thread.sleep(b);
                    System.out.println("Your health remaining = " + mainCharacter.getName() + mainCharacter.setHealth(mainCharacter.getHealth() - skeleton1.getDamage()));
                    Thread.sleep(b);
                    if (skeleton1.Alive()) {
                        System.out.println("To attack again press 1 to run press 2");
                        choice1 = in.next();
                    } else {
                        System.out.println("Skeleton Killed!");
                    }

                }
                while (skeleton1.Alive() && choice1.equalsIgnoreCase("2")) {

                    Thread.sleep(1000);
                    System.out.println("The Skeleton walks forward to attack you. Skeleton punches you.");
                    Thread.sleep(b);
                    System.out.println("Skeleton deals 1 damage");
                    Thread.sleep(b);
                    System.out.println("Your health remaining = " + mainCharacter.getName() + mainCharacter.setHealth(mainCharacter.getHealth() - skeleton1.getDamage()));
                    Thread.sleep(b);
                    if (skeleton1.Alive()) {
                        System.out.println("To attack again press 1 to run press 2");
                        choice1 = in.next();
                    } else {
                        System.out.println("Skeleton Killed!");
                    }
                }
            } else {
                System.out.println("Please re-enter selection");
                choice1 = in.next();
            }
        }
        if (!skeleton1.Alive()) {
            Inventory healthPot = new Inventory("Health Potion", "Restores 5 Health", 5);
            inventory.add(healthPot);
            inventory.add(healthPot);
            inventory.add(healthPot);
            inventory.add(healthPot);
            inventory.add(healthPot);
            Inventory basicWep = new Inventory("", "", 0);
            if (mainCharacter.getCharClass().equalsIgnoreCase("Mage")) {
                basicWep.setName("Basic Staff");
                basicWep.setDescription("Simple Mage Weapon");
                basicWep.setNumb(8);

            } else if (mainCharacter.getCharClass().equalsIgnoreCase("Rogue")) {
                basicWep.setName("Basic Dagger");
                basicWep.setDescription("Simple Rogue Weapon");
                basicWep.setNumb(6);
            } else if (mainCharacter.getCharClass().equalsIgnoreCase("Warrior")) {
                basicWep.setName("Basic Sword");
                basicWep.setDescription("Simple Warrior Weapon");
                basicWep.setNumb(4);
            }
            inventory.add(basicWep);
            System.out.println("Skeleton drops 5 health potions and a " + basicWep.getName());

            System.out.println("Your health has been reset to max.");


        }

    }
}



