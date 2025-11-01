package baitap44;

public class TestShape {
    public static void main(String[] args) {
        // Test Shape
        Shape s1 = new Shape("red", false);
        System.out.println("Shape toString(): " + s1.toString());
        System.out.println("  getColor() = " + s1.getColor());
        System.out.println("  isFilled() = " + s1.isFilled());
        System.out.println();

        // Test Circle
        Circle c1 = new Circle(2.5, "blue", true);
        System.out.println("Circle toString(): " + c1.toString());
        System.out.println("  getRadius() = " + c1.getRadius());
        System.out.printf("  getArea() = %.6f%n", c1.getArea());
        System.out.printf("  getPerimeter() = %.6f%n", c1.getPerimeter());
        System.out.println();

        // Test Rectangle
        Rectangle r1 = new Rectangle(2.0, 4.0, "yellow", true);
        System.out.println("Rectangle toString(): " + r1.toString());
        System.out.println("  getWidth() = " + r1.getWidth());
        System.out.println("  getLength() = " + r1.getLength());
        System.out.printf("  getArea() = %.6f%n", r1.getArea());
        System.out.printf("  getPerimeter() = %.6f%n", r1.getPerimeter());
        System.out.println();

        // Test Square
        Square sq1 = new Square(3.0, "purple", false);
        System.out.println("Square toString(): " + sq1.toString());
        System.out.println("  getSide() = " + sq1.getSide());
        System.out.println("  getWidth() = " + sq1.getWidth());
        System.out.println("  getLength() = " + sq1.getLength());
        System.out.printf("  getArea() = %.6f%n", sq1.getArea());
        System.out.printf("  getPerimeter() = %.6f%n", sq1.getPerimeter());
        System.out.println();

        // Change side and re-check
        sq1.setSide(5.0);
        System.out.println("After sq1.setSide(5.0):");
        System.out.println("  getSide() = " + sq1.getSide());
        System.out.println("  getWidth() = " + sq1.getWidth());
        System.out.println("  getLength() = " + sq1.getLength());
        System.out.printf("  getArea() = %.6f%n", sq1.getArea());
        System.out.printf("  getPerimeter() = %.6f%n", sq1.getPerimeter());
    }
}
