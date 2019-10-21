package HackAttack;
import java.util.Random;
import java.util.Scanner;
public class Items {
    public static void items(double mod, double shield, double health, double atk, int floor, double armor, String userChoice, String [] correctItems){
        Random rand = new Random();
        String result;
//        for(int i = 0; i < correctItems.length; i++){
//            if(userChoice.equalsIgnoreCase(correctItems[i])) {
//               result = correctItems[i].substring(0,2);
//                if(result.equalsIgnoreCase("Sm")){
//                   smallPotion(mod, health, rand);
//                } else if(result.equalsIgnoreCase("Me")) {
//                    mediumPotion(mod, health, rand);
//                }else if(result.equalsIgnoreCase("La")) {
//                    largePotion(mod, health, rand);
//                } else if(result.equalsIgnoreCase("Gi")) {
//                    giantPotion(mod, health, rand);
//                }else if(result.equalsIgnoreCase("Wo")) {
//                    woodenShield(mod,shield, rand);
//                }else if(result.equalsIgnoreCase("Ru")) {
//                    rustyShield(mod, shield, rand);
//                }else if(result.equalsIgnoreCase("Sh")) {
//                    shield(mod, shield, rand);
//                } else if(result.equalsIgnoreCase("Fl")) {
//                    floorToken(mod, floor, rand);
//                } } else if(userChoice.equalsIgnoreCase("In")){
//                invincible(health, shield);
//            } else if(userChoice.equalsIgnoreCase("Ga")){
//                    Scanner input = new Scanner(System.in);
//                    int counter = 0;
//                    int userPick = 0;
//                    System.out.println("Welcome to virtual rock paper scissors!");
//                    System.out.println("Please make your selection,\nTo choose rock, please press 1.\nTo choose paper, please pres 2.\nTo choose scissors, please press 3." +
//                            "\nTo exit please enter 999.");
//                    do {
//                        int computerChoice = rand.nextInt(3) + 1;
//                        String Print = null;
//                        userPick = input.nextInt();
//                        if (userPick == 1 && computerChoice == 1) {
//                            Print = "It's a draw!";
//                        } else if (userPick == 1 && computerChoice == 2) {
//                            Print = "Paper covers rock, you lose!";
//                        } else if (userPick == 1 && computerChoice == 3) {
//                            Print = "Your rock broke my scissors, you win!";
//                            counter++;
//                        } else if (userPick == 2 && computerChoice == 1) {
//                            Print = "Your paper covered my rock, you win!";
//                            counter++;
//                        } else if (userPick == 2 && computerChoice == 2) {
//                            Print = "It's a draw!";
//                        } else if (userPick == 2 && computerChoice == 3) {
//                            Print = "My scissors cut your paper, you loose!";
//                        } else if (userPick == 3 && computerChoice == 1) {
//                            Print = "My rock smashes your scissors, you loose!";
//                        } else if (userPick == 3 && computerChoice == 2) {
//                            Print = "Your scissors cut my paper, you win!";
//                            counter++;
//                        } else if (userPick == 3 && computerChoice == 3) {
//                            Print = "It's a draw!";
//                        } else if (userPick > 3) {
//                            Print = "Please enter a correct number.";
//                        }
//                        System.out.println(Print + "You have won the past " + counter + " times!");
//                    } while(counter < 3);
//            }  else{
//
//            }
//           // Engine.player(atk, shield, health, armor)
//      }
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
    public static void woodenShield(double mod, double shield, Random rand){
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
    } public static void GameToken(double atk, double mod, Random rand){
    }
    public static void invincible(double health, double shield){
        health = 999999999;
        shield = 999999999;
        System.out.println("You gain " + health + " HP, and " + shield + " shield!");
    }
}