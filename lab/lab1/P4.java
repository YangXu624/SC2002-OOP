import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Height: ");
        int height = sc.nextInt();

        Pyramid p = new Pyramid(height);
        p.printPyramid();

        sc.close();
    }

    // pyramid object
    public static class Pyramid {
        private int height;

        public Pyramid(int height) {
            setHeight(height);
        }

        public void setHeight(int height) {
            if (height >= 0) {
                this.height = height;
            }
            else {
                System.out.println("Error input!!");
                return;
            }
        }

        public int getHeight() {
            return this.height;
        }

        public void printPyramid() {
            for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= i; j++) {
                    if (j % 2 != i % 2) {
                        System.out.print("BB");
                    }
                    else {
                        System.out.print("AA");
                    }
                }
            System.out.print("\n");
            }
        }
    }
}