// A right circular cone. Height is perpendicular to the base.
public class Cone implements Shape {
    private final Circle base;
    private final double height;

    public Cone(double radius, double height) {
        this.base = new Circle(radius);
        this.height = height;
    }

    @Override
    public double getArea() {
        double radius = base.getRadius();
        double slantHeight = Math.hypot(radius, height);
        return base.getArea() + Math.PI * radius * slantHeight;
    }
}
