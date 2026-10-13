public class Cylinder implements Shape {
    private final Circle base;
    private final double height;

    public Cylinder(double radius, double height) {
        this.base = new Circle(radius);
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2 * base.getArea() + 2 * Math.PI * base.getRadius() * height;
    }
}
