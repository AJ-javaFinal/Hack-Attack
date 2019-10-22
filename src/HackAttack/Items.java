package HackAttack;
import javax.swing.*;
import java.util.Random;
import java.util.Scanner;
public class Items {
    public static void items(double mod, double shield, double health, double atk, int floor,
                             double armor, String userChoice, String [] correctItems){
        Random rand = new Random();
    }
    public static void smallPotion(double mod, double health, Random rand){
        health = (rand.nextInt(5) + 1) * mod;
        JOptionPane.showInputDialog(null,"You gain " + health + " HP!");
    }
    public static void mediumPotion(double mod, double health, Random rand){
        health = (rand.nextInt(10) + 1) * mod;
        JOptionPane.showInputDialog(null,"You gain " + health + " HP!");
    }
    public static void largePotion(double mod, double health, Random rand){
        health = (rand.nextInt(15) + 1) * mod;
        JOptionPane.showInputDialog(null,"You gain " + health + " HP!");
    }
    public static void giantPotion(double mod, double health, Random rand){
        health = (rand.nextInt(20) + 1) * mod;
        JOptionPane.showInputDialog(null,"You gain " + health + " HP!");
    }
    public static void woodenShield(double mod, double shield, Random rand){
        shield = (rand.nextInt(5) + 1) * mod;
        JOptionPane.showInputDialog(null,"You gain " + shield + " shield!");
    }
    public static void brokenShield(double mod, double shield, Random rand){
        shield = (rand.nextInt(10) + 1) * mod;
        JOptionPane.showInputDialog(null,"You gain " + shield + " shield!");
    }
    public static void shield(double mod, double shield, Random rand){
        shield = (rand.nextInt(15) + 1) * mod;
        JOptionPane.showInputDialog(null,"You gain " + shield + " shield!");
    }
    public static void floorToken(double mod, int floor, Random rand){
        floor = floor + (rand.nextInt(5) + 1);
        JOptionPane.showInputDialog(null,"You advance " + floor + " floors!");
    }public static void invincible(double health, double shield){
        health = 999999999;
        shield = 999999999;
        JOptionPane.showInputDialog(null,"You gain " + health + " HP, and " + shield + " shield!");
    } public static void GameToken(double atk, double mod, Random rand){
    }
}