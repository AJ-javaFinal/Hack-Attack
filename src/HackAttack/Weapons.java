package HackAttack;
import javax.swing.*;
import java.util.Scanner;
import java.util.Random;
public class Weapons {
    public static void weapons(double atk, double mod, double health, double armor, double shield, boolean dead,
                               String userChoice, String [] correctItems, boolean kontinue) {
        Random rand = new Random();
        //This class is used to store all of the weapons that can be used, and their atk values.
    }
    public static void dullSword(double atk, double mod, Random rand){
        atk = (rand.nextInt(5) + 1) * mod;
        JOptionPane.showInputDialog(null,"Your attack does " + atk + " damage!\nPlease hit the Enter key.");
    }
    public static void dagger(double atk, double mod, Random rand){
        atk = (rand.nextInt(10) + 1) * mod;
        JOptionPane.showInputDialog(null,"Your attack does " + atk + " damage!\nPlease hit the Enter key.");
    }
    public static void longSword(double atk, double mod, Random rand){
        atk = (rand.nextInt(15) + 1) * mod;
        JOptionPane.showInputDialog(null,"Your attack does " + atk + " damage!\nPlease hit the Enter key.");
    }
    public static void claymore(double atk, double mod, Random rand){
        atk = (rand.nextInt(20) + 1) * mod;
        JOptionPane.showInputDialog(null,"Your attack does " + atk + " damage!\nPlease hit the Enter key.");
    }
    public static void rustyAxe(double atk, double mod, Random rand){
        atk = (rand.nextInt(5) + 3) * mod;
        JOptionPane.showInputDialog(null,"Your attack does " + atk + " damage!\nPlease hit the Enter key.");
    }
    public static void axe(double atk, double mod, Random rand){
        atk = (rand.nextInt(10) + 3) * mod;
        JOptionPane.showInputDialog(null,"Your attack does " + atk + " damage!\nPlease hit the Enter key.");
    }
    public static void greatAxe(double atk, double mod, Random rand){
        atk = (rand.nextInt(15) + 3) * mod;
        JOptionPane.showInputDialog(null,"Your attack does " + atk + " damage!\nPlease hit the Enter key.");
    }
    public static void shortBow(double atk, double mod, Random rand){
        atk = (rand.nextInt(5) + 5) * mod;
        JOptionPane.showInputDialog(null,"Your attack does " + atk + " damage!\nPlease hit the Enter key.");
    } public static void crossBow(double atk, double mod, Random rand){
        atk = (rand.nextInt(10) + 5) * mod;
        JOptionPane.showInputDialog(null,"Your attack does " + atk + " damage!\nPlease hit the Enter key.");
    }
    public static void spear(double atk, double mod, Random rand){
        atk = ((rand.nextInt(5) + 5) * 2) * mod;
        JOptionPane.showInputDialog(null,"Your attack does " + atk + " damage!\nPlease hit the Enter key.");
    }public static void quit(boolean dead, String userChoice, boolean kontinue){
        userChoice = JOptionPane.showInputDialog(null,"Are you sure?");
        if(userChoice.equalsIgnoreCase("Yes")){
            kontinue = false;
            dead = true;
        }else {
            dead = false;
        }
        //This section of code allows a user to quit the game
    }
    public static void kill(double atk){
        atk = 999999999;
        JOptionPane.showInputDialog(null,"Your attack does " + atk + " damage\nPlease hit the Enter key.!");
    }
}