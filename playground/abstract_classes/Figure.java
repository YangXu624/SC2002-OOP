// Abstract Class
abstract class Figure {
    private String color;

    public Figure() {
        this.color = "black";
    }

    public Figure(String c) {
        this.color = c;
    }

    public String getColor() {
        return color;
    }

    // Abstract methods - subclasses must provide implementations
    public abstract double findArea();
    public abstract double findPerimeter();
    public abstract void print();
}

// Concrete Subclass
class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(String c, double w, double h) {
        super(c); // Calls the abstract class constructor
        this.width = w;
        this.height = h;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // Implementing the abstract methods
    @Override
    public double findArea() {
        return width * height;
    }

    @Override
    public double findPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void print() {
        System.out.println("Rectangle Details:");
        System.out.println("Color: " + getColor());
        System.out.println("Width: " + width + " | Height: " + height);
        System.out.println("Area: " + findArea());
        System.out.println("Perimeter: " + findPerimeter());
    }
}