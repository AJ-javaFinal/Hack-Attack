package HackAttack;
import java.util.Scanner;
import java.util.Random;
public class Weapons {
    public static void weapons(double atk, double mod, double health, double armor, double shield, String userChoice, String [] correctItems, boolean kontinue) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("What will you attack with?");
            userChoice = input.next();
            if (userChoice.equalsIgnoreCase("Quit")) {
                kontinue = false;

            }
            if (userChoice.equalsIgnoreCase("RustedSword")) {
                rustedSword(atk, mod, rand);
            } else if (userChoice.equalsIgnoreCase("ShortSword")) {
                shortSword(atk, mod, rand);
            } else if (userChoice.equalsIgnoreCase("LongSword")) {
                longSword(atk, mod, rand);
            } else if (userChoice.equalsIgnoreCase("GreatSword")) {
                greatSword(atk, mod, rand);
            } else if (userChoice.equalsIgnoreCase("RustyAxe")) {
                rustyAxe(atk, mod, rand);
            } else if (userChoice.equalsIgnoreCase("Axe")) {
                axe(atk, mod, rand);
            } else if (userChoice.equalsIgnoreCase("GreatAxe")) {
                greatAxe(atk, mod, rand);
            } else if (userChoice.equalsIgnoreCase("ShortBow")) {
                shortBow(atk, mod, rand);
            } else if (userChoice.equalsIgnoreCase("LongBow")) {
                longBow(atk, mod, rand);
            } else if (userChoice.equalsIgnoreCase("Spear")) {
                spear(atk, mod, rand);
            } else if (userChoice.equalsIgnoreCase("Kill")) {
                kill(atk);
            }
            //Engine.player(atk, shield, health, armor);
        }while (kontinue == true) ;
    }
    public static void rustedSword(double atk, double mod, Random rand){
        atk = (rand.nextInt(5) + 1) * mod;
        System.out.println("Your attack does " + atk + " damage!");
    }
    public static void shortSword(double atk, double mod, Random rand){
        atk = (rand.nextInt(10) + 1) * mod;
        System.out.println("Your attack does " + atk + " damage!");
    }
    public static void longSword(double atk, double mod, Random rand){
        atk = (rand.nextInt(15) + 1) * mod;
        System.out.println("Your attack does " + atk + " damage!");
    }
    public static void greatSword(double atk, double mod, Random rand){
        atk = (rand.nextInt(20) + 1) * mod;
        System.out.println("Your attack does " + atk + " damage!");
    }
    public static void rustyAxe(double atk, double mod, Random rand){
        atk = (rand.nextInt(5) + 3) * mod;
        System.out.println("Your attack does " + atk + " damage!");
    }
    public static void axe(double atk, double mod, Random rand){
        atk = (rand.nextInt(10) + 3) * mod;
        System.out.println("Your attack does " + atk + " damage!");
    }
    public static void greatAxe(double atk, double mod, Random rand){
        atk = (rand.nextInt(15) + 3) * mod;
        System.out.println("Your attack does " + atk + " damage!");
    }
    public static void shortBow(double atk, double mod, Random rand){
        atk = (rand.nextInt(5) + 5) * mod;
        System.out.println("Your attack does " + atk + " damage!");
    } public static void longBow(double atk, double mod, Random rand){
        atk = (rand.nextInt(10) + 5) * mod;
        System.out.println("Your attack does " + atk + " damage!");
    }
    public static void spear(double atk, double mod, Random rand){
        atk = ((rand.nextInt(5) + 5) * 2) * mod;
        System.out.println("Your attack does " + atk + " damage!");
    }
    public static void kill(double atk){
        atk = 999999999;
        System.out.println("Your attack does " + atk + " damage!");
    }
}