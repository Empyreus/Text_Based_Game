/**
 * Runs the program with the story
 */

import java.util.ArrayList;
import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) throws InterruptedException {
        boolean running = true;
        while (running) {

            Scanner in = new Scanner(System.in);

            //Array Lists
            ArrayList<Inventory> weapons = new ArrayList<>();
            ArrayList<Inventory> healthPots = new ArrayList<>();
            ArrayList<Inventory> items = new ArrayList<>();

            //Inventory Items
            Inventory basicKey = new Inventory("Basic Key", "Basic key that unlocks certain doors.", 1);
            Inventory healthPot = new Inventory("Health Potion", "Restores 5 Health", 5);
            Inventory basicWep = new Inventory("", "", 0);
            Inventory advancedWep = new Inventory("", "", 0);


            //Rooms
            Room startRoom = new Room("You open your eyes to find a room. In this room you see a Skeleton before the only door.");
            Room secondRoom = new Room("You walk through the door the skeleton was prevously gaurding. You see two doors, one with a skeleton (stronger than before) the other with no enemy.");
            Room thirdRoom = new Room("You walk into a room, contains one Behemoth");
            Room fourthRoom = new Room("You walk into a room containing one large chest.");
            Room currentRoom = startRoom;

            //Wait Times
            short a = 0;
            short b = 0;
            short c = 0;
            short d = 0;
            short x = 0;

            //Characters
            MainCharacter mainCharacter = new MainCharacter("", "", 0);
            Skeleton skeleton1 = new Skeleton();
            StrongSkeleton enemy1 = new StrongSkeleton();


            Thread.sleep(b);
            System.out.println("This game can only be exited at predetermined places. If exit option is available, it will be said. Now lets begin.");
            Thread.sleep(b);
            System.out.print("Character Name: ");
            mainCharacter.setName(in.next());
            System.out.print("Please choose Mage, Rogue, or Warrior for a Class: ");
            String possibleClass = in.next();
            boolean correctSelection = false;
            int maxHealth = 0;
            while (!correctSelection) {


                if (possibleClass.equalsIgnoreCase("Mage")) {
                    mainCharacter.setClass("Mage");
                    mainCharacter.setDamage(6);
                    mainCharacter.setMaxMageHealth();
                    maxHealth = mainCharacter.getHealth();
                    correctSelection = true;

                } else if (possibleClass.equalsIgnoreCase("Rogue")) {
                    mainCharacter.setClass("Rogue");
                    mainCharacter.setDamage(4);
                    mainCharacter.setMaxRogueHealth();
                    maxHealth = mainCharacter.getHealth();

                    correctSelection = true;

                } else if (possibleClass.equalsIgnoreCase("Warrior")) {
                    mainCharacter.setClass("Warrior");
                    mainCharacter.setDamage(2);
                    mainCharacter.setMaxWarriorHealth();
                    maxHealth = mainCharacter.getHealth();
                    correctSelection = true;

                } else {
                    System.out.println("Please choose Mage, Rogue, or Warrior");
                    possibleClass = in.next();

                }
            }

            System.out.println("Character Health = " + mainCharacter.getHealth());
            System.out.println("Character Damage = " + mainCharacter.getDamage());

            while (currentRoom == startRoom) {
                System.out.println(startRoom.getRoomDescription());

                System.out.println("Skeleton Health = " + skeleton1.getHealth());
                System.out.println("Skeleton Damage = " + skeleton1.getDamage());
                System.out.println("Type 1 to Attack or 2 to Run. Type Exit to exit game");
                String choice1 = in.next();
                while (skeleton1.Alive()) {
                    if (choice1.equalsIgnoreCase("exit")) {
                        running = false;
                        System.out.println("Not viable answer, reset game");
                    } else if (choice1.equalsIgnoreCase("1") || choice1.equalsIgnoreCase("2")) {

                        while (skeleton1.Alive() && choice1.equalsIgnoreCase("1")) {

                            Thread.sleep(a);
                            System.out.println("You walk forward to attack skeleton. You punch the skeleton.");
                            Thread.sleep(b);
                            System.out.println("You deal " + mainCharacter.getDamage() + " Damage");
                            Thread.sleep(b);
                            System.out.println("Skeletons health remaining = " + skeleton1.takeDamage(mainCharacter.getDamage()));
                            Thread.sleep(b);
                            if (skeleton1.Alive()) {
                                System.out.println("The Skeleton walks forward to attack you. Skeleton punches you.");
                                Thread.sleep(b);
                                System.out.println("Skeleton deals 1 damage");
                                Thread.sleep(b);
                                System.out.println("Your health remaining = " + mainCharacter.setHealth(mainCharacter.getHealth() - skeleton1.getDamage()));
                                Thread.sleep(b);
                            }
                            if (skeleton1.Alive()) {
                                System.out.println("To attack again press 1 to run press 2");
                                choice1 = in.next();
                            } else {
                                System.out.println("Skeleton Killed!");
                            }

                        }
                        while (skeleton1.Alive() && choice1.equalsIgnoreCase("2")) {

                            Thread.sleep(a);
                            System.out.println("The Skeleton walks forward to attack you. Skeleton punches you.");
                            Thread.sleep(b);
                            System.out.println("Skeleton deals 1 damage");
                            Thread.sleep(b);
                            System.out.println("Your health remaining = " + mainCharacter.setHealth(mainCharacter.getHealth() - skeleton1.getDamage()));
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
                    healthPots.add(healthPot);
                    healthPots.add(healthPot);
                    healthPots.add(healthPot);
                    healthPots.add(healthPot);
                    healthPots.add(healthPot);
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
                    weapons.add(basicWep);
                    System.out.println("Skeleton drops 5 health potions and a " + basicWep.getName());
                    mainCharacter.setHealth(maxHealth);
                    mainCharacter.setDamage(basicWep.getNumb());
                    System.out.println("Your health has been reset to max, and your new weapon has been equiped.");
                    currentRoom = secondRoom;
                }


            }
            while (currentRoom == secondRoom) {
                System.out.println(currentRoom.getRoomDescription());
                System.out.println("To fight skeleton press 1 or 2 to go to door with no enemy.");
                String choice = in.next();
                if (choice.equalsIgnoreCase("1")) {
                    System.out.print("You walk forward to the skeleton. Description: ");
                    System.out.println(enemy1.getEnemyDescription());
                    System.out.println("StrongSkeleton's health = " + enemy1.getHealth());
                    System.out.println("StrongSkeleton's damage = " + enemy1.getDamage());
                    System.out.println("Press 1 to attack, 2 to retreat.");
                    String choice1 = in.next();
                    String choice2 = "1";
                    if (choice1.equalsIgnoreCase("1")) {
                        while (enemy1.Alive()) {
                            if (choice2.equalsIgnoreCase("1")) {
                                Thread.sleep(a);
                                System.out.println("You walk forward to attack skeleton. You attack the skeleton.");
                                Thread.sleep(b);
                                System.out.println("You deal " + mainCharacter.getDamage() + " Damage");
                                Thread.sleep(b);
                                System.out.println("Skeletons health remaining = " + enemy1.takeDamage(mainCharacter.getDamage()));
                                Thread.sleep(b);
                                System.out.println("The Skeleton walks forward to attack you. Skeleton attacks you.");
                                Thread.sleep(b);
                                System.out.println("Skeleton deals " + enemy1.getDamage() + " damage");
                                Thread.sleep(b);
                                System.out.println("Your health remaining = " + mainCharacter.setHealth(mainCharacter.getHealth() - enemy1.getDamage()));
                                Thread.sleep(b);
                                if (enemy1.Alive()) {
                                    System.out.println("To attack again press 1 to use a health potion press 2 / Enter 3 to check health potions remaining.");
                                    choice2 = in.next();
                                } else {
                                    System.out.println("Skeleton Killed!");
                                }
                            } else if (choice2.equalsIgnoreCase("2")) {
                                if (healthPots.size() >= 0) {
                                    mainCharacter.setHealth(mainCharacter.getHealth() + healthPots.get(0).getNumb());
                                    healthPots.remove(0);
                                    System.out.println("Heal is now = " + mainCharacter.getHealth());
                                    System.out.println("To attack again press 1 to use a health potion press 2 / Enter 3 to check health potions remaining.");
                                    choice2 = in.next();
                                } else {
                                    System.out.println("No more health potions remaining.");
                                    System.out.println("To attack again press 1 to use a health potion press 2 / Enter 3 to check health potions remaining.");
                                    choice2 = in.next();
                                }
                            } else if (choice2.equalsIgnoreCase("3")) {
                                System.out.println("There are " + healthPots.size() + " heal potions remaining.");
                                System.out.println("To attack again press 1 to use a health potion press 2 / Enter 3 to check health potions remaining.");
                                choice2 = in.next();
                            } else {
                                System.out.println("Please choose a valid option.");
                                System.out.println("To fight skeleton press 1 or 2 to go to enemyless door.");
                                choice2 = in.next();
                            }
                        }

                    }
                } else if (choice.equalsIgnoreCase("2")) {
                    System.out.println("You walk over to the dooor, when you attempt to open the door it does budge and is locked. There is no sign of a key nearby.");
                    System.out.println("To fight skeleton press 1 or 2 to go to door with no enemy.");
                    choice = in.next();
                }
                if (!enemy1.Alive()) {
                    if (mainCharacter.getCharClass().equalsIgnoreCase("Mage")) {
                        advancedWep.setName("Advanced Staff");
                        advancedWep.setDescription("Magically Imbued Mage Weapon, increases strength of Magic");
                        advancedWep.setNumb(10);

                    } else if (mainCharacter.getCharClass().equalsIgnoreCase("Rogue")) {
                        advancedWep.setName("Advnaced Dagger");
                        advancedWep.setDescription("Extremely Light Rogue Weapon, allows for more precise attacks");
                        advancedWep.setNumb(8);
                    } else if (mainCharacter.getCharClass().equalsIgnoreCase("Warrior")) {
                        advancedWep.setName("Advanced Sword");
                        advancedWep.setDescription("Supremely Fordged Warriar Weapon, better balancing allows for stronger attacks");
                        advancedWep.setNumb(6);
                    }
                    weapons.add(advancedWep);
                    items.add(basicKey);
                    System.out.println("StrongSkeleton drops an " + advancedWep.getName() + " and a basic key");
                    System.out.println(advancedWep.getName() + " Description: " + advancedWep.getDescription());
                    System.out.println(advancedWep.getName() + " Damage: " + advancedWep.getNumb());
                    System.out.println("Press 1 to equipe " + advancedWep.getName() + "or press 2 to equipe" + basicWep.getName());
                    String choice1 = in.next();
                    if (choice1.equalsIgnoreCase("1")) {
                        mainCharacter.setDamage(advancedWep.getNumb());
                    } else if (choice1.equalsIgnoreCase("2")) {
                        mainCharacter.setDamage(basicWep.getNumb());
                    }
                    System.out.println("New Damage: " + mainCharacter.getDamage());
                    System.out.println("To enter door behind dead press 1, to go to door with no enemy press 2.");
                    String choice2 = in.next();
                    if(choice2 == "1"){
                        currentRoom = thirdRoom;
                    }
                    else if (choice2 == "2"){
                        System.out.println("You walk to the door with no enemy.");
                        System.out.println("To use the dropped key press 1, to enter the door behind the dead skeleton press 2.");
                        String choice3 = in.next();
                        if (choice3 == "1" && items.contains(basicKey)){
                            System.out.println("You unlock the dorry with the key, you enter the room.");
                            currentRoom = fourthRoom;
                        }
                        else if (choice3 == "1" && !items.contains(basicKey)){
                            System.out.println("You do not have the key to enter this door");
                            System.out.println("Enter 1 to go through door behind dead skeleton");
                            choice3 = in.next();
                            currentRoom = thirdRoom;
                        }

                    }
                }
            }
            if (currentRoom == thirdRoom) {
                System.out.println(thirdRoom.getRoomDescription());
            }
            if (currentRoom == fourthRoom){
                System.out.println(fourthRoom.getRoomDescription());
                System.out.println("To open large chest press 1, To return press 2.");
                String choice = in.next();
                if (choice == "1") {
                    System.out.println("You open chest.");
                } else if (choice == "2") {
                    currentRoom = secondRoom;
                }
            }
        }
    }
}



