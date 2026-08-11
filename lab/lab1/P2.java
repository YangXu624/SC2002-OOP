import java.util.Scanner;

public class P2 {
    public static String getGrade(int salary, int merit) {
        if ((500 <= salary && salary <= 599) || (600 <= salary && salary <= 649 && merit < 10)) {
            return "C"; // Catches all possible C. So subsequent code can ignore C
        }
        else if ((600 <= salary && salary <= 699) || (700 <= salary && salary <= 799 && merit < 20)) {
            return "B"; // Catches all possible B. So subsequent code can ignore C
        }
        else if (700 <= salary && salary <= 899) {
            return "A";
        }
        else {
            return "None";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Salary: ");
        int salary = scanner.nextInt();

        System.out.print("Merit: ");
        int merit = scanner.nextInt();

        System.out.println("Salary: " + salary + ", Merit: " + merit);

        String grade = getGrade(salary, merit);
        System.out.println("Grade: " + grade);
    }
}