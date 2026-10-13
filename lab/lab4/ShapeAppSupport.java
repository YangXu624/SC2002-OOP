import java.util.Scanner;

// Shared console input and polymorphic area calculation for both applications.
public class ShapeAppSupport {
    public static int readInt(Scanner scan, String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            if (scan.hasNextInt()) {
                int value = scan.nextInt();
                if (value >= min && value <= max) {
                    return value;
                }
            } else {
                scan.next();
            }
            System.out.println("Enter a whole number from " + min + " to " + max + ".");
        }
    }

    public static double readDimension(Scanner scan, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scan.hasNextDouble()) {
                double value = scan.nextDouble();
                if (Double.isFinite(value) && value > 0) {
                    return value;
                }
            } else {
                scan.next();
            }
            System.out.println("Enter a positive, finite dimension.");
        }
    }

    public static void requestCalculation(Scanner scan, Shape[] shapes, String label) {
        int choice = readInt(scan, "\nCalculation: 1 = Area, 0 = Exit: ", 0, 1);
        if (choice == 1) {
            double total = 0;
            for (Shape shape : shapes) {
                total += shape.getArea();
            }
            System.out.printf("%s: %.2f square units%n", label, total);
        }
    }
}
