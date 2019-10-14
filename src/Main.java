import java.util.Scanner;
public class Main {
        public static void main (String[]args){
            Scanner input = new Scanner(System.in);
            boolean acceptableAnswer = false;
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
           double tax = 0;
           String userChoice;
           do {
               System.out.println("Please choose a difficulty.");
               userChoice = input.next();
               if (userChoice.equalsIgnoreCase("SuperEasy")) {
                   mod = sEMod;
                   tax = sEContinueTax;
                   acceptableAnswer = true;
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
                   mod = sHMod;
                   tax = sHContinueTax;
                   acceptableAnswer = true;
               } else {
                   acceptableAnswer = false;
               }
           }while(acceptableAnswer == false);
           System.out.println("The mod is " + mod + ", and the tax is " +  tax + ".");
        }
}