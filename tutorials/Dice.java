// tutorial 2 question 2
import java.util.Random;

public class Dice {
    private int valueOfDice;
    private static Random rand = new Random();

    public Dice() {
        this.valueOfDice = 0;
    }

    // setter
    public void setDiceValue() {
        this.valueOfDice = rand.nextInt(6) + 1;
    }

    // getter
    public int getDiceValue() {
        return this.valueOfDice;
    }

    // print
    public void printDiceValue() {
        System.out.println("Current value is " + this.valueOfDice);
    }
}