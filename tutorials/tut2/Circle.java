// tutorial 2 question 1
public class Circle {
    private double radius;
    private static final double PI = 3.14159;

    // constructor
    public Circle(double rad) {
        this.radius = rad;
    }

    // setter
    public void setRadius(double rad) {
        this.radius = rad;
    }

    // getter
    public double getRadius() {
        return this.radius;
    }

    // calculate area
    public double area() {
        return PI * this.radius * this.radius;
    }

    // calculate circumference
    public double circumference() {
        return PI * 2 * this.radius;
    }

    // print area
    public void printArea() {
        System.out.println("Area of circle");
        System.out.printf("Radius: %.1f\n", this.getRadius());
        System.out.println("Area: " + this.area());
    }

    // print circumference
    public void printCircumference() {
        System.out.println("Circumference of circle");
        System.out.printf("Radius: %.1f\n", this.getRadius());
        System.out.println("Circumference: " + this.circumference());
    }
}