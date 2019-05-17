
import java.util.Scanner;
//import java.util.Random;

public class ConsoleExercises {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //Enemy stats
        int maxEnemyHealth = 27000;
        int enemyDamage = 1250;
        int expGain = 7200;
        //future notes: make enemy randomized with Random and an array to draw from

        //Hero stats
        int Hp = 8776;
        int attackDamage = 9999;

        //Battle options
        String whatNow = "\nAttack \nSkills \nDefend \nItems \nRun Away";

        //Beginning prompts
        System.out.println("What is your name?");
        String heroName = scan.nextLine();

        System.out.println("Are you ready to go?");
        String respondAn = scan.nextLine();
        //For the moment this adventure is not optional

        System.out.println("Where do you go now?");
        String whereNow = scan.nextLine();

//======================================================================

        System.out.println("A random encounter! what do you do? \n" + "\n" + "His stats: \n" + "Health:" + maxEnemyHealth +"\n" + "\n" + "Your stats:  " + "\nHealth:" + Hp  + "\n" + whatNow);
        String battleOp = scan.nextLine();


        if (maxEnemyHealth >= 0){
            do {
                maxEnemyHealth -= attackDamage;
                System.out.println("You hit the enemy for " + attackDamage + " " + "damage");
            } while (maxEnemyHealth >= 0);
        } if (Hp >= 0) {
            do {
                Hp -= enemyDamage;
                System.out.println("Counterattack," + " " + "The enemy hits you for " + enemyDamage + " " + "damage!");
            } while (Hp >= 6000);
        } else {
            System.out.println("Should I be fighting this enemy?");
        }
        //make a separate attack cycle for enemy here if no counter attack.

        //After battle results
        System.out.println(maxEnemyHealth + " " + "enemy death" + "\n" + "\n Wow, if he wasn't dead before he certainly is now.");
        System.out.format("Congratulations %s, you beat the enemy +" + expGain + " " + "exp.", heroName);

        //options after battle
        System.out.println("\n");
        System.out.println("\n" + "After battle you can choose to rest or continue forward.");
        String keepGoing = scan.nextLine();

        //End game here
        System.out.format("\n" + "You make it to %s... Save and quit?", whereNow);

    }

}
