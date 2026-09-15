package shapes;

public class Circle extends Point {
    private double radius;
    protected static final double PI = 3.14159;

    public Circle(int x, int y, double rad) {
        super(x, y);
        this.radius = rad;
    }

    public void setRadius(double rad) {
        this.radius = rad;
    }

    public double getRadius() {
        return this.radius;
    }

    public double area() {
        return PI * this.radius * this.radius;
    }
}