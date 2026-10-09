public class TestPolygon {
    public static void main(String[] args) {
        Polygon r = new Rectangle("rect", 2.0f, 3.0f);
        Polygon t = new Triangle("tri", 2.0f, 3.0f);

        printArea(r);
        printArea(t);
    }

    // Example of dynamic binding - define on superclass and call method using superclass
    public static void printArea(Polygon p) {
        System.out.println(p.calArea());
    }

    // Example of static binding - overload based on subclass
    // public void printArea(Rectangle r) {
    //     System.out.println("Area of Rectangle = " + r.calArea());
    // }

    // public void printArea(Triangle t) {
    //     System.out.println("Area of Triangle = " + t.calArea());
    // }
}