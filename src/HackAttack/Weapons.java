package HackAttack;
import java.util.Scanner;
import java.util.Random;
public class Weapons {
    public static void weapons(double atk, double mod, double health, double armor, double shield,
                               String userChoice, String [] correctItems, boolean kontinue) {
        Random rand = new Random();
    }
    public static void dullSword(double atk, double mod, Random rand){
        atk = (rand.nextInt(5) + 1) * mod;
        System.out.println("Your attack does " + atk + " damage!");
    }
    public static void dagger(double atk, double mod, Random rand){
        atk = (rand.nextInt(10) + 1) * mod;
        System.out.println("Your attack does " + atk + " damage!");
    }
    public static void longSword(double atk, double mod, Random rand){
        atk = (rand.nextInt(15) + 1) * mod;
        System.out.println("Your attack does " + atk + " damage!");
    }
    public static void claymore(double atk, double mod, Random rand){
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
    } public static void crossBow(double atk, double mod, Random rand){
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