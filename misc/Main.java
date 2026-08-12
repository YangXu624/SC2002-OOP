import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            System.out.print(sc.next().charAt(1));
        }
    }

    public static double addNumbers(double a, double b) {
        return (a + b);
    }
}