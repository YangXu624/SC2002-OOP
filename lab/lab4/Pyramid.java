// A right square-based pyramid. Height is perpendicular to the base.
public class Pyramid implements Shape {
    private final Square base;
    private final double side;
    private final double height;

    public Pyramid(double side, double height) {
        this.base = new Square(side);
        this.side = side;
        this.height = height;
    }

    @Override
    public double getArea() {
        double slantHeight = Math.hypot(height, side / 2);
        Triangle face = new Triangle(side, slantHeight);
        return base.getArea() + 4 * face.getArea();
    }
}
