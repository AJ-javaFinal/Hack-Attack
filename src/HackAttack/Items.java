package HackAttack;
import java.util.Random;
import java.util.Scanner;
public class Items {
    public static void items(double mod, double shield, double health, int floor, String userChoice, String [] correctItems){
        Random rand = new Random();
        if(userChoice.equalsIgnoreCase("SmallPotion")) {
            smallPotion(mod, health, rand);
        }
        else if(userChoice.equalsIgnoreCase("MediumPotion")) {
            mediumPotion(mod, health, rand);
        }
        else if(userChoice.equalsIgnoreCase("LargePotion")) {
            largePotion(mod, health, rand);
        }
        else if(userChoice.equalsIgnoreCase("GiantPotion")) {
            giantPotion(mod, health, rand);
        }
        else if(userChoice.equalsIgnoreCase("WoodenShield")) {
            woodenShield(mod,shield, rand);
        }
        else if(userChoice.equalsIgnoreCase("RustyShield")) {
            rustyShield(mod, shield, rand);
        }
        else if(userChoice.equalsIgnoreCase("Shield")) {
            shield(mod, shield, rand);
        }
        else if(userChoice.equalsIgnoreCase("FloorToken")) {
            floorToken(mod, floor, rand);
        }
        else if(userChoice.equalsIgnoreCase("GameToken")){
            Scanner input = new Scanner(System.in);
            int counter = 0;
            int userPick = 0;
            System.out.println("Welcome to virtual rock paper scissors!");
            System.out.println("Please make your selection,\nTo choose rock, please press 1.\nTo choose paper, please pres 2.\nTo choose scissors, please press 3." +
                    "\nTo exit please enter 999.");
           do {
                int computerChoice = rand.nextInt(3) + 1;
                String result = null;
                userPick = input.nextInt();
                if (userPick == 1 && computerChoice == 1) {
                    result = "It's a draw!";
                } else if (userPick == 1 && computerChoice == 2) {
                    result = "Paper covers rock, you lose!";
                } else if (userPick == 1 && computerChoice == 3) {
                    result = "Your rock broke my scissors, you win!";
                    counter++;
                } else if (userPick == 2 && computerChoice == 1) {
                    result = "Your paper covered my rock, you win!";
                    counter++;
                } else if (userPick == 2 && computerChoice == 2) {
                    result = "It's a draw!";
                } else if (userPick == 2 && computerChoice == 3) {
                    result = "My scissors cut your paper, you loose!";
                } else if (userPick == 3 && computerChoice == 1) {
                    result = "My rock smashes your scissors, you loose!";
                } else if (userPick == 3 && computerChoice == 2) {
                    result = "Your scissors cut my paper, you win!";
                    counter++;
                } else if (userPick == 3 && computerChoice == 3) {
                    result = "It's a draw!";
                } else if (userPick > 3) {
                    result = "Please enter a correct number.";
                }
                System.out.println(result + "You have won the past " + counter + " times!");
            } while(counter < 3);
        }
        else if(userChoice.equalsIgnoreCase("Invincible")){
            invincible(health, shield);
        }
        else{
        }
    }
    public static void smallPotion(double mod, double health, Random rand){
        health = (rand.nextInt(5) + 1) * mod;
        System.out.println("You gain " + health + " HP!");
    }
    public static void mediumPotion(double mod, double health, Random rand){
        health = (rand.nextInt(10) + 1) * mod;
        System.out.println("You gain " + health + " HP!");
    }
    public static void largePotion(double mod, double health, Random rand){
        health = (rand.nextInt(15) + 1) * mod;
        System.out.println("You gain " + health + " HP!");
    }
    public static void giantPotion(double mod, double health, Random rand){
        health = (rand.nextInt(20) + 1) * mod;
        System.out.println("You gain " + health + " HP!");
    }
    public static void woodenShield(double shield, double mod, Random rand){
        shield = (rand.nextInt(5) + 1) * mod;
        System.out.println("You gain " + shield + " shield!");
    }
    public static void rustyShield(double mod, double shield, Random rand){
        shield = (rand.nextInt(10) + 1) * mod;
        System.out.println("You gain " + shield + " shield!");
    }
    public static void shield(double mod, double shield, Random rand){
        shield = (rand.nextInt(15) + 1) * mod;
        System.out.println("You gain " + shield + " shield!");
    }
    public static void floorToken(double mod, int floor, Random rand){
        floor = floor + (rand.nextInt(5) + 1);
        System.out.println("You advance " + floor + " floors!");
    } public static void longBow(double atk, double mod, Random rand){
        atk = (rand.nextInt(10) + 5) * mod;
        System.out.println("Your attack does " + atk + " damage!");
    }
    public static void invincible(double health, double shield){
        health = 999999999;
        shield = 999999999;
        System.out.println("You gain " + health + " HP, and " + shield + " shield!");
    }
}