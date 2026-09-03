import java.util.Scanner;
import java.util.Random;

public class Lab2p1 {
    private static Scanner sc = new Scanner(System.in); // make global so accessible by all methods
    private static Random rand = new Random();
    
    public static void main(String[] args) {
        int choice;

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
                    System.out.println(divide(4, 7));
                    break;

                case 3: 
                    System.out.println(modulus(4, 7));
                    break;

                case 4: 
                    System.out.println(countDigits(1234));
                    break;

                case 5: 
                    System.out.println(position(12315, 1));
                    System.out.println(position(123, 4));
                    break;

                case 6: 
                    System.out.println(extractOddDigits(12345));
                    System.out.println(extractOddDigits(54123));
                    System.out.println(extractOddDigits(246));
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
        if (m < n) {
            return 0;
        } else {
            return (m % n);
        }
    }

    public static int modulus(int m, int n) {
        return (m % n);
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