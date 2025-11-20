package baitap52;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        System.out.println(c1);  // Cylinder: base=Circle[radius=1.0, color=red], height=1.0
        System.out.println("Base area: " + c1.getBaseArea());
        System.out.println("Volume: " + c1.getVolume());

        Cylinder c2 = new Cylinder(2.0, 5.0, "blue");
        System.out.println(c2);
        System.out.println("Base area: " + c2.getBaseArea());
        System.out.println("Volume: " + c2.getVolume());
    }
}
