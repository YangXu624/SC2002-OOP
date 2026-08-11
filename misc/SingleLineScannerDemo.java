import java.util.Scanner;

public class SingleLineScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter: [Name] [Age] [GPA] [Enrolled] [Grade]");
        // User inputs: "  John 21   3.85 true  A+"

        // 1. next() -> Skips leading spaces, grabs the first word up to next space
        String name = scanner.next();

        // 2. nextInt() -> Skips spaces, parses the next integer
        int age = scanner.nextInt();

        // 3. nextDouble() -> Skips spaces, parses the next double
        double gpa = scanner.nextDouble();

        // 4. nextBoolean() -> Skips spaces, parses boolean
        boolean isEnrolled = scanner.nextBoolean();

        // 5. next().charAt(0) -> Skips spaces, grabs "A+", extracts index 0 ('A')
        char grade = scanner.next().charAt(0);

        // Print extracted variables
        System.out.println("Extracted Name:       " + name);
        System.out.println("Extracted Age:        " + age);
        System.out.println("Extracted GPA:        " + gpa);
        System.out.println("Extracted Enrolled:   " + isEnrolled);
        System.out.println("Extracted Grade:      " + grade);

        scanner.close();
    }
}