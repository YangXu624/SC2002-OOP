import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) {
        // Q1(a): Test printArray with these arrays.
        Integer[] integers = {1, 2, 3, 4, 5};
        String[] strings = {"Java", "Generics", "Arrays"};
        Double[] doubles = {1.5, 2.5, 3.5};

        printArray(integers);
        printArray(strings);
        printArray(doubles);

        // Q1(b): Uncomment the call to investigate what happens.
        int[] primitives = {1, 2, 3, 4, 5};
        // printArray(primitives);

        // TODO Q1(b): Explain the result and why it happens.
        // TODO Q1(c): Modify or extend printArray to handle primitive arrays,
        // then test your approach with primitives.
    }

    public static <T> void printArray(T[] array) {
        // TODO Q1(a): Print each element of the array.
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
