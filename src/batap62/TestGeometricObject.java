package batap62;

public class TestGeometricObject {
    public static void main(String[] args) {

        GeometricObject g1 = new Circle(2.5);
        System.out.println(g1);
        System.out.println("Area: " + g1.getArea());
        System.out.println("Perimeter: " + g1.getPerimeter());

        GeometricObject g2 = new Rectangle(3.0, 4.0);
        System.out.println("\n" + g2);
        System.out.println("Area: " + g2.getArea());
        System.out.println("Perimeter: " + g2.getPerimeter());
    }
}
