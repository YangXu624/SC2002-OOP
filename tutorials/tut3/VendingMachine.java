import java.util.Scanner;

public class VendingMachine {
    private Scanner sc = new Scanner(System.in);

    public VendingMachine() {}

    public double selectDrink() {
        // lets user select drink, output cost
        int choice;
        double cost = 0.0;
        System.out.println("====== Vending Machine ======");
        System.out.println("|1. Buy Beer       ($3.00)  |");
        System.out.println("|2. Buy Coke       ($1.00)  |");
        System.out.println("|3. Buy Green Tea  ($2.00)  |");
        System.out.println("=============================");

        do {
            System.out.print("Please enter selection: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    cost = 3.00;
                    break;
                case 2:
                    cost = 1.00;
                    break;
                case 3:
                    cost = 2.00;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        } while (choice < 1 || choice > 3);
        return cost;
    }

    public double insertCoins(double drinkCost) {
        System.out.println("====== Coins Input ======");
        System.out.println("'Q': 0.10");
        System.out.println("'T': 0.20");
        System.out.println("'F': 0.50");
        System.out.println("'N': 1.00");
        System.out.println("=============================");

        double amount = 0.00;
        char coin;

        while (amount < drinkCost) {
            System.out.print("Please insert coins: ");
            coin = sc.next().charAt(0);

            switch (coin) {
                case 'Q':
                    amount += 0.10;
                    break;
                case 'T':
                    amount += 0.30;
                    break;
                case 'F':
                    amount += 0.50;
                    break;
                case 'N':
                    amount += 1.00;
                    break;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
            System.out.printf("Coins inserted: $%.2f%n", amount);
        }
        return amount;
    }

    public void checkChange(double amount, double drinkCost) {
        double change = drinkCost - amount;
        System.out.println("Change: $%.2f%n", change);
    }

    public void printReceipt() {
        System.out.println("Please collect your drink\nThank you!!");
    }
}