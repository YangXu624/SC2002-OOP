public class Sphere implements Shape {
    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }
}
