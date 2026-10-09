public class Triangle extends Polygon {
    public Triangle(String theName, float theWidth, float theHeight) {
        super(theName, theWidth, theHeight);
        this.polytype = KindOfPolygon.POLY_TRIANG;
    }

    @Override
    public float calArea() {
        return 0.5f * this.width * this.height;
    }
}