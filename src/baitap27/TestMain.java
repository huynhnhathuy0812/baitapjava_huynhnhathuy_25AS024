package baitap27;

public class TestMain {
    public static void main(String[] args) {
        MyLine l1 = new MyLine(1, 2, 3, 4);
        System.out.println(l1);

        MyPoint p1 = new MyPoint(5, 6);
        MyPoint p2 = new MyPoint(7, 8);
        MyLine l2 = new MyLine(p1, p2);
        System.out.println(l2);

        System.out.printf("Length: %.2f%n", l2.getLength());
        System.out.printf("Gradient: %.2f%n", l2.getGradient());
    }
}
