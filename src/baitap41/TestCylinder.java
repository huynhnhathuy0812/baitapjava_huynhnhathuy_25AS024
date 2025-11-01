package baitap41;

public class TestCylinder {
    public static void main(String[] args) {

        Cylinder c1 = new Cylinder();
        System.out.println(c1.toString());
        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Height: " + c1.getHeight());
        System.out.println("Base area: " + c1.getArea());
        System.out.println("Volume: " + c1.getVolume());
        System.out.println();

        Cylinder c2 = new Cylinder(5.0);
        System.out.println(c2.toString());
        System.out.println("Base area: " + c2.getArea());
        System.out.println("Volume: " + c2.getVolume());
        System.out.println();

        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println(c3.toString());
        System.out.println("Base area: " + c3.getArea());
        System.out.println("Volume: " + c3.getVolume());
        System.out.println();

        Cylinder c4 = new Cylinder(3.5, "blue", 5.0);
        System.out.println(c4.toString());
        System.out.println("Color: " + c4.getColor());
        System.out.println("Base area: " + c4.getArea());
        System.out.println("Volume: " + c4.getVolume());
    }
}

