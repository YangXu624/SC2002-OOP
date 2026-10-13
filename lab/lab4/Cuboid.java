public class Cuboid implements Shape {
    private final Rectangle base;
    private final Rectangle front;
    private final Rectangle side;

    public Cuboid(double length, double breadth, double height) {
        this.base = new Rectangle(length, breadth);
        this.front = new Rectangle(length, height);
        this.side = new Rectangle(breadth, height);
    }

    @Override
    public double getArea() {
        return 2 * (base.getArea() + front.getArea() + side.getArea());
    }
}
