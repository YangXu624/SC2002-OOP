public class Rectangle implements Shape {
    private final double length;
    private final double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double getArea() {
        return length * breadth;
    }
}
