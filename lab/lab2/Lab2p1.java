import java.util.Scanner;
import java.util.Random;

public class Lab2p1 {
    private static Scanner sc = new Scanner(System.in); // make global so accessible by all methods
    private static Random rand = new Random();
    
    public static void main(String[] args) {
        int choice;
        int m;
        int n;

        do {
            System.out.println("Perform the following methods:");
            System.out.println("1: multiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            choice = sc.nextInt();

            switch (choice) {
                case 1: 
                    mulTest();
                    break;

                case 2: 
                    System.out.print("m: ");
                    m = sc.nextInt();
                    System.out.print("n: ");
                    n = sc.nextInt();
                    System.out.println("Answer: " + divide(m, n));
                    break;

                case 3: 
                    System.out.print("m: ");
                    m = sc.nextInt();
                    System.out.print("n: ");
                    n = sc.nextInt();
                    System.out.println("Answer: " + modulus(m, n));
                    break;

                case 4: 
                    System.out.print("n: ");
                    n = sc.nextInt();
                    System.out.println(countDigits(n));
                    break;

                case 5: 
                    System.out.print("n: ");
                    n = sc.nextInt();
                    System.out.print("Digit: ");
                    int digit = sc.nextInt();
                    System.out.println(position(n, digit));
                    break;

                case 6: 
                    System.out.print("num: ");
                    long num = sc.nextLong();
                    System.out.println(extractOddDigits(num));
                    break;

                case 7: 
                    System.out.println("Program terminating ….");
                    break;

                default:
                    System.out.println("Invalid option.");
                    break;
            }
        } while (choice < 7);

        sc.close();
    }

    // add methods here
    public static void mulTest() {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            int x = rand.nextInt(8) + 1;
            int y = rand.nextInt(8) + 1;

            System.out.printf("How much is %d times %d? ", x, y);
            if (sc.nextInt() == x * y) {
                count++;
            }
        }
        System.out.println(count + " answers out of 5 are correct.\n");
    }

    public static int divide(int m, int n) {
        int counter = 0;
        while (m > n) {
            m -= n;
            counter++;
        }
        return counter;
    }

    public static int modulus(int m, int n) {
        while (m > n) {
            m -= n;
        }
        return m;
    }

    public static int countDigits(int n) {
        if (n == 0) return 1;

        // arithmetic is much faster than converting to string
        return (int) Math.log10(Math.abs(n)) + 1;
    }
    

    public static int position(int n, int digit) {
        int position = 1;
        while (n > 0) {
            if (n % 10 == digit) { // checks last digit
                return position;
            }
            position++;
            n /= 10; // remove last digit
        }
        return -1;
    }

    public static long extractOddDigits(long n) {
        if (n < 0) {
            throw new IllegalArgumentException("Error input!!");
        }

        long result = 0;
        int position = 0;
        while (n > 0) {
            if ((n % 10) % 2 == 1) { // if last digit is odd
                result += (n % 10) * Math.pow(10, position);
                position++;
            }
            n /= 10;
        }
        
        if (result > 0) {
            return result;
        } else {
            return -1;
        }
    }
}