import java.util.Scanner;

public class Shape2DApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = ShapeAppSupport.readInt(scan, "Total number of shapes: ", 1, Integer.MAX_VALUE);
        Shape[] shapes = new Shape[count];

        for (int i = 0; i < count; i++) {
            System.out.println("\nShape " + (i + 1) + ": 1 = Square, 2 = Rectangle, 3 = Circle, 4 = Triangle");
            int choice = ShapeAppSupport.readInt(scan, "Choose a shape: ", 1, 4);
            switch (choice) {
                case 1:
                    double side = ShapeAppSupport.readDimension(scan, "Side: ");
                    shapes[i] = new Square(side);
                    break;
                case 2:
                    double length = ShapeAppSupport.readDimension(scan, "Length: ");
                    double breadth = ShapeAppSupport.readDimension(scan, "Breadth: ");
                    shapes[i] = new Rectangle(length, breadth);
                    break;
                case 3:
                    double radius = ShapeAppSupport.readDimension(scan, "Radius: ");
                    shapes[i] = new Circle(radius);
                    break;
                case 4:
                    double base = ShapeAppSupport.readDimension(scan, "Base: ");
                    double height = ShapeAppSupport.readDimension(scan, "Perpendicular height: ");
                    shapes[i] = new Triangle(base, height);
                    break;
            }
        }

        ShapeAppSupport.requestCalculation(scan, shapes, "Total area");
    }
}
