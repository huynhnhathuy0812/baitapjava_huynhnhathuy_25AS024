package baitap46;

public class TestResizableCircle {
    public static void main(String[] args) {
        GeometricObject c1 = new Circle(10.0);
        System.out.println(c1);
        System.out.printf("Perimeter = %.4f%n", c1.getPerimeter());
        System.out.printf("Area = %.4f%n", c1.getArea());

        System.out.println();

        ResizableCircle c2 = new ResizableCircle(20.0);
        System.out.println(c2);
        System.out.printf("Perimeter = %.4f%n", c2.getPerimeter());
        System.out.printf("Area = %.4f%n", c2.getArea());

        System.out.println("\nResize to 50%...");
        c2.resize(50);
        System.out.println(c2);
        System.out.printf("Perimeter = %.4f%n", c2.getPerimeter());
        System.out.printf("Area = %.4f%n", c2.getArea());
    }
}

