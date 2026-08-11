import java.util.Scanner;

public class Choice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter choice: ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("A")) {
            System.out.print("Action movie fan\n");
        }
        else if (choice.equalsIgnoreCase("C")) {
            System.out.print("Comedy movie fan\n");
        }
        else if (choice.equalsIgnoreCase("D")) {
            System.out.print("Drama movie fan\n");
        }
        else {
            System.out.print("Invalid choice\n");
        }

        scanner.close();
    }
}