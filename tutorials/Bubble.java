import java.util.Scanner;
import java.util.Arrays;

public class Bubble {
    // Bubble sort implementation, translated from Python code in tutorial
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\nEnter number of integer elements to be sorted: ");
        int n = sc.nextInt(); // Get size of array
        
        int[] arr = new int[n]; // Can used fixed size array instead of ArrayList, since array size was specified

        for (int i = 0; i < n; i++) {
            System.out.printf("\n\nEnter integer value for element no. %d: ", i + 1);
            arr[i] = sc.nextInt(); // Populate array
        }

        bubble(arr, n);

        System.out.printf("\n\nFinally sorted array is: %s\n\n", Arrays.toString(arr));

        sc.close();
    }

    public static void bubble(int[] arr, int n) {
        // Bubble sort
        for (int i = n - 2; i > -1; i--) {
            for (int j = 0; j < i + 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}