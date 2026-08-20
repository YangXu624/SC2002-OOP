import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("starting: ");
        int start = sc.nextInt(); // get start
        System.out.print("ending: ");
        int end = sc.nextInt(); // get end
        System.out.print("increment: ");
        int increment = sc.nextInt(); // get increment

        // error checking
        if (start > end || increment <= 0) {
            System.out.println((end - start) % increment);
            System.out.println("Error input!!");
            return;
        }

        // requirement 1: for loop
        System.out.println("US$         S$");
        System.out.println("--------------");
        for (int i = start; i <= end ; i += increment) {
            System.out.printf("%d           %.2f\n", i, i * 1.82);
        }

        // requirement 2: while loop
        System.out.println("\nUS$         S$");
        System.out.println("--------------");
        int count = start;
        while (count <= end) {
            System.out.printf("%d           %.2f\n", count, count * 1.82);
            count += increment;
        }

        // requirement 3: do-while loop
        System.out.println("\nUS$         S$");
        System.out.println("--------------");
        int counter = start;
        do {
            System.out.printf("%d           %.2f\n", counter, counter * 1.82);
            counter += increment;
        } while (counter <= end);

        sc.close();
    }
}