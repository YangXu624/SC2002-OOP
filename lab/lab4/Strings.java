import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\nHow many strings do you want to sort? ");
        int size = scan.nextInt();
        scan.nextLine();
        String[] stringList = new String[size];

        System.out.println("\nEnter the strings (one per line)...");
        for (int i = 0; i < size; i++) {
            stringList[i] = scan.nextLine();
        }

        Sorting.insertionSort(stringList);
        System.out.println("\nYour strings in sorted order...");
        for (String value : stringList) {
            System.out.println(value);
        }
    }
}
