public class FigureApp {
    public static void main(String[] args) {
        // Uncommenting the line below will cause a compilation error:
        // Figure f = new Figure("Red"); 

        // This works because Rectangle is a concrete class fulfilling all contracts
        Rectangle rect = new Rectangle("Blue", 10.0, 5.0);
        rect.print();
    }
}