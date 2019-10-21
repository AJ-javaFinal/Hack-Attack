package HackAttack;
import static java.lang.Math.round;
import java.util.Random;
public class Enemies {
    public static void enemies(double mod, double hp, double dmg, int floor, int enemyCounter, boolean kontinue, boolean enemiesRemain) {
//        Random rand = new Random();
//        if (enemiesRemain = true) {
//        } else {
//            int enemyAmount = (floor);
//            for (int i = 0; i < floor; i++) {
//                if (floor >= 0 && floor != 100) {
//                    rat(mod, hp, dmg, rand);
//                } else if (floor >= 10 && floor != 100) {
//                    slime(mod, hp, dmg, rand);
//                } else if (floor >= 20 && floor != 100) {
//                    skeleton(mod, hp, dmg, rand);
//                } else if (floor >= 30 && floor != 100) {
//                    goblin(mod, hp, dmg, rand);
//                } else if (floor >= 40 && floor != 100) {
//                    orc(mod, hp, dmg, rand);
//                } else if (floor >= 50 && floor != 100) {
//                    demon(mod, hp, dmg, rand);
//                } else if (floor >= 60 && floor != 100) {
//                    poltergeist(mod, hp, dmg, rand);
//                } else if (floor >= 70 && floor != 100) {
//                    mimic(mod, hp, dmg, rand);
//                } else if (floor >= 80 && floor != 100) {
//                    dragon(mod, hp, dmg, rand);
//                } else if (floor >= 90 && floor != 100) {
//                    basilisk(mod, hp, dmg, rand);
//                } else if (floor == 100) {
//                    System.out.println("Good Luck");
//                    boss(mod, hp, dmg, rand);
//                }
//                Engine.enemy(hp, dmg, floor, enemiesRemain, mod);
//            }
//        }
    }
    public static void rat(double mod, double hp, double dmg, Random rand){
        hp = (rand.nextInt(5) + 1) * mod;
        dmg = (rand.nextInt(5) + 1) * mod;
        System.out.println("The rats have " + hp + " health and do " + dmg + " damage.");

    }
    public static void slime(double mod, double hp, double dmg, Random rand) {
        hp = (rand.nextInt(10) + 1) * mod;
        dmg = (rand.nextInt(10) + 1) * mod;
        System.out.println("The slimes have " + hp + " health and do " + dmg + " damage.");
    }
    public static void skeleton(double mod, double hp, double dmg, Random rand){
        hp = (rand.nextInt(15) + 1) * mod;
        dmg = (rand.nextInt(15) + 1) * mod;
        System.out.println("The skeletons have " + hp + " health and do " + dmg + " damage.");
    }
    public static void goblin(double mod, double hp, double dmg, Random rand) {
        hp = (rand.nextInt(20) + 1) * mod;
        dmg = (rand.nextInt(20) + 1) * mod;
        System.out.println("The goblins have " + hp + " health and do " + dmg + " damage.");
    }
    public static void orc(double mod, double hp, double dmg, Random rand) {
        hp = (rand.nextInt(25) + 1) * mod;
        dmg = (rand.nextInt(25) + 1) * mod;
        System.out.println("The orcs have " + hp + " health and do " + dmg + " damage.");
    }
    public static void demon(double mod, double hp, double dmg, Random rand) {
        hp = (rand.nextInt(30) + 1) * mod;
        dmg = (rand.nextInt(30) + 1) * mod;
        System.out.println("The demons have " + hp + " health and do " + dmg + " damage.");
    }
    public static void poltergeist(double mod, double hp, double dmg, Random rand) {
        hp = (rand.nextInt(35) + 1) * mod;
        dmg = (rand.nextInt(35) + 1) * mod;
        System.out.println("The poltergeists have " + hp + " health and do " + dmg + " damage.");
    }
    public static void mimic(double mod, double hp, double dmg, Random rand) {
        hp = (rand.nextInt(40) + 1) * mod;
        dmg = (rand.nextInt(40) + 1) * mod;
        System.out.println("The mimics have " + hp + " health and do " + dmg + " damage.");
    }
    public static void dragon(double mod, double hp, double dmg, Random rand) {
        hp = (rand.nextInt(45) + 1) * mod;
        dmg = (rand.nextInt(45) + 1) * mod;
        System.out.println("The dragons have " + hp + " health and do " + dmg + " damage.");
    }
    public static void basilisk(double mod, double hp, double dmg, Random rand) {
        hp = (mod * (rand.nextInt(50) + 1));
        dmg = (mod * (rand.nextInt(50) + 1));
        System.out.println("The boss has " + hp + " health and does " + dmg + " damage.");
    }
    public static void boss(double mod, double hp, double dmg, Random rand) {
        hp = ((50 * mod) * (rand.nextInt(50) + 1));
        dmg = ((50 * mod) * (rand.nextInt(50) + 1));
        System.out.println("The boss has " + hp + " health and does " + dmg + " damage.");
    }
}