import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Chose your name: ");
        String name = sc.next();

        System.out.print("Chose your class: ");
        String type = sc.next();

        int strength = 20;
        int intel = 20;
        int agility = 10;


       double mod = rand.nextDouble()+0.5;
        int damage =(int) (intel * 5 * mod);

               System.out.println("You have hit the orc for " + damage + " HP");





    }
}
