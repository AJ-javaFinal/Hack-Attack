package HackAttack;
import javax.swing.*;
import java.util.Random;
import java.util.Scanner;
import static HackAttack.Items.*;
import java.util.Scanner;
import static HackAttack.Enemies.*;
import static HackAttack.Weapons.*;
public class Engine {
    private static double enemyTest[];
    public static void enemy(double hp, double dmg, int floor, boolean enemiesRemain, double mod, boolean kontinue) {
        Random rand = new Random();
        double[] enemyHpArray = new double[floor];
        double[] enemyAtkArray = new double[floor];
        enemyTest = enemyAtkArray;
        do {
            for (int j = 0; enemyHpArray[j] == 0; j++) {
                if (j == floor) {
                    enemiesRemain = false;
                    floor++;
                    if (enemiesRemain = true) {
                        JOptionPane.showInputDialog(null,"What do you do?");
                    } else {
                        floor++;
                        for (int i = 0; i < floor; i++) {
                            if (i >= 0 && i != 100&& i <= 10) {
                                enemyHpArray[i] = hp;
                                enemyAtkArray[i] = dmg;
                                rat(mod, hp, dmg, rand);
                            } else if (floor >= 10 && floor != 100 && i <= 20) {
                                enemyHpArray[i] = hp;
                                enemyAtkArray[i] = dmg;
                                slime(mod, hp, dmg, rand);
                            } else if (floor >= 20 && floor != 100 && i <= 30) {
                                enemyHpArray[i] = hp;
                                enemyAtkArray[i] = dmg;
                                skeleton(mod, hp, dmg, rand);
                            } else if (floor >= 30 && floor != 100 && i <= 40) {
                                enemyHpArray[i] = hp;
                                enemyAtkArray[i] = dmg;
                                goblin(mod, hp, dmg, rand);
                            } else if (floor >= 40 && floor != 100 && i <= 50) {
                                enemyHpArray[i] = hp;
                                enemyAtkArray[i] = dmg;
                                orc(mod, hp, dmg, rand);
                            } else if (floor >= 50 && floor != 100 && i <= 60) {
                                enemyHpArray[i] = hp;
                                enemyAtkArray[i] = dmg;
                                demon(mod, hp, dmg, rand);
                            } else if (floor >= 60 && floor != 100 && i <= 70) {
                                enemyHpArray[i] = hp;
                                enemyAtkArray[i] = dmg;
                                poltergeist(mod, hp, dmg, rand);
                            } else if (floor >= 70 && floor != 100 && i <=80) {
                                enemyHpArray[i] = hp;
                                enemyAtkArray[i] = dmg;
                                mimic(mod, hp, dmg, rand);
                            } else if (floor >= 80 && floor != 100 && i <= 90) {
                                enemyHpArray[i] = hp;
                                enemyAtkArray[i] = dmg;
                                dragon(mod, hp, dmg, rand);
                            } else if (floor >= 90 && floor != 100 && i < 100) {
                                enemyHpArray[i] = hp;
                                enemyAtkArray[i] = dmg;
                                basilisk(mod, hp, dmg, rand);
                            } else if (floor == 100) {
                                enemyHpArray[i] = hp;
                                enemyAtkArray[i] = dmg;
                                System.out.println("Good Luck");
                                boss(mod, hp, dmg, rand);
                            }
                        }
                    }
                    Main.run();
                }
            }
        }while(kontinue = true);
    }
    public static void player(double atk, double shield, double health, double armor, String[] correctItems,
                               String userChoice, double mod, int floor, boolean kontinue, boolean dead) {
        String result;
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        do {
            userChoice = JOptionPane.showInputDialog(null,"What will you attack with?");
            if (userChoice.equalsIgnoreCase("Quit")) {
                userChoice = JOptionPane.showInputDialog(null,"Are you sure?");
                if(userChoice.equalsIgnoreCase("Yes")){
                    kontinue = false;
                    dead = true;
                }else {
                    dead = false;
                }
            }
            for (int i = 0; i < correctItems.length; i++) {
                if (userChoice.equalsIgnoreCase(correctItems[i])) {
                    result = correctItems[i].substring(0, 3);
                    enemyTest[0] = enemyTest[0] - atk;
                    if (result.equalsIgnoreCase("Sma")) {
                        smallPotion(mod, health, rand);
                    } else if (result.equalsIgnoreCase("Med")) {
                        mediumPotion(mod, health, rand);
                    } else if (result.equalsIgnoreCase("Lar")) {
                        largePotion(mod, health, rand);
                    } else if (result.equalsIgnoreCase("Gia")) {
                        giantPotion(mod, health, rand);
                    } else if (result.equalsIgnoreCase("Woo")) {
                        woodenShield(mod, shield, rand);
                    } else if (result.equalsIgnoreCase("Bro")) {
                        brokenShield(mod, shield, rand);
                    } else if (result.equalsIgnoreCase("Shi")) {
                        shield(mod, shield, rand);
                    }  else if (result.equalsIgnoreCase("Inv")) {
                        invincible(health, shield);
                    }else if (result.equalsIgnoreCase("Flo")) {
                        floorToken(mod, floor, rand);
                    } else if (result.equalsIgnoreCase("Dul")) {
                        dullSword(atk, mod, rand);
                    }else if (result.equalsIgnoreCase("Dag")) {
                        dagger(atk, mod, rand);
                    }else if (result.equalsIgnoreCase("Lon")) {
                        longSword(atk, mod, rand);
                    }else if (result.equalsIgnoreCase("Cla")) {
                        claymore(atk, mod, rand);
                    }else if (result.equalsIgnoreCase("Rus")) {
                        rustyAxe(atk, mod, rand);
                    }else if (result.equalsIgnoreCase("Axe")) {
                        axe(atk, mod, rand);
                    }else if (result.equalsIgnoreCase("Gre")) {
                        greatAxe(atk, mod, rand);
                    }else if (result.equalsIgnoreCase("Sho")) {
                        shortBow(atk, mod, rand);
                    }else if (result.equalsIgnoreCase("Cro")) {
                        crossBow(atk, mod, rand);
                    }else if (result.equalsIgnoreCase("Spe")) {
                        spear(atk, mod, rand);
                    }else if (result.equalsIgnoreCase("Kil")) {
                        kill(atk);
                    }else if (result.equalsIgnoreCase("Gam")) {
                        int counter = 0;
                        int userPick = 0;
                        JOptionPane.showInputDialog(null,"Welcome to virtual rock paper scissors!");
                        JOptionPane.showInputDialog(null,"Please make your selection,\nTo choose rock, please press 1." +
                                "\nTo choose paper, please pres 2.\nTo choose scissors, please press 3." +
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
        }while (kontinue == true) ;
    }public static void output(double atk, double shield, double health, double armor, String[] correctItems, String userChoice, double mod,
                               int floor, boolean kontinue,double hp, double dmg, boolean enemiesRemain, boolean dead){
        Scanner input = new Scanner(System.in);
                if(dead = true){
                    JOptionPane.showInputDialog(null,"continue?");
                    userChoice = input.next();
                    if(userChoice.equalsIgnoreCase("Yes")){
                        kontinue = true;
                    }else{
                        kontinue = false;
                    }
                }
            }
    }