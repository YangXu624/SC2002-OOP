package package2;
import package1.ClassA;
import java.util.Scanner;

public class ClassB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClassA a = new ClassA(1);

        System.out.println(a.getX());
    }
}