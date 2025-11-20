package baitap51;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point();  // (0,0)
        System.out.println("p1: " + p1);  // (0,0)

        Point p2 = new Point(3, 4);
        System.out.println("p2: " + p2);  // (3,4)

        System.out.println("p2 x: " + p2.getX());  // 3
        System.out.println("p2 y: " + p2.getY());  // 4

        p1.setX(1);
        p1.setY(2);
        System.out.println("p1 sau khi set: " + p1);  // (1,2)

        p2.setXY(5, 6);
        int[] coords = p2.getXY();
        System.out.println("p2 sau khi setXY: (" + coords[0] + "," + coords[1] + ")");

        double distance = p1.distance(p2);
        System.out.println("Khoảng cách giữa p1 và p2: " + distance);
    }
}