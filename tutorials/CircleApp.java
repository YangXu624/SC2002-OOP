// tutorial 2 question 1
import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Circle c = null; // creates a variable first, but does not construct yet
        while(true) {
            System.out.println("==== Circle Computation ====");
            System.out.println("|1. Create a new circle    |");
            System.out.println("|2. Print Area             |");
            System.out.println("|3. Print circumference    |");
            System.out.println("|4. Quit                   |");
            System.out.println("============================");
            System.out.println("Choose option (1-3):");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the radius to compute the area and circumference");
                    double rad = sc.nextDouble();
                    c = new Circle(rad);
                    System.out.println("A new circle is created!")
                    break;
                case 2:
                    if (c != null) {
                        c.printArea();
                    } else {
                        System.out.println("No circle created yet!");
                    }
                    break;
                case 3:
                    if (c != null) {
                        c.printCircumference();
                    } else {
                        System.out.println("No circle created yet!");
                    }
                    break;
                case 4:
                    System.out.println("Thank you!!");
                    sc.close();
                    return; // exit if choice is 4
                default:
                    System.out.println("Invalid option. Please choose between 1 and 4.");
                    break;
            }
        }
    }
}