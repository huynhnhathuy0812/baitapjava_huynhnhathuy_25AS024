package baitap45;

public class TestResizableCircle {
    public static void main(String[] args) {

        ResizableCircle rc1 = new ResizableCircle(10.0, "orange", true);
        System.out.println("Before resize:");
        System.out.println("  " + rc1);
        System.out.printf("  Area = %.6f%n", rc1.getArea());
        System.out.printf("  Perimeter = %.6f%n", rc1.getPerimeter());


        rc1.resize(50);
        System.out.println("\nAfter resize(50%):");
        System.out.println("  " + rc1);
        System.out.printf("  Area = %.6f%n", rc1.getArea());
        System.out.printf("  Perimeter = %.6f%n", rc1.getPerimeter());


        rc1.resize(200);
        System.out.println("\nAfter resize(200%):");
        System.out.println("  " + rc1);
        System.out.printf("  Area = %.6f%n", rc1.getArea());
        System.out.printf("  Perimeter = %.6f%n", rc1.getPerimeter());
    }
}

