package shapes;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(int x, int y, double radius, double height) {
        super(x, y, radius);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double area() {
        return (2 * super.area() + 2 * PI * getRadius() * height);
    }

    public double volume() {
        return super.area() * height;
    }
}