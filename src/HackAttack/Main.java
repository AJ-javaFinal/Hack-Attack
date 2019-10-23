package HackAttack;
import javax.swing.*;
import java.util.Random;
import java.util.Scanner;
public class Main {
    private static double hp = 0;
    private static int floor = 1;
    private static double dmg = 0;
    private static int enemyCounter = 0;
    private static boolean kontinue = true;
    private static boolean enemiesRemain = true;
        public static void main (String[]args) {
            Scanner input = new Scanner(System.in);
            Random rand = new Random();
            String correctItems[] = {"DullSword", "Dagger", "LongSword", "Claymore", "RustyAxe",
                    "Axe", "GreatAxe", "ShortBow", "CrossBow", "Spear", "SmallPotion", "MediumPotion", "LargePotion",
                    "GiantPotion", "WoodenShield", "BrokenShield", "Shield", "FloorToken", "GameToken", "Kill", "Invincible", "Quit"};
            //This string prevents the game from accepting incorrect inputs.
            boolean dead = false;
            boolean acceptableAnswer = false;
            double shield = 0;
            double armor = 100;
            double hitPoints = 100;
            double health = 0;
            double atk = 0;
            double sEMod = .25;
            double eMod = .5;
            double mMod = 1;
            double hMod = 2;
            double sHMod = 4;
            double mod = 0;
            //This variable modifies how difficult the game is.
            double sEContinueTax = .125;
            double eContinueTax = .25;
            double mContinueTax = .5;
            double hContinueTax = .75;
            double sHContinueTax = 1;
            double tax;
            //Tax is used when a user dies, but wants to continue the game. A portion of their gold is removed when they respawn.
            String userChoice;
            do {
                System.out.println("Please choose a difficulty.");
                userChoice = JOptionPane.showInputDialog(null,"Please choose a difficulty.");
                if (userChoice.equalsIgnoreCase("SuperEasy")) {
                    userChoice =  JOptionPane.showInputDialog(null,"You chose " + userChoice + ", really?");
                    if (userChoice.equalsIgnoreCase("Yes"))
                        acceptableAnswer = true;
                    else {
                        acceptableAnswer = false;
                    }
                    mod = sEMod;
                    tax = sEContinueTax;
                } else if (userChoice.equalsIgnoreCase("Easy")) {
                    mod = eMod;
                    tax = eContinueTax;
                    acceptableAnswer = true;
                } else if (userChoice.equalsIgnoreCase("Medium")) {
                    mod = mMod;
                    tax = mContinueTax;
                    acceptableAnswer = true;
                } else if (userChoice.equalsIgnoreCase("Hard")) {
                    mod = hMod;
                    tax = hContinueTax;
                    acceptableAnswer = true;
                } else if (userChoice.equalsIgnoreCase("SuperHard")) {
                    userChoice = JOptionPane.showInputDialog(null,"You chose " + userChoice + ", really?");
                    if (userChoice.equalsIgnoreCase("Yes"))
                        acceptableAnswer = true;
                    else {
                        acceptableAnswer = false;
                    }
                    mod = sHMod;
                    tax = sHContinueTax;
                } else {
                    acceptableAnswer = false;
                }
            } while (acceptableAnswer == false);
            Engine.player(atk, shield, health, armor,correctItems,userChoice, mod, floor, kontinue, dead);
            Engine.output(atk, shield, health, armor, correctItems, userChoice,
            mod, floor, kontinue, hp, dmg, enemiesRemain, dead);
            //This while loop runs the game.
        }
        public static void run(){
        }
}