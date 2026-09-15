import shapes.*;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(0, 0, 5.0);
        Cylinder cy = new Cylinder(0, 0, 4.0, 6.0);

        // System.out.println(c.getRadius());
        // System.out.println(cy.getRadius());
        // c.setRadius(3.0);
        // System.out.println(c.getRadius());
        // System.out.println(c.area());
        // System.out.println(cy.getHeight());
        // System.out.println(cy.area());
        // System.out.println(cy.volume());
        System.out.println(c.getX());
        // System.out.println(c.x); // error: x has protected access in Point
    }
}