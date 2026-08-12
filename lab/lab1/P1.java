import java.util.Scanner;

public class P1 {
    public static String getCategory(String choice) {
        // function that takes in a choice and returns catgeory
        if (choice == null) {
            return "Invalid choice";
        }

        if (choice.equalsIgnoreCase("A")) {
            return "Action movie fan";
        }
        else if (choice.equalsIgnoreCase("C")) {
            return "Comedy movie fan";
        }
        else if (choice.equalsIgnoreCase("D")) {
            return "Drama movie fan";
        }
        else {
            return "Invalid choice";
        }

    }

    public static void main(String[] args) {
        // main function, prints category to terminal
        int odd = 1;
        if (odd) {
            System.out.print("Hi");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter choice: ");
        String choice = scanner.nextLine();

        String category = getCategory(choice);
        System.out.println(category);
        scanner.close();
    }
}