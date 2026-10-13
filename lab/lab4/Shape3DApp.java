import java.util.Scanner;

public class Shape3DApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = ShapeAppSupport.readInt(scan, "Total number of shapes: ", 1, Integer.MAX_VALUE);
        Shape[] shapes = new Shape[count];

        for (int i = 0; i < count; i++) {
            System.out.println("\nShape " + (i + 1)
                    + ": 1 = Sphere, 2 = Square-based pyramid, 3 = Cuboid, 4 = Cone, 5 = Cylinder");
            int choice = ShapeAppSupport.readInt(scan, "Choose a shape: ", 1, 5);
            switch (choice) {
                case 1:
                    double sphereRadius = ShapeAppSupport.readDimension(scan, "Radius: ");
                    shapes[i] = new Sphere(sphereRadius);
                    break;
                case 2:
                    double side = ShapeAppSupport.readDimension(scan, "Square base side: ");
                    double pyramidHeight = ShapeAppSupport.readDimension(scan, "Perpendicular height: ");
                    shapes[i] = new Pyramid(side, pyramidHeight);
                    break;
                case 3:
                    double length = ShapeAppSupport.readDimension(scan, "Length: ");
                    double breadth = ShapeAppSupport.readDimension(scan, "Breadth: ");
                    double cuboidHeight = ShapeAppSupport.readDimension(scan, "Height: ");
                    shapes[i] = new Cuboid(length, breadth, cuboidHeight);
                    break;
                case 4:
                    double coneRadius = ShapeAppSupport.readDimension(scan, "Base radius: ");
                    double coneHeight = ShapeAppSupport.readDimension(scan, "Perpendicular height: ");
                    shapes[i] = new Cone(coneRadius, coneHeight);
                    break;
                case 5:
                    double cylinderRadius = ShapeAppSupport.readDimension(scan, "Base radius: ");
                    double cylinderHeight = ShapeAppSupport.readDimension(scan, "Height: ");
                    shapes[i] = new Cylinder(cylinderRadius, cylinderHeight);
                    break;
            }
        }

        ShapeAppSupport.requestCalculation(scan, shapes, "Total surface area");
    }
}
