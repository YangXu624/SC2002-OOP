// tutorial 2 question 2
import java.util.Scanner;

public class DiceApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // instantiate two dice
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();

        // roll first dice
        System.out.println("Press <key> to roll the first dice");
        sc.nextLine();
        dice1.setDiceValue();
        dice1.printDiceValue();

        // roll second dice
        System.out.println("Press <key> to roll second dice");
        sc.nextLine();
        dice2.setDiceValue();
        dice2.printDiceValue();

        // display total
        int total = dice1.getDiceValue() + dice2.getDiceValue();
        System.out.println("Your total number is: " + total);

        sc.close();
    }
}