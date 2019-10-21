package HackAttack;
import java.util.Random;
import java.util.Scanner;
public class Main {
        public static void main (String[]args){
            Scanner input = new Scanner(System.in);
            Random rand = new Random();
            String correctItems [] = {"RustedSword","ShortSword","LongSword","GreatSword","RustyAxe",
                    "Axe","GreatAxe","ShortBow","LongBow","Spear","SmallPotion","MediumPotion","LargePotion",
                    "GiantPotion","WoodenShield","RustyShield","Shield","FloorToken","GameToken"};
            int floor = 100;
            int enemyCounter = 0;
            boolean kontinue = true;
            boolean enemiesRemain = true;
            boolean dead = false;
            boolean acceptableAnswer = false;
            double shield = 0;
            double armor = 100;
            double hitPoints = 100;
            double health = 0;
            double atk = 0;
            double hp = 0;
            double dmg = 0;
           double sEMod = .25;
           double eMod = .5;
           double mMod = 1;
           double hMod = 2;
           double sHMod = 4;
           double mod = 0;
           double sEContinueTax = .125;
           double eContinueTax = .25;
           double mContinueTax = .5;
           double hContinueTax = .75;
           double sHContinueTax = 1;
           double tax;
           String userChoice;
           do {
               System.out.println("Please choose a difficulty.");
               userChoice = input.next();
               if (userChoice.equalsIgnoreCase("SuperEasy")) {
                   System.out.println("You chose " + userChoice + ", really?");
                   userChoice = input.next();
                   if(userChoice.equalsIgnoreCase("Yes"))
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
                   System.out.println("You chose " + userChoice + ", are you sure?");
                   userChoice = input.next();
                   if(userChoice.equalsIgnoreCase("Yes"))
                       acceptableAnswer = true;
                   else {
                       acceptableAnswer = false;
                   }
                   mod = sHMod;
                   tax = sHContinueTax;
               } else {
                   acceptableAnswer = false;
               }
           }while(acceptableAnswer == false);
            do {
                System.out.println("What will you attack with?");
                userChoice = input.next();
                Weapons.weapons(atk, mod, userChoice, correctItems);
                Items.items(mod, shield, health, floor, userChoice, correctItems);
                if(userChoice.equalsIgnoreCase("Quit")){
                    kontinue = false;
                }
            }while(kontinue == true);
            Enemies.enemies(mod, hp, dmg, floor, enemyCounter, kontinue, enemiesRemain);
            }
        }