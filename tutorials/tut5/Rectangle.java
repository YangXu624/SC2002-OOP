public class Rectangle extends Polygon {
    public Rectangle(String theName, float theWidth, float theHeight) {
        super(theName, theWidth, theHeight);
        this.polytype = KindOfPolygon.POLY_RECT;
    }

    @Override
    public float calArea() {
        return this.width * this.height;
    }
}