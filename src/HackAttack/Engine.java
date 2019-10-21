package HackAttack;
import java.util.Random;
import static HackAttack.Enemies.*;
public class Engine {
    public static void enemy(double hp, double dmg, int floor, boolean enemiesRemain, double mod){
        Random rand = new Random();
        double [] enemyHpArray = new double [floor];
        double [] enemyAtkArray = new double [floor];
        if (enemiesRemain = true) {
            System.out.println("What do you do?");
        } else {
            floor++;
            int enemyAmount = (floor);
            for (int i = 0; i < floor; i++) {
                if (floor >= 0 && floor != 100) {
                    rat(mod, hp, dmg, rand);
                } else if (floor >= 10 && floor != 100) {
                    slime(mod, hp, dmg, rand);
                } else if (floor >= 20 && floor != 100) {
                    skeleton(mod, hp, dmg, rand);
                } else if (floor >= 30 && floor != 100) {
                    goblin(mod, hp, dmg, rand);
                } else if (floor >= 40 && floor != 100) {
                    orc(mod, hp, dmg, rand);
                } else if (floor >= 50 && floor != 100) {
                    demon(mod, hp, dmg, rand);
                } else if (floor >= 60 && floor != 100) {
                    poltergeist(mod, hp, dmg, rand);
                } else if (floor >= 70 && floor != 100) {
                    mimic(mod, hp, dmg, rand);
                } else if (floor >= 80 && floor != 100) {
                    dragon(mod, hp, dmg, rand);
                } else if (floor >= 90 && floor != 100) {
                    basilisk(mod, hp, dmg, rand);
                } else if (floor == 100) {
                    System.out.println("Good Luck");
                    boss(mod, hp, dmg, rand);
                }
            }
        }
        Main.run();
    }
    public static void player(double atk, double shield, double health, double armor){

    }
    public static void output(){

    }
}