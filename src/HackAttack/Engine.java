package HackAttack;
import java.util.Random;
import java.util.Scanner;
import static HackAttack.Items.*;
import static HackAttack.Enemies.*;
public class Engine {
    public static void enemy(double hp, double dmg, int floor, boolean enemiesRemain, double mod) {
        Random rand = new Random();
        double[] enemyHpArray = new double[floor];
        double[] enemyAtkArray = new double[floor];
        if (enemiesRemain = true) {
            System.out.println("What do you do?");
        } else {
            floor++;
            int enemyAmount = (floor);
            for (int i = 0; i < floor; i++) {
                if (floor >= 0 && floor != 100) {
                    rat(mod, hp, dmg, rand);
                } else if (floor >= 10 && floor != 100) {
                    slime(mod, hp, dmg, rand);
                } else if (floor >= 20 && floor != 100) {
                    skeleton(mod, hp, dmg, rand);
                } else if (floor >= 30 && floor != 100) {
                    goblin(mod, hp, dmg, rand);
                } else if (floor >= 40 && floor != 100) {
                    orc(mod, hp, dmg, rand);
                } else if (floor >= 50 && floor != 100) {
                    demon(mod, hp, dmg, rand);
                } else if (floor >= 60 && floor != 100) {
                    poltergeist(mod, hp, dmg, rand);
                } else if (floor >= 70 && floor != 100) {
                    mimic(mod, hp, dmg, rand);
                } else if (floor >= 80 && floor != 100) {
                    dragon(mod, hp, dmg, rand);
                } else if (floor >= 90 && floor != 100) {
                    basilisk(mod, hp, dmg, rand);
                } else if (floor == 100) {
                    System.out.println("Good Luck");
                    boss(mod, hp, dmg, rand);
                }
            }
        }
        Main.run();
    }

    public static void player(double atk, double shield, double health, double armor, String[] correctItems, String userChoice, double mod, int floor, boolean kontinue) {
        String result;
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("What will you attack with?");
            userChoice = input.next();
            if (userChoice.equalsIgnoreCase("Quit")) {
                kontinue = false;

            }
            for (int i = 0; i < correctItems.length; i++) {
                if (userChoice.equalsIgnoreCase(correctItems[i])) {
                    result = correctItems[i].substring(0, 2);
                    if (result.equalsIgnoreCase("Sm")) {
                        smallPotion(mod, health, rand);
                    } else if (result.equalsIgnoreCase("Me")) {
                        mediumPotion(mod, health, rand);
                    } else if (result.equalsIgnoreCase("La")) {
                        largePotion(mod, health, rand);
                    } else if (result.equalsIgnoreCase("Gi")) {
                        giantPotion(mod, health, rand);
                    } else if (result.equalsIgnoreCase("Wo")) {
                        woodenShield(mod, shield, rand);
                    } else if (result.equalsIgnoreCase("Ru")) {
                        rustyShield(mod, shield, rand);
                    } else if (result.equalsIgnoreCase("Sh")) {
                        shield(mod, shield, rand);
                    } else if (result.equalsIgnoreCase("Fl")) {
                        floorToken(mod, floor, rand);
                    } else if (userChoice.equalsIgnoreCase("In")) {
                        invincible(health, shield);
                    } else if (userChoice.equalsIgnoreCase("Ga")) {
                        int counter = 0;
                        int userPick = 0;
                        System.out.println("Welcome to virtual rock paper scissors!");
                        System.out.println("Please make your selection,\nTo choose rock, please press 1.\nTo choose paper, please pres 2.\nTo choose scissors, please press 3." +
                                "\nTo exit please enter 999.");
                        do {
                            int computerChoice = rand.nextInt(3) + 1;
                            String Print = null;
                            userPick = input.nextInt();
                            if (userPick == 1 && computerChoice == 1) {
                                Print = "It's a draw!";
                            } else if (userPick == 1 && computerChoice == 2) {
                                Print = "Paper covers rock, you lose!";
                            } else if (userPick == 1 && computerChoice == 3) {
                                Print = "Your rock broke my scissors, you win!";
                                counter++;
                            } else if (userPick == 2 && computerChoice == 1) {
                                Print = "Your paper covered my rock, you win!";
                                counter++;
                            } else if (userPick == 2 && computerChoice == 2) {
                                Print = "It's a draw!";
                            } else if (userPick == 2 && computerChoice == 3) {
                                Print = "My scissors cut your paper, you loose!";
                            } else if (userPick == 3 && computerChoice == 1) {
                                Print = "My rock smashes your scissors, you loose!";
                            } else if (userPick == 3 && computerChoice == 2) {
                                Print = "Your scissors cut my paper, you win!";
                                counter++;
                            } else if (userPick == 3 && computerChoice == 3) {
                                Print = "It's a draw!";
                            } else if (userPick > 3) {
                                Print = "Please enter a correct number.";
                            }
                            System.out.println(Print + "You have won the past " + counter + " times!");
                        } while (counter < 3);
                    } else {

                    }
                }
            }
//            public static void output(){
//
//            }
        }while (kontinue == true) ;
    }
}