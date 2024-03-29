package HackAttack;
import static java.lang.Math.round;
import java.util.Random;
public class Enemies {
    public static void enemies(double mod, double hp, double dmg) {
        //This class stores all of the health and attack values for the enemies.
    }
    public static void rat(double mod, double hp, double dmg, Random rand){
        hp = (rand.nextInt(5) + 1) * mod;
        dmg = (rand.nextInt(5) + 1) * mod;
        System.out.println("The rats have " + hp + " health and do " + dmg + " damage.\nPlease hit the Enter key.");
    }
    public static void slime(double mod, double hp, double dmg, Random rand) {
        hp = (rand.nextInt(10) + 1) * mod;
        dmg = (rand.nextInt(10) + 1) * mod;
        System.out.println("The slimes have " + hp + " health and do " + dmg + " damage.\nPlease hit the Enter key.");
    }
    public static void skeleton(double mod, double hp, double dmg, Random rand){
        hp = (rand.nextInt(15) + 1) * mod;
        dmg = (rand.nextInt(15) + 1) * mod;
        System.out.println("The skeletons have " + hp + " health and do " + dmg + " damage.\nPlease hit the Enter key.");
    }
    public static void goblin(double mod, double hp, double dmg, Random rand) {
        hp = (rand.nextInt(20) + 1) * mod;
        dmg = (rand.nextInt(20) + 1) * mod;
        System.out.println("The goblins have " + hp + " health and do " + dmg + " damage.\nPlease hit the Enter key.");
    }
    public static void orc(double mod, double hp, double dmg, Random rand) {
        hp = (rand.nextInt(25) + 1) * mod;
        dmg = (rand.nextInt(25) + 1) * mod;
        System.out.println("The orcs have " + hp + " health and do " + dmg + " damage.\nPlease hit the Enter key.");
    }
    public static void demon(double mod, double hp, double dmg, Random rand) {
        hp = (rand.nextInt(30) + 1) * mod;
        dmg = (rand.nextInt(30) + 1) * mod;
        System.out.println("The demons have " + hp + " health and do " + dmg + " damage.\nPlease hit the Enter key.");
    }
    public static void poltergeist(double mod, double hp, double dmg, Random rand) {
        hp = (rand.nextInt(35) + 1) * mod;
        dmg = (rand.nextInt(35) + 1) * mod;
        System.out.println("The poltergeists have " + hp + " health and do " + dmg + " damage.\nPlease hit the Enter key.");
    }
    public static void mimic(double mod, double hp, double dmg, Random rand) {
        hp = (rand.nextInt(40) + 1) * mod;
        dmg = (rand.nextInt(40) + 1) * mod;
        System.out.println("The mimics have " + hp + " health and do " + dmg + " damage.\nPlease hit the Enter key.");
    }
    public static void dragon(double mod, double hp, double dmg, Random rand) {
        hp = (rand.nextInt(45) + 1) * mod;
        dmg = (rand.nextInt(45) + 1) * mod;
        System.out.println("The dragons have " + hp + " health and do " + dmg + " damage.\nPlease hit the Enter key.");
    }
    public static void basilisk(double mod, double hp, double dmg, Random rand) {
        hp = (mod * (rand.nextInt(50) + 1));
        dmg = (mod * (rand.nextInt(50) + 1));
        System.out.println("The boss has " + hp + " health and does " + dmg + " damage.\nPlease hit the Enter key.");
    }
    public static void boss(double mod, double hp, double dmg, Random rand) {
        hp = ((50 * mod) * (rand.nextInt(50) + 1));
        dmg = ((50 * mod) * (rand.nextInt(50) + 1));
        System.out.println("The boss has " + hp + " health and does " + dmg + " damage.\nPlease hit the Enter key.");
    }
}