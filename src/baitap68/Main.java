package baitap68;

public class Main {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(5, 6, 10, 15);
        System.out.println("Point ban đầu: " + m1);
        m1.moveLeft();
        System.out.println("Sau moveLeft: " + m1);

        Movable m2 = new MovableCircle(1, 2, 3, 4, 20);
        System.out.println("\nCircle ban đầu: " + m2);
        m2.moveRight();
        System.out.println("Sau moveRight: " + m2);

        Movable m3 = new MovableRectangle(0, 0, 10, 10, 5, 5);
        System.out.println("\nRectangle ban đầu: " + m3);
        m3.moveDown();
        System.out.println("Sau moveDown: " + m3);
    }
}
